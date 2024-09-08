package Lab2;
import javax.swing.*;
import java.awt.*;

public class Lab2_Exercise1 extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Lab2_Exercise1 lab = new Lab2_Exercise1();
        frame.setTitle("Lab2");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(lab);
        frame.setVisible(true);
    }

    public void naiveLine(Graphics g, int x1, int y1, int x2, int y2) {
        float dx = x2 - x1;
        float dy = y2 - y1;
        float b = y1 - (dy / dx) * x1;

        for (int x = x1; x <= x2; x++) {
            int y = Math.round((dy / dx) * x) + Math.round(b);
            g.drawLine(x, y, x, y); // Draw a point at (x, y)
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Use the naiveLine method to draw the line
        naiveLine(g, 100, 100, 400, 200);
        naiveLine(g, 400, 300, 100, 200);
        naiveLine(g, 100, 100, 200, 400);
    }
}