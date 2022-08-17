import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {

  // Írj egy függvényt countLines() néven, ami fogad egy fájlnevet stringként,
  // majd visszadja a fájlban található sorok számát.
  // Ha nem tudja megnyitni a fájlt adjon vissza nullát és
  // ne jelezzen semmilyen hibát.

  public static void main(String[] args) {

    System.out.println("Number of lines: " + countLines("something.txt"));
    System.out.println("Number of lines: " + countLines("something-2.txt"));
    System.out.println("Number of lines: " + countLines(null));
  }

  public static int countLines(String filename) {
    //if (filename == null) return 0;
    List<String> content;
    try {
      Path path = Paths.get(filename);
      content = Files.readAllLines(path);
    } catch (Exception e) {
      return 0;
    }
    return content.size();
  }

}
