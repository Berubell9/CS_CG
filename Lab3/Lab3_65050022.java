import java.awt.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.Queue;

class Lab3_65050022 extends JPanel {
    public static void main(String[] args) {
        Lab3_65050022 lab3 = new Lab3_65050022();

        JFrame f = new JFrame();
        f.add(lab3);
        f.setTitle("Lab3");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);

    }

    public void paintComponent(Graphics g) {

        BufferedImage buffer = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer.createGraphics();

        g2.setColor(Color.white);
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.black);

        bezierCurve(g2, 200, 500, 100, 200, 500, 200, 400, 500);

        bezierCurve(g2, 200, 500, 100, 200, 400, 500, 500, 200);

        bezierCurve(g2, 200, 500, 500, 200, 100, 200, 400, 500);

        int xPoly[] = { 150, 250, 325, 375, 400, 275, 100 };
        int yPoly[] = { 150, 100, 125, 225, 325, 375, 300 };

        Polygon polygon = new Polygon(xPoly, yPoly, 7);
        polygon.addPoint(150, 150);
        polygon.addPoint(250, 100);
        polygon.addPoint(325, 125);
        polygon.addPoint(375, 225);
        polygon.addPoint(400, 325);
        polygon.addPoint(275, 375);
        polygon.addPoint(100, 300);
        g2.drawPolygon(polygon);

        buffer = FloodFill(buffer, 200, 150, Color.WHITE, Color.GREEN);
        
        buffer = FloodFill(buffer, 400, 400, Color.white, Color.gray);

        g.drawImage(buffer, 0, 0, null);
    }

    private void plot(Graphics g, double x, double y, int size) {
        g.fillRect((int) x, (int) y, size, size);
    }

    public void bezierCurve(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        for (int i = 0; i <= 1000; i++) {
            double t = i / 1000.0;
            int x = (int) (Math.pow((1 - t), 3) * x1
                    + 3 * t * Math.pow((1 - t), 2) * x2
                    + 3 * Math.pow((t), 2) * (1 - t) * x3 + Math.pow(t, 3) * x4);

            int y = (int) (Math.pow((1 - t), 3) * y1
                    + 3 * t * Math.pow((1 - t), 2) * y2
                    + 3 * Math.pow((t), 2) * (1 - t) * y3 + Math.pow(t, 3) * y4);

            plot(g, x, y, 3);
        }
    }

    public BufferedImage FloodFill(BufferedImage m, int x, int y, Color targetColour, Color replacementColor) {
        Graphics2D g2 = m.createGraphics();
        Queue<Point> q = new LinkedList<>();

        if (m.getRGB(x, y) == targetColour.getRGB()) {
            g2.setColor(replacementColor);
            plot(g2, x, y, 1);
            q.add(new Point(x, y));
        }

        while (!q.isEmpty()) {
            Point p = q.poll();

            // South
            if (p.y < 600 && m.getRGB(p.x, p.y + 1) == targetColour.getRGB()) {
                g2.setColor(replacementColor);
                plot(g2, p.x, p.y + 1, 1);
                q.add(new Point(p.x, p.y + 1));
            }
            // North
            if (p.y > 0 && m.getRGB(p.x, p.y - 1) == targetColour.getRGB()) {
                g2.setColor(replacementColor);
                plot(g2, p.x, p.y - 1, 1);
                q.add(new Point(p.x, p.y - 1));
            }
            // East
            if (p.x < 600 && m.getRGB(p.x + 1, p.y) == targetColour.getRGB()) {
                g2.setColor(replacementColor);
                plot(g2, p.x + 1, p.y, 1);
                q.add(new Point(p.x + 1, p.y));
            }
            // West
            if (p.x > 0 && m.getRGB(p.x - 1, p.y) != Color.BLACK.getRGB()) {
                g2.setColor(replacementColor);
                plot(g2, p.x - 1, p.y, 1);
                q.add(new Point(p.x - 1, p.y));
            }
        }
        return m;
    }

}
