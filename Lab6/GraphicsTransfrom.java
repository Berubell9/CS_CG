package Lab6;
import java.awt.*;
import java.awt.geom.AffineTransform;

import javax.swing.*;
public class GraphicsTransfrom extends JPanel{
    public static void main(String[] args) {
        GraphicsTransfrom m = new GraphicsTransfrom();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("TRYAFFINETRANSFROM");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.drawRect(200, 200, 200, 200);

        g2.setColor(Color.RED);
        g2.setTransform(new AffineTransform(Math.cos(Math.toRadians(30)), -Math.sin(Math.toRadians(30)),
            Math.sin(Math.toRadians(30)), Math.cos(Math.toRadians(30)), 0, 0));
        g2.drawRect(200, 200, 200, 200);

        g2.setTransform(new AffineTransform());
        

        g2.setColor(Color.GREEN);
        g2.setTransform(new AffineTransform(2,0,0,2,-50,50));
        g2.drawRect(0, 0, 200, 200);

        // g2.setColor(Color.YELLOW);
        // g2.setTransform(new AffineTransform(1,0,0,1,300,100));
        // g2.drawRect(200, 200, 200, 200);

    }
}