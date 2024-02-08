import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "src/rentabilidades.txt";
        String diretorioAtual = System.getProperty("user.dir");
        String caminhoCompleto = diretorioAtual + "/" + caminhoArquivo;
        String novoArquivo = diretorioAtual + "/src/rentabilidades-ordenado.txt";


        List<Fundo> fundos = lerArquivoFundos(caminhoCompleto);

        Map<Month, Double> somaPorMes = fundos.stream()
                .collect(Collectors.groupingBy(
                        fundo -> fundo.getDate().getMonth(),
                        Collectors.summingDouble(Fundo::getRentabilidade)
                ));

        Map<Month, Double> fundosOrdenado = somaPorMes.entrySet().stream()
                .sorted((entry1, entry2) -> Double.compare(entry2.getValue(), entry1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));


        String conteudo = GeradorConteudo.gerarTxt(fundosOrdenado);
        GeradorArquivo.escrever(novoArquivo,conteudo);
    }

    private static List<Fundo> lerArquivoFundos(String caminhoCompleto) {
        List<Fundo> fundos = new ArrayList<>();
        try {
            fundos = LeitorArquivo.lerTxtFundos(caminhoCompleto);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fundos;
    }
}