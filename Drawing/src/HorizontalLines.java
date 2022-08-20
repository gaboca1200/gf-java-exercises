import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class HorizontalLines {
  public static void mainDraw(Graphics graphics) {
    /* Hozz létre egy függvényt, ami egy vonalat rajzol ki és 3 változót vár:
       az egyenes kiindulási x és y koordinátáit és a graphics-et.
       A függvény rajzoljon egy 50 pixel hosszú vízszintes vonalat a kezdőpontból.
       Használj egy cilklust arra, hogy a függvényeddel 3 vonalat rajzolj.*/
    final int LINE_LENGTH = 50;
    final int NUMBER_OF_LINES = 100;
    for (int i = 0; i < NUMBER_OF_LINES; i++) {
      int x = (int)(Math.random() * (WIDTH - LINE_LENGTH));
      int y = (int)(Math.random() * HEIGHT);
      drawHorizontalLine50PX(x, y, graphics);
    }


  }

  public static void drawHorizontalLine50PX(int x, int y, Graphics g) {
    g.drawLine(x, y, x + 50, y);
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