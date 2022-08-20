import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  public static void mainDraw(Graphics graphics) {
    // rajzoltass ki négy különböző méretű és színű négyzetet a vászonra
    // kerüld a kódismétlést
    final int NUMBER_OF_SQUARES = 4;
    for (int i = 0; i < NUMBER_OF_SQUARES; i++) {
      int maxSize = HEIGHT >= WIDTH ? WIDTH : HEIGHT;
      int size = (int) (Math.random() * maxSize + 1);
      int x = (int) (Math.random() * (WIDTH - size));
      int y = (int) (Math.random() * (HEIGHT - size));
      Color color = new Color(
          (int)(Math.random() * 255),
          (int)(Math.random() * 255),
          (int)(Math.random() * 255)
          );
      graphics.setColor(color);
      graphics.drawRect(x, y, size, size);
    }

  }

  // Boilerplate kód. A graphics működéséhez kell. Nem kell piszkálni. Vagy piszkáld, ha szeretnéd :)
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