import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Contacts {
private String directory = "data";
private String filename = "animals.txt";

Path dataDirectory = Paths.get(directory);
Path dataFile = Paths.get(directory, filename);

if (Files.notExists(dataDirectory)) {
        try {
            Files.createDirectories(dataDirectory);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
