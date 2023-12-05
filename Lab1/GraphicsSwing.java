import javax.swing.*;
import java.awt.*;

public class GraphicsSwing extends JPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        GraphicsSwing m = new GraphicsSwing();
        
        f.setTitle("First Swing");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m); 
        f.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //ข้อคว่าม
        g.drawString("Hello", 40, 40);
        /* ------------------------------------------------ */
        //เปลี่ยนสีข้างล่าง
        g.setColor(Color.BLUE);
        //สี่เหลี่ยมเเบบเต็ม
        g.fillRect(130, 30, 100, 80);
        //วงรีกรวง
        g.drawOval(30, 130, 50, 60);
        /* ------------------------------------------------ */
        //เปลี่ยนสีข้างล่าง
        g.setColor(Color.RED);
        //เส้นตรง
        g.drawLine(0, 0, 200, 30);
        //วงรีเเบบเต็ม
        g.fillOval(130, 130, 50, 60);
        //เส้นโค้ง
        g.drawArc(30, 200, 40, 50, 90, 60);
        //สามเหลี่ยมเเบบเต็ม
        g.fillArc(30, 130, 40, 50, 180, 40);
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
    private void plot(Graphics g, int x, int y)
    {
        // plot จุด
        g.fillOval(x, y, 1, 1);
    }
}
