import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class PrintEachLine {

  public static void main(String[] args) {
    // Írj egy programot, ami megnyitja a "my-file.txt"-t,
    // aztán kiprinteli minden egyes sorát.
    // Ha a program nem tudja megnyitni a fájlt (mert nem létezik),
    // akkor a következő üzenetet printelje ki: "Unable to read file: my-file.txt"

    Path path = Paths.get("my-file.txt");
    try {
      List<String> content = Files.readAllLines(path);
      for (String line : content) {
        System.out.println(line);
      }
    } catch (IOException e) {
      if (!Files.exists(path)) {
        System.out.println("The file doesn't exists.");
      }
      System.out.println("Unable to read file: " + path.getFileName());
    }



  }

}