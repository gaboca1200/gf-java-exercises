import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenteredSquare {

  public static void mainDraw(Graphics graphics) {
    // Rajzolj egy 10 pixel x 10 pixeles négyzetet a vászonra,
    // úgy hogy a négyzet közepe a vászon közepén legyen
    final int SIZE_OF_SQUARE = 10;
    int x = WIDTH / 2 - SIZE_OF_SQUARE / 2;
    int y = HEIGHT / 2 - SIZE_OF_SQUARE / 2;
    graphics.drawRect(x, y, SIZE_OF_SQUARE - 1, SIZE_OF_SQUARE - 1);
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