import javax.swing.*;

import java.awt.*;
import java.util.HashMap;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
  public static void mainDraw(Graphics graphics) {
    // Tölts ki a vásznat sakktáblamintával

    final int NUMBER_OF_SQUARES = 20;
    final int SIZE = Math.min(WIDTH, HEIGHT) / NUMBER_OF_SQUARES;
    for (int y = 0; y < HEIGHT; y += SIZE) {
      int x = ((y / SIZE) % 2 == 0) ? SIZE : 0;
      while (x < WIDTH) {
        drawSquare(x, y, SIZE, Color.BLACK, graphics);
        x += (SIZE * 2);
      }
    }

  }

  public static void drawSquare(int x, int y, int size, Color color, Graphics graphics) {
    graphics.setColor(color);
    graphics.fillRect(x, y, size, size);
  }

  // Boilerplate code. A graphics működéséhez kell. Nem kell piszkálni.
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