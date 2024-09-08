package Lab2;
import javax.swing.*;
import java.awt.*;

public class Lab2_Exercise3 extends JPanel {
     public static void main(String[] args) {
        JFrame frame = new JFrame();
        Lab2_Exercise3 lab = new Lab2_Exercise3();
        frame.setTitle("Lab2");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(lab);
        frame.setVisible(true);
    }

    public void bresenhamLine(Graphics g ,int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;
        boolean isSwap = false;

        if (dy > dx) {
            // Swap
            int temp = dx;
            dx = dy;
            dy = temp;
            isSwap = true;
        }
        int D = 2 * dy - dx;
        int x = x1;
        int y = y1;

        for (int i = 1; i <= dx; i++) {
            plot(g ,x, y);
            if (D >= 0) {
                if (isSwap) x += sx;
                else y += sy;
                D -= 2 * dx;
            }
            if (isSwap) y += sy;
            else x += sx;
            D += 2 * dy;
        }
    }

    public void plot(Graphics g,int x, int y) {
        g.drawLine(x, y, x, y); // Draw a point at (x, y)
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        bresenhamLine(g ,100, 100, 400, 200);
        bresenhamLine(g, 400, 300, 100, 200);
        bresenhamLine(g, 100, 100, 200, 400);
    }
}
