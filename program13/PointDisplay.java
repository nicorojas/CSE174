import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;
import java.util.ArrayList;

public class PointDisplay extends JPanel
{
  private ArrayList<Point> points;
  private int diameter;
  private boolean connectTheDots;

  /**
   * Constructs a PointDisplay with a given array of points and a
   * diameter to be used for displaying those points. Add this
   * display to a JFrame object and it will automatically show its
   * points.
   *
   * @param points An array of Point objects to be displayed
   * @param diameter The diameter, in pixels, of each point to be
   *           displayed
   */
  public PointDisplay(ArrayList<Point> points, int diameter,
                      boolean connectTheDots) {
    this.points = points;
    this.diameter = diameter;
    this.connectTheDots = connectTheDots;
  }

  public PointDisplay(Point[] pointArray, int diameter,
                      boolean connectTheDots) {
    this.points = new ArrayList<Point>();
    for (Point p : pointArray) {
      points.add(p);
    }
    this.diameter = diameter;
    this.connectTheDots = connectTheDots;
  }



  public void add(Point p) {
    points.add(p);
    repaint();
  }

  public void add(Point[] pointArray) {
    for (Point p : pointArray) {
      points.add(p);
    }
  }

  public void add(ArrayList<Point> pointArrayList) {
    for (Point p : pointArrayList) {
      points.add(p);
    }
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);

    if (points != null)
      for (int i = 0; i < points.size(); i++) {
      Point p = points.get(i);
      float red = points.size() > 0 ? (float) i / points.size() : 0;
      float green = 0.0f;
      float blue = 1.0f - red;

      g.setColor(new Color(red, green, blue));
      if (p != null) {

        // Draw the point, if in range
        if (p.x <= 600 && p.x >= 0 &&
            p.y <= 600 && p.y >= 0) {
          g.fillOval(p.x - diameter / 2, p.y
                       - diameter / 2, diameter, diameter);


          // Connect the dots, if desired:
          if (connectTheDots) {
            if (i > 0 && points.get(i - 1) != null) {
              g.drawLine(points.get(i - 1).x, points.get(i - 1).y,
                         p.x, p.y);
            }
          }
        }

        else {
          System.out.println("POINT OUT OF BOUNDS ERROR! " + p.x + ", " + p.y);
          System.exit(0);
        }

      }

    }
  }

}
