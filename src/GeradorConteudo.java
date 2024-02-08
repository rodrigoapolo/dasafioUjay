import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class GeradorConteudo {
    public static String gerarTxt(String mes, Double rentabilidade) {
        StringBuilder conteudo = new StringBuilder();

        conteudo.append("Mês ");
        conteudo.append(mes);
        conteudo.append(": ");
        conteudo.append(rentabilidade.toString());

        return conteudo.toString();
    }
    public static String gerarTxt(Map<Month, Double> fundos) {
        StringBuilder conteudo = new StringBuilder();

        for (Map.Entry<Month, Double> entry : fundos.entrySet()) {
            conteudo.append(gerarTxt(entry.getKey().toString(), entry.getValue()));
            conteudo.append(System.lineSeparator());
        }
        return conteudo.toString().substring(0, conteudo.toString().length() - 1);
    }
}
