import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LineInTheMiddle {
  public static void mainDraw(Graphics graphics){
    // Rajzolj egy piros vízszintes vonalat a vászon közepéig!
    // Rajzolj egy zöld függőleges vonalat a vászon közepéig!
    graphics.setColor(Color.RED);
    graphics.drawLine(0, HEIGHT/2, WIDTH/2, HEIGHT/2);
    graphics.setColor(Color.GREEN);
    graphics.drawLine(WIDTH/2, 0, WIDTH/2, HEIGHT/2);
  }

  public static Point getPosition(int width, int height) {
    Point position = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
    position.x -= WIDTH/2;
    position.y -= HEIGHT/2;
    return position;
  };

  // Boilerplate kód. A graphics működéséhez kell. Nem kell piszkálni.
  static int WIDTH = 320;  // vászon szélessége
  static int HEIGHT = 320; // vászon magassága

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocation(getPosition(WIDTH,HEIGHT));
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