import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class EggSignalAnimation extends JPanel implements Runnable {
    private int eggX = 50; // ตำแหน่งแกน X ของไข่
    private int eggY = 200; // ตำแหน่งแกน Y ของไข่
    private int eggDirection = 1; // ทิศทางของการเคลื่อนที่ของไข่ (1 = ขึ้น, -1 = ลง)
    private int spermX = 700; // ตำแหน่งแกน X ของอสุจิ
    private int spermY = 200; // ตำแหน่งแกน Y ของอสุจิ
    private final int eggWidth = 50; // ขนาดของไข่
    private final int spermWidth = 50; // ขนาดของอสุจิ
    private final int speed = 5; // ความเร็วของการเคลื่อนที่
    private final double speed2 = 1; // ความเร็วของการเคลื่อนที่
    private int tailLength = 50; // ความยาวของหาง
    private int[] tailX = new int[tailLength]; // ตำแหน่ง X ของหาง
    private int[] tailY = new int[tailLength]; // ตำแหน่ง Y ของหาง
    private int timeSperm = 0; // เวลา
    private boolean spermInsideCircle = false; // ตัวแปรเพื่อตรวจสอบว่าอสุจิอยู่ในวงกลมหรือไม่
    private boolean spermInEgg = false; // ตัวแปรเพื่อตรวจสอบว่าอสุจิอยู่ในไข่หรือไม่
    private BufferedImage spermImage; // รูปของอสุจิ
    private BufferedImage circleImage; // รูปของวงกลม

    public EggSignalAnimation() {
        loadImages(); // โหลดรูปภาพ
    }

    // โหลดรูปภาพของอสุจิและวงกลม
    private void loadImages() {
        // รูปของอสุจิ
        spermImage = new BufferedImage(spermWidth, spermWidth, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = spermImage.createGraphics();
        g2d.setColor(Color.BLUE);
        g2d.fillRect(0, 0, spermWidth, spermWidth);
        g2d.dispose();

        // รูปของวงกลม
        circleImage = new BufferedImage(200, 200, BufferedImage.TYPE_INT_ARGB);
        g2d = circleImage.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillOval(0, 0, 200, 200);
        g2d.dispose();
    }

    // เมทอด run() สำหรับการเคลื่อนที่ของไข่และอสุจิ
    public void run() {
        while (true) {
            
            // เคลื่อนที่ไข่ขึ้นลง
            eggY += eggDirection * speed2;

            // เมื่อไข่ชนขอบของหน้าต่าง สลับทิศทางการเคลื่อนที่ของไข่
            if (eggY <= 280 || eggY >= 300) {
                eggDirection *= -1;
            }
            
            // ให้อสุจิเคลื่อนที่เข้าหาไข่
            if (!spermInsideCircle) {
                if (spermX > eggX + 60) {
                    spermX -= speed; // อสุจิเคลื่อนที่ไปทางซ้าย
                } else if (spermX < eggX - 60) {
                    spermX += speed; // อสุจิเคลื่อนที่ไปทางขวา
                } else {
                    spermInsideCircle = true;
                }
            } else {
                if (!spermInEgg) {
                    if (spermY > eggY + 25) {
                        spermY -= speed; // อสุจิเคลื่อนที่ขึ้น
                    } else {
                        spermInEgg = true;
                    }
                } else {
                    if (spermY < getHeight() + spermWidth) {
                        spermY += speed; // อสุจิเคลื่อนที่ลง
                    } else {
                        spermY = -spermWidth; // ถ้าอสุจิอยู่นอกขอบของวงกลมให้ย้ายตำแหน่งอสุจิออกนอกจอ
                        // ตั้งค่าให้หางของอสุจิหายไปเพื่อความสวยงาม
                        tailLength = 0;
                    }
                }
            }

            // เคลื่อนที่หาง
            for (int i = tailLength - 1; i > 0; i--) {
                tailX[i] = tailX[i - 1];
                tailY[i] = tailY[i - 1];
            }
            tailX[0] = spermX + spermWidth / 2;
            tailY[0] = (int) (spermY + spermWidth / 2 + 10 * Math.sin(timeSperm * 0.5)); // เพิ่มค่าความยาวของคลื่น

            timeSperm++; // เพิ่มเวลา

            // วาดองค์ประกอบใหม่
            repaint();

            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }

    // เมทอด paintComponent() เพื่อวาดองค์ประกอบ
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight()); // วาดพื้นหลังสีดำ
        g.setColor(Color.YELLOW);
        g.fillOval(eggX, eggY, eggWidth, eggWidth); // วาดไข่

        // ถ้าอสุจิไม่ได้อยู่ในวงกลม ให้วาดอสุจิ
        if (!spermInsideCircle) {
            g.drawImage(spermImage, spermX, spermY, this);
        }

        // วาดหาง
        g.setColor(Color.BLUE);
        for (int i = 0; i < tailLength; i++) {
            if (i != 0) {
                g.drawLine(tailX[i], tailY[i], tailX[i - 1], tailY[i - 1]);
            }
        }

        // ถ้าอสุจิอยู่ในวงกลม ให้วาดวงกลม
        if (spermInsideCircle) {
            g.drawImage(circleImage, 100, 100, this);
        }
    }

    public static void main(String[] args) {
        EggSignalAnimation animation = new EggSignalAnimation();
        JFrame frame = new JFrame("Egg Signal Animation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(animation);
        frame.setVisible(true);

        // สร้างและเริ่ม Thread สำหรับการเคลื่อนที่ของไข่และอสุจิ
        Thread eggThread = new Thread(animation);
        eggThread.start();
    }
}
