import javax.swing.*;
import java.awt.*;

public class DinosaurDrawing extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        DinosaurDrawing giraffe = new DinosaurDrawing();
        frame.setTitle("Dinosaur Drawing");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(giraffe);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        
        //* ----- bg ----- */
        g.setColor(new Color(0x92CEA8));
        g.fillRect(0, 400, 600, 300);
        g.setColor(new Color(0xE1FEFE));
        g.fillRect(0, 0, 600, 400);

        //* ----- ตัดเส้น ----- */
        g.setColor(new Color(0x394039));
        g2.setStroke(new BasicStroke(3));
        g.drawArc(189, 484, 138, 180, 90, 90);
        g.drawArc(240, 293, 40, 65, 265, -170);
        g.drawArc(249, 250, 80, 95, 90, 90);
        g.drawLine(258, 360, 258, 482);

        g.drawArc(251, 484, 140, 180, 90, -90);
        g.drawArc(301, 293, 40, 65, -265, -170);
        g.drawArc(251, 250, 80, 95, 90, -90);
        g.drawLine(325, 360, 325, 482);

         //*----- neck ----- */
        g.setColor(new Color(0x97B3AD));
        g.fillRect(259, 350, 65, 150);
        g.setColor(new Color(0x8fa197));
        g.fillRect(294, 350, 30, 150);
        g.setColor(new Color(0xdde2dd));
        g.fillRect(270, 350, 20, 150);
        g.setColor(new Color(0xD0E1DD ));
        g.fillRect(290, 350, 23, 150);
        // g.setColor(new Color(0xd2d9d2));
        // g.fillRect(269, 350, 45, 150);
        

        //* ----- head ----- */
        g.setColor(new Color(0x97B3AD));
        g.fillArc(250, 250, 80, 100, 90, 90);
        g.setColor(new Color(0x8fa197));
        g.fillArc(250, 250, 80, 100, 90, -90);

         //eye
        g.setColor(new Color(0xffffff));
        g.fillOval(258, 265, 20, 35);
        g.setColor(new Color(0xffffff));
        g.fillOval(302, 265, 20, 35);
        g.setColor(new Color(0x313131));
        g.fillOval(260, 270, 15, 20);
        g.setColor(new Color(0x313131));
        g.fillOval(305, 270, 15, 20);

        g.setColor(new Color(0xc7d0c7));
        g.fillArc(240, 280, 100, 90, 90, 90);
        g.setColor(new Color(0xB2CAC5));
        g.fillArc(240, 280, 100, 90, 90, -90);
        g.setColor(new Color(0xB6C8BE));
        g.fillArc(240, 280, 100, 90, 180, 180);
        
        //mouth
        g.setColor(new Color(0x313131));
        g2.setStroke(new BasicStroke(4));
        g.drawArc(250, 310, 80, 50, 200, 150);

        //nose
        g.setColor(new Color(0x313131));
        g.fillOval(260, 300, 15, 10);
        g.setColor(new Color(0x313131));
        g.fillOval(305, 300, 15, 10);

       //* ----- body ----- */
        g.setColor(new Color(0xb9c4b9));
        g.fillArc(190, 477, 200, 175, 90, 90);
        g.setColor(new Color(0x6B8C87));
        g.fillArc(190, 477, 200, 175, 90, -90);
        g.setColor(new Color(0xD0E1DD ));
        g.fillArc(215, 475, 150, 190, 90, 90);
        g.setColor(new Color(0xdde2dd));
        g.fillArc(215, 475, 150, 190, 90, -90);
        

        //* ----- String ----- */
        g.setFont(new Font("Kanit", Font.BOLD, 45));
        g.setColor(new Color(0xffbbda));
        g.drawString("DINOSAUR", 40, 60);
        g.setColor(new Color(0xfcf6bd));
        g.drawString("DINOSAUR", 310, 60);
        g.setColor(new Color(0xffe2d1));
        g.drawString("DINOSAUR", 40, 120);
        g.setColor(new Color(0xd0f4de));
        g.drawString("DINOSAUR", 310, 120);
        g.setColor(new Color(0xc0e4f6));
        g.drawString("DINOSAUR", 40, 180);
        g.setColor(new Color(0xe8cff8));
        g.drawString("DINOSAUR", 310, 180);
       
        //* ----- Grass ----- */
        g2.setStroke(new BasicStroke(2));
        g.setColor(new Color(0x80B7A2));
        g.drawLine(100, 500, 110, 490);
        g.drawLine(100, 500, 100, 485);
        g.drawLine(100, 500, 90, 490);

        g.setColor(new Color(0xD0F4DE));
        g.drawLine(200, 470, 210, 460);
        g.drawLine(200, 470, 200, 455);
        g.drawLine(200, 470, 190, 460);

        g.setColor(new Color(0x577460));
        g.drawLine(20, 430, 30, 420);
        g.drawLine(20, 430, 20, 415);
        g.drawLine(20, 430, 10, 420);

        g.setColor(new Color(0x577460));
        g.drawLine(20, 430, 30, 420);
        g.drawLine(20, 430, 20, 415);
        g.drawLine(20, 430, 10, 420);
    }
}
