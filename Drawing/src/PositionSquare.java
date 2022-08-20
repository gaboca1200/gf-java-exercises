import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
  public static void mainDraw(Graphics graphics) {
    // hozz létre egy függvényt, ami egy négyzetet rajzol a vászonra
    // a függvény 3 változót várjon: a négyzet bal felső sarkának a
    // koordinátáit és a graphics-ot és rajzoljon egy 50 x 50-es
    // négyzetet
    // rajzoltass ki 3 négyzetet a függvényeddel
    // kerüld a kódismétlést
    final int NUMBER_OF_SUARES = 300;
    final int SIZE = 50;
    for (int i = 0; i < NUMBER_OF_SUARES; i++) {
      int x = (int) (Math.random() * (WIDTH - SIZE));
      int y = (int) (Math.random() * (HEIGHT - SIZE));
      drawSquare(x, y, graphics);
    }

  }

  public static void drawSquare(int x, int y, Graphics g) {
    g.drawRect(x, y, 50, 50);
  }

  // Boilerplate kód. A graphics működéséhez kell. Piszkálhatód, ha szeretnéd :), nem kell.
  static int WIDTH = 320;  // vászon szélessége
  static int HEIGHT = 320; // vászon magassága

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}