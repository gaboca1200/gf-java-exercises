import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    // Rajzolj egy négyzetet, aminek minden oldala más színű!
    //graphics.drawRect(20, 20, 200, 200);
    drawColoredBox(20, 20, 200, 200, graphics);
  }

  public static void drawColoredBox(int x, int y, int width, int height, Graphics graphics) {
    graphics.setColor(Color.RED);
    graphics.drawLine(x, y, x+width, y);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(x+width, y, x+width, y+height);
    graphics.setColor(Color.BLUE);
    graphics.drawLine(x+width, y+height, x, y+height);
    graphics.setColor(Color.ORANGE);
    graphics.drawLine(x, y+height, x, y);
  }

  /// Boilerplate kód. A graphics működéséhez kell. Nem kell piszkálni.
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