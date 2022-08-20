import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Diagonals {
  public static void mainDraw(Graphics graphics) {
    // Rajzold meg a vászon átlóit!
    // A bal felső saroból induló legyen zöld, a másik pedig piros!
    graphics.setColor(Color.GREEN);
    graphics.drawLine(0, 0, WIDTH-1, HEIGHT-1);
    graphics.setColor(Color.RED);
    graphics.drawLine(WIDTH-1, 0, 0, HEIGHT-1);
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