import javax.swing.*;
import java.awt.*;

public class Dot extends JPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Dot m = new Dot();
        
        f.setTitle("First Swing");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m); 
        f.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // 1
        g.setColor(new Color(0xB5A3A1));
        plot(g, 37,89);
        // 2
        g.setColor(new Color(0xF898A4));
        plot(g, 190, 41);
        // 3
        g.setColor(new Color(0xDFC2C3));
        plot(g, 562, 352);
        // 4
        g.setColor(new Color(0xE0C7EE));
        plot(g, 10, 11);
        // 5
        g.setColor(new Color(0xFCEE9E));
        plot(g, 258, 269);
        // 6
        g.setColor(new Color(0x92CEA8));
        plot(g, 96,520);
        // 7
        g.setColor(new Color(0x8BD2EC));
        plot(g, 452, 84);
        // 8
        g.setColor(new Color(0x75464A));
        plot(g, 376, 282);
        // 9
        g.setColor(new Color(0x464543));
        plot(g, 165, 17);
        // 10
        g.setColor(new Color(0x7F867B));
        plot(g, 45, 359);
    }

    public void plot(Graphics g, int x, int y) {
        g.fillOval(x, y, 1, 1);
    }
}
