import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
  public static void mainDraw(Graphics graphics) {
    /* Hozz létre egy függvényet, ami egy egyenest rajzol és 3 változót vár:
       az vonal kiindulási x és y koordinátáit és a graphics-et.
       Az vonal a vászon közepébe fusson.
       Használj egy cilklust arra, hogy a függvényeddel 3 vonalat rajzolj. */
    for (int i = 0; i < 3; i++) {
      drawLineToCenter((int) (Math.random()*WIDTH), (int) (Math.random()*HEIGHT), graphics);
    }
  }

  public static void drawLineToCenter(int x, int y, Graphics g) {
    g.drawLine(x, y, WIDTH/2, HEIGHT/2);
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