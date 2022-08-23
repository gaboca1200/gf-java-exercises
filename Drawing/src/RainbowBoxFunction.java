import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  public static void mainDraw(Graphics graphics) {
    // Hozz létre egy függvényt, ami egy négyzetet rajzol a vászonra és 3 változót vár:
    // a négyzet méretét, a négyzet kitöltésének színtét és a graphics-ot.
    // A függvénynek a négyzetet úgy kell megrajzolnia, hogy a négyzet közepe a vászon közepén legyen,
    // ami a megadott színnel van kitöltve és a mérete is a megadott.
    // Írj egy ciklust, ami kitölti a vásznat a négyzetekkel a szívárvány színeiben (piros, narancssárga,
    // citromsárga, zöld, kék, indigó, ibolya)
    Color[] colors = {
        Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
        Color.BLUE, new Color(75, 0, 130), new Color(148, 0, 211)
    };
    int size = WIDTH > HEIGHT ? HEIGHT : WIDTH;
    for (int i = 0; i < colors.length; i++) {
      drawColorSquare(size, colors[i], graphics);
      size -= ((WIDTH > HEIGHT ? HEIGHT : WIDTH) / colors.length);
    }
  }

  public static void drawColorSquare(int size, Color color, Graphics graphics) {
    int x = WIDTH / 2 - size / 2;
    int y = HEIGHT / 2 - size / 2;
    graphics.setColor(color);
    graphics.fillRect(x, y, size, size);
  }

  // Boilerplate kód. A graphics működéséhez kell. Nem kell piszkálni.
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
