import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivo {
    private static List<String> obterLinhasTextFundo(String caminhoCompleto) throws Exception{
        final Path arquivo = Paths.get(caminhoCompleto);
        List<String> linhas = Files.readAllLines(arquivo);
        linhas.remove(0);
        return linhas;
    }

    public static List<Fundo> lerTxtFundos(String caminhoCompleto) throws Exception{
        List<String> linhas = obterLinhasTextFundo(caminhoCompleto);

        List<Fundo> fundos = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for(String linha: linhas){

            String [] colunas = linha.split("\\;");

            Fundo fundo = new Fundo();
            fundo.setDate(LocalDate.parse(colunas [0],formatter));
            fundo.setRentabilidade(Double.parseDouble(colunas [1]));

            fundos.add(fundo);
        }

        return fundos;
    }
}
