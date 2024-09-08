package Lab4;

import javax.swing.*;
import java.awt.*;

public class Lab4_midpointCircle extends JPanel{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Lab4_midpointCircle lab = new Lab4_midpointCircle();
        frame.setTitle("Lab4");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(lab);
        frame.setVisible(true);
    } 
    
    public void midpointCircle(Graphics g, int xc , int yc , int r){
        int x = 0;
        int y = r;
        int d = 1;
        int dx = 2*x;
        int dy = 2*y;

        while (x <= y) {
            plot(g, x+xc, y+yc,5);
            plot(g, -x+xc, y+yc,5);
            plot(g, x+xc, -y+yc,5);
            plot(g, -x+xc, -y+yc,5);
            plot(g, y+xc, x+yc,5);
            plot(g, -y+xc, x+yc,5);
            plot(g, y+xc, -x+yc,5);
            plot(g, -y+xc, -x+yc,5);
           
            x++;
            dx += 2;
            d = d+dx+1;

            if(d>=0){
                y--;
                dy -= 2;
                d = d-dy;
            }
        }
    }

    private void plot(Graphics g, double x, double y, int size) {
        g.fillRect((int) x, (int) y, size, size);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        midpointCircle(g ,300, 300, 100);
        
    }
}
