import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String caminhoArquivo = "src/rentabilidades.txt";
        String diretorioAtual = System.getProperty("user.dir");
        String caminhoCompleto = diretorioAtual + "/" + caminhoArquivo;
        String novoArquivo = diretorioAtual + "/src/rentabilidades-ordenado.txt";


        List<Fundo> fundos = lerArquivoFundos(caminhoCompleto);

        fundos.sort((f1, f2) ->
                -f1.getRentabilidade().compareTo(f2.getRentabilidade())
        );

        String conteudo = GeradorConteudo.gerarTxt(fundos);
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