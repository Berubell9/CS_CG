import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Assignment2_65050022_65050042 extends JPanel implements Runnable {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Assignment2_65050022_65050042 Assingment2 = new Assignment2_65050022_65050042();
        frame.setTitle("FROM BABIES TO ...");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(Assingment2);
        frame.setVisible(true);
        (new Thread(Assingment2)).start();
    }

    double Move1 = 0;
    double velocityBackGround = 50.0;
    double frame = 0;
    double framePerSec = 30.0;

    public void run() {

        double lastTime = System.currentTimeMillis();
        double currentTime, elapsedTime;

        while (true) {

            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;
            lastTime = System.currentTimeMillis();

            // Update cloud
            Move1 -= velocityBackGround * elapsedTime / 1000.0;
            if (Move1 <= -1200) {
                Move1 = 600;
            }

            // Update frame
            frame += framePerSec * elapsedTime / 5000.0;
            if (frame >= 100) {
                System.out.println(frame);
                frame = 0;
            }

            // Update sperm positions
            updateSpermPosition();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            repaint();
        }
    }

    public int spermX = 600;
    public int spermY = 300;
    public int eggY = 300;
    public final double speed = 0.1; // ความเร็วของการเคลื่อนที่
    public int tailLength = 100; // ความยาวของหาง
    public int[] tailX = new int[tailLength];
    public int[] tailY = new int[tailLength];
    public final int spermWidth = 10; // ขนาดของอสุจิ
    public int timeSperm = 0; // เวลา

    public void updateSpermPosition() {
        // Sperm
        if (spermX >= 300) {
            spermX -= 1;
        } else {
            spermX = 250;
            spermY = 200;
        }

        // Tail
        for (int i = tailLength - 1; i > 0; i--) {
            tailX[i] = tailX[i - 1];
            tailY[i] = tailY[i - 1];
        }
        tailX[0] = spermX + spermWidth / 2;
        tailY[0] = (int) (spermY + spermWidth / 2 + 5 * Math.sin(timeSperm * 0.5));
        timeSperm++;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        /* ------ Frame 1 ------ */
        if (frame >= 0 && frame <= 30) {
            backGround_1(g);
            egg(g, 200, eggY);
            sperm(g, spermX, spermY);
        }
        /* ------ Frame 2 ------ */
        else if (frame >= 30 && frame <= 32) {
            Boom_1(g);
        }
        /* ------ Frame 3 ------ */
        else if (frame >= 32 && frame <= 35) {
            Boom_2(g);
        }
        /* ------ Frame 4 ------ */
        else if (frame >= 35 && frame <= 37) {
            setBackground(Color.ORANGE);
        }
        /* ------ Frame 5 ------ */
        else if (frame >= 37 && frame <= 40) {
            setBackground(Color.red);
        }
        /* ------ Frame 6 ------ */
        else if (frame >= 40 && frame <= 50) {
            backGround_2(g);
            Baby(g);
        }
        /* ------ Frame 7 ------ */
        else if (frame >= 50 && frame <= 60) {
            backGround_2(g);
            Child(g);
        }
        /* ------ Frame 8 ------ */
        else if (frame >= 60 && frame <= 70) {
            backGround_2(g);
            Teen(g);
        }
        /* ------ Frame 9 ------ */
        else if (frame >= 70 && frame <= 100) {
            backGround_2(g);
            Adult(g);
        }
    }

    public void egg(Graphics g, int x, int y) {
        // all layers
        ArrayList<BufferedImage> layers = new ArrayList<>();

        // Egg
        int faceOffsetY = (int) (Math.sin(System.currentTimeMillis() * 0.004) * 5);
        layers.add(
                makeCircleFill(x - 20, y - 30 + faceOffsetY, 170, new Color(255, 255, 255), new Color(255, 255, 255)));

        // Face egg
        if (spermX <= 350) {
            layers.add(makeCircleFill(x - 40, y - 50 + faceOffsetY, 15, Color.black, Color.black)); // Left eye
            layers.add(makeCircleFill(x + 40, y - 50 + faceOffsetY, 15, Color.black, Color.black)); // Right eye
            layers.add(makeCircleFill(x, y + 20 + faceOffsetY, 45, Color.black, Color.black)); // Mouth
        } else {
            layers.add(makeCircleFill(x - 40, y - 40 + faceOffsetY, 10, Color.black, Color.black)); // Left eye
            layers.add(makeCircleFill(x + 40, y - 40 + faceOffsetY, 10, Color.black, Color.black)); // Right eye
            layers.add(makeCircleFill(x, y + 5 + faceOffsetY, 10, Color.black, Color.black)); // Mouth
        }

        // Draw to Graphics
        drawLayerToImages(g, layers);
    }

    public void sperm(Graphics g, int x, int y) {
        ArrayList<BufferedImage> layers = new ArrayList<>();

        // Body
        layers.add(makeOvalFill(x, y, 30, 15, new Color(255, 255, 255), new Color(255, 255, 255)));

        // Tail
        g.setColor(Color.white);
        for (int i = 0; i < tailLength; i++) {
            if (i != 0) {
                g.drawLine(tailX[i], tailY[i], tailX[i - 1], tailY[i - 1]);
            }
        }

        drawLayerToImages(g, layers);
    }

    public void Boom_1(Graphics g) {
        BufferedImage buffer0 = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g0 = buffer0.createGraphics();

        setBackground(new Color(255,157,0));

        // Mid
        int[] xMid = {150,120,230,326,415,597,491,498,592,537,556,396,380,297,226,187,151,37,107,42,149,159};
        int[] yMid = {150,80,97,32,98,110,236,268,324,396,461,431,582,560,597,494,471,503,369,243,218,170};
        g0.setColor(new Color(255,192,84));
        g0.fillPolygon(xMid, yMid, 22);

        // In
        int[] xIn = {297,331,350,407,412,436,395,388,357,325,295,239,236,195,224,201,218,208};
        int[] yIn  = {208,169,215,222,262,290,307,341,344,456,433,455,397,385,340,307,287,274};
        g0.setColor(new Color(255,205,118));
        g0.fillPolygon(xIn, yIn, 18);

        g.drawImage(buffer0, 0, 0, null);
    }
    public void Boom_2(Graphics g) {
        BufferedImage buffer0 = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g0 = buffer0.createGraphics();

        setBackground(new Color(255,157,0));

        // Mid
        int[] xMid = {49,215,279,359,428,446,546,592,588,542,589,532,571,431,44,384,349,287,218,173,7,73,12,106};
        int[] yMid = {31,93,3,75,6,94,126,145,255,289,346,346,532,459,591,558,584,549,586,473,543,355,226,207};
        g0.setColor(new Color(255,192,84));
        g0.fillPolygon(xMid, yMid, 24);

        // In
        int[] xIn = {213,198,275,309,357,446,418,477,411,447,372,375,291,233,217,130,200,124,221};
        int[] yIn  = {267,142,186,108,190,141,227,331,334,435,411,510,435,511,396,425,346,271,265};
        g0.setColor(new Color(255,205,118));
        g0.fillPolygon(xIn, yIn, 19);
        
        g.drawImage(buffer0, 0, 0, null);
    }

    public void Baby(Graphics g) {
        BufferedImage buffer0 = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g0 = buffer0.createGraphics();
        ArrayList<BufferedImage> layers = new ArrayList<>();
        
        // Ear
        layers.add(makePolygonFill(new Point[] { new Point(224, 299), new Point(213, 302), new Point(208, 312),new Point(210,326),new Point(215,330),new Point(225,330) },new Color(248, 220, 196), new Color(248, 220, 196)));
        layers.add(makePolygonFill(new Point[] { new Point(375, 301), new Point(380, 304), new Point(386, 310),new Point(389,318),new Point(386,326),new Point(380,332), new Point(373,335)},new Color(248, 220, 196), new Color(248, 220, 196)));

        // Mouth
        int[] xMouth = {270,280,288,301,315,309,301,288,281,274,271};
        int[] yMouth  = {332,331,332,334,340,347,353,353,350,343,337};
        g0.setColor(new Color(255,183,212));
        g0.fillPolygon(xMouth, yMouth, 11);
        
        // Arm Left
        int[] xArmLeft = {244,235,226,220,214,211,214,223,236,247,253,257,258,253,246,245,240,233,236,240,241,247};
        int[] yArmLeft  = {372,381,390,402,414,427,433,440,444,444,440,434,427,420,415,411,407,409,401,391,382,375};
        g0.setColor(new Color(248, 220, 196));
        g0.fillPolygon(xArmLeft, yArmLeft, 22);

        // Arm Right
        int[] xArmRight = {349,352,357,358,356,351,341,335,322,314,307,302,300,304,304,308,309,302,294,309,323,339};
        int[] yArmRight  = {374,382,393,403,422,435,449,455,464,466,464,459,451,451,451,436,435,414,393,388,388,380};
        g0.setColor(new Color(248, 220, 196));
        g0.fillPolygon(xArmRight, yArmRight, 22);

        // Leg Left
        int[] xLegLeft = {321,338,346,354,358,360,359,363,363,357,341,329,318,313,312,321,316,320,320};
        int[] yLegLeft  = {466,453,457,464,472,483,489,494,503,511,517,518,515,509,505,495,485,476,466};
        g0.setColor(new Color(248, 220, 196));
        g0.fillPolygon(xLegLeft, yLegLeft, 18);

        // Leg Right
        int[] xLegRight = {238,239,242,246,246,243,239,222,202,196,194,194,199,198,201,207,227,238};
        int[] yLegRight  = {456,469,483,494,505,512,516,518,516,511,505,494,486,482,476,475,460,457};
        g0.setColor(new Color(248, 220, 196));
        g0.fillPolygon(xLegRight, yLegRight, 18);
        
        /* Milk bottle */ 
        int[] xTop = {247,246,249,254,258,264,254};
        int[] yTop  = {374,358,354,353,360,370,371};
        g0.setColor(Color.white);
        g0.fillPolygon(xTop, yTop, 7);

        int[] xMid = {241,241,245,251,258,267,272,276,266,256,243};
        int[] yMid  = {390,384,378,373,371,370,373,380,380,383,389};
        g0.setColor(new Color(255,183,212));
        g0.fillPolygon(xMid, yMid, 10);

        int[] xLow = {234,236,240,245,253,270,282,289,309,304,303,300,305,309,320,318,313,308,265,258,250,244,236,247,256,257,255,248,246,244,236,234};
        int[] yLow   = {408,401,393,388,383,380,382,387,437,437,444,448,464,466,466,478,489,494,503,501,497,491,445,445,438,430,422,415,414,409,408,408};
        g0.setColor(new Color(214,230,255));
        g0.fillPolygon(xLow , yLow , 31);

        int[] xIn = {257,275,292,304,309,304,303,303,300,300,304,311,320,319,312,306,289,278,262,252,244,240,238,237,248,254};
        int[] yIn   = {432,432,430,423,436,437,443,445,448,456,463,466,466,477,490,495,499,501,502,499,493,477,455,446,444,439};
        g0.setColor(Color.white);
        g0.fillPolygon(xIn , yIn , 26);
     
        // Hair
        g0.setColor(Color.BLACK);
        makeCurve(g0, 295, 238, 284, 255, 295, 269, 304, 255, 2);
        makeCurve(g0, 304, 255, 301, 252, 296, 248, 292, 250, 2);
        
        // Head
        layers.add(makeCircleFill(297, 315, 78, Color.black, new Color(248, 220, 196)));
        layers.add(makeOvalFill(247, 321, 10, 5, new Color(255,183,212), new Color(255,183,212)));
        layers.add(makeOvalFill(340, 339, 10, 5, new Color(255,183,212), new Color(255,183,212)));

        // Eye
        layers.add(makeOvalFill(271, 306, 6, 10, Color.black, Color.black));
        layers.add(makeOvalFill(322, 311, 6, 10, Color.black, Color.black));

        // Mouth
        makeCurve(g0, 270, 332, 288, 331, 304, 333, 316, 339, 2);
        makeCurve(g0, 270, 332, 272, 360, 310, 360, 316, 339, 2);

        // Ear
        makeCurve(g0, 220, 298, 202, 303, 202, 327, 222, 333, 2);
        makeCurve(g0, 373, 300, 395, 308, 395, 331, 373, 335, 2);

        // Milk bottle
        makeCurve(g0, 247, 373, 243, 346, 255, 346, 263, 368, 2);
        makeCurve(g0, 240, 388, 242, 368, 272, 365, 275, 378, 2);

        makeCurve(g0, 234, 408, 237, 375, 285, 375, 290, 389, 2);
        makeCurve(g0, 290, 389, 295, 398, 304, 421, 309, 434, 2);
        makeCurve(g0, 320, 467, 322, 475, 319, 486, 308, 494, 2);
        makeCurve(g0, 308, 494, 301, 497, 277, 502, 265, 503, 2);
        makeCurve(g0, 265, 503, 250, 502, 245, 496, 242, 486, 2);
        makeCurve(g0, 242, 486, 239, 474, 239, 463, 236, 445, 2);

        // Arm and Hand left
        makeCurve(g0, 246, 370, 225, 384, 210, 414, 212, 431, 2);
        makeCurve(g0, 213, 433, 226, 444, 240, 447, 250, 444, 2);
        makeCurve(g0, 250, 444, 260, 437, 261, 425, 247, 415, 2);
        makeCurve(g0, 245, 415, 248, 409, 242, 404, 229, 412, 2);

        // Arm and Hand right
        makeCurve(g0, 347, 373, 367, 400, 362, 438, 323, 465, 2);
        makeCurve(g0, 323, 465, 302, 473, 292, 449, 305, 445, 2);
        makeCurve(g0, 304, 444, 301, 437, 308, 434, 316, 440, 2);
        makeCurve(g0, 315, 440, 326, 435, 334, 425, 332, 408, 2);

        // Leg and Foot left
        makeCurve(g0, 338, 454, 355, 460, 363, 474, 360, 490, 2);
        makeCurve(g0, 313, 503, 322, 495, 330, 484, 337, 479, 2);
        makeCurve(g0, 337, 479, 344, 476, 350, 480, 349, 484, 2);
        makeCurve(g0, 245, 415, 248, 409, 242, 404, 229, 412, 2);
        makeCurve(g0, 348, 486, 365, 480, 368, 505, 360, 509, 2);
        makeCurve(g0, 362, 509, 324, 528, 310, 514, 313, 503, 2);
        makeCurve(g0, 317, 486, 318, 489, 319, 493, 320, 495, 2);

        // Leg and Hand right
        makeCurve(g0, 238, 456, 226, 460, 215, 466, 208, 475, 2);
        makeCurve(g0, 244, 494, 230, 491, 216, 481, 207, 476, 2);
        makeCurve(g0, 208, 475, 199, 475, 196, 481, 201, 484, 2);
        makeCurve(g0, 199, 485, 192, 492, 191, 508, 200, 516, 2);
        makeCurve(g0, 200, 516, 212, 518, 233, 518, 241, 515, 2);
        makeCurve(g0, 244, 493, 248, 499, 247, 509, 241, 515, 2);

        drawLayerToImages(g, layers);
        g.drawImage(buffer0, 0, 0, null);
    }

    public void Child(Graphics g) {
        BufferedImage buffer0 = new BufferedImage(2001, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g0 = buffer0.createGraphics();
        ArrayList<BufferedImage> layers = new ArrayList<>();

        // Neck
        int[] x2 = { 300, 314, 313, 315, 311, 303, 298, 294, 299, 301, };
        int[] y2 = { 274, 275, 279, 281, 286, 287, 285, 281, 281, 278, };
        g0.setColor(new Color(255, 228, 204));
        g0.fillPolygon(x2, y2, 10);

        // Shirt
        int[] x3 = { 282, 288, 292, 296, 301, 307, 313, 318, 321, 324, 323, 321, 311, 314, 306, 296, 290, 286, };
        int[] y3 = { 285, 282, 281, 286, 289, 289, 287, 282, 285, 293, 301, 307, 304, 297, 296, 295, 294, 288, };
        int[] x4 = { 279, 284, 293, 299, 304, 310, 317, 317, 275, 278, };
        int[] y4 = { 310, 310, 311, 317, 319, 319, 317, 327, 327, 317, };
        g0.setColor(new Color(101, 51, 1));
        g0.fillPolygon(x3, y3, 18);
        g0.fillPolygon(x4, y4, 10);

        // Arm
        int[] x5 = { 272, 275, 278, 290, 290, 313, 308, 321, 313, 305, 293, 282, 269, 266, 271, 275, };
        int[] y5 = { 286, 284, 285, 297, 297, 298, 304, 309, 318, 318, 309, 308, 305, 301, 297, 294, };
        g0.setColor(new Color(255, 228, 204));
        g0.fillPolygon(x5, y5, 16);

        // Trousers
        int[] x6 = { 273, 318, 336, 319, 306, 299, 291, 284, 269, 256, 266, };
        int[] y6 = { 327, 327, 395, 396, 400, 339, 339, 395, 392, 393, 348, };
        g0.setColor(new Color(0, 102, 51));
        g0.fillPolygon(x6, y6, 11);

        // Foot
        int[] x7 = { 255, 268, 284, 282, 243, 242, 241, };
        int[] y7 = { 394, 393, 396, 412, 411, 411, 407, };
        int[] x8 = { 306, 319, 336, 348, 348, 343, 308, };
        int[] y8 = { 401, 397, 396, 408, 411, 413, 412, };
        g0.setColor(new Color(64, 64, 64));
        g0.fillPolygon(x7, y7, 7);
        g0.fillPolygon(x8, y8, 7);

        // Head
        layers.add(makeCircleFill(302, 230, 46, Color.black, new Color(248, 220, 196)));

        // Hair
        makeCurve(g0, 283, 187, 278, 182, 275, 179, 271, 176, 2);
        makeCurve(g0, 297, 183, 295, 176, 294, 171, 293, 168, 2);
        makeCurve(g0, 308, 183, 311, 176, 312, 173, 314, 168, 2);

        // Ear
        makeCurve(g0, 347, 236, 356, 239, 351, 246, 344, 248, 2);
        makeCurve(g0, 260, 249, 251, 249, 257, 259, 268, 261, 2);

        // Face
        makeCurve(g0, 306, 219, 309, 216, 313, 214, 317, 212, 2);
        makeCurve(g0, 295, 222, 290, 220, 285, 220, 280, 219, 2);
        makeCurve(g0, 295, 222, 290, 220, 285, 220, 280, 219, 2);
        g0.fillOval(289, 231, 9, 11);
        g0.fillOval(310, 226, 9, 11);
        makeCurve(g0, 296, 256, 306, 260, 313, 256, 317, 252, 2);
        makeCurve(g0, 314, 249, 316, 251, 318, 252, 319, 253, 2);

        // Shoulder and Arm
        makeCurve(g0, 300, 277, 300, 276, 300, 279, 300, 281, 2);
        makeCurve(g0, 314, 277, 314, 276, 314, 279, 314, 282, 2);
        makeCurve(g0, 300, 281, 295, 282, 289, 284, 280, 286, 2);
        makeCurve(g0, 314, 282, 316, 284, 318, 285, 322, 288, 2);
        makeCurve(g0, 289, 295, 285, 289, 282, 286, 275, 283, 2);
        makeCurve(g0, 275, 283, 272, 284, 270, 288, 274, 294, 2);
        makeCurve(g0, 322, 288, 326, 300, 324, 310, 315, 317, 2);
        makeCurve(g0, 315, 317, 311, 320, 304, 320, 293, 310, 2);
        makeCurve(g0, 322, 288, 315, 299, 312, 302, 304, 309, 2);
        makeCurve(g0, 322, 288, 315, 299, 312, 302, 304, 309, 2);
        makeCurve(g0, 313, 297, 290, 295, 282, 295, 272, 295, 2);
        makeCurve(g0, 272, 295, 266, 299, 266, 304, 271, 307, 2);
        makeCurve(g0, 271, 307, 283, 309, 292, 310, 304, 309, 2);

        // Body
        makeCurve(g0, 278, 309, 276, 319, 273, 327, 270, 334, 2);
        makeCurve(g0, 270, 334, 267, 343, 264, 353, 255, 392, 2);
        makeCurve(g0, 255, 392, 250, 398, 246, 401, 242, 406, 2);
        makeCurve(g0, 242, 406, 241, 409, 241, 411, 282, 412, 2);
        makeCurve(g0, 282, 412, 286, 386, 288, 366, 291, 341, 2);

        // Right Leg
        makeCurve(g0, 318, 314, 318, 324, 319, 330, 320, 336, 2);
        makeCurve(g0, 320, 336, 323, 350, 329, 370, 335, 395, 2);
        makeCurve(g0, 335, 395, 340, 399, 344, 403, 347, 407, 2);
        makeCurve(g0, 347, 407, 349, 409, 347, 411, 344, 412, 2);
        makeCurve(g0, 344, 412, 333, 412, 320, 412, 308, 412, 2);
        makeCurve(g0, 308, 412, 303, 382, 301, 362, 298, 341, 2);
        makeCurve(g0, 287, 338, 291, 340, 296, 340, 300, 338, 2);
        makeCurve(g0, 294, 282, 299, 288, 310, 289, 316, 283, 2);
        makeCurve(g0, 310, 304, 314, 306, 317, 307, 320, 308, 2);
        makeCurve(g0, 274, 327, 287, 328, 305, 328, 317, 327, 2);
        makeCurve(g0, 255, 395, 265, 392, 274, 393, 284, 395, 2);
        makeCurve(g0, 307, 400, 316, 397, 329, 396, 336, 395, 2);

        drawLayerToImages(g, layers);
        g.drawImage(buffer0, 0, 0, null);
    }

    public void Teen(Graphics g) {
        BufferedImage buffer0 = new BufferedImage(2001, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g0 = buffer0.createGraphics();

        // Hair
        int[] x9 = { 264, 258, 258, 269, 285, 298, 304, 312, 317, 317, 316, 311, 302, 290, 278, 269, 266, };
        int[] y9 = { 110, 97, 84, 70, 65, 72, 70, 74, 83, 95, 104, 93, 84, 81, 84, 93, 100, };
        g0.setColor(new Color(0, 0, 0));
        g0.fillPolygon(x9, y9, 17);

        // Ear
        int[] x10 = { 315, 321, 320, 314, };
        int[] y10 = { 111, 108, 119, 124, };
        int[] x11 = { 264, 259, 261, 268, };
        int[] y11 = { 114, 114, 122, 127 };
        g0.setColor(new Color(255, 228, 204));
        g0.fillPolygon(x10, y10, 4);
        g0.fillPolygon(x11, y11, 4);

        // Face
        int[] x12 = { 266, 267, 269, 277, 289, 299, 306, 313, 313, 307, 298, 288, 277, 271, 267, };
        int[] y12 = { 110, 100, 92, 85, 82, 83, 88, 103, 131, 140, 149, 149, 144, 135, 121, };
        g0.setColor(new Color(255, 228, 204));
        g0.fillPolygon(x12, y12, 15);

        // Neck
        int[] x13 = { 284, 294, 305, 307, 314, 306, 296, 289, 282, 278, 285, };
        int[] y13 = { 148, 152, 144, 160, 163, 173, 175, 174, 172, 165, 160, };
        g0.setColor(new Color(255, 228, 204));
        g0.fillPolygon(x13, y13, 11);

        // Shirt
        int[] x14 = { 277, 289, 298, 306, 316, 332, 337, 343, 347, 353, 336, 331, 329, 329, 331, 333, 303, 273, 273,274, 273, 270, 269, 266, 248, 251, 253, 267, };
        int[] y14 = { 167, 175, 175, 173, 164, 168, 170, 177, 189, 210, 219, 209, 222, 242, 254, 270, 275, 274, 255,240, 219, 211, 219, 226, 218, 201, 183, 172, };
        g0.setColor(new Color(101, 51, 1));
        g0.fillPolygon(x14, y14, 28);

        // Arm
        int[] x15 = { 248, 266, 262, 261, 263, 272, 276, 286, 285, 276, 268, 245, 246, };
        int[] y15 = { 219, 226, 235, 244, 253, 274, 278, 282, 285, 282, 289, 247, 226, };
        int[] x16 = { 336, 353, 358, 356, 345, 340, 336, 329, 318, 319, 335, 342, 337, };
        int[] y16 = { 220, 211, 229, 246, 272, 285, 287, 280, 280, 277, 270, 238, 224, };
        g0.setColor(new Color(255, 228, 204));
        g0.fillPolygon(x15, y15, 13);
        g0.fillPolygon(x16, y16, 13);

        // Trousers
        int[] x17 = { 275, 300, 321, 317, 321, 330, 336, 340, 344, 344, 343, 343, 330, 316, 316, 318, 315, 311, 308,298, 298, 298, 298, 300, 300, 282, 272, 268, 268, 277, 287, 287, 287, };
        int[] y17 = { 276, 277, 275, 281, 283, 282, 288, 315, 335, 379, 397, 405, 467, 466, 413, 385, 351, 330, 300,300, 338, 360, 386, 417, 463, 464, 407, 318, 290, 283, 285, 284, 281, };
        g0.setColor(new Color(0, 102, 51));
        g0.fillPolygon(x17, y17, 32);

        // Foot
        int[] x18 = { 283, 300, 301, 306, 297, 289, };
        int[] y18 = { 465, 464, 479, 514, 520, 513, };
        int[] x19 = { 315, 330, 335, 342, 358, 357, 314, 310, 313, 316, };
        int[] y19 = { 467, 467, 491, 499, 506, 509, 507, 501, 492, 483, };
        g0.setColor(new Color(64, 64, 64));
        g0.fillPolygon(x18, y18, 6);
        g0.fillPolygon(x19, y19, 10);

        g0.setColor(new Color(0, 0, 0));

        // Head
        makeCurve(g0, 267, 120, 263, 104, 267, 91, 285, 81, 2);
        makeCurve(g0, 283, 81, 298, 82, 309, 90, 314, 103, 2);
        makeCurve(g0, 315, 103, 314, 128, 307, 144, 295, 150, 2);
        makeCurve(g0, 295, 150, 279, 146, 275, 142, 267, 120, 2);

        // Ear
        makeCurve(g0, 315, 111, 321, 108, 320, 119, 314, 124, 2);
        makeCurve(g0, 264, 114, 256, 114, 261, 122, 268, 127, 2);

        // Hair
        makeCurve(g0, 263, 111, 256, 99, 256, 83, 266, 71, 2);
        makeCurve(g0, 266, 71, 282, 64, 291, 65, 297, 73, 2);
        makeCurve(g0, 297, 73, 303, 69, 319, 75, 315, 109, 2);

        // Face
        g0.fillOval(278, 113, 6, 9);
        g0.fillOval(298, 111, 6, 9);
        makeCurve(g0, 294, 107, 298, 102, 303, 101, 307, 103, 2);
        makeCurve(g0, 286, 108, 281, 105, 276, 105, 271, 108, 2);
        makeCurve(g0, 279, 132, 289, 138, 295, 138, 303, 130, 2);
        
        // Neck
        makeCurve(g0, 284, 148, 284, 154, 284, 157, 284, 160, 2);
        makeCurve(g0, 305, 143, 306, 152, 306, 156, 308, 159, 2);
        
        // Shoulder
        makeCurve(g0, 284, 161, 275, 166, 261, 175, 252, 184, 2);
        makeCurve(g0, 252, 184, 251, 198, 248, 219, 245, 241, 2);
        makeCurve(g0, 245, 241, 245, 248, 252, 262, 267, 289, 2);
        makeCurve(g0, 267, 289, 276, 283, 279, 283, 283, 285, 2);
        makeCurve(g0, 283, 285, 287, 288, 289, 284, 283, 279, 2);
        makeCurve(g0, 283, 279, 278, 278, 277, 278, 275, 277, 2);
        makeCurve(g0, 275, 277, 267, 263, 263, 254, 261, 247, 2);
        makeCurve(g0, 261, 247, 262, 235, 267, 225, 270, 211, 2);
        makeCurve(g0, 308, 159, 314, 163, 323, 165, 336, 168, 2);
        makeCurve(g0, 336, 168, 345, 181, 350, 196, 353, 209, 2);
        makeCurve(g0, 353, 209, 358, 228, 358, 247, 344, 273, 2);
        makeCurve(g0, 344, 273, 341, 285, 338, 287, 337, 287, 2);
        makeCurve(g0, 337, 287, 334, 285, 332, 283, 329, 279, 2);
        makeCurve(g0, 329, 279, 317, 283, 316, 278, 334, 271, 2);
        makeCurve(g0, 334, 271, 338, 257, 339, 248, 340, 242, 2);
        makeCurve(g0, 340, 242, 342, 239, 342, 235, 331, 210, 2);

        makeCurve(g0, 278, 165, 289, 177, 304, 177, 315, 163, 2);
        makeCurve(g0, 248, 218, 255, 220, 261, 223, 265, 226, 2);
        makeCurve(g0, 353, 210, 347, 213, 341, 216, 334, 220, 2);
        
        // Shirt
        makeCurve(g0, 267, 203, 273, 218, 274, 254, 273, 274, 2);
        makeCurve(g0, 273, 274, 295, 276, 310, 275, 334, 271, 2);
        makeCurve(g0, 334, 271, 328, 238, 329, 218, 335, 199, 2);
        
        // Leg
        makeCurve(g0, 268, 290, 270, 359, 272, 409, 280, 456, 2);
        makeCurve(g0, 280, 456, 287, 483, 288, 506, 288, 506, 2);
        makeCurve(g0, 288, 506, 294, 522, 304, 520, 306, 507, 2);
        makeCurve(g0, 306, 507, 302, 492, 298, 476, 299, 302, 2);
        makeCurve(g0, 295, 299, 302, 301, 305, 301, 312, 299, 2);
        makeCurve(g0, 337, 288, 344, 336, 344, 399, 330, 467, 2);
        makeCurve(g0, 330, 467, 330, 489, 344, 500, 355, 504, 2);
        makeCurve(g0, 355, 504, 359, 506, 358, 511, 317, 507, 2);
        makeCurve(g0, 317, 507, 310, 503, 310, 496, 316, 489, 2);
        makeCurve(g0, 316, 489, 316, 415, 322, 394, 309, 301, 2);
        makeCurve(g0, 282, 464, 287, 464, 292, 464, 299, 464, 2);
        makeCurve(g0, 315, 466, 315, 466, 315, 466, 330, 466, 2);

        g.drawImage(buffer0, 0, 0, null);
    }

    public void Adult(Graphics g) {
        BufferedImage buffer0 = new BufferedImage(2001, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g0 = buffer0.createGraphics();

        // Hair
        int[] x20 = { 225, 234, 242, 246, 256, 261, 267, 279, 283, 287, 288, 266, 242, };
        int[] y20 = { 174, 151, 150, 149, 149, 153, 155, 161, 161, 165, 184, 170, 167, };
        g0.setColor(new Color(0, 0, 0));
        g0.fillPolygon(x20, y20, 13);
        
        // Face
        int[] x21 = { 225, 242, 266, 288, 287, 277, 257, 249, 235, };
        int[] y21 = { 174, 167, 170, 186, 201, 219, 233, 234, 219, };
        g0.setColor(new Color(255, 228, 204));
        g0.fillPolygon(x21, y21, 9);
        
        // NeckArm
        int[] x22 = { 263, 282, 286, 290, 290, 284, 273, };
        int[] y22 = { 229, 213, 215, 215, 227, 233, 234, };
        int[] x23 = { 277, 287, 297, 302, 298, 294, 289, 285, 281, 277, 278, 282, 280, };
        int[] y23 = { 283, 274, 286, 359, 359, 349, 356, 372, 370, 361, 350, 336, 292, };
        int[] x24 = { 352, 344, 362, 377, 379, 378, 381, 380, 376, 372, 368, 368, 365, 363, 364, 361, 360, };
        int[] y24 = { 224, 203, 201, 210, 248, 268, 281, 298, 297, 279, 278, 290, 290, 273, 242, 232, 221, };
        g0.setColor(new Color(255, 228, 204));
        g0.fillPolygon(x22, y22, 7);
        g0.fillPolygon(x23, y23, 13);
        g0.fillPolygon(x24, y24, 17);
       
        // Shirt
        int[] x25 = { 252, 257, 264, 273, 278, 286, 290, 291, 305, 323, 343, 351, 338, 363, 364, 338, 318, 306, 305,286, 277, 262, 251, };
        int[] y25 = { 235, 233, 230, 235, 235, 233, 227, 215, 210, 206, 204, 225, 231, 264, 284, 300, 306, 306, 298,273, 282, 260, 243, };
        g0.setColor(new Color(101, 51, 1));
        g0.fillPolygon(x25, y25, 23);
        
        // Trousers
        int[] x26 = { 306, 324, 347, 363, 366, 368, 370, 372, 377, 380, 380, 368, 362, 361, 336, 331, 336, 305, 303,301, 275, 270, 270, 279, 282, 286, 294, 300, 302, 298, 301, 304, };
        int[] y26 = { 307, 305, 296, 285, 292, 280, 279, 281, 300, 317, 327, 358, 383, 456, 457, 366, 339, 382, 396,452, 455, 395, 379, 367, 373, 373, 351, 361, 358, 341, 319, 313, };
        g0.setColor(new Color(0, 102, 51));
        g0.fillPolygon(x26, y26, 32);
        
        // Foot
        int[] x27 = { 277, 301, 300, 255, 254, 253, 255, 276, };
        int[] y27 = { 455, 453, 478, 490, 488, 482, 477, 462, };
        int[] x28 = { 337, 361, 361, 345, 327, 323, 323, 338, };
        int[] y28 = { 458, 456, 479, 488, 488, 488, 482, 468, };
        g0.setColor(new Color(64, 64, 64));
        g0.fillPolygon(x27, y27, 8);
        g0.fillPolygon(x28, y28, 8);

        g0.setColor(new Color(0, 0, 0));
       
        makeCurve(g0, 225, 174, 239, 160, 268, 165, 289, 189, 2);
        makeCurve(g0, 225, 174, 225, 206, 242, 233, 255, 234, 2);
        makeCurve(g0, 255, 234, 273, 227, 282, 216, 289, 189, 2);
        makeCurve(g0, 280, 186, 286, 184, 287, 194, 280, 199, 2);
        makeCurve(g0, 249, 190, 253, 187, 259, 184, 263, 182, 2);
        makeCurve(g0, 242, 190, 238, 187, 233, 184, 231, 183, 2);
        g0.fillOval(235, 194, 9, 11);
        g0.fillOval(252, 191, 9, 11);
        makeCurve(g0, 242, 216, 243, 209, 252, 208, 258, 215, 2);
        makeCurve(g0, 225, 172, 226, 163, 226, 154, 246, 148, 2);
        makeCurve(g0, 246, 148, 246, 148, 270, 149, 277, 161, 2);
        makeCurve(g0, 277, 161, 283, 160, 287, 165, 290, 190, 2);
        // Neck Arm
        makeCurve(g0, 282, 210, 286, 215, 290, 215, 296, 213, 2);
        makeCurve(g0, 264, 230, 276, 238, 290, 231, 290, 215, 2);
        makeCurve(g0, 251, 235, 251, 243, 256, 252, 276, 282, 2);
        makeCurve(g0, 276, 282, 280, 296, 282, 319, 282, 337, 2);
        makeCurve(g0, 282, 337, 282, 340, 277, 351, 277, 362, 2);
        makeCurve(g0, 277, 362, 282, 372, 285, 372, 286, 367, 2);
        makeCurve(g0, 286, 367, 288, 360, 290, 354, 294, 349, 2);
        makeCurve(g0, 294, 349, 296, 354, 297, 359, 300, 361, 2);
        makeCurve(g0, 300, 361, 303, 359, 300, 341, 298, 286, 2);
        makeCurve(g0, 298, 212, 322, 205, 344, 202, 359, 200, 2);
        makeCurve(g0, 359, 200, 359, 200, 375, 209, 375, 209, 2);
        makeCurve(g0, 375, 209, 379, 241, 379, 241, 379, 241, 2);
        makeCurve(g0, 379, 241, 378, 268, 378, 268, 382, 295, 2);
        makeCurve(g0, 382, 295, 381, 300, 378, 300, 373, 284, 2);
        makeCurve(g0, 373, 284, 372, 277, 369, 277, 367, 288, 2);
        makeCurve(g0, 367, 288, 368, 292, 363, 289, 364, 265, 2);
        makeCurve(g0, 364, 265, 365, 244, 365, 244, 360, 221, 2);
        makeCurve(g0, 360, 221, 360, 221, 360, 221, 330, 234, 2);
        
        // Shirt
        makeCurve(g0, 271, 258, 291, 272, 305, 296, 305, 306, 2);
        makeCurve(g0, 305, 306, 337, 301, 352, 293, 363, 283, 2);
        makeCurve(g0, 339, 230, 349, 242, 357, 254, 363, 264, 2);
        
        // Trousers
        makeCurve(g0, 305, 306, 305, 312, 304, 316, 301, 320, 2);
        makeCurve(g0, 279, 365, 273, 372, 270, 380, 270, 388, 2);
        makeCurve(g0, 270, 388, 272, 415, 275, 440, 277, 453, 2);
        makeCurve(g0, 277, 453, 276, 460, 267, 470, 257, 475, 2);
        makeCurve(g0, 257, 475, 250, 482, 253, 490, 267, 489, 2);
        makeCurve(g0, 267, 489, 284, 483, 284, 483, 293, 481, 2);
        makeCurve(g0, 293, 481, 301, 479, 301, 467, 301, 453, 2);
        makeCurve(g0, 301, 453, 302, 429, 302, 410, 303, 395, 2);
        makeCurve(g0, 303, 395, 305, 382, 315, 365, 335, 338, 2);
        makeCurve(g0, 336, 338, 335, 353, 331, 362, 331, 413, 2);
        makeCurve(g0, 331, 413, 332, 427, 334, 445, 338, 458, 2);
        makeCurve(g0, 338, 458, 338, 467, 330, 475, 323, 481, 2);
        makeCurve(g0, 323, 481, 319, 487, 325, 494, 360, 480, 2);
        makeCurve(g0, 360, 480, 363, 478, 362, 468, 362, 391, 2);
        makeCurve(g0, 362, 391, 363, 379, 363, 379, 375, 343, 2);
        makeCurve(g0, 375, 343, 379, 331, 380, 313, 376, 295, 2);
        
        // Detail
        makeCurve(g0, 344, 203, 347, 210, 350, 218, 351, 224, 2);
        makeCurve(g0, 276, 281, 279, 279, 283, 276, 285, 274, 2);
        makeCurve(g0, 276, 455, 285, 454, 294, 453, 301, 453, 2);
        makeCurve(g0, 337, 457, 344, 456, 354, 456, 360, 456, 2);

        makeCurve(g0, 384, 254, 387, 250, 390, 247, 393, 243, 2);
        makeCurve(g0, 393, 243, 393, 246, 392, 250, 392, 253, 2);
        makeCurve(g0, 392, 253, 396, 247, 399, 243, 403, 239, 2);

        makeCurve(g0, 392, 266, 397, 263, 401, 261, 406, 258, 2);
        makeCurve(g0, 406, 258, 404, 262, 403, 265, 401, 267, 2);
        makeCurve(g0, 401, 267, 407, 264, 411, 262, 417, 258, 2);

        makeCurve(g0, 388, 279, 393, 281, 400, 282, 404, 283, 2);
        makeCurve(g0, 404, 283, 400, 285, 396, 286, 395, 286, 2);
        makeCurve(g0, 395, 286, 401, 290, 405, 293, 409, 295, 2);

        g.drawImage(buffer0, 0, 0, null);
    }

    public void backGround_1(Graphics g) {
        ArrayList<BufferedImage> layers = new ArrayList<>();

        layers.add(makeCircleFill(300, 300, 450, new Color(231, 193, 193), new Color(231, 193, 193)));
        layers.add(makeCircleFill(300, 300, 350, new Color(235, 200, 200), new Color(235, 200, 200)));
        layers.add(makeCircleFill(300, 300, 250, new Color(239, 207, 207), new Color(239, 207, 207)));
        layers.add(makeCircleFill(300, 300, 100, new Color(241, 213, 213), new Color(241, 213, 213)));

        drawLayerToImages(g, layers);
    }

    public void backGround_2(Graphics g) {
        /* BG */
        BufferedImage buffer1 = new BufferedImage(2000, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g1 = buffer1.createGraphics();
        g1.setColor(new Color(179, 229, 250));
        g1.fillRect(0, 0, 2000, 600);
        g1.setColor(new Color(103, 186, 106));
        g1.fillRect(0, 415, 2000, 600);

        int[] x29 = { 0, 136, 161, 185, 223, 273, 440, 0, };
        int[] y29 = { 383, 301, 296, 295, 299, 327, 415, 415, };
        g1.setColor(new Color(35, 165, 151));
        g1.fillPolygon(x29, y29, 8);

        int[] x30 = { 251, 356, 391, 466, 522, 600, 600, 429, };
        int[] y30 = { 315, 253, 243, 242, 268, 326, 415, 415, };
        g1.setColor(new Color(32, 158, 139));
        g1.fillPolygon(x30, y30, 8);

        // Cloud
        g1.setColor(new Color(255, 255, 255));
        g1.fillOval(36 + (int) Move1, 29, 80, 80);
        g1.fillOval(65 + (int) Move1, 11, 120, 120);
        g1.fillOval(136 + (int) Move1, 31, 80, 80);

        g1.fillOval(212 + (int) Move1, 119, 80, 80);
        g1.fillOval(259 + (int) Move1, 94, 120, 120);
        g1.fillOval(338 + (int) Move1, 119, 80, 80);

        g1.fillOval(36 + (int) Move1 + 500, 29, 80, 80);
        g1.fillOval(65 + (int) Move1 + 500, 11, 120, 120);
        g1.fillOval(136 + (int) Move1 + 500, 31, 80, 80);

        g1.fillOval(36 + (int) Move1 + 700, 29, 80, 80);
        g1.fillOval(65 + (int) Move1 + 700, 11, 120, 120);
        g1.fillOval(136 + (int) Move1 + 700, 31, 80, 80);

        g1.fillOval(212 + (int) Move1 + 700, 119, 80, 80);
        g1.fillOval(259 + (int) Move1 + 700, 94, 120, 120);
        g1.fillOval(338 + (int) Move1 + 700, 119, 80, 80);

        g1.fillOval(36 + (int) Move1 + 1200, 29, 80, 80);
        g1.fillOval(65 + (int) Move1 + 1200, 11, 120, 120);
        g1.fillOval(136 + (int) Move1 + 1200, 31, 80, 80);

        g.drawImage(buffer1, 0, 0, null);
    }

    /* -------------------------- Tool -------------------------- */
    // Draw all BufferedImage to Graphics
    public void drawLayerToImages(Graphics g, ArrayList<BufferedImage> layers) {
        for (BufferedImage layer : layers) {
            g.drawImage(layer, 0, 0, null);
        }
    }

    // Create Oval and fill color
    public BufferedImage makeOvalFill(int xc, int yc, int a, int b, Color lineColor, Color fillColor) {

        BufferedImage OvalImage = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gOval = OvalImage.createGraphics();

        gOval.setColor(lineColor);

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
            plot(gOval, xc + x, yc + y, 2);
            plot(gOval, xc + x, yc - y, 2);
            plot(gOval, xc - x, yc + y, 2);
            plot(gOval, xc - x, yc - y, 2);
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

            plot(gOval, xc + x, yc + y, 2);
            plot(gOval, xc + x, yc - y, 2);
            plot(gOval, xc - x, yc + y, 2);
            plot(gOval, xc - x, yc - y, 2);

            y += 1;
            Dy += twoA2;
            D += Dy + a2;

            if (D >= 0) {
                x -= 1;
                Dx -= twoB2;
                D -= Dx;
            }
        }

        // fill color
        floodfill(OvalImage, xc, yc, new Color(0, 0, 0, 0), fillColor);

        return OvalImage;
    }

    // Create Circle and fill color
    public BufferedImage makeCircleFill(int xc, int yc, int r, Color lineColor, Color fillColor) {
        BufferedImage CircleImage = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gCircle = CircleImage.createGraphics();

        gCircle.setColor(lineColor);

        int x = 0;
        int y = r;
        int d = 1 - r;
        int dx = 2 * x;
        int dy = 2 * y;

        while (x <= y) {
            plot(gCircle, x + xc, y + yc, 2);
            plot(gCircle, -x + xc, y + yc, 2);
            plot(gCircle, x + xc, -y + yc, 2);
            plot(gCircle, -x + xc, -y + yc, 2);
            plot(gCircle, y + xc, x + yc, 2);
            plot(gCircle, -y + xc, x + yc, 2);
            plot(gCircle, y + xc, -x + yc, 2);
            plot(gCircle, -y + xc, -x + yc, 2);

            x++;
            dx += 2;
            d = d + dx + 1;

            if (d >= 0) {
                y--;
                dy -= 2;
                d = d - dy;
            }
        }

        // fill color
        floodfill(CircleImage, xc, yc, new Color(0, 0, 0, 0), fillColor);
        return CircleImage;
    }

    // Create Traingle and fill color in BufferedImage
    public BufferedImage makePolygonFill(Point[] points, Color lineColor, Color fillColor) {

        BufferedImage polyImage = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gPoly = polyImage.createGraphics();

        int[] xPoly = new int[points.length];
        int[] yPoly = new int[points.length];

        int x = 0;
        int y = 0;

        for (int i = 0; i < points.length; i++) {
            xPoly[i] = points[i].x;
            x += points[i].x;
            yPoly[i] = points[i].y;
            y += points[i].y;
        }

        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        gPoly.setColor(lineColor);
        gPoly.drawPolygon(poly);

        floodfill(polyImage, x / xPoly.length, y / yPoly.length, new Color(0, 0, 0, 0), fillColor);

        return polyImage;
    }

    // fill color in shape
    public void floodfill(BufferedImage m, int x, int y, Color targetColor, Color replacementColor) {
        Graphics2D g2 = m.createGraphics();
        Queue<Point> q = new LinkedList<>();

        if (m.getRGB(x, y) == targetColor.getRGB()) {
            g2.setColor(replacementColor);
            plot(g2, x, y, 1);
            q.add(new Point(x, y));
        }

        while (!q.isEmpty()) {
            Point p = q.poll();
            // s
            if (p.y < 600 && m.getRGB(p.x, p.y + 1) == targetColor.getRGB()) {
                plot(g2, p.x, p.y + 1, 1);
                q.add(new Point(p.x, p.y + 1));
            }
            // n
            if (p.y > 0 && m.getRGB(p.x, p.y - 1) == targetColor.getRGB()) {
                plot(g2, p.x, p.y - 1, 1);
                q.add(new Point(p.x, p.y - 1));
            }
            // e
            if (p.x < 600 && m.getRGB(p.x + 1, p.y) == targetColor.getRGB()) {
                plot(g2, p.x + 1, p.y, 1);
                q.add(new Point(p.x + 1, p.y));
            }
            // w
            if (p.x > 0 && m.getRGB(p.x - 1, p.y) == targetColor.getRGB()) {
                plot(g2, p.x - 1, p.y, 1);
                q.add(new Point(p.x - 1, p.y));
            }
        }
    }

    // Draw Curve Line
    public void makeCurve(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int size) {
        for (int i = 0; i <= 1000; i++) {
            double t = i / 1000.0;

            int x = (int) (Math.pow((1 - t), 3) * x1 +
                    (3 * t) * Math.pow(1 - t, 2) * x2
                    + (3 * (t * t) * (1 - t)) * x3
                    + Math.pow(t, 3) * x4);

            int y = (int) (Math.pow((1 - t), 3) * y1 +
                    (3 * t) * Math.pow(1 - t, 2) * y2
                    + (3 * (t * t) * (1 - t)) * y3
                    + Math.pow(t, 3) * y4);

            plot(g, x, y, size);
        }
    }

    // Draw Line
    public void makeLine(int x1, int y1, int x2, int y2, Color color) {
        BufferedImage Image = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gImage = Image.createGraphics();
        gImage.setColor(color);

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;

        boolean isSwap = false;

        if (dy > dx) {
            dx ^= dy;
            dy ^= dx;
            dx ^= dy;
            isSwap = true;
        }

        int D = 2 * dy - dx;

        int x = x1;
        int y = y1;

        for (int i = 0; i <= dx; i++) {
            plot(gImage, x, y, 2);
            if (D >= 0) {
                if (isSwap) {
                    x += sx;
                } else {
                    y += sy;
                }

                D -= 2 * dx;
            }

            if (isSwap) {
                y += sy;
            } else {
                x += sx;
            }

            D += 2 * dy;
        }
    }

    // Draw a dot
    public void plot(Graphics g, int x, int y, int size) {
        g.fillRect(x, y, size, size);
    }
}
