import java.time.format.DateTimeFormatter;
import java.util.List;

public class GeradorConteudo {
    public static String gerarTxt(Fundo fundo) {
        StringBuilder conteudo = new StringBuilder();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        conteudo.append(fundo.getDate().format(formatter));
        conteudo.append(";");
        conteudo.append(fundo.getRentabilidade().toString());

        return conteudo.toString();
    }
    public static String gerarTxt(List<Fundo> fundos) {
        StringBuilder conteudo = new StringBuilder();
        conteudo.append("Data;Rentabilidade");
        conteudo.append(System.lineSeparator());
        for (Fundo fundo : fundos) {
            conteudo.append(gerarTxt(fundo));
            conteudo.append(System.lineSeparator());
        }
        return conteudo.toString().substring(0, conteudo.toString().length() - 1);
    }
}
