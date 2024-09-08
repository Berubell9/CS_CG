import java.awt.*;
import javax.swing.*;

class AllGraphics extends JPanel implements Runnable {

    double circleMove = 0;
    double squareRotate = 0;
    double circleDirect = 0;
    double squareMove = 0;
    double counttime = 0;

    public void run() {
        double lastTime = System.currentTimeMillis();
        double currentTime, elapsedTime;

        while (true) {
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;
            lastTime = currentTime;
            counttime += 1 * elapsedTime / 1000;

            // TODO: update logics

            // chane millisecond to seconds
            // move 50 pixel per second

            if (circleMove >= 500) { // Right edge collision check

                circleDirect = -50; // Change direction
            } else if (circleMove <= 0) { // Left edge collision check

                circleDirect = 50; // Change direction
            }

            circleMove += circleDirect * elapsedTime / 1000.0;

            // Rotate 0.5 radians per second
            // squareRotate += 0.5 * elapsedTime / 1000.0;
            // System.out.println(squareMove);

            if (counttime >= 3) {
                if (squareMove >= -500)
                    squareMove -= 100 * elapsedTime / 1000.0;
            }

            // Display
            repaint();
        }
    }

    public static void main(String[] args) {
        AllGraphics m = new AllGraphics();

        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("Graphics");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        (new Thread(m)).start();
    }

    public void paintComponent(Graphics g) {

        /* circle move with unclear old frame */
        // g.drawOval(0, 0, 100, 100);
        // Graphics2D g2 = (Graphics2D) g;
        // g2.translate(circleMove, 0);
        // g2.drawOval(0, 0, 100, 100);

        /* circle move with clear old frame */
        // Graphics2D g2 = (Graphics2D) g;
        // g2.setColor(Color.WHITE);
        // g2.fillRect(0, 0, 600, 600);
        // g2.setColor(Color.BLACK);
        // g2.translate(circleMove, 0);
        // g2.drawOval(0, 0, 100, 100);

        /* rotating square */
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, 600, 600);
        g2.setColor(Color.BLACK);
        g2.translate(circleMove, 0);
        g2.drawOval(0, 0, 100, 100);
        g2.translate(-circleMove, 0);

        // g2.rotate(squareRotate,300,300);
        // g2.drawRect(200, 200, 200, 200);

        // g2.rotate(squareRotate,50,550);

        g2.translate(0, squareMove);
        g2.drawRect(0, 500, 100, 100);
        g2.translate(0, -squareMove);

    }
}