import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
  public static void mainDraw(Graphics graphics) {
    // Írjatok egy kis progit, ami ilyen képet tud rajzolni:
    // [https://github.com/green-fox-academy/teaching-materials/blob/master/workshop/drawing/assets/r3.png]

    final int SIZE = 10;
    final int NUMBER_OF_SQUARES = 20;
    int x = 10, y = 10;
    for (int i = 0; i < NUMBER_OF_SQUARES; i++) {
      drawSquare(x, y, SIZE, graphics);
      x += SIZE;
      y += SIZE;
    }

  }

  public static void drawSquare(int x, int y, int size, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    graphics.drawRect(x, y, size, size);
    graphics.setColor(new Color(180, 0, 255));
    graphics.fillRect(x+1, y+1, size-1, size-1);
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