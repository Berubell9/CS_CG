package Lab2;
import javax.swing.*;
import java.awt.*;

public class Lab2_Exercise2 extends JPanel {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Lab2_Exercise2 lab = new Lab2_Exercise2();
        frame.setTitle("Lab2");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(lab);
        frame.setVisible(true);
    }

    public void DDALine(Graphics g, int x1, int y1, int x2, int y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;

        double x,y;
        double m = dy / dx;

        if (m <= 1 && m >= 0) {
            y = Math.min(y1,y2);
            for (x = Math.min(x1,x2); x <= Math.max(x1,x2); x++) {
                y = y + m;
                plot(g, (int)x, (int)y);
            }
        } else if (m >= -1 && m < 0) {
            y = Math.max(y1,y2);
            for (x = Math.max(x1,x2); x >= Math.min(x1,x2); x--) {
                y = y + m;
                plot(g, (int)x, (int)y);
            }
        } else if (m > 1) {
            x = Math.min(x1,x2);
            for (y = Math.min(y1,y2); y <= Math.max(y1,y2); y++) {
                x = x + 1 / m;
                plot(g, (int)x, (int)y);
            }
        } else {
            x = Math.max(x1,x2);
            for (y = Math.max(y1,y2); y <= Math.min(y1,y2); y--) {
                x = x + 1 / m;
                plot(g, (int)x, (int)y);
            }
        }
    }

    public void plot(Graphics g, int x, int y) {
        g.drawLine(x, y, x, y); // Draw a point at (x, y)
    }

    @Override
    public void paintComponent(Graphics g) {
        DDALine(g, 100, 100, 400, 200);
        DDALine(g, 400, 300, 100, 200);
        DDALine(g, 100, 100, 200, 400);
    }
}

