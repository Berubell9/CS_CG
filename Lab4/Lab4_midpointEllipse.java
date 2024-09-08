package Lab4;

import javax.swing.*;
import java.awt.*;

public class Lab4_midpointEllipse extends JPanel{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Lab4_midpointEllipse lab = new Lab4_midpointEllipse();
        frame.setTitle("Lab4");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(lab);
        frame.setVisible(true);
    } 
    
    public void midpointEllipse(Graphics g, int xc , int yc , int a ,int b){
        int a2 = a * a;
        int b2 = b * b;
        int twoA2 = 2 * a2;
        int twoB2 = 2 * b2;

        // Region 1
        int x = 0;
        int y = b;
        int D = Math.round(b2 - a2 * b + a2 / 4);
        int Dx = 0;
        int Dy = twoA2 * y;

        while (Dx <= Dy) {

            plot(g, xc + x, yc + y, 5);
            plot(g, xc + x, yc - y, 5);
            plot(g, xc - x, yc + y, 5);
            plot(g, xc - x, yc - y, 5);

            x += 1;
            Dx += twoB2;
            D += Dx + b2;

            if (D >= 0) {
                y -= 1;
                Dy -= twoA2;
                D -= Dy;
            }
        }

        // Region 2
        x = a;
        y = 0;
        D = Math.round(a2 - b2 * a + b2 / 4);
        Dx = twoB2 * x;
        Dy = 0;

        while (Dx >= Dy) {

            plot(g, xc + x, yc + y, 5);
            plot(g, xc + x, yc - y, 5);
            plot(g, xc - x, yc + y, 5);
            plot(g, xc - x, yc - y, 5);

            y += 1;
            Dy += twoA2;
            D += Dy + a2;

            if (D >= 0) {
                x -= 1;
                Dx -= twoB2;
                D -= Dx;
            }
        }
    }

    private void plot(Graphics g, double x, double y, int size) {
        g.fillRect((int) x, (int) y, size, size);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        midpointEllipse(g ,300, 300, 200,100);
        
    }
}
