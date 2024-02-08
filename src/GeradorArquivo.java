import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class GeradorArquivo {
    public static void escrever(String caminhoCompleto, String conteudo){
        Path path = Paths.get(caminhoCompleto);
        try {
            Files.createDirectories(path.getParent());
            Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE );
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
