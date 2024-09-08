import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Assignment1_65050022_65050042 extends JPanel {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Assignment1_65050022_65050042 NewYear = new Assignment1_65050022_65050042();
        frame.setTitle("Happy New Year!!");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(NewYear);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        backGround(g);
        AJ_Mo(g);
        catSparkler(g);
        catDragon(g);
    }
    
    public void backGround(Graphics g){ 
        Color customGray = Color.decode("#2a2a2a");
        Color customPastelPurple = Color.decode("#df85c2");
        Color customPurple = Color.decode("#7518ae");
        Color customLightPurple = Color.decode("#d45ae8");
        Color customPink = Color.decode("#ff55aa");
        Color customLightPink = Color.decode("#ffb1ce");
        Color customSky = Color.decode("#3df6f5");
        Color customOrange = Color.decode("#fd8c59");
        Color customGreen = Color.decode("#daf42c");
        Color customYellow = Color.decode("#ffdc8f");

        setBackground(customGray); 

        /* Fireworks */
        // Purple fireworks
        makeLine(g, 121, 162, 119, 94, customPurple);
        makeLine(g, 122, 163, 119, 94, customPurple);
        makeLine(g, 122, 161, 119, 93, customPurple);
        makeLine(g, 122, 162, 118, 92, customPurple);
        makeLine(g, 122, 162, 119, 91, customPurple);
        makeLine(g, 122, 162, 120, 90, customPurple);
        makeLine(g, 123, 162, 121, 90, customPurple);
        makeLine(g, 122, 162, 121, 89, customPurple);     
        makeLine(g, 122, 162, 122, 90, customPurple);
        makeLine(g, 122, 162, 123, 91, customPurple);
        makeLine(g, 122, 162, 124, 92, customPurple);

        makeLine(g, 134, 163, 173, 110, customPurple);
        makeLine(g, 133, 164, 173, 110, customPurple);
        makeLine(g, 133, 162, 173, 110, customPurple);
        makeLine(g, 133, 163, 172, 111, customPurple);
        makeLine(g, 133, 163, 173, 112, customPurple);
        makeLine(g, 133, 163, 173, 113, customPurple);
        makeLine(g, 134, 163, 173, 109, customPurple);
        makeLine(g, 134, 163, 174, 109, customPurple);
        makeLine(g, 134, 163, 175, 109, customPurple);
        makeLine(g, 134, 163, 176, 109, customPurple);
        makeLine(g, 134, 163, 177, 109, customPurple);
        makeLine(g, 134, 163, 177, 110, customPurple);
        makeLine(g, 134, 163, 177, 111, customPurple);
        makeLine(g, 134, 163, 177, 112, customPurple);
        makeLine(g, 135, 163, 177, 113, customPurple);

        makeLine(g, 134, 172, 202, 157, customPurple);
        makeLine(g, 134, 172, 203, 157, customPurple);
        makeLine(g, 134, 172, 204, 157, customPurple);
        makeLine(g, 134, 172, 204, 158, customPurple);
        makeLine(g, 134, 172, 205, 158, customPurple);
        makeLine(g, 135, 173, 205, 159, customPurple);
        makeLine(g, 134, 172, 205, 160, customPurple);
        makeLine(g, 134, 172, 205, 161, customPurple);
        makeLine(g, 134, 172, 205, 162, customPurple);
        makeLine(g, 134, 172, 204, 162, customPurple);

        makeLine(g, 137, 184, 191, 212, customPurple);
        makeLine(g, 137, 184, 191, 213, customPurple);
        makeLine(g, 137, 184, 191, 214, customPurple);
        makeLine(g, 137, 184, 191, 215, customPurple);
        makeLine(g, 139, 186, 191, 216, customPurple);
        makeLine(g, 138, 185, 190, 216, customPurple);
        makeLine(g, 137, 184, 189, 216, customPurple);
        makeLine(g, 137, 184, 188, 216, customPurple);
        makeLine(g, 137, 184, 187, 216, customPurple);
        makeLine(g, 137, 184, 186, 215, customPurple);

        makeLine(g, 126, 187, 152, 250, customPurple);
        makeLine(g, 126, 187, 152, 251, customPurple);
        makeLine(g, 126, 187, 152, 252, customPurple);
        makeLine(g, 126, 187, 152, 253, customPurple);
        makeLine(g, 128, 190, 152, 254, customPurple);
        makeLine(g, 127, 189, 152, 255, customPurple);
        makeLine(g, 126, 187, 152, 255, customPurple);
        makeLine(g, 126, 187, 151, 255, customPurple);
        makeLine(g, 126, 187, 150, 255, customPurple);
        makeLine(g, 126, 187, 149, 255, customPurple);
        makeLine(g, 126, 187, 148, 254, customPurple);

        makeLine(g, 117, 187, 96, 254, customPurple);
        makeLine(g, 117, 187, 96, 255, customPurple);
        makeLine(g, 117, 187, 95, 254, customPurple);
        makeLine(g, 117, 187, 95, 255, customPurple);
        makeLine(g, 117, 187, 94, 255, customPurple);
        makeLine(g, 117, 187, 93, 255, customPurple);
        makeLine(g, 117, 187, 92, 255, customPurple);
        makeLine(g, 117, 187, 92, 254, customPurple);
        makeLine(g, 117, 187, 91, 254, customPurple);
        makeLine(g, 117, 187, 91, 253, customPurple);
        makeLine(g, 117, 187, 91, 252, customPurple);
        makeLine(g, 117, 187, 91, 251, customPurple);

        makeLine(g, 107, 183, 61, 213, customPurple);
        makeLine(g, 107, 183, 60, 213, customPurple);
        makeLine(g, 107, 183, 59, 214, customPurple);
        makeLine(g, 107, 183, 58, 214, customPurple);
        makeLine(g, 107, 183, 58, 213, customPurple);
        makeLine(g, 107, 183, 57, 214, customPurple);
        makeLine(g, 107, 183, 56, 214, customPurple);
        makeLine(g, 107, 183, 56, 213, customPurple);
        makeLine(g, 107, 183, 56, 212, customPurple);
        makeLine(g, 107, 183, 56, 211, customPurple);
        makeLine(g, 107, 183, 56, 210, customPurple);
        makeLine(g, 107, 183, 57, 209, customPurple);

        makeLine(g, 109, 172, 40, 162, customPurple);
        makeLine(g, 109, 172, 39, 162, customPurple);
        makeLine(g, 109, 172, 38, 161, customPurple);
        makeLine(g, 109, 172, 38, 160, customPurple);
        makeLine(g, 109, 172, 38, 159, customPurple);
        makeLine(g, 109, 172, 39, 159, customPurple);
        makeLine(g, 109, 172, 39, 158, customPurple);
        makeLine(g, 109, 172, 40, 158, customPurple);
        makeLine(g, 109, 172, 40, 157, customPurple);

        makeLine(g, 110, 161, 70, 117, customPurple);
        makeLine(g, 110, 161, 70, 116, customPurple);
        makeLine(g, 110, 161, 70, 115, customPurple);
        makeLine(g, 110, 161, 70, 114, customPurple);
        makeLine(g, 110, 161, 70, 113, customPurple);
        makeLine(g, 110, 161, 71, 113, customPurple);
        makeLine(g, 110, 161, 72, 113, customPurple);
        makeLine(g, 110, 161, 72, 113, customPurple);
        makeLine(g, 110, 161, 72, 114, customPurple);
        makeLine(g, 110, 161, 73, 114, customPurple);
        makeLine(g, 110, 161, 74, 114, customPurple);

        makeLine(g, 112, 148, 93, 104, customLightPurple);
        makeLine(g, 112, 148, 93, 103, customLightPurple);
        makeLine(g, 112, 148, 93, 102, customLightPurple);
        makeLine(g, 112, 148, 93, 101, customLightPurple);
        makeLine(g, 112, 148, 93, 100, customLightPurple);
        makeLine(g, 112, 148, 94, 100, customLightPurple);
        makeLine(g, 112, 148, 95, 100, customLightPurple);
        makeLine(g, 112, 148, 96, 100, customLightPurple);

        makeLine(g, 131, 148, 146, 102, customLightPurple);
        makeLine(g, 131, 148, 147, 100, customLightPurple);
        makeLine(g, 131, 148, 148, 100, customLightPurple);
        makeLine(g, 131, 148, 149, 100, customLightPurple);
        makeLine(g, 131, 148, 150, 100, customLightPurple);
        makeLine(g, 131, 148, 150, 101, customLightPurple);
        makeLine(g, 131, 148, 150, 102, customLightPurple);
        makeLine(g, 131, 148, 150, 103, customLightPurple);

        makeLine(g, 145, 160, 186, 135, customLightPurple);
        makeLine(g, 145, 160, 188, 134, customLightPurple);
        makeLine(g, 145, 160, 189, 134, customLightPurple);
        makeLine(g, 145, 160, 190, 134, customLightPurple);
        makeLine(g, 145, 160, 190, 135, customLightPurple);
        makeLine(g, 145, 160, 190, 136, customLightPurple);
        makeLine(g, 145, 160, 190, 137, customLightPurple);
        makeLine(g, 145, 160, 189, 134, customLightPurple);
        makeLine(g, 145, 160, 188, 138, customLightPurple);

        makeLine(g, 148, 178, 199, 187, customLightPurple);
        makeLine(g, 148, 178, 199, 188, customLightPurple);
        makeLine(g, 148, 178, 199, 189, customLightPurple);
        makeLine(g, 148, 178, 199, 190, customLightPurple);
        makeLine(g, 148, 178, 198, 190, customLightPurple);
        makeLine(g, 148, 178, 197, 190, customLightPurple);
        makeLine(g, 148, 178, 196, 190, customLightPurple);
        makeLine(g, 148, 178, 195, 190, customLightPurple);
        makeLine(g, 148, 178, 195, 190, customLightPurple);
        makeLine(g, 148, 178, 194, 190, customLightPurple);
        makeLine(g, 148, 178, 193, 190, customLightPurple);
        
        makeLine(g, 139, 194, 173, 232, customLightPurple);
        makeLine(g, 139, 194, 173, 233, customLightPurple);
        makeLine(g, 139, 194, 173, 234, customLightPurple);
        makeLine(g, 139, 194, 173, 235, customLightPurple);
        makeLine(g, 139, 194, 172, 235, customLightPurple);
        makeLine(g, 139, 194, 171, 235, customLightPurple);
        makeLine(g, 139, 194, 170, 235, customLightPurple);
        makeLine(g, 139, 194, 169, 235, customLightPurple);

        makeLine(g, 122, 200, 124, 252, customLightPurple);
        makeLine(g, 122, 200, 123, 253, customLightPurple);
        makeLine(g, 122, 200, 122, 253, customLightPurple);
        makeLine(g, 122, 200, 121, 253, customLightPurple);
        makeLine(g, 122, 200, 120, 252, customLightPurple);
        makeLine(g, 122, 200, 121, 251, customLightPurple);

        makeLine(g, 105, 194, 74, 235, customLightPurple);
        makeLine(g, 105, 194, 73, 235, customLightPurple);
        makeLine(g, 105, 194, 72, 235, customLightPurple);
        makeLine(g, 105, 194, 71, 235, customLightPurple);
        makeLine(g, 105, 194, 71, 234, customLightPurple);
        makeLine(g, 105, 194, 71, 233, customLightPurple);
        makeLine(g, 105, 194, 71, 232, customLightPurple);

        makeLine(g, 95, 178, 46, 190, customLightPurple);
        makeLine(g, 95, 178, 45, 190, customLightPurple);
        makeLine(g, 95, 178, 45, 189, customLightPurple);
        makeLine(g, 95, 178, 44, 189, customLightPurple);
        makeLine(g, 95, 178, 44, 188, customLightPurple);
        makeLine(g, 95, 178, 45, 187, customLightPurple);
        makeLine(g, 95, 178, 46, 186, customLightPurple);

        makeLine(g, 98, 160, 54, 137, customLightPurple);
        makeLine(g, 98, 160, 54, 136, customLightPurple);
        makeLine(g, 98, 160, 54, 135, customLightPurple);
        makeLine(g, 98, 160, 55, 135, customLightPurple);
        makeLine(g, 98, 160, 54, 134, customLightPurple);
        makeLine(g, 98, 160, 55, 134, customLightPurple);
        makeLine(g, 98, 160, 55, 134, customLightPurple);
        makeLine(g, 98, 160, 57, 134, customLightPurple);

        // Purple spots
        makeLine(g, 75, 135, 75, 139, customLightPurple);
        makeLine(g, 76, 135, 76, 139, customLightPurple);
        makeLine(g, 74, 136, 78, 136, customLightPurple);
        makeLine(g, 74, 137, 78, 137, customLightPurple);

        makeLine(g, 109, 110, 109, 114, customLightPurple);
        makeLine(g, 110, 110, 110, 114, customLightPurple);
        makeLine(g, 108, 111, 112, 111, customLightPurple);
        makeLine(g, 108, 112, 112, 112, customLightPurple);

        makeLine(g, 177, 152, 177, 157, customLightPurple);
        makeLine(g, 178,152, 178, 157, customLightPurple);
        makeLine(g, 179, 152,179, 157, customLightPurple);
        makeLine(g, 176, 153, 181, 153, customLightPurple);
        makeLine(g, 176, 154, 181, 154, customLightPurple);
        makeLine(g, 176, 155, 181, 155, customLightPurple);

        makeLine(g, 83, 207, 83, 211, customLightPurple);
        makeLine(g, 84, 207, 84, 211, customLightPurple);
        makeLine(g, 82, 208, 86, 208, customLightPurple);
        makeLine(g, 82, 209, 86, 209, customLightPurple);


        makeLine(g, 123, 172, 123, 177, customLightPurple);
        makeLine(g, 124, 172, 124, 177, customLightPurple);
        makeLine(g, 125, 172, 125, 177, customLightPurple);
        makeLine(g, 122, 173, 127, 173, customLightPurple);
        makeLine(g, 122, 174, 127, 174, customLightPurple);
        makeLine(g, 122, 175, 127, 175, customLightPurple);

        makeLine(g, 81, 157, 81, 161, customPurple);
        makeLine(g, 82, 157, 82, 161, customPurple);
        makeLine(g, 80, 158, 84, 158, customPurple);
        makeLine(g, 80, 159, 84, 159, customPurple);
        
        makeLine(g, 127, 155, 127, 159, customPurple);
        makeLine(g, 128, 155, 128, 159, customPurple);
        makeLine(g, 126, 156, 130, 156, customPurple);
        makeLine(g, 126, 157, 130, 157, customPurple);

        makeLine(g, 155, 185, 155, 189, customPurple);
        makeLine(g, 156, 185, 156, 189, customPurple);
        makeLine(g, 154, 186, 158, 186, customPurple);
        makeLine(g, 154, 187, 158, 187, customPurple);

        makeLine(g, 183, 196, 183, 200, customPurple);
        makeLine(g, 184, 196, 184, 200, customPurple);
        makeLine(g, 182, 197, 186, 197, customPurple);
        makeLine(g, 182, 198, 186, 198, customPurple);

        makeLine(g, 169, 214, 169,218, customPurple);
        makeLine(g, 170, 214, 170,218, customPurple);
        makeLine(g, 168, 215, 172,215, customPurple);
        makeLine(g, 168, 216, 172,216, customPurple);

        makeLine(g, 146, 213, 146,218, customPurple);
        makeLine(g, 147, 213, 147,218, customPurple);
        makeLine(g, 148, 213, 148,218, customPurple);
        makeLine(g, 145, 214, 150,214, customPurple);
        makeLine(g, 145, 215, 150,215, customPurple);
        makeLine(g, 145, 216, 150,216, customPurple);

        makeLine(g, 113, 218, 113,223, customPurple);
        makeLine(g, 114, 218, 114,223, customPurple);
        makeLine(g, 115, 218, 115,223, customPurple);
        makeLine(g, 112, 219, 117,219, customPurple);
        makeLine(g, 112, 220, 117,220, customPurple);
        makeLine(g, 112, 221, 117,221, customPurple);


        // Pink fireworks
        makeLine(g, 487, 162, 485, 91, customPink);
        makeLine(g, 487, 162, 485, 90, customPink);
        makeLine(g, 487, 162, 486, 89, customPink);
        makeLine(g, 487, 162, 487, 89, customPink);
        makeLine(g, 487, 162, 488, 89, customPink);
        makeLine(g, 487, 162, 489, 90, customPink);
        makeLine(g, 487, 162, 489, 91, customPink);
        makeLine(g, 487, 162, 489, 90, customPink);
        makeLine(g, 487, 162, 490, 91, customPink);

        makeLine(g, 498, 162, 539, 109, customPink);
        makeLine(g, 498, 162, 540, 109, customPink);
        makeLine(g, 498, 162, 541, 109, customPink);
        makeLine(g, 498, 162, 542, 109, customPink);
        makeLine(g, 498, 162, 542, 110, customPink);
        makeLine(g, 498, 162, 542, 111, customPink);
        makeLine(g, 498, 162, 542, 112, customPink);
        makeLine(g, 498, 162, 542, 113, customPink);

        makeLine(g, 500, 172, 569, 157, customPink);
        makeLine(g, 500, 172, 569, 158, customPink);
        makeLine(g, 500, 172, 570, 158, customPink);
        makeLine(g, 500, 172, 571, 159, customPink);
        makeLine(g, 500, 172, 571, 160, customPink);
        makeLine(g, 500, 172, 571, 158, customPink);
        makeLine(g, 500, 172, 571, 161, customPink);
        makeLine(g, 500, 172, 571, 162, customPink);
        makeLine(g, 500, 172, 569, 163, customPink);

        makeLine(g, 503, 184, 557, 213, customPink);
        makeLine(g, 503, 184, 556, 212, customPink);
        makeLine(g, 503, 184, 557, 214, customPink);
        makeLine(g, 503, 184, 557, 215, customPink);
        makeLine(g, 503, 184, 557, 213, customPink);
        makeLine(g, 503, 184, 556, 215, customPink);
        makeLine(g, 503, 184, 556, 216, customPink);
        makeLine(g, 503, 184, 555, 216, customPink);
        makeLine(g, 503, 184, 554, 216, customPink);
        makeLine(g, 503, 184, 553, 216, customPink);

        makeLine(g, 492, 187, 518, 252, customPink);
        makeLine(g, 492, 187, 518, 253, customPink);
        makeLine(g, 492, 187, 518, 254, customPink);
        makeLine(g, 492, 187, 517, 254, customPink);
        makeLine(g, 492, 187, 517, 255, customPink);
        makeLine(g, 492, 187, 516, 255, customPink);
        makeLine(g, 492, 187, 515, 255, customPink);
        makeLine(g, 492, 187, 516, 255, customPink);
        makeLine(g, 492, 187, 515, 255, customPink);
        makeLine(g, 492, 187, 514, 254, customPink);

        makeLine(g, 483, 187, 460, 255, customPink);
        makeLine(g, 483, 187, 459, 255, customPink);
        makeLine(g, 483, 187, 458, 255, customPink);
        makeLine(g, 483, 187, 460, 255, customPink);
        makeLine(g, 483, 187, 457, 255, customPink);
        makeLine(g, 483, 187, 457, 254, customPink); 
        makeLine(g, 483, 187, 457, 253, customPink);
        makeLine(g, 483, 187, 456, 253, customPink);
        makeLine(g, 483, 187, 456, 252, customPink);
        makeLine(g, 483, 187, 456, 251, customPink);

        makeLine(g, 473, 183, 425, 214, customPink);
        makeLine(g, 473, 183, 424, 214, customPink);
        makeLine(g, 473, 183, 423, 214, customPink);
        makeLine(g, 473, 183, 422, 214, customPink);
        makeLine(g, 473, 183, 422, 213, customPink);
        makeLine(g, 473, 183, 421, 213, customPink);
        makeLine(g, 473, 183, 421, 212, customPink);
        makeLine(g, 473, 183, 421, 211, customPink);
        makeLine(g, 473, 183, 422, 210, customPink);

        makeLine(g, 474, 172, 405, 162, customPink);
        makeLine(g, 474, 172, 405, 161, customPink);
        makeLine(g, 474, 172, 404, 160, customPink);
        makeLine(g, 474, 172, 404, 159, customPink);
        makeLine(g, 474, 172, 404, 158, customPink);
        makeLine(g, 474, 172, 405, 158, customPink);
        makeLine(g, 474, 172, 406, 158, customPink);
        makeLine(g, 474, 172, 407, 158, customPink);
        makeLine(g, 474, 172, 408, 158, customPink);
        makeLine(g, 474, 172, 409, 159, customPink);

        makeLine(g, 475, 160, 435, 116, customPink);
        makeLine(g, 475, 160, 435, 117, customPink);
        makeLine(g, 475, 160, 435, 115, customPink);
        makeLine(g, 475, 160, 435, 114, customPink);
        makeLine(g, 475, 160, 436, 114, customPink);
        makeLine(g, 475, 160, 436, 115, customPink);
        makeLine(g, 475, 160, 436, 113, customPink);
        makeLine(g, 475, 160, 437, 113, customPink);
        makeLine(g, 475, 160, 438, 113, customPink);
        makeLine(g, 475, 160, 439, 113, customPink);

        makeLine(g, 478, 148, 459, 103, customLightPink);
        makeLine(g, 478, 148, 459, 102, customLightPink);
        makeLine(g, 478, 148, 459, 101, customLightPink);
        makeLine(g, 478, 148, 460, 101, customLightPink);
        makeLine(g, 478, 148, 460, 100, customLightPink);
        makeLine(g, 478, 148, 461, 100, customLightPink);
        makeLine(g, 478, 148, 462, 100, customLightPink);
        makeLine(g, 478, 148, 462, 101, customLightPink);

        makeLine(g, 496, 148, 512, 101, customLightPink);
        makeLine(g, 496, 148, 513, 101, customLightPink);
        makeLine(g, 496, 148, 513, 100, customLightPink);
        makeLine(g, 496, 148, 514, 100, customLightPink);
        makeLine(g, 496, 148, 513, 100, customLightPink);
        makeLine(g, 496, 148, 514, 101, customLightPink);
        makeLine(g, 496, 148, 515, 100, customLightPink);
        makeLine(g, 496, 148, 515, 101, customLightPink);
        makeLine(g, 496, 148, 515, 102, customLightPink);
        makeLine(g, 496, 148, 515, 103, customLightPink);
        makeLine(g, 496, 148, 515, 104, customLightPink);

        makeLine(g, 510, 160, 554, 134, customLightPink);
        makeLine(g, 510, 160, 555, 134, customLightPink);
        makeLine(g, 510, 160, 555, 135, customLightPink);
        makeLine(g, 510, 160, 556, 135, customLightPink);
        makeLine(g, 510, 160, 556, 136, customLightPink);
        makeLine(g, 510, 160, 556, 137, customLightPink);
        makeLine(g, 510, 160, 554, 138, customLightPink);

        makeLine(g, 514, 178, 565, 187, customLightPink);
        makeLine(g, 514, 178, 565, 188, customLightPink);
        makeLine(g, 514, 178, 565, 189, customLightPink);
        makeLine(g, 514, 178, 564, 189, customLightPink);
        makeLine(g, 514, 178, 564, 190, customLightPink);
        makeLine(g, 514, 178, 563, 191, customLightPink);
        makeLine(g, 514, 178, 562, 191, customLightPink);
        makeLine(g, 514, 178, 561, 191, customLightPink);

        makeLine(g, 504, 194, 539, 232, customLightPink);
        makeLine(g, 504, 194, 539, 233, customLightPink);
        makeLine(g, 504, 194, 539, 234, customLightPink);
        makeLine(g, 504, 194, 538, 234, customLightPink);
        makeLine(g, 504, 194, 538, 235, customLightPink);
        makeLine(g, 504, 194, 537, 235, customLightPink);
        makeLine(g, 504, 194, 536, 235, customLightPink);
        makeLine(g, 504, 194, 535, 235, customLightPink);

        makeLine(g, 487, 200, 490, 252, customLightPink);
        makeLine(g, 487, 200, 489, 252, customLightPink);
        makeLine(g, 487, 200, 489, 253, customLightPink);
        makeLine(g, 487, 200, 488, 253, customLightPink);
        makeLine(g, 487, 200, 488, 254, customLightPink);
        makeLine(g, 487, 200, 487, 254, customLightPink);
        makeLine(g, 487, 200, 486, 253, customLightPink);
        makeLine(g, 487, 200, 485, 252, customLightPink);

        makeLine(g, 470, 194, 440, 236, customLightPink);
        makeLine(g, 470, 194, 439, 236, customLightPink);
        makeLine(g, 470, 194, 438, 236, customLightPink);
        makeLine(g, 470, 194, 437, 236, customLightPink);
        makeLine(g, 470, 194, 437, 235, customLightPink);
        makeLine(g, 470, 194, 436, 235, customLightPink);
        makeLine(g, 470, 194, 436, 234, customLightPink);
        makeLine(g, 470, 194, 436, 233, customLightPink);

        makeLine(g, 461, 178, 414, 189, customLightPink);
        makeLine(g, 461, 178, 413, 190, customLightPink);
        makeLine(g, 461, 178, 412, 190, customLightPink);
        makeLine(g, 461, 178, 411, 190, customLightPink);
        makeLine(g, 461, 178, 410, 190, customLightPink);
        makeLine(g, 461, 178, 410, 189, customLightPink);
        makeLine(g, 461, 178, 410, 188, customLightPink);
        makeLine(g, 461, 178, 410, 187, customLightPink);
        makeLine(g, 461, 178, 411, 186, customLightPink);
        makeLine(g, 461, 178, 412, 186, customLightPink);

        makeLine(g, 464, 160, 419, 138, customLightPink);
        makeLine(g, 464, 160, 419, 137, customLightPink);
        makeLine(g, 464, 160, 419, 136, customLightPink);
        makeLine(g, 464, 160, 419, 135, customLightPink);
        makeLine(g, 464, 160, 420, 135, customLightPink);
        makeLine(g, 464, 160, 420, 134, customLightPink);
        makeLine(g, 464, 160, 421, 134, customLightPink);
        makeLine(g, 464, 160, 422, 134, customLightPink);
        makeLine(g, 464, 160, 423, 134, customLightPink);


        // Pink spots
        makeLine(g, 441, 135, 441, 139, customLightPink);
        makeLine(g, 442, 135, 442, 139, customLightPink);
        makeLine(g, 440, 136, 444, 136, customLightPink);
        makeLine(g, 440, 137, 444, 137, customLightPink);

        makeLine(g, 475, 110, 475, 114, customLightPink);
        makeLine(g, 476, 110, 476, 114, customLightPink);
        makeLine(g, 474, 111, 478, 111, customLightPink);
        makeLine(g, 474, 112, 478, 112, customLightPink);

        makeLine(g, 543, 152, 543, 157, customLightPink);
        makeLine(g, 544, 152, 544, 157, customLightPink);
        makeLine(g, 545, 152, 545, 157, customLightPink);
        makeLine(g, 542, 153, 547, 153, customLightPink);
        makeLine(g, 542, 154, 547, 154, customLightPink);
        makeLine(g, 542, 155, 547, 155, customLightPink);

        makeLine(g, 449, 207, 449, 211, customLightPink);
        makeLine(g, 450, 207, 450, 211, customLightPink);
        makeLine(g, 448, 208, 452, 208, customLightPink);
        makeLine(g, 448, 209, 452, 209, customLightPink);


        makeLine(g, 489, 172, 489, 177, customLightPink);
        makeLine(g, 490, 172, 490, 177, customLightPink);
        makeLine(g, 491, 172, 491, 177, customLightPink);
        makeLine(g, 488, 173, 493, 173, customLightPink);
        makeLine(g, 488, 174, 493, 174, customLightPink);
        makeLine(g, 488, 175, 493, 175, customLightPink);

        makeLine(g, 447, 157, 447, 161, customPink);
        makeLine(g, 448, 157, 448, 161, customPink);
        makeLine(g, 446, 158, 450, 158, customPink);
        makeLine(g, 446, 159, 450, 159, customPink);
        
        makeLine(g, 493, 155, 493, 159, customPink);
        makeLine(g, 494, 155, 494, 159, customPink);
        makeLine(g, 492, 156, 496, 156, customPink);
        makeLine(g, 492, 157, 496, 157, customPink);

        makeLine(g, 521, 185, 521, 189, customPink);
        makeLine(g, 522, 185, 522, 189, customPink);
        makeLine(g, 520, 186, 524, 186, customPink);
        makeLine(g, 520, 187, 524, 187, customPink);

        makeLine(g, 549, 196, 549, 200, customPink);
        makeLine(g, 550, 196, 550, 200, customPink);
        makeLine(g, 548, 197, 552, 197, customPink);
        makeLine(g, 548, 198, 552, 198, customPink);

        makeLine(g, 535, 214, 535,218, customPink);
        makeLine(g, 536, 214, 536,218, customPink);
        makeLine(g, 534, 215, 538,215, customPink);
        makeLine(g, 534, 216, 538,216, customPink);

        makeLine(g, 512, 213, 512,218, customPink);
        makeLine(g, 513, 213, 513,218, customPink);
        makeLine(g, 514, 213, 514,218, customPink);
        makeLine(g, 511, 214, 516,214, customPink);
        makeLine(g, 511, 215, 516,215, customPink);
        makeLine(g, 511, 216, 516,216, customPink);

        makeLine(g, 479, 218, 479,223, customPink);
        makeLine(g, 480, 218, 480,223, customPink);
        makeLine(g, 481, 218, 481,223, customPink);
        makeLine(g, 478, 219, 483,219, customPink);
        makeLine(g, 478, 220, 483,220, customPink);
        makeLine(g, 478, 221, 483,221, customPink);

        // Fireworks on blue head
        makeLine(g, 307, 180, 305, 168, customSky);
        makeLine(g, 307, 180, 306, 167, customSky);
        makeLine(g, 307, 180, 307, 166, customSky);
        makeLine(g, 307, 180, 308, 167, customSky);
        makeLine(g, 307, 180, 309, 168, customSky);

        makeLine(g, 377, 209, 384, 198, customSky);
        makeLine(g, 377, 209, 385, 198, customSky);
        makeLine(g, 377, 209, 386, 198, customSky);
        makeLine(g, 377, 209, 387, 198, customSky);
        makeLine(g, 377, 209, 387, 199, customSky);
        makeLine(g, 377, 209, 387, 200, customSky);
       
        makeLine(g, 396, 261, 406, 255, customSky);
        makeLine(g, 396, 261, 407, 255, customSky);
        makeLine(g, 396, 261, 408, 255, customSky);
        makeLine(g, 396, 261, 409, 256, customSky);
        makeLine(g, 396, 261, 409, 257, customSky);
        makeLine(g, 396, 261, 409, 258, customSky);

        makeLine(g, 406, 291, 446, 288, customSky);
        makeLine(g, 406, 291, 446, 289, customSky);
        makeLine(g, 406, 291, 447, 289, customSky);
        makeLine(g, 406, 291, 448, 290, customSky);
        makeLine(g, 406, 291, 447, 291, customSky);
        makeLine(g, 406, 291, 446, 291, customSky);
        makeLine(g, 406, 291, 446, 292, customSky);
        
        makeLine(g, 381, 316, 414, 327, customSky);
        makeLine(g, 381, 316, 414, 328, customSky);
        makeLine(g, 381, 316, 414, 329, customSky);
        makeLine(g, 381, 316, 414, 330, customSky);
        makeLine(g, 381, 316, 413, 330, customSky);
        makeLine(g, 381, 316, 412, 330, customSky);

        makeLine(g, 394, 340, 429, 358, customSky);
        makeLine(g, 394, 340, 429, 359, customSky);
        makeLine(g, 394, 340, 429, 360, customSky);
        makeLine(g, 394, 340, 428, 360, customSky);
        makeLine(g, 394, 340, 427, 360, customSky);
        makeLine(g, 394, 340, 426, 360, customSky);

        makeLine(g, 398, 368, 428, 391, customSky);
        makeLine(g, 398, 368, 428, 392, customSky);
        makeLine(g, 398, 368, 428, 393, customSky);
        makeLine(g, 398, 368, 427, 393, customSky);
        makeLine(g, 398, 368, 427, 394, customSky);
        makeLine(g, 398, 368, 426, 394, customSky);
        makeLine(g, 398, 368, 425, 394, customSky);

        makeLine(g, 206, 328, 198, 333, customSky);
        makeLine(g, 206, 328, 197, 333, customSky);
        makeLine(g, 206, 328, 196, 333, customSky);
        makeLine(g, 206, 328, 195, 333, customSky);
        makeLine(g, 206, 328, 195, 332, customSky);
        makeLine(g, 206, 328, 195, 331, customSky);

        makeLine(g, 190, 334, 154, 348, customSky);
        makeLine(g, 190, 334, 153, 348, customSky);
        makeLine(g, 190, 334, 152, 348, customSky);
        makeLine(g, 190, 334, 153, 347, customSky);
        makeLine(g, 190, 334, 151, 347, customSky);
        makeLine(g, 190, 334, 151, 346, customSky);
        makeLine(g, 190, 334, 151, 345, customSky);

        makeLine(g, 220, 275, 211, 276, customSky);
        makeLine(g, 220, 275, 210, 275, customSky);
        makeLine(g, 220, 275, 211, 274, customSky);
        makeLine(g, 220, 275, 211, 273, customSky);
        makeLine(g, 220, 275, 212, 273, customSky);
        makeLine(g, 220, 275, 211, 276, customSky);

        makeLine(g, 241, 211, 220, 189, customSky);
        makeLine(g, 241, 211, 220, 188, customSky);
        makeLine(g, 241, 211, 220, 187, customSky);
        makeLine(g, 241, 211, 221, 187, customSky);
        makeLine(g, 241, 211, 221, 186, customSky);
        makeLine(g, 241, 211, 222, 186, customSky);
        makeLine(g, 241, 211, 223, 186, customSky);

        // Fireworks on orange head
        makeLine(g, 306, 158, 305, 119, customOrange);
        makeLine(g, 307, 159, 306, 119, customOrange);
        makeLine(g, 307, 159, 306, 118, customOrange);
        makeLine(g, 307, 159, 307, 117, customOrange);
        makeLine(g, 307, 159, 308, 118, customOrange);
        makeLine(g, 307, 159, 308, 119, customOrange);
        makeLine(g, 308, 158, 309, 119, customOrange);

        makeLine(g, 357, 205, 375, 172, customOrange);
        makeLine(g, 357, 205, 376, 172, customOrange);
        makeLine(g, 357, 205, 376, 171, customOrange);
        makeLine(g, 357, 205, 377, 171, customOrange);
        makeLine(g, 357, 205, 378, 171, customOrange);
        makeLine(g, 357, 205, 378, 172, customOrange);
        makeLine(g, 357, 205, 378, 173, customOrange);
        makeLine(g, 357, 205, 378, 174, customOrange);

        makeLine(g, 389, 194, 406, 171, customOrange);
        makeLine(g, 389, 194, 407, 171, customOrange);
        makeLine(g, 389, 194, 407, 170, customOrange);
        makeLine(g, 389, 194, 408, 170, customOrange);
        makeLine(g, 389, 194, 409, 170, customOrange);
        makeLine(g, 389, 194, 409, 171, customOrange);
        makeLine(g, 389, 194, 409, 172, customOrange);
        makeLine(g, 389, 194, 409, 173, customOrange);

        makeLine(g, 381, 249, 388, 243, customOrange);
        makeLine(g, 381, 249, 389, 243, customOrange);
        makeLine(g, 381, 249, 390, 243, customOrange);
        makeLine(g, 381, 249, 390, 244, customOrange);
        makeLine(g, 381, 249, 391, 243, customOrange);
        makeLine(g, 381, 249, 391, 244, customOrange);
        makeLine(g, 381, 249, 391, 245, customOrange);
        
        makeLine(g, 394, 241, 426, 220, customOrange);
        makeLine(g, 394, 241, 427, 220, customOrange);
        makeLine(g, 394, 241, 428, 220, customOrange);
        makeLine(g, 394, 241, 428, 221, customOrange);
        makeLine(g, 394, 241, 429, 221, customOrange);
        makeLine(g, 394, 241, 429, 222, customOrange);
        makeLine(g, 394, 241, 429, 223, customOrange);

        makeLine(g, 412, 254, 441, 242, customOrange);
        makeLine(g, 412, 254, 442, 242, customOrange);
        makeLine(g, 412, 254, 443, 242, customOrange);
        makeLine(g, 412, 254, 444, 242, customOrange);
        makeLine(g, 412, 254, 444, 243, customOrange);
        makeLine(g, 412, 254, 444, 244, customOrange);
        makeLine(g, 412, 254, 444, 245, customOrange);

        makeLine(g, 391, 290, 399, 289, customOrange);
        makeLine(g, 391, 290, 400, 289, customOrange);
        makeLine(g, 391, 290, 400, 290, customOrange);
        makeLine(g, 391, 290, 401, 290, customOrange);
        makeLine(g, 391, 290, 401, 291, customOrange);
        makeLine(g, 391, 290, 400, 292, customOrange);
        makeLine(g, 391, 290, 399, 292, customOrange);

        makeLine(g, 414, 309, 425, 309, customOrange);
        makeLine(g, 414, 309, 425, 310, customOrange);
        makeLine(g, 414, 309, 426, 310, customOrange);
        makeLine(g, 414, 309, 427, 310, customOrange);
        makeLine(g, 414, 309, 427, 311, customOrange);
        makeLine(g, 414, 309, 427, 312, customOrange);
        makeLine(g, 414, 309, 426, 312, customOrange);
        makeLine(g, 414, 309, 425, 312, customOrange);
        makeLine(g, 414, 309, 425, 313, customOrange);

        makeLine(g, 368, 340, 380, 347, customOrange);
        makeLine(g, 368, 340, 380, 348, customOrange);
        makeLine(g, 368, 340, 380, 349, customOrange);
        makeLine(g, 368, 340, 380, 350, customOrange);
        makeLine(g, 368, 340, 379, 350, customOrange);
        makeLine(g, 368, 340, 378, 350, customOrange);
        makeLine(g, 368, 340, 377, 350, customOrange);

        makeLine(g, 239, 350, 225, 366, customOrange);
        makeLine(g, 239, 350, 224, 366, customOrange);
        makeLine(g, 239, 350, 223, 366, customOrange);
        makeLine(g, 239, 350, 222, 366, customOrange);
        makeLine(g, 239, 350, 222, 365, customOrange);
        makeLine(g, 239, 350, 222, 364, customOrange);
        makeLine(g, 239, 350, 222, 363, customOrange);

        makeLine(g, 222, 342, 193, 362, customOrange);
        makeLine(g, 222, 342, 192, 362, customOrange);
        makeLine(g, 222, 342, 191, 362, customOrange);
        makeLine(g, 222, 342, 190, 362, customOrange);
        makeLine(g, 222, 342, 190, 361, customOrange);
        makeLine(g, 222, 342, 190, 360, customOrange);
        makeLine(g, 222, 342, 190, 359, customOrange);

        makeLine(g, 231, 320, 217, 327, customOrange);
        makeLine(g, 231, 320, 216, 328, customOrange);
        makeLine(g, 231, 320, 215, 328, customOrange);
        makeLine(g, 231, 320, 214, 328, customOrange);
        makeLine(g, 231, 320, 213, 328, customOrange);
        makeLine(g, 231, 320, 213, 327, customOrange);
        makeLine(g, 231, 320, 213, 326, customOrange);

        makeLine(g, 230, 306, 196, 311, customOrange);
        makeLine(g, 230, 306, 195, 311, customOrange);
        makeLine(g, 230, 306, 194, 311, customOrange);
        makeLine(g, 230, 306, 193, 311, customOrange);
        makeLine(g, 230, 306, 192, 310, customOrange);
        makeLine(g, 230, 306, 192, 309, customOrange);
        makeLine(g, 230, 306, 193, 308, customOrange);
        makeLine(g, 230, 306, 194, 308, customOrange);

        makeLine(g, 184, 271, 147, 265, customOrange);
        makeLine(g, 184, 271, 146, 265, customOrange);
        makeLine(g, 184, 271, 146, 264, customOrange);
        makeLine(g, 184, 271, 145, 264, customOrange);
        makeLine(g, 184, 271, 145, 263, customOrange);
        makeLine(g, 184, 271, 146, 263, customOrange);
        makeLine(g, 184, 271, 146, 262, customOrange);
        makeLine(g, 184, 271, 147, 262, customOrange);
        makeLine(g, 184, 271, 148, 262, customOrange);

        makeLine(g, 212, 212, 192, 197, customOrange);
        makeLine(g, 212, 212, 192, 196, customOrange);
        makeLine(g, 212, 212, 192, 195, customOrange);
        makeLine(g, 212, 212, 192, 194, customOrange);
        makeLine(g, 212, 212, 193, 194, customOrange);
        makeLine(g, 212, 212, 194, 194, customOrange);
        makeLine(g, 212, 212, 195, 194, customOrange);

        makeLine(g, 255, 202, 236, 172, customOrange);
        makeLine(g, 255, 202, 236, 171, customOrange);
        makeLine(g, 255, 202, 236, 170, customOrange);
        makeLine(g, 255, 202, 237, 170, customOrange);
        makeLine(g, 255, 202, 237, 169, customOrange);
        makeLine(g, 255, 202, 238, 169, customOrange);
        makeLine(g, 255, 202, 239, 169, customOrange);
        makeLine(g, 255, 202, 240, 170, customOrange);

        // Fireworks on green head
        makeLine(g, 330, 167, 334, 130, customGreen);
        makeLine(g, 330, 167, 335, 130, customGreen);
        makeLine(g, 330, 167, 335, 129, customGreen);
        makeLine(g, 330, 167, 336, 129, customGreen);
        makeLine(g, 330, 167, 337, 128, customGreen);
        makeLine(g, 330, 167, 337, 129, customGreen);
        makeLine(g, 330, 167, 338, 129, customGreen);

        makeLine(g, 342, 197, 351, 164, customGreen);
        makeLine(g, 342, 197, 352, 163, customGreen);
        makeLine(g, 342, 197, 353, 162, customGreen);
        makeLine(g, 342, 197, 354, 162, customGreen);
        makeLine(g, 342, 197, 355, 163, customGreen);
        makeLine(g, 342, 197, 354, 163, customGreen);
        makeLine(g, 342, 197, 355, 164, customGreen);
        makeLine(g, 342, 197, 355, 165, customGreen);

        makeLine(g, 377, 233, 392, 218, customGreen);
        makeLine(g, 377, 233, 393, 218, customGreen);
        makeLine(g, 377, 233, 394, 218, customGreen);
        makeLine(g, 377, 233, 395, 218, customGreen);
        makeLine(g, 377, 233, 395, 219, customGreen);
        makeLine(g, 377, 233, 395, 220, customGreen);
        makeLine(g, 377, 233, 395, 221, customGreen);

        makeLine(g, 433, 313, 470, 318, customGreen);
        makeLine(g, 433, 313, 471, 318, customGreen);
        makeLine(g, 433, 313, 471, 319, customGreen);
        makeLine(g, 433, 313, 472, 319, customGreen);
        makeLine(g, 433, 313, 472, 320, customGreen);
        makeLine(g, 433, 313, 471, 321, customGreen);
        makeLine(g, 433, 313, 472, 321, customGreen);
        makeLine(g, 433, 313, 471, 322, customGreen);
        makeLine(g, 433, 313, 470, 322, customGreen);

        makeLine(g, 187, 310, 176, 312, customGreen);
        makeLine(g, 187, 310, 176, 311, customGreen);
        makeLine(g, 187, 310, 175, 311, customGreen);
        makeLine(g, 187, 310, 174, 310, customGreen);
        makeLine(g, 187, 310, 175, 309, customGreen);
        makeLine(g, 187, 310, 176, 309, customGreen);
        makeLine(g, 187, 310, 176, 308, customGreen);

        // Fireworks on yellow head
        makeLine(g, 326, 186, 327, 173, customYellow);
        makeLine(g, 326, 186, 328, 172, customYellow);
        makeLine(g, 326, 186, 329, 172, customYellow);
        makeLine(g, 326, 186, 330, 172, customYellow);
        makeLine(g, 326, 186, 330, 173, customYellow);
        makeLine(g, 326, 186, 330, 174, customYellow);

        makeLine(g, 379, 169, 383, 160, customYellow);
        makeLine(g, 379, 169, 384, 159, customYellow);
        makeLine(g, 379, 169, 385, 159, customYellow);
        makeLine(g, 379, 169, 386, 159, customYellow);
        makeLine(g, 379, 169, 387, 160, customYellow);
        makeLine(g, 379, 169, 387, 161, customYellow);

        // Fireworks on purple head
        makeLine(g, 384, 277, 417, 270, customPastelPurple);
        makeLine(g, 384, 277, 418, 270, customPastelPurple);
        makeLine(g, 384, 277, 419, 270, customPastelPurple);
        makeLine(g, 384, 277, 419, 271, customPastelPurple);
        makeLine(g, 384, 277, 420, 271, customPastelPurple);
        makeLine(g, 384, 277, 420, 272, customPastelPurple);
        makeLine(g, 384, 277, 420, 273, customPastelPurple);
        makeLine(g, 384, 277, 419, 274, customPastelPurple);

        makeLine(g, 380, 331, 390, 335, customPastelPurple);
        makeLine(g, 380, 331, 391, 336, customPastelPurple);
        makeLine(g, 380, 331, 391, 337, customPastelPurple);
        makeLine(g, 380, 331, 390, 337, customPastelPurple);
        makeLine(g, 380, 331, 390, 338, customPastelPurple);
        makeLine(g, 380, 331, 390, 338, customPastelPurple);
        makeLine(g, 380, 331, 389, 338, customPastelPurple);
        makeLine(g, 380, 331, 388, 338, customPastelPurple);

        makeLine(g, 386, 356, 395, 362, customPastelPurple);
        makeLine(g, 386, 356, 395, 363, customPastelPurple);
        makeLine(g, 386, 356, 395, 364, customPastelPurple);
        makeLine(g, 386, 356, 395, 365, customPastelPurple);
        makeLine(g, 386, 356, 394, 365, customPastelPurple);
        makeLine(g, 386, 356, 393, 365, customPastelPurple);
        makeLine(g, 386, 356, 392, 365, customPastelPurple);

        makeLine(g, 234, 334, 225, 338, customPastelPurple);
        makeLine(g, 234, 334, 225, 339, customPastelPurple);
        makeLine(g, 234, 334, 225, 340, customPastelPurple);
        makeLine(g, 234, 334, 226, 340, customPastelPurple);
        makeLine(g, 234, 334, 226, 341, customPastelPurple);
        makeLine(g, 234, 334, 227, 341, customPastelPurple);
        makeLine(g, 234, 334, 228, 341, customPastelPurple);

        makeLine(g, 210, 291, 172, 293, customPastelPurple);
        makeLine(g, 210, 291, 171, 292, customPastelPurple);
        makeLine(g, 210, 291, 170, 292, customPastelPurple);
        makeLine(g, 210, 291, 169, 291, customPastelPurple);
        makeLine(g, 210, 291, 170, 290, customPastelPurple);
        makeLine(g, 210, 291, 171, 289, customPastelPurple);

        makeLine(g, 204, 274, 190, 273, customPastelPurple);
        makeLine(g, 204, 274, 189, 272, customPastelPurple);
        makeLine(g, 204, 274, 188, 271, customPastelPurple);
        makeLine(g, 204, 274, 189, 270, customPastelPurple);
        makeLine(g, 204, 274, 190, 270, customPastelPurple);
        makeLine(g, 204, 274, 191, 270, customPastelPurple);

        makeLine(g, 221, 261, 203, 256, customPastelPurple);
        makeLine(g, 221, 261, 202, 256, customPastelPurple);
        makeLine(g, 221, 261, 202, 255, customPastelPurple);
        makeLine(g, 221, 261, 202, 254, customPastelPurple);
        makeLine(g, 221, 261, 202, 253, customPastelPurple);
        makeLine(g, 221, 261, 203, 252, customPastelPurple);
        makeLine(g, 221, 261, 204, 253, customPastelPurple);

        makeLine(g, 222, 243, 189, 224, customPastelPurple);
        makeLine(g, 222, 243, 189, 223, customPastelPurple);
        makeLine(g, 222, 243, 189, 222, customPastelPurple);
        makeLine(g, 222, 243, 189, 221, customPastelPurple);
        makeLine(g, 222, 243, 190, 221, customPastelPurple);
        makeLine(g, 222, 243, 191, 221, customPastelPurple);
        makeLine(g, 222, 243, 192, 221, customPastelPurple);
        makeLine(g, 222, 243, 193, 221, customPastelPurple);

        makeLine(g, 226, 223, 215, 216, customPastelPurple);
        makeLine(g, 226, 223, 215, 215, customPastelPurple);
        makeLine(g, 226, 223, 215, 214, customPastelPurple);
        makeLine(g, 226, 223, 216, 214, customPastelPurple);
        makeLine(g, 226, 223, 217, 214, customPastelPurple);

        makeLine(g, 265, 173, 250, 138, customPastelPurple);
        makeLine(g, 265, 173, 250, 137, customPastelPurple);
        makeLine(g, 265, 173, 251, 137, customPastelPurple);
        makeLine(g, 265, 173, 251, 136, customPastelPurple);
        makeLine(g, 265, 173, 252, 136, customPastelPurple);
        makeLine(g, 265, 173, 253, 136, customPastelPurple);
        makeLine(g, 265, 173, 254, 137, customPastelPurple);

        makeLine(g, 290, 186, 282, 149, customPastelPurple);
        makeLine(g, 290, 186, 282, 148, customPastelPurple);
        makeLine(g, 290, 186, 282, 147, customPastelPurple);
        makeLine(g, 290, 186, 282, 146, customPastelPurple);
        makeLine(g, 290, 186, 283, 146, customPastelPurple);
        makeLine(g, 290, 186, 284, 146, customPastelPurple);
        makeLine(g, 290, 186, 285, 146, customPastelPurple);
        makeLine(g, 290, 186, 285, 147, customPastelPurple);
        makeLine(g, 290, 186, 285, 148, customPastelPurple);
        makeLine(g, 290, 186, 286, 147, customPastelPurple);

        // Fireworks on pink head
        makeLine(g, 272, 191, 265, 179, customLightPink);
        makeLine(g, 272, 191, 265, 178, customLightPink);
        makeLine(g, 272, 191, 266, 177, customLightPink);
        makeLine(g, 272, 191, 267, 177, customLightPink);
        makeLine(g, 272, 191, 268, 177, customLightPink);
        makeLine(g, 272, 191, 269, 178, customLightPink);

        /* Happy New Year 2024 */
        g.setColor(Color.WHITE);

        //H
        makeCurve(g, 121,40, 126,34, 146,34,154, 32, 3);
        makeCurve(g, 130,18, 131,10, 130,53,130, 57, 4);
        makeCurve(g, 149,18, 147,23, 145,36,145, 47, 4);
        makeCurve(g, 145,47, 148,59, 155,58,159, 49, 3);

        //A
        makeCurve(g, 173,33, 163,36, 160,44,160, 50, 3);
        makeCurve(g, 160,50, 163,52, 167,47,173, 43, 2);
        makeCurve(g, 173,32, 173,40, 173,50,173, 55, 3);
        makeCurve(g, 173,55, 175,59, 178,59,186, 44, 2);

        //P
        makeCurve(g, 188,26, 189,44, 188,58,188, 67, 4);
        makeCurve(g, 191,40, 197,32, 203,32,204, 40, 3);
        makeCurve(g, 204,40, 200,48, 196,52,191, 52, 3);
        makeCurve(g, 191,46, 198,42, 203,40,212, 39, 2);

        //P
        makeCurve(g, 212,26, 213,44, 212,58,212, 67, 4);
        makeCurve(g, 216,39, 221,32, 227,33,228, 41, 3);
        makeCurve(g, 228,41, 225,47, 220,52,215, 52, 3);
        makeCurve(g, 215,47, 221,43, 228,40,235, 40, 2);

        //Y
        makeCurve(g, 238,25, 236,33, 236,43,241, 47, 3);
        makeCurve(g, 241,48, 244,49, 249,42,252, 28, 2);
        makeCurve(g, 252,27, 250,50, 250,56,247, 63, 4);
        makeCurve(g, 246,63, 243,67, 238,67,239, 58, 3);
        makeCurve(g, 239,58, 245,53, 254,47,261, 41, 2);

        //N
        makeCurve(g, 281,19, 281,31, 281,46,281, 56, 4);
        makeCurve(g, 284,30, 290,21, 295,18,298, 22, 2);
        makeCurve(g, 298,23, 299,33, 299,50,301, 55, 3);
        makeCurve(g, 301,56, 303,58, 307,57,313, 49, 2);

        //E
        makeCurve(g, 319,29, 314,35, 313,49,319, 53, 4);
        makeCurve(g, 319,29, 326,30, 326,37,317, 42,2);
        makeCurve(g, 318,53, 320,55, 325,53,332, 44,2);

        //W
        makeCurve(g, 335,32, 334,43, 334,53,336, 58,4);
        makeCurve(g, 335,58, 343,57, 342,51,344, 43,2);
        makeCurve(g, 345,33, 346,47, 348,52,350, 55,4);
        makeCurve(g, 351,55, 353,57, 359,54,360, 32,2);
        makeCurve(g, 360,32, 358,28, 355,30,357, 37,2);
        makeCurve(g, 357,37, 360,40, 362,42,371, 41,2);

        //Y
        makeCurve(g, 394,24, 393,33, 394,39,396, 44,4);
        makeCurve(g, 397,45, 396,49, 405,45,409, 26,2);
        makeCurve(g, 409,24, 410,34, 409,44,403, 56,3);
        makeCurve(g, 403,56, 399,63, 390,64,386, 60,2);
        makeCurve(g, 386,60, 390,54, 403,49,418, 43,2);

        //E
        makeCurve(g, 426,29, 420,36, 420,47,424, 53,4);
        makeCurve(g, 426,29, 435,32, 436,38,422, 43,2);
        makeCurve(g, 424,53, 426,56, 431,54,438, 43,2);

        //A
        makeCurve(g, 452,32, 444,33, 439,41,440, 51,2);
        makeCurve(g, 440,51, 444,50, 447,44,451, 36,2);
        makeCurve(g, 452,32, 452,42, 452,51,452, 57,3);
        makeCurve(g, 452,57, 455,60, 459,55,465, 42,2);

        //R
        makeCurve(g, 467,28, 467,38, 465,47,463, 56,3);
        makeCurve(g, 467,28, 471,29, 475,30,479, 30,2);
        makeCurve(g, 477,30, 476,40, 475,49,478, 58,4);
        makeCurve(g, 477,58, 480,61, 484,57,492, 40,2);

        //2
        makeCurve(g, 255,89, 261,77, 265,76,268, 78,3);
        makeCurve(g, 268,78, 269,86, 267,94,264, 103,3);
        makeCurve(g, 264,103, 257,112, 249,107,257, 100,2);
        makeCurve(g, 257,100, 261,105, 265,107,270, 108,2);

        //0
        makeCurve(g, 286,79, 280,88, 278,97,281, 106,3);
        makeCurve(g, 281,106, 289,105, 290,93,289, 86,3);
        makeCurve(g, 290,86, 289,82, 288,79,286, 79,3);

        //2
        makeCurve(g, 299,89, 305,77, 309,76,312, 78,3);
        makeCurve(g, 312,78, 313,86, 311,94,308, 103,3);
        makeCurve(g, 308,103, 301,112, 293,107,301, 100,2);
        makeCurve(g, 301,100, 305,105, 309,107,314, 108,2);

        //4
        makeCurve(g, 328,78, 317,101, 333,97,342, 94,3);
        makeCurve(g, 333,78, 333,89, 333,99,333, 111,3);

        // Star
        makeLine(g, 451, 145, 451, 149,Color.WHITE);
        makeLine(g, 452, 145, 452, 149,Color.WHITE);
        makeLine(g, 450, 146, 454, 146,Color.WHITE);
        makeLine(g, 450, 147, 454, 147,Color.WHITE);
 
        makeLine(g, 8, 48, 8, 52,Color.WHITE);
        makeLine(g, 9, 48, 9, 52,Color.WHITE);
        makeLine(g, 7, 49, 11, 49,Color.WHITE);
        makeLine(g, 7, 50, 11, 50,Color.WHITE);
 
        makeLine(g, 19, 35, 19, 39,Color.WHITE);
        makeLine(g, 20, 35, 20, 39,Color.WHITE);
        makeLine(g, 18, 36, 22, 36,Color.WHITE);
        makeLine(g, 18, 37, 22, 37,Color.WHITE);
 
        makeLine(g, 19, 35, 19, 39,Color.WHITE);
        makeLine(g, 20, 35, 20, 39,Color.WHITE);
        makeLine(g, 18, 36, 22, 36,Color.WHITE);
        makeLine(g, 18, 37, 22, 37,Color.WHITE);
 
        makeLine(g, 69, 22, 69, 26,Color.WHITE);
        makeLine(g, 70, 22, 70, 26,Color.WHITE);
        makeLine(g, 68, 23, 72, 23,Color.WHITE);
        makeLine(g, 68, 24, 72, 24,Color.WHITE);
 
        makeLine(g, 112, 16, 112, 20,Color.WHITE);
        makeLine(g, 113, 16, 113, 20,Color.WHITE);
        makeLine(g, 111, 17, 115, 17,Color.WHITE);
        makeLine(g, 111, 18, 115, 18,Color.WHITE);
 
        makeLine(g, 112, 16, 112, 20,Color.WHITE);
        makeLine(g, 113, 16, 113, 20,Color.WHITE);
        makeLine(g, 111, 17, 115, 17,Color.WHITE);
        makeLine(g, 111, 18, 115, 18,Color.WHITE);
         
        makeLine(g, 71, 78,	71,	82,Color.WHITE);
        makeLine(g, 72,	78,	72,	82,Color.WHITE);
        makeLine(g, 70,	79,	74,	79,Color.WHITE);
        makeLine(g, 70,	80,	74,	80	,Color.WHITE);
 
        makeLine(g, 51,	104,	51,	108,Color.WHITE);
        makeLine(g, 52,	104,	52,	108,Color.WHITE);
        makeLine(g, 50,	105,	54,	105,Color.WHITE);
        makeLine(g, 50,	106,	54,	106,Color.WHITE);
 
        makeLine(g, 28, 149, 28, 153,Color.WHITE);
        makeLine(g, 29, 149, 29, 153,Color.WHITE);
        makeLine(g, 27, 150, 31, 150,Color.WHITE);
        makeLine(g, 27, 151, 31, 151,Color.WHITE);
 
        makeLine(g, 101, 133, 101, 137,Color.WHITE);
        makeLine(g, 102, 133, 102, 137,Color.WHITE);
        makeLine(g, 100, 134, 104, 134,Color.WHITE);
        makeLine(g, 100, 135, 104, 135,Color.WHITE);
 
        makeLine(g, 73, 172, 73, 176,Color.WHITE);
        makeLine(g, 74, 172, 74, 176,Color.WHITE);
        makeLine(g, 72, 173, 76, 173,Color.WHITE);
        makeLine(g, 72, 174, 76, 174,Color.WHITE);
 
        makeLine(g, 29, 213, 29, 217,Color.WHITE);
        makeLine(g, 30, 213, 30, 217,Color.WHITE);
        makeLine(g, 28, 214, 32, 214,Color.WHITE);
        makeLine(g, 28, 215, 32, 215,Color.WHITE);
 
        makeLine(g, 28, 149, 28, 153,Color.WHITE);
        makeLine(g, 29, 149, 29, 153,Color.WHITE);
        makeLine(g, 27, 150, 31, 150,Color.WHITE);
        makeLine(g, 27, 151, 31, 151,Color.WHITE);
 
        makeLine(g, 91, 227, 91, 231,Color.WHITE);
        makeLine(g, 92, 227, 92, 231,Color.WHITE);
        makeLine(g, 90, 228, 94, 228,Color.WHITE);
        makeLine(g, 90, 229, 94, 229,Color.WHITE);
         
        makeLine(g, 63, 237, 63, 241,Color.WHITE);
        makeLine(g, 64, 237, 64, 241,Color.WHITE);
        makeLine(g, 62, 238, 66, 238,Color.WHITE);
        makeLine(g, 62, 239, 66, 239,Color.WHITE);
 
        makeLine(g, 27, 275, 27, 279,Color.WHITE);
        makeLine(g, 28, 275, 28, 279,Color.WHITE);
        makeLine(g, 26, 276, 30, 276,Color.WHITE);
        makeLine(g, 26, 277, 30, 277,Color.WHITE);
 
        makeLine(g, 114, 258, 114, 262,Color.WHITE);
        makeLine(g, 115, 258, 115, 262,Color.WHITE);
        makeLine(g, 113, 259, 117, 259,Color.WHITE);
        makeLine(g, 113, 260, 117, 260,Color.WHITE);
 
        makeLine(g, 133, 283, 133, 287,Color.WHITE);
        makeLine(g, 134, 283, 134, 287,Color.WHITE);
        makeLine(g, 132, 284, 136, 284,Color.WHITE);
        makeLine(g, 132, 285, 136, 285,Color.WHITE);
 
        // 1
        makeLine(g, 112, 59, 112, 63,Color.WHITE);
        makeLine(g, 113, 59, 113, 63,Color.WHITE);
        makeLine(g, 111, 60, 115, 60,Color.WHITE);
        makeLine(g, 111, 61, 115, 61,Color.WHITE);
 
        makeLine(g, 140, 96, 140, 100,Color.WHITE);
        makeLine(g, 141, 96, 141, 100,Color.WHITE);
        makeLine(g, 139, 97, 143, 97,Color.WHITE);
        makeLine(g, 139, 98, 143, 98,Color.WHITE);
 
        makeLine(g, 173, 80, 173, 84,Color.WHITE);
        makeLine(g, 174, 80, 174, 84,Color.WHITE);
        makeLine(g, 172, 81, 176, 81,Color.WHITE);
        makeLine(g, 172, 82, 176, 82,Color.WHITE);
 
        makeLine(g, 207, 76, 207, 80,Color.WHITE);
        makeLine(g, 208, 76, 208, 80,Color.WHITE);
        makeLine(g, 206, 77, 210, 77,Color.WHITE);
        makeLine(g, 206, 78, 210, 78,Color.WHITE);
         
        makeLine(g, 218, 108, 218, 112,Color.WHITE);
        makeLine(g, 219, 108, 219, 112,Color.WHITE);
        makeLine(g, 217, 109, 221, 109,Color.WHITE);
        makeLine(g, 217, 110, 221, 110,Color.WHITE);
 
        makeLine(g, 227, 151, 227, 155,Color.WHITE);
        makeLine(g, 228, 151, 228, 155,Color.WHITE);
        makeLine(g, 226, 152, 230, 152,Color.WHITE);
        makeLine(g, 226, 153, 230, 153,Color.WHITE);
          
        makeLine(g, 286, 71, 286, 75,Color.WHITE);
        makeLine(g, 287, 71, 287, 75,Color.WHITE);
        makeLine(g, 285, 72, 289, 72,Color.WHITE);
        makeLine(g, 285, 73, 289, 73,Color.WHITE);
 
        makeLine(g, 361, 86, 361, 90,Color.WHITE);
        makeLine(g, 362, 86, 362, 90,Color.WHITE);
        makeLine(g, 360, 87, 364, 87,Color.WHITE);
        makeLine(g, 360, 88, 364, 88,Color.WHITE);
 
        makeLine(g, 372, 76, 372, 80,Color.WHITE);
        makeLine(g, 373, 76, 373, 80,Color.WHITE);
        makeLine(g, 371, 77, 375, 77,Color.WHITE);
        makeLine(g, 371, 78, 375, 78,Color.WHITE);
 
        makeLine(g, 363, 133, 363, 137,Color.WHITE);
        makeLine(g, 364, 133, 364, 137,Color.WHITE);
        makeLine(g, 362, 134, 366, 134,Color.WHITE);
        makeLine(g, 362, 135, 366, 135,Color.WHITE);
 
        makeLine(g, 391, 167, 391, 171,Color.WHITE);
        makeLine(g, 392, 167, 392, 171,Color.WHITE);
        makeLine(g, 390, 168, 394, 168,Color.WHITE);
        makeLine(g, 390, 169, 394, 169,Color.WHITE);
 
        makeLine(g, 424, 96, 424, 100,Color.WHITE);
        makeLine(g, 425, 96, 425, 100,Color.WHITE);
        makeLine(g, 423, 97, 427, 97,Color.WHITE);
        makeLine(g, 423, 98, 427, 98,Color.WHITE);
 
        makeLine(g, 435, 16, 435, 20,Color.WHITE);
        makeLine(g, 436, 16, 436, 20,Color.WHITE);
        makeLine(g, 434, 17, 438, 17,Color.WHITE);
        makeLine(g, 434, 18, 438, 18,Color.WHITE);
 
        makeLine(g, 495, 49, 495, 53,Color.WHITE);
        makeLine(g, 496, 49, 496, 53,Color.WHITE);
        makeLine(g, 494, 50, 498, 50,Color.WHITE);
        makeLine(g, 494, 51, 498, 51,Color.WHITE);
 
        makeLine(g, 556, 38, 556, 42,Color.WHITE);
        makeLine(g, 557, 38, 557, 42,Color.WHITE);
        makeLine(g, 555, 39, 559, 39,Color.WHITE);
        makeLine(g, 555, 40, 559, 40,Color.WHITE);
 
        makeLine(g, 577, 112, 577, 116,Color.WHITE);
        makeLine(g, 578, 112, 578, 116,Color.WHITE);
        makeLine(g, 576, 113, 580, 113,Color.WHITE);
        makeLine(g, 576, 114, 580, 114,Color.WHITE);
 
        makeLine(g, 509, 135, 509, 139,Color.WHITE);
        makeLine(g, 510, 135, 510, 139,Color.WHITE);
        makeLine(g, 508, 136, 512, 136,Color.WHITE);
        makeLine(g, 508, 137, 512, 137,Color.WHITE);
 
        makeLine(g, 531, 158, 531, 162,Color.WHITE);
        makeLine(g, 532, 158, 532, 162,Color.WHITE);
        makeLine(g, 530, 159, 534, 159,Color.WHITE);
        makeLine(g, 530, 160, 534, 160,Color.WHITE);
 
        makeLine(g, 500, 188, 500, 192,Color.WHITE);
        makeLine(g, 501, 188, 501, 192,Color.WHITE);
        makeLine(g, 499, 189, 503, 189,Color.WHITE);
        makeLine(g, 499, 190, 503, 190,Color.WHITE);
 
        makeLine(g, 547, 199, 547, 203,Color.WHITE);
        makeLine(g, 548, 199, 548, 203,Color.WHITE);
        makeLine(g, 546, 200, 550, 200,Color.WHITE);
        makeLine(g, 546, 201, 550, 201,Color.WHITE);
 
        makeLine(g, 551, 249, 551, 253,Color.WHITE);
        makeLine(g, 552, 249, 552, 253,Color.WHITE);
        makeLine(g, 550, 250, 554, 250,Color.WHITE);
        makeLine(g, 550, 251, 554, 251,Color.WHITE);
 
        makeLine(g, 516, 283, 516, 287,Color.WHITE);
        makeLine(g, 517, 283, 517, 287,Color.WHITE);
        makeLine(g, 515, 284, 519, 284,Color.WHITE);
        makeLine(g, 515, 285, 519, 285,Color.WHITE);
 
        makeLine(g, 560, 302, 560, 306,Color.WHITE);
        makeLine(g, 561, 302, 561, 306,Color.WHITE);
        makeLine(g, 559, 303, 563, 303,Color.WHITE);
        makeLine(g, 559, 304, 563, 304,Color.WHITE);
 
        makeLine(g, 495, 312, 495, 316,Color.WHITE);
        makeLine(g, 496, 312, 496, 316,Color.WHITE);
        makeLine(g, 494, 313, 498, 313,Color.WHITE);
        makeLine(g, 494, 314, 498, 314,Color.WHITE);
 
        makeLine(g, 539, 327, 539, 331,Color.WHITE);
        makeLine(g, 540, 327, 540, 331,Color.WHITE);
        makeLine(g, 538, 328, 542, 328,Color.WHITE);
        makeLine(g, 538, 329, 542, 329,Color.WHITE);
 
        makeLine(g, 467, 359, 467, 363,Color.WHITE);
        makeLine(g, 468, 359, 468, 363,Color.WHITE);
        makeLine(g, 466, 360, 470, 360,Color.WHITE);
        makeLine(g, 466, 361, 470, 361,Color.WHITE);
 
        makeLine(g, 542, 370, 542, 374,Color.WHITE);
        makeLine(g, 543, 370, 543, 374,Color.WHITE);
        makeLine(g, 541, 371, 545, 371,Color.WHITE);
        makeLine(g, 541, 372, 545, 372,Color.WHITE);
 
        makeLine(g, 414, 411, 414, 415,Color.WHITE);
        makeLine(g, 415, 411, 415, 415,Color.WHITE);
        makeLine(g, 413, 412, 417, 412,Color.WHITE);
        makeLine(g, 413, 413, 417, 413,Color.WHITE);
 
        makeLine(g, 489, 405, 489, 409,Color.WHITE);
        makeLine(g, 490, 405, 490, 409,Color.WHITE);
        makeLine(g, 488, 406, 492, 406,Color.WHITE);
        makeLine(g, 488, 407, 492, 407,Color.WHITE);
 
        makeLine(g, 438, 439, 438, 443,Color.WHITE);
        makeLine(g, 439, 439, 439, 443,Color.WHITE);
        makeLine(g, 437, 440, 441, 440,Color.WHITE);
        makeLine(g, 437, 441, 441, 441,Color.WHITE);
 
        makeLine(g, 523, 432, 523, 436,Color.WHITE);
        makeLine(g, 524, 432, 524, 436,Color.WHITE);
        makeLine(g, 522, 433, 526, 433,Color.WHITE);
        makeLine(g, 522, 434, 526, 434,Color.WHITE);
 
        makeLine(g, 574, 413, 574, 417,Color.WHITE);
        makeLine(g, 575, 413, 575, 417,Color.WHITE);
        makeLine(g, 573, 414, 577, 414,Color.WHITE);
        makeLine(g, 573, 415, 577, 415,Color.WHITE);
 
        makeLine(g, 412, 520, 412, 524,Color.WHITE);
        makeLine(g, 413, 520, 413, 524,Color.WHITE);
        makeLine(g, 411, 521, 415, 521,Color.WHITE);
        makeLine(g, 411, 522, 415, 522,Color.WHITE);
 
        makeLine(g, 402, 579, 402, 583,Color.WHITE);
        makeLine(g, 403, 579, 403, 583,Color.WHITE);
        makeLine(g, 401, 580, 405, 580,Color.WHITE);
        makeLine(g, 401, 581, 405, 581,Color.WHITE);
 
        makeLine(g, 551, 498, 551, 502,Color.WHITE);
        makeLine(g, 552, 498, 552, 502,Color.WHITE);
        makeLine(g, 550, 499, 554, 499,Color.WHITE);
        makeLine(g, 550, 500, 554, 500,Color.WHITE);
 
        makeLine(g, 587, 516, 587, 520,Color.WHITE);
        makeLine(g, 588, 516, 588, 520,Color.WHITE);
        makeLine(g, 586, 517, 590, 517,Color.WHITE);
        makeLine(g, 586, 518, 590, 518,Color.WHITE);
 
        makeLine(g, 564, 559, 564, 563,Color.WHITE);
        makeLine(g, 565, 559, 565, 563,Color.WHITE);
        makeLine(g, 563, 560, 567, 560,Color.WHITE);
        makeLine(g, 563, 561, 567, 561,Color.WHITE);
 
        makeLine(g, 531, 566, 531, 570,Color.WHITE);
        makeLine(g, 532, 566, 532, 570,Color.WHITE);
        makeLine(g, 530, 567, 534, 567,Color.WHITE);
        makeLine(g, 530, 568, 534, 568,Color.WHITE);
 
        makeLine(g, 67, 300, 67, 304,Color.WHITE);
        makeLine(g, 68, 300, 68, 304,Color.WHITE);
        makeLine(g, 66, 301, 70, 301,Color.WHITE);
        makeLine(g, 66, 302, 70, 302,Color.WHITE);
 
        makeLine(g, 45, 329, 45, 333,Color.WHITE);
        makeLine(g, 46, 329, 46, 333,Color.WHITE);
        makeLine(g, 44, 330, 48, 330,Color.WHITE);
        makeLine(g, 44, 331, 48, 331,Color.WHITE);
 
        makeLine(g, 84, 352, 84, 356,Color.WHITE);
        makeLine(g, 85, 352, 85, 356,Color.WHITE);
        makeLine(g, 83, 353, 87, 353,Color.WHITE);
        makeLine(g, 83, 354, 87, 354,Color.WHITE);
 
        makeLine(g, 8, 396, 8, 400,Color.WHITE);
        makeLine(g, 9, 396, 9, 400,Color.WHITE);
        makeLine(g, 7, 397, 11, 397,Color.WHITE);
        makeLine(g, 7, 398, 11, 398,Color.WHITE);
 
        makeLine(g, 92, 392, 92, 396,Color.WHITE);
        makeLine(g, 93, 392, 93, 396,Color.WHITE);
        makeLine(g, 91, 393, 95, 393,Color.WHITE);
        makeLine(g, 91, 394, 95, 394,Color.WHITE);
 
        makeLine(g, 117, 398, 117, 402,Color.WHITE);
        makeLine(g, 118, 398, 118, 402,Color.WHITE);
        makeLine(g, 116, 399, 120, 399,Color.WHITE);
        makeLine(g, 116, 400, 120, 400,Color.WHITE);
 
        makeLine(g, 133, 414, 133, 418,Color.WHITE);
        makeLine(g, 134, 414, 134, 418,Color.WHITE);
        makeLine(g, 132, 415, 136, 415,Color.WHITE);
        makeLine(g, 132, 416, 136, 416,Color.WHITE);
 
        makeLine(g, 162, 443, 162, 447,Color.WHITE);
        makeLine(g, 163, 443, 163, 447,Color.WHITE);
        makeLine(g, 161, 444, 165, 444,Color.WHITE);
        makeLine(g, 161, 445, 165, 445,Color.WHITE);
 
        makeLine(g, 203, 510, 203, 514,Color.WHITE);
        makeLine(g, 204, 510, 204, 514,Color.WHITE);
        makeLine(g, 202, 511, 206, 511,Color.WHITE);
        makeLine(g, 202, 512, 206, 512,Color.WHITE);
 
        makeLine(g, 189, 577, 189, 581,Color.WHITE);
        makeLine(g, 190, 577, 190, 581,Color.WHITE);
        makeLine(g, 188, 578, 192, 578,Color.WHITE);
        makeLine(g, 188, 579, 192, 579,Color.WHITE);
        
        makeLine(g, 134, 329, 134, 333,Color.WHITE);
        makeLine(g, 135, 329, 135, 333,Color.WHITE);
        makeLine(g, 133, 330, 137, 330,Color.WHITE);
        makeLine(g, 133, 331, 137, 331,Color.WHITE);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(2));
        makeLine(g, 55, 476, 57, 476,Color.WHITE);
        makeLine(g, 57, 476, 57, 478,Color.WHITE);
        makeLine(g, 57, 478, 55, 478,Color.WHITE);
        makeLine(g, 55, 478, 55, 476,Color.WHITE);

        makeLine(g, 13, 548, 15, 548,Color.WHITE);
        makeLine(g, 15, 548, 15, 550,Color.WHITE);
        makeLine(g, 15, 550, 13, 550,Color.WHITE);
        makeLine(g, 13, 550, 13, 548,Color.WHITE);

        makeLine(g, 61, 419, 63, 419,Color.WHITE);
        makeLine(g, 63, 419, 63, 421,Color.WHITE);
        makeLine(g, 63, 421, 61, 421,Color.WHITE);
        makeLine(g, 61, 421, 61, 419,Color.WHITE);

        makeLine(g, 53, 566, 55, 566,Color.WHITE);
        makeLine(g, 55, 566, 55, 568,Color.WHITE);
        makeLine(g, 55, 568, 53, 568,Color.WHITE);
        makeLine(g, 53, 568, 53, 566,Color.WHITE);
    }
    
    public void catDragon(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        int [] xBody = {99,117,126,135,144,160,164,168,168,168,166,164,158,155,143,103,90,85,82,80,86,91,97};
        int [] yBody = {476,471,470,471,473,480,499,516,530,540,551,563,572,575,576,576,574,568,559,546,522,502,481};
        g.setColor(new Color(75,75,75));
        g.fillPolygon(xBody , yBody , 23);

        int [] xEarRight = {99,118,105,102};
        int [] yEarRight = {477,472,462,468};
        g.setColor(new Color(93,87,84));
        g.fillPolygon(xEarRight , yEarRight , 4);

        int [] xEarLeft = {143,160,158,154};
        int [] yEarLeft = {473,481,466,465};
        g.setColor(new Color(93,87,84));
        g.fillPolygon(xEarLeft , yEarLeft , 4);

        int [] xArmRight = {91,80,74,74,76,86};
        int [] yArmRight = {502,510,515,514,522,522};
        g.setColor(new Color(93,87,84));
        g.fillPolygon(xArmRight , yArmRight , 6);

        int [] xArmLeft = {164,172,176,180,177,169};
        int [] yArmLeft = {500,496,496,500,506,515};
        g.setColor(new Color(93,87,84));
        g.fillPolygon(xArmLeft , yArmLeft , 6);
        
        int [] xLegRight = {90,104,100,91};
        int [] yLegRight = {574,576,582,582};
        g.setColor(new Color(93,87,84));
        g.fillPolygon(xLegRight , yLegRight , 4);

        int [] xLegLeft = {142,157,155,147};
        int [] yLegLeft = {575,575,581,582};
        g.setColor(new Color(93,87,84));
        g.fillPolygon(xLegLeft , yLegLeft , 4);

        int [] xTail = {80,68,58,49,40,38,38,39,45,57,66,81};
        int [] yTail = {540,530,521,519,517,520,528,535,540,548,551,556};
        g.setColor(new Color(75,75,75));
        g.fillPolygon(xTail , yTail , 12);

        int [] xTailP = {53,46,39,34,35,37,41,44};
        int [] yTailP = {519,526,534,527,523,520,518,516};
        g.setColor(new Color(49,49,49));
        g.fillPolygon(xTailP , yTailP , 8);

        int [] xMouth = {126,129,133,132,129,126};
        int [] yMouth = {504,502,504,507,508,507};
        g.setColor(new Color(228,136,141));
        g.fillPolygon(xMouth , yMouth , 6);

        int [] xWingRight = {86,81,74,66,61,59,68,72,74};
        int [] yWingRight = {505,505,505,507,512,517,517,518,515};
        g.setColor(new Color(116,156,116));
        g.fillPolygon(xWingRight , yWingRight , 9);

        int [] xWingLeft = {176,188,192,196,198,193,185,180,177,170,169,168};
        int [] yWingLeft = {507,507,511,517,528,525,525,527,526,527,519,515};
        g.setColor(new Color(116,156,116));
        g.fillPolygon(xWingLeft , yWingLeft ,12);

        int [] xSashRight = {90,91,91,89,86,84,85};
        int [] ySashRight = {505,502,515,521,521,526,521};
        g.setColor(new Color(116,156,116));
        g.fillPolygon(xSashRight , ySashRight , 7);

        int [] xSashLeft = {163,163,163,169,169,167,167,167};
        int [] ySashLeft = {500,506,515,520,514,509,503,498};
        g.setColor(new Color(116,156,116));
        g.fillPolygon(xSashLeft , ySashLeft , 4);

        int [] xHornRight = {112,109,106,101,101,102,110,108,110,116,118,119,121};
        int [] yHornRight = {464,455,453,453,449,446,448,442,439,439,445,455,470};
        g.setColor(new Color(104,72,66));
        g.fillPolygon(xHornRight , yHornRight ,13);

        int [] xHornLeft = {138,139,140,142,144,148,152,150,153,155,153,149,148,144};
        int [] yHornLeft = {470,461,453,445,442,441,443,448,449,452,456,457,467,472};
        g.setColor(new Color(104,72,66));
        g.fillPolygon(xHornLeft , yHornLeft , 14);

        int [] xCatBelly = {115,125,136,143,145,138,128,120,113,109,109,112};
        int [] yCatBelly = {521,518,518,525,536,553,556,556,551,543,530,525};
        g.setColor(new Color(87,83,81));
        g.fillPolygon(xCatBelly , yCatBelly , 12);
        
        /* Cat pattern */
        g.setColor(new Color(49,49,49));
        makeCurve(g, 42,536, 47,532, 52,527,56, 520,3);
        makeCurve(g, 62,525, 59,531, 54,537,48, 540,3);

        // Cheeks
        Color customGray = Color.decode("#313131");
        g2.setStroke(new BasicStroke(3));
        makeLine(g, 93, 491, 101, 492, customGray);
        makeLine(g, 92, 494, 100, 498, customGray);
        makeLine(g, 91, 499, 97, 505, customGray);

        makeLine(g, 161, 488, 154, 491, customGray);
        makeLine(g, 162, 493, 154, 497, customGray);
        makeLine(g, 163, 498, 157, 503, customGray);

        // Head
        g2.setStroke(new BasicStroke(4));
        makeLine(g, 118, 472, 120, 483, customGray);
        makeLine(g, 120, 483, 124, 471, customGray);

        makeLine(g, 127, 471, 129, 484, customGray);
        makeLine(g, 129, 484, 133, 471, customGray);

        makeLine(g, 137, 472, 138, 484, customGray);
        makeLine(g, 138, 484, 143, 472, customGray);

        /* line drawing */
        g.setColor(Color.BLACK);

        // Ears
        makeCurve(g, 99,475, 101,469, 102,465,105, 462,2);
        makeCurve(g, 105,462, 110,461, 114,468,117, 471,2);
        makeCurve(g, 144,473, 148,469, 152,466,156, 465,2);
        makeCurve(g, 156,465, 159,472, 160,480,161, 486,2);

        // Body
        makeCurve(g, 100,473, 97,480, 94,489,91, 502,2);
        makeCurve(g, 86,521, 80,540, 79,557,90, 574,2);
        makeCurve(g, 156,575, 169,550, 170,530,169, 514,2);
        makeCurve(g, 159,480, 161,487, 162,492,163, 499,2);
        makeCurve(g, 117,471, 124,470, 134,470,144, 472,2);
        makeCurve(g, 104,575, 116,576, 131,576,143, 575,2);

        // Arms
        makeCurve(g, 90,502, 86,506, 80,510,76, 514,2);
        makeCurve(g, 75,514, 72,519, 75,525,86, 521,2);
        makeCurve(g, 164,499, 178,493, 188,499,169, 515,2);
        
        // Legs
        makeCurve(g, 90,574, 90,583, 99,584,104, 576,2);
        makeCurve(g, 142,575, 147,583, 155,583,156, 575,2);
        
        // Tail
        makeCurve(g, 79,541, 70,532, 57,521,48, 517,2);
        makeCurve(g, 48,517, 39,516, 34,522,38, 533,2);
        makeCurve(g, 38,533, 49,543, 63,551,80, 556,2);

        // Horn
        makeCurve(g, 111,463, 110,457, 105,453,101, 453,2);
        makeCurve(g, 101,453, 99,451, 99,448,101, 445,2);
        makeCurve(g, 101,445, 109,447, 109,446,107, 443,2);
        makeCurve(g, 107,443, 105,440, 112,436,116, 439,2);
        makeCurve(g, 116,439, 119,451, 120,460,122, 470,2);
        makeCurve(g, 138,471, 139,455, 141,446,144, 440,2);
        makeCurve(g, 144,440, 148,438, 152,441,150, 448,2);
        makeCurve(g, 149,449, 156,448, 156,456,148, 458,2);
        makeCurve(g, 148,458, 147,461, 147,465,147, 469,2);

        // Wing
        makeCurve(g, 178,505,188,506, 196,516,199, 530,2);
        makeCurve(g, 198,529,193,526, 185,526,180, 530,2);
        makeCurve(g, 180,530,178,527, 173,527,170, 529,2);
        makeCurve(g, 87,505,73,500, 62,505,59, 519,2);
        makeCurve(g, 58,519,64,516, 69,517,73, 520,2);

        // Cat whiskers
        g2.setStroke(new BasicStroke(2));
        makeLine(g, 94, 489, 88, 483, Color.BLACK);
        makeLine(g, 92, 493, 85, 491, Color.BLACK);
        makeLine(g, 90, 499, 84, 500, Color.BLACK);
        makeLine(g, 162, 486, 168, 481, Color.BLACK);
        makeLine(g, 163, 490, 170, 488, Color.BLACK);
        makeLine(g, 163, 494, 170, 495, Color.BLACK);

        // Eyes
        makeCurve(g, 108,490, 113,490, 113,496,108, 494,5);
        makeCurve(g, 144,490, 149,490, 149,496,144, 494,5);

        // Mouth
        makeCurve(g, 121,500, 122,503, 126,503,128, 501,2);
        makeCurve(g, 130,501, 131,504, 136,504,138, 500,2);
        makeCurve(g, 126,504, 126,509, 132,509,132, 504,2);
    }
    
    public void catSparkler(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        int [] xBody = {444,453,460,474,489,496,504,506,511,515,518,519,521,523,521,512,498,483,466,456,448,442,439,439,434,435,435,435,439,443};
        int [] yBody = {480,474,471,470,470,472,476,486,497,503,514,520,533,554,562,573,575,576,576,575,573,568,561,553,541,532,525,511,498,488};
        g.setColor(new Color(253,240,222));
        g.fillPolygon(xBody , yBody , 30);

        int [] xEarLeft = {460,453,445,448,455};
        int [] yEarLeft = {472,475,480,464,467};
        g.setColor(new Color(104,95,86));
        g.fillPolygon(xEarLeft , yEarLeft , 5);

        int [] xEarRight = {489,497,501,503,497,489};
        int [] yEarRight = {470,460,466,476,474,471};
        g.setColor(new Color(104,95,86));
        g.fillPolygon(xEarRight , yEarRight , 6);
        
        int [] xNoseRight = {470,474,474,470};
        int [] yNoseRight = {494,494,498,498};
        g.setColor(new Color(104,95,86));
        g.fillPolygon(xNoseRight , yNoseRight , 4);

        int [] xNoseLeft = {476,481,481,476};
        int [] yNoseLeft = {494,494,498,498};
        g.setColor(new Color(104,95,86));
        g.fillPolygon(xNoseLeft , yNoseLeft , 4);

        int [] xArmRight = {519,515,518,525};
        int [] yArmRight = {498,502,512,503};
        g.setColor(new Color(104,95,86));
        g.fillPolygon(xArmRight , yArmRight , 4);

        int [] xArmRightP = {436,429,428,428,430,434};
        int [] yArmRightP = {497,504,500,496,494,495};
        g.setColor(new Color(254,241,223));
        g.fillPolygon(xArmRightP , yArmRightP , 6);

        int [] xArmLeft = {436,439,436,429};
        int [] yArmLeft = {497,500,514,504};
        g.setColor(new Color(104,95,86));
        g.fillPolygon(xArmLeft , yArmLeft , 4);

        int [] xArmLeftP = {518,524,526,526,523};
        int [] yArmLeftP = {498,503,499,496,500};
        g.setColor(new Color(254,241,223));
        g.fillPolygon(xArmLeftP , yArmLeftP , 5);
        
        int [] xLegRight = {447,460,457,449};
        int [] yLegRight = {573,574,578,578};
        g.setColor(new Color(104,95,86));
        g.fillPolygon(xLegRight , yLegRight , 4);

        int [] xLegRightP = {449,457,456,451};
        int [] yLegRightP = {580,580,582,582};
        g.setColor(new Color(254,241,223));
        g.fillPolygon(xLegRightP , yLegRightP , 4);

        int [] xLegLeft = {498,513,511,502};
        int [] yLegLeft = {575,573,578,579};
        g.setColor(new Color(104,95,86));
        g.fillPolygon(xLegLeft , yLegLeft , 4);

        int [] xLegLeftP = {503,511,510,505};
        int [] yLegLeftP = {580,580,583,583};
        g.setColor(new Color(254,241,223));
        g.fillPolygon(xLegLeftP , yLegLeftP , 4);

        int [] xTail = {524,528,533,539,545,553,555,560,558,548,540,533,528,523};
        int [] yTail = {539,534,529,525,520,516,521,528,530,541,546,551,554,557};
        g.setColor(new Color(171,114,81));
        g.fillPolygon(xTail , yTail , 14);

        int [] xTailP = {551,560,562,565,566,565,562,557,554};
        int [] yTailP = {517,530,528,525,521,517,515,514,515};
        g.setColor(new Color(89,82,73));
        g.fillPolygon(xTailP , yTailP , 9);

        int [] xMouth = {474,477,478,478,477,473,473};
        int [] yMouth = {497,497,498,501,503,502,498};
        g.setColor(new Color(228,136,141));
        g.fillPolygon(xMouth , yMouth , 7);

        int [] xHat = {460,470,466,466,470,476,479,479,477,487};
        int [] yHat = {469,451,445,443,439,439,443,447,450,469};
        g.setColor(new Color(255,186,186));
        g.fillPolygon(xHat , yHat , 10);

        /* line drawing */
        g.setColor(Color.BLACK);

        // Body
        makeCurve(g, 458,470, 467,470, 480,470,490, 470,2);
        makeCurve(g, 519,511, 520,520, 521,529,524, 539,2);
        makeCurve(g, 524,539, 524,556, 520,565,512, 574,2);
        makeCurve(g, 498,576, 486,575, 473,576,459, 575,2);
        makeCurve(g, 445,572, 434,556, 434,531,434, 513,2);
        
        // Ears
        makeCurve(g, 490,470, 492,464, 494,462,497, 459,2);
        makeCurve(g, 497,459, 503,471, 507,487,516, 502,2); 
        makeCurve(g, 439,500, 442,493, 444,483,447, 462,2);
        makeCurve(g, 447,462, 453,466, 456,468,459, 470,2);
        
        // Arms
        makeCurve(g, 516,502, 523,494, 526,495,527, 500,2);
        makeCurve(g, 527,500, 525,503, 522,508,519, 511,2);
        makeCurve(g, 434,513, 432,509, 429,505,428, 501,2);
        makeCurve(g, 428,501, 427,496, 431,494,434, 495,2);
        makeCurve(g, 434,495, 436,497, 437,498,439, 500,2);

        // Legs
        makeCurve(g, 512,574, 511,577, 510,580,510, 585,2);
        makeCurve(g, 510,585, 508,585, 506,585,504, 585,2);
        makeCurve(g, 504,585, 503,581, 501,579,498, 576,2);
        makeCurve(g, 459,575, 457,579, 457,582,456, 584,2);
        makeCurve(g, 456,584, 454,585, 452,585,450, 584,2);
        makeCurve(g, 450,584, 449,578, 447,575,445, 572,2);

        // Cat whiskers
        makeCurve(g, 507,487, 509,486, 513,484,516, 482,2);
        makeCurve(g, 509,490, 511,490, 514,490,518, 490,1);
        makeCurve(g, 442,485, 438,484, 435,483,432, 482,2);
        makeCurve(g, 441,490, 437,492, 433,490,432, 492,2);
        
        //หางแมว
        makeCurve(g, 525,538, 536,527, 548,518,555, 515,2);
        makeCurve(g, 555,515, 561,514, 566,517,565, 523,2);
        makeCurve(g, 565,523, 556,535, 542,545,523, 557,2);
        
        // Eyes
        makeCurve(g, 455,489, 460,489, 460,494,455, 493,5);
        makeCurve(g, 490,489, 493,489, 496,494,490, 493,5);

        // Mouth
        g.setColor(Color.BLACK);
        makeCurve(g, 469,496, 469,498, 472,499,476, 496,2);
        makeCurve(g, 476,496, 476,498, 480,499,481, 496,2);
        makeCurve(g, 473,498, 473,503, 478,503,478, 498,2);

        // Cat hat
        makeCurve(g, 461, 469, 470,469, 481,469,487, 469,2);
        makeCurve(g, 461, 469, 463,462, 465,456,468, 450,2);
        makeCurve(g, 487, 469, 484,462, 480,456,476, 449,2);
        makeCurve(g, 466, 444, 468,450, 476,450,479, 444,2);
        makeCurve(g, 466, 444, 469,438, 476,438,479, 444,2);

        // Hat Pattern
        Color customPink = Color.decode("#e4888d");
        g2.setStroke(new BasicStroke(2));
        makeLine(g, 469, 455, 478, 455, customPink);
        makeLine(g, 467, 460, 482, 460, customPink);
        makeLine(g, 465, 465, 485, 465, customPink);

        /* Sparkler */
        // Left
        Color customYellow = Color.decode("#ffdc8f");
        g2.setStroke(new BasicStroke(2));
        g.setColor(Color.gray);
        makeCurve(g, 431, 498, 426,491, 421,484,418, 479,2);
        makeCurve(g, 524, 497,530,489,534,483, 537, 478, 2);
        makeLine(g, 415, 480, 415, 496, customYellow);
        makeLine(g, 415, 480, 416, 496, customYellow);
        makeLine(g, 413, 480, 403, 491, customYellow);
        makeLine(g, 413, 480, 403, 492, customYellow);
        makeLine(g, 413, 480, 404, 492, customYellow);
        makeLine(g, 413, 478, 397, 478, customYellow);
        makeLine(g, 413, 478, 396, 479, customYellow);
        makeLine(g, 413, 475, 401, 468, customYellow);
        makeLine(g, 413, 475, 400, 467, customYellow);
        makeLine(g, 413, 475, 401, 467, customYellow);
        makeLine(g, 415, 474, 409, 459, customYellow);
        makeLine(g, 415, 474, 409, 458, customYellow);
        makeLine(g, 415, 474, 410, 458, customYellow);
        makeLine(g, 417, 474, 422, 460, customYellow);
        makeLine(g, 417, 474, 423, 460, customYellow);
        makeLine(g, 417, 474, 423, 461, customYellow);  
        makeLine(g, 418, 476, 432, 467, customYellow);
        makeLine(g, 418, 476, 433, 467, customYellow);
        makeLine(g, 418, 476, 433, 468, customYellow);
        makeLine(g, 420, 478, 434, 477, customYellow);
        makeLine(g, 420, 478, 435, 478, customYellow);
        
        // Right
        makeLine(g, 536, 477, 521, 482, customYellow);
        makeLine(g, 536, 477, 520, 482, customYellow);
        makeLine(g, 536, 477, 520, 481, customYellow);
        makeLine(g, 536, 475, 523,469, customYellow);
        makeLine(g, 536, 475, 523,468, customYellow);
        makeLine(g, 536, 475, 524,468, customYellow);
        makeLine(g, 538, 473, 530,459, customYellow);
        makeLine(g, 538, 473, 530,458, customYellow);
        makeLine(g, 538, 473, 531,458, customYellow);
        makeLine(g, 540, 473, 544,458, customYellow);
        makeLine(g, 540, 473, 545,458, customYellow);
        makeLine(g, 540, 473, 545,459, customYellow);
        makeLine(g, 542, 475, 554,465, customYellow);
        makeLine(g, 542, 475, 555,465, customYellow);
        makeLine(g, 542, 475, 555,466, customYellow);
        makeLine(g, 543, 477, 559,478, customYellow);
        makeLine(g, 543, 477, 559,477, customYellow);
        makeLine(g, 542, 478, 553,489, customYellow);
        makeLine(g, 542, 478, 553,490, customYellow);
        makeLine(g, 542, 478, 552,490, customYellow);
        makeLine(g, 540, 479, 540,495, customYellow);
        makeLine(g, 540, 479, 541,495, customYellow);
    }
    public void AJ_Mo(Graphics g){
        // all layers
        ArrayList<BufferedImage> layers = new ArrayList<>();
    
        layers.add(makePolygonFill(new Point[]{new Point(296,400), new Point(303,408), new Point(300,409), new Point(294,401)}, new Color(60,60,60), new Color(60,60,60)));
        layers.add(makePolygonFill(new Point[]{new Point(284,410), new Point(287,410), new Point(282,437), new Point(278,437)}, new Color(60,60,60), new Color(60,60,60)));

        int [] xGlass = {177,181,187,198,206,211,212,213,213,197,198,201,203,202,191,187,187,192,192,185,180,177,176,176};
        int [] yGlass = {371,368,366,366,367,369,373,382,401,402,422,424,426,427,427,426,424,422,401,399,396,390,384,374};
        g.setColor(new Color(231,255,253));
        g.fillPolygon(xGlass , yGlass , 24);

        int [] xWine = {177,181,185,188,205,213,213,210,199,192,184,179,178,177,177};
        int [] yWine = {381,383,385,385,384,380,391,398,402,402,398,395,391,386,381};
        g.setColor(new Color(176,74,79));
        g.fillPolygon(xWine , yWine , 15);

        int [] xChair = {253,247,242,237,233,231,231,233,234,221,215,214,218,227,232,234,239,244,354,364,375,382,389,391,394,393,390,390,388,386,384,382,377,371,362,352,302,269};
        int [] yChair = {359,362,368,380,391,400,418,435,458,466,471,477,483,486,516,519,521,521,525,523,522,519,513,503,491,482,469,422,398,385,382,376,368,363,358,356,354,357};
        g.setColor(new Color(197,91,96));
        g.fillPolygon(xChair, yChair, 38);
        layers.add(makePolygonFill(new Point[]{new Point(306,457), new Point(333,466), new Point(333,472), new Point(302,457)}, new Color(207,207,207), new Color(207,207,207)));
        int [] xShirtW = {289,278,287,291,303,333,335,338,338,342,372,371,353,346,341,328,314,306,307,299,299,294,290};
        int [] yShirtW = {404,455,453,453,458,467,464,455,429,447,439,435,405,397,395,391,343,409,426,426,409,412,407};
        g.setColor(new Color(233,233,233));
        g.fillPolygon(xShirtW, yShirtW, 23);
        
        int [] xHead = {238,237,240,245,250,259,266,275,285,295,294,302,315,316,332,347,350,354,362,370,371,366,345,302,278,251,238,238};
        int [] yHead = {314,332,344,352,359,369,377,384,389,390,398,407,395,385,377,364,361,349,328,308,296,295,260,236,234,252,285,318};
        g.setColor(new Color(245,207,172));
        g.fillPolygon(xHead, yHead, 28);
        
        int [] xHair = {237,230,227,225,224,227,231,235,242,246,262,275,289,302,316,332,344,357,367,374,380,381,379,375,367,364,363,358,354,360,371,369,365,358,345,338,334,331,324,325,317,311,300,297,287,284,278,269,263,260,257,252,252,245,245,243,238};
        int [] yHair = {316,293,293,281,260,245,235,228,220,215,205,199,195,194,194,199,204,213,225,238,252,272,291,310,325,339,347,353,354,329,301,296,295,320,270,287,268,279,261,270,261,249,266,247,271,236,234,246,267,252,268,254,281,272,288,285,316};
        g.setColor(new Color(226,221,214));
        g.fillPolygon(xHair, yHair, 57);

        int [] xArmLeft = {181,182,178,178,187,192,192,189,187,186,200,197,198,198,206,226,231,236,240,250,240,235,225,225,219,216,212,213,216,213,210,204};
        int [] yArmLeft = {387,397,397,403,408,411,402,397,392,387,382,385,402,413,414,444,446,446,443,434,420,423,410,404,391,383,382,390,400,401,387,382};
        g.setColor(new Color(245,207,172));
        g.fillPolygon(xArmLeft, yArmLeft, 32);

        int [] xArmRight = {344,365,371,372,372,371,366,356,353,351,346,343,340,334,334,336,337,339,347};
        int [] yArmRight = {447,442,458,462,468,471,474,475,474,475,474,476,474,472,470,467,461,455,454};
        g.setColor(new Color(245,207,172));
        g.fillPolygon(xArmRight, yArmRight, 19);

        int [] xShirtB = {293,286,275,269,264,258,249,242,237,256,271,271,275,278,282,285,289,294,301,293,294,299,299,306,306,315,327,318,314,315,301};
        int [] yShirtB = {391,391,394,396,399,402,409,414,418,440,428,458,456,444,429,415,406,412,407,396,394,408,425,425,409,413,391,387,391,396,408};
        g.setColor(new Color(60,60,60));
        g.fillPolygon(xShirtB, yShirtB,31);

        int [] xLeg = {272,258,237,228,222,214,208,215,229,255,265,270,287,291,297,301,314,331,340,339,336,330,328,323,331,340,346,349,350,347,342,336,293,286,278};
        int [] yLeg = {459,486,535,532,532,536,546,554,560,567,546,547,509,573,590,593,594,593,590,583,577,572,571,515,515,512,508,502,495,487,479,474,453,453,454};
        g.setColor(new Color(56,56,56));
        g.fillPolygon(xLeg, yLeg, 35);
        
        hair(layers);
        head(layers);
        arm(layers);
        body(layers);       
        wine(layers);
        chair(layers);
        
        // ตัดเส้น
        line(g);

        // Draw to Graphics
        drawLayerToImages(g, layers);
    }

    public void chair(ArrayList<BufferedImage> layers){
        // Shadow 1
        layers.add(makePolygonFill(new Point[]{new Point(353,356), new Point(358,357), new Point(346,373), new Point(347,382),new Point(351 ,389),new Point(346,393), new Point(337,393),new Point(322,382),new Point(330,378),new Point(338,371), new Point(347,363)}, new Color(176,74,79), new Color(176,74,79)));
        layers.add(makePolygonFill(new Point[]{new Point(346,383), new Point(341,393), new Point(349,399), new Point(356,409),new Point(364 ,423),new Point(372,435), new Point(381,447), new Point(382,424), new Point(373,411),new Point(365,400), new Point(355,391), new Point(348,385)}, new Color(176,74,79), new Color(176,74,79)));
        layers.add(makePolygonFill(new Point[]{new Point(369,473), new Point(373,475), new Point(379,473), new Point(387,461),new Point(389 ,471),new Point(380,481), new Point(380,481),new Point(369,486), new Point(351,484), new Point(348,479),new Point(348,475)}, new Color(176,74,79), new Color(176,74,79)));
        layers.add(makePolygonFill(new Point[]{new Point(354,495), new Point(359,491), new Point(366,490), new Point(381,489),new Point(386 ,487),new Point(379,520), new Point(371,523),new Point(358,525), new Point(344,527), new Point(331,526),new Point(340,521), new Point(350,511), new Point(354,501)}, new Color(176,74,79), new Color(176,74,79)));
        layers.add(makePolygonFill(new Point[]{new Point(226,485), new Point(250,482), new Point(250,493), new Point(242,493),new Point(238 ,490),new Point(226,489)}, new Color(176,74,79), new Color(176,74,79)));
        layers.add(makePolygonFill(new Point[]{new Point(243,492), new Point(249,492), new Point(247,504), new Point(245,515),new Point(243 ,522),new Point(237,521), new Point(234,519),new Point(239,514), new Point(241,505), new Point(242,498)}, new Color(176,74,79), new Color(176,74,79)));
        layers.add(makePolygonFill(new Point[]{new Point(216,477), new Point(222,479), new Point(231,479), new Point(243,479),new Point(253 ,477),new Point(252,481), new Point(245,484),new Point(238,485), new Point(229,485), new Point(221,485), new Point(216,480)}, new Color(176,74,79), new Color(176,74,79)));
        layers.add(makePolygonFill(new Point[]{new Point(264,461), new Point(253,472), new Point(253,480), new Point(266,467)}, new Color(176,74,79), new Color(176,74,79)));
        layers.add(makePolygonFill(new Point[]{new Point(235,454), new Point(256,441), new Point(271,429), new Point(271,458), new Point(267,464), new Point(264,459), new Point(253,454), new Point(244,455), new Point(236,458)}, new Color(176,74,79), new Color(176,74,79)));
        layers.add(makePolygonFill(new Point[]{new Point(232,415), new Point(237,410), new Point(243,405), new Point(250,401), new Point(255,397), new Point(260,393), new Point(263,391), new Point(268,397), new Point(258,402), new Point(253,407), new Point(244,414), new Point(239,418),new Point(235,423),new Point(231,419)}, new Color(176,74,79), new Color(176,74,79)));
        layers.add(makePolygonFill(new Point[]{new Point(253,363), new Point(259,395), new Point(262,399), new Point(276,395), new Point(282,392), new Point(286,390), new Point(285,389), new Point(277,384), new Point(264,374), new Point(255,365)}, new Color(176,74,79), new Color(176,74,79)));
        layers.add(makePolygonFill(new Point[]{new Point(251,435), new Point(234,447), new Point(236,454), new Point(253,446), new Point(259,443), new Point(252,436)}, new Color(176,74,79), new Color(176,74,79)));
        
        // Shadow 2
        layers.add(makePolygonFill(new Point[]{new Point(322,383), new Point(329,387), new Point(341,391), new Point(348,393),new Point(346 ,398), new Point(339,394), new Point(333,392), new Point(325,391),new Point(317,386)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(343, 391), new Point(354,399), new Point(360,407), new Point(367,416),new Point(375 ,431), new Point(380,443), new Point(376,447), new Point(372,437),new Point(367,427), new  Point(361,417),new Point(354,407),new Point(349,401), new Point(336,393)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(371, 425), new Point(381,445), new Point(380,455), new Point(371,456),new Point(365 ,442), new Point(372,439), new Point(365,423)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(340, 442), new Point(347,453), new Point(339,454)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(342, 477), new Point(346,475), new Point(350,476), new Point(353,479), new Point(361,482), new Point(371,483),new Point(377,483), new Point(370,486), new Point(358,486), new Point(348,486),new Point(348,486), new Point(345,482)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(348, 486), new Point(371,486), new Point(387,486), new Point(385,489), new Point(375,490), new Point(362,491),new Point(348,492)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(385, 475), new Point(379,483), new Point(375,484), new Point(376,490), new Point(383,488), new Point(386,486)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(349, 487), new Point(357,487), new Point(355,495), new Point(353,505), new Point(352,509), new Point(346,507),new Point(348,502), new Point(349,495), new Point(348,490)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(347, 503), new Point(352,506), new Point(348,512), new Point(343,518), new Point(341,520), new Point(338,514),new Point(343,510), new Point(347,506)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(344, 510), new Point(348,515), new Point(343,519), new Point(339,522), new Point(333,526), new Point(323,527),new Point(323,515), new Point(328,515), new Point(336,514), new Point(340,511)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(285, 513), new Point(280,525), new Point(287,525)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(263, 474), new Point(247,511), new Point(250,482), new Point(258,477)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(235, 453), new Point(251,447), new Point(256,441), new Point(270,430), new Point(272,431), new Point(271,459), new Point(267,463), new Point(262,459), new Point(254,454), new Point(245,454), new Point(237,459)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(276, 385), new Point(262,399), new Point(273,395), new Point(286,392)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(365, 360), new Point(373,364), new Point(382,372), new Point(384,381),new Point(377,381), new Point(375,374), new Point(370,367),new Point(366,361)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(378, 380), new Point(385,383), new Point(387,393), new Point(389,401),new Point(390,409), new Point(389,421), new Point(380,404),new Point(380,394)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(381, 405), new Point(390,411), new Point(390,427), new Point(391,448),new Point(390,467), new Point(388,466), new Point(385,459),new Point(380,455), new Point(381,440), new Point(380,421)}, new Color(153,58,62), new Color(153,58,62)));
        layers.add(makePolygonFill(new Point[]{new Point(386, 474), new Point(390,468), new Point(392,476), new Point(393,489),new Point(392,500), new Point(389,509), new Point(387,517),new Point(380,517), new Point(384,506), new Point(385,495), new Point(386,481), new Point(386,473)}, new Color(153,58,62), new Color(153,58,62)));
        
        // Highlight
        layers.add(makePolygonFill(new Point[]{new Point(371,368), new Point(366,369), new Point(363,372), new Point(363,380),new Point(365 ,390),new Point(370,396),new Point(374,397),new Point(378,394),new Point(377,387),new Point(376,379),new Point(374,373)}, new Color(200,103,106), new Color(200,103,106)));
        layers.add(makePolygonFill(new Point[]{new Point(374,457), new Point(377,456), new Point(381,457), new Point(383,458),new Point(383 ,462),new Point(375,463),new Point(373,461),new Point(372,458)}, new Color(200,103,106), new Color(200,103,106)));
        layers.add(makePolygonFill(new Point[]{new Point(363,500), new Point(380,495), new Point(381,497), new Point(379,507),new Point(375 ,516),new Point(367,518),new Point(358,519),new Point(358,516), new Point(360,509)}, new Color(197,91,96), new Color(197,91,96)));
        layers.add(makePolygonFill(new Point[]{new Point(369,504), new Point(373,502), new Point(376,502), new Point(378,504),new Point(378 ,510),new Point(375,514),new Point(369,514),new Point(367,511), new Point(367,507)}, new Color(200,103,106), new Color(200,103,106)));
        layers.add(makePolygonFill(new Point[]{new Point(228,495), new Point(231,494), new Point(234,495), new Point(235,499),new Point(235 ,510),new Point(233,511),new Point(230,511),new Point(229,501)}, new Color(200,103,106), new Color(200,103,106)));
        layers.add(makePolygonFill(new Point[]{new Point(223,471), new Point(226,470), new Point(231,470), new Point(233,472),new Point(233 ,475),new Point(230,476),new Point(225,476),new Point(223,474),new Point(223,472)}, new Color(200,103,106), new Color(200,103,106)));
        layers.add(makePolygonFill(new Point[]{new Point(244,455), new Point(248,454), new Point(253,454), new Point(257,455),new Point(258 ,459),new Point(257,463),new Point(252,464),new Point(247,464),new Point(243,463), new Point(242,460)}, new Color(200,103,106), new Color(200,103,106)));
        layers.add(makePolygonFill(new Point[]{new Point(244,372), new Point(246,368), new Point(248,367), new Point(256,378),new Point(257 ,386),new Point(254,390),new Point(250,390),new Point(247,386),new Point(246,382)}, new Color(200,103,106), new Color(200,103,106)));
        
        // Chair legs
        layers.add(makePolygonFill(new Point[]{new Point(356,526), new Point(356,586), new Point(368,586), new Point(368,524)}, new Color(121,86,86), new Color(121,86,86)));
        layers.add(makePolygonFill(new Point[]{new Point(377,521), new Point(377,562), new Point(388,562), new Point(388,514),new Point(383,518)}, new Color(121,86,86), new Color(121,86,86)));
        layers.add(makePolygonFill(new Point[]{new Point(237,521), new Point(237,533), new Point(243,522)}, new Color(121,86,86), new Color(121,86,86)));
        layers.add(makePolygonFill(new Point[]{new Point(237,563), new Point(237,584), new Point(250,584), new Point(250,566)}, new Color(121,86,86), new Color(121,86,86)));
        
        // Highlights of the chair legs
        layers.add(makePolygonFill(new Point[]{new Point(240,570), new Point(244,570), new Point(243,580), new Point(240,573)}, new Color(137,101,100), new Color(137,101,100)));
        layers.add(makePolygonFill(new Point[]{new Point(361,538), new Point(364,535), new Point(364,583), new Point(361,581)}, new Color(137,101,100), new Color(137,101,100)));
        layers.add(makePolygonFill(new Point[]{new Point(382,539), new Point(385,536), new Point(385,552), new Point(383,555), new Point(382,551)}, new Color(137,101,100), new Color(137,101,100)));
    }
    
    public void head(ArrayList<BufferedImage> layers){
        // Shadow 1
        layers.add(makePolygonFill(new Point[]{new Point(265,316), new Point(248,336), new Point(243,336), new Point(238,326),new Point(248 ,325)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(240,313), new Point(242,326), new Point(238,326)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(263,348), new Point(282,385), new Point(265,375)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(297,312), new Point(331,321), new Point(353,309), new Point(360,323), new Point(335, 329) ,new Point(318,329), new Point(296,312), new Point(317,327)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(347,325), new Point(359,314), new Point(360,330), new Point(352,356), new Point(330, 378) ,new Point(306,388), new Point(282,388), new Point(276,383),new Point(302,381), new Point(320,366), new Point(314,335)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(359,320), new Point(364,297), new Point(366,295), new Point(371,297), new Point(371,301),new Point(362,327)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(346,270), new Point(352,291), new Point(358,320), new Point(350,319), new Point(349,295),new Point(342,279), new Point(344,268)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(301,321), new Point(299,328), new Point(291,329), new Point(286,333), new Point(287 ,340),new Point(293,339), new Point(299,336), new Point(301,329), new Point(303,323)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(265,325), new Point(268,330), new Point(275,331), new Point(279,336), new Point(279 ,336),new Point(279,340), new Point(278,342), new Point(269,342) ,new Point(265,331) ,new Point(262,327)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(270,355), new Point(286,363), new Point(307,353), new Point(301,367), new Point(291 ,372),new Point(283,372)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(271,302), new Point(263,316), new Point(271,315), new Point(275,308), new Point(275 ,296)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(274,306), new Point(270,305), new Point(269,296), new Point(258,286), new Point(246,286), new Point(245,279), new Point(265,274), new Point(271,275),new Point(273,287),new Point(274,298)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(294,294), new Point(292,289), new Point(291,281) ,new Point(297,274) , new Point(318,272) , new Point(322,275), new Point(321,281) , new Point(307,280), new Point(303,287)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(312,270), new Point(327,276), new Point(337,284) ,new Point(338,293) , new Point(328,289) , new Point(318,280), new Point(313,279) }, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(329,288), new Point(339,288), new Point(339,293) ,new Point(334,297) , new Point(325,298) , new Point(323,294), new Point(329,292) }, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(329,293), new Point(323,293), new Point(317,296) ,new Point(306,298) , new Point(298,297) , new Point(295,296), new Point(303,302), new Point(310,304), new Point(317,302), new Point(325,300),new Point(333,297) }, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(269,293), new Point(273,298), new Point(265,308) ,new Point(253,309) , new Point(238,305) , new Point(240,300), new Point(246,301), new Point(250,304), new Point(258,300), new Point(264,302)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(294,390), new Point(307,389), new Point(316,386) ,new Point(313,390) , new Point(314,394) , new Point(311,399), new Point(309,396), new Point(296,400), new Point(293,396), new Point(295,400)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(334,269), new Point(333,274), new Point(336,281)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(325,261), new Point(329,275), new Point(324,267)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(309,256), new Point(311,251), new Point(323,271) ,new Point(311,259)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(313,257), new Point(303,266), new Point(311,251)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(294,253), new Point(299,267), new Point(298,246)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(299,253), new Point(290,269), new Point(297,249)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(278,258), new Point(286,269), new Point(283,236), new Point(276,236), new Point(269,253), new Point(276,271), new Point(278,259)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(273,245), new Point(271,263), new Point(270,277), new Point(263,276), new Point(264,264), new Point(270,246)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(260,256), new Point(263,273), new Point(259,273), new Point(258,263)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(252,257), new Point(259,271), new Point(251,274)}, new Color(236,182,149), new Color(236,182,149)));

        // Shadow 2
        layers.add(makePolygonFill(new Point[]{new Point(267,316), new Point(251,333), new Point(243,334), new Point(238,328),new Point(243 ,347),new Point(257,368), new Point(272,380), new Point(263,352), new Point(264,328)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(296,313), new Point(318,327), new Point(340,327), new Point(340,349),new Point(331 ,364),new Point(322,372), new Point(322,353), new Point(314,334), new Point(301,321)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(276,332), new Point(287,332), new Point(286,341), new Point(280,341),new Point(279 ,336)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(294,390), new Point(317,386), new Point(314,394) ,new Point(309,392) , new Point(296,398) , new Point(293,396)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(255,277), new Point(271,278), new Point(273,287) ,new Point(273,294) , new Point(271,297) , new Point(264,279)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(297,290), new Point(295,292), new Point(292,291) ,new Point(297,274) , new Point(321,274) , new Point(315,277)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(364,299), new Point(367,307), new Point(369,300) ,new Point(368,298)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(362,308), new Point(364,315), new Point(360,320)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(282,240), new Point(274,252), new Point(265,266), new Point(267,253), new Point(275,237), new Point(281,236)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(261,260), new Point(259,271), new Point(258,256)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(254,262), new Point(253,273), new Point(251,273), new Point(251,258)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(298,255), new Point(292,260), new Point(296,248)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(313,255), new Point(304,263), new Point(310,249)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(324,264), new Point(328,268), new Point(325,259)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(334,273), new Point(336,278), new Point(334,268)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(345,269), new Point(342,278), new Point(351,287), new Point(347,270)}, new Color(219,164,128), new Color(219,164,128)));

        // Highlight
        layers.add(makePolygonFill(new Point[]{new Point(328,301), new Point(340,297), new Point(340,308)}, new Color(251,230,211), new Color(251,230,211)));
        layers.add(makePolygonFill(new Point[]{new Point(238,310), new Point(243,305), new Point(249,309),new Point(244,318), new Point(241,315)}, new Color(251,230,211), new Color(251,230,211)));
        layers.add(makePolygonFill(new Point[]{new Point(277,313), new Point(280,319), new Point(277,323),new Point(273,321)}, new Color(251,230,211), new Color(251,230,211)));
        layers.add(makePolygonFill(new Point[]{new Point(277,295), new Point(280,297), new Point(279,305),new Point(277,306), new Point(276, 297)}, new Color(251,230,211), new Color(251,230,211)));
        layers.add(makePolygonFill(new Point[]{new Point(306,332), new Point(303,335), new Point(307,338),new Point(310,336)}, new Color(251,230,211), new Color(251,230,211)));
        layers.add(makePolygonFill(new Point[]{new Point(313,359), new Point(315,365), new Point(306,370),new Point(304,368)}, new Color(251,230,211), new Color(251,230,211)));

        // Mouth
        layers.add(makePolygonFill(new Point[]{new Point(271,346), new Point(305,345), new Point(307,350), new Point(300,353),new Point(289 ,355),new Point(277,355), new Point(270,349)}, new Color(255,255,255), new Color(255,255,255)));
        layers.add(makePolygonFill(new Point[]{new Point(266,346), new Point(280,341), new Point(292,341), new Point(305,343),new Point(311 ,345),new Point(304,346), new Point(269,346)}, new Color(197,91,96), new Color(197,91,96)));
        layers.add(makePolygonFill(new Point[]{new Point(268,351), new Point(279,354), new Point(296,353), new Point(312,348),new Point(298 ,363),new Point(288,367), new Point(283,367), new Point(277,365), new Point(272,359)}, new Color(197,91,96), new Color(197,91,96)));
        layers.add(makePolygonFill(new Point[]{new Point(306,346), new Point(306,351), new Point(312,348), new Point(312,346),new Point(308 ,345)}, new Color(28,9,8), new Color(28,9,8)));
        layers.add(makePolygonFill(new Point[]{new Point(272,347), new Point(272,351), new Point(273,353), new Point(269,352),new Point(266,351), new Point(265,347), new Point(269,346)}, new Color(28,9,8), new Color(28,9,8)));
        layers.add(makePolygonFill(new Point[]{new Point(292,357), new Point(295,355), new Point(301,354), new Point(303,354),new Point(303,356), new Point(298,359), new Point(294,360)}, new Color(200,103,106), new Color(200,103,106)));
        
        // Eyebrows
        layers.add(makePolygonFill(new Point[]{new Point(247,276), new Point(255,272), new Point(264,272), new Point(270,273),new Point(270,277), new Point(255,277), new Point(246,279)}, new Color(105,81,68), new Color(105,81,68)));
        layers.add(makePolygonFill(new Point[]{new Point(298,269), new Point(296,271), new Point(296,273), new Point(298,275),new Point(305,275), new Point(306,274), new Point(320,274), new Point(328,277), new Point(314,269)}, new Color(105,81,68), new Color(105,81,68)));
        
        // Right eyes
        layers.add(makePolygonFill(new Point[]{new Point(246,299), new Point(248,296), new Point(252,295),new Point(256,293), new Point(262,293),new Point(265,295),new Point(267,298),new Point(264,299),new Point(258,300),new Point(248,300)}, new Color(104,74,61), new Color(104,74,61)));
        layers.add(makePolygonFill(new Point[]{new Point(251,298), new Point(252,296), new Point(253,295), new Point(256,295),new Point(256,297), new Point(258,299)}, new Color(255,255,255), new Color(255,255,255)));
        layers.add(makePolygonFill(new Point[]{new Point(256,295), new Point(257,294), new Point(262,294), new Point(264,295),new Point(265,296), new Point(263,298),new Point(261,299), new Point(258,299)}, new Color(31,29,29), new Color(31,29,29)));
        layers.add(makePolygonFill(new Point[]{new Point(261,295), new Point(261,296), new Point(263,296)}, new Color(255,255,255), new Color(255,255,255)));
        
        // Left eyes
        layers.add(makePolygonFill(new Point[]{new Point(302,291) ,new Point(303,291), new Point(307,289),new Point(310,287),new Point(315,287),new Point(319,288),new Point(323,289),new Point(327,290),new Point(326,292),new Point(316,294),new Point(307,294),new Point(305,293),new Point(302,293)}, new Color(104,74,61), new Color(104,74,61)));
        layers.add(makePolygonFill(new Point[]{new Point(306,290), new Point(308,290), new Point(310,293), new Point(308,293),new Point(306,292)}, new Color(255,255,255), new Color(255,255,255)));
        layers.add(makePolygonFill(new Point[]{new Point(319,289), new Point(321,289), new Point(321,292), new Point(319,292)}, new Color(255,255,255), new Color(255,255,255)));
        layers.add(makePolygonFill(new Point[]{new Point(308,289), new Point(311,288), new Point(316,289), new Point(318,291),new Point(316,293), new Point(310,293),new Point(308,291)}, new Color(31,29,29), new Color(31,29,29)));
        layers.add(makePolygonFill(new Point[]{new Point(313,289), new Point(316,289), new Point(316,290),new Point(314,290)}, new Color(255,255,255), new Color(255,255,255)));
    }
    public void hair(ArrayList<BufferedImage> layers){
        // Shadow 1
        layers.add(makePolygonFill(new Point[]{new Point(232,278), new Point(236,276), new Point(238,281), new Point(233,295),new Point(232,289)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(236,250), new Point(240,249), new Point(240,261), new Point(236,261)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(244,252), new Point(247,251), new Point(249,252), new Point(249,257), new Point(246,258), new Point(244,257)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(256,234), new Point(259,232), new Point(261,234), new Point(259,251), new Point(256,253), new Point(254,252)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(267,237), new Point(270,237), new Point(266,245), new Point(262,245)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(287,238), new Point(289,236), new Point(291,236), new Point(293,238), new Point(291,251), new Point(290,252), new Point(288,252),new Point(287,251)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(304,235), new Point(301,241), new Point(301,251), new Point(302,252), new Point(304,252), new Point(308,246), new Point(309,239),new Point(308,235)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(317,237), new Point(320,237), new Point(321,239), new Point(321,253), new Point(320,254), new Point(317,254), new Point(316,253)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(326,236), new Point(328,236), new Point(330,238), new Point(331,248), new Point(331,256), new Point(328,257), new Point(326,252), new Point(325,242)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(337,237), new Point(339,237), new Point(341,240), new Point(342,258), new Point(339,259), new Point(337,255), new Point(337,244), new Point(336,238)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(348,245), new Point(352,244), new Point(353,247), new Point(353,260), new Point(354,264), new Point(353,265), new Point(350,264), new Point(349,262), new Point(348,255)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(357,256), new Point(358,254), new Point(361,254), new Point(362,256), new Point(363,263), new Point(363,278), new Point(360,286), new Point(357,286), new Point(357,276)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(369,269), new Point(373,268), new Point(377,270), new Point(377,280), new Point(376,285), new Point(372,287), new Point(368,286), new Point(368,286), new Point(367,280)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(265,214), new Point(275,203), new Point(278,203), new Point(278,206), new Point(269,216), new Point(267,218)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(283,209), new Point(284,212), new Point(279,220), new Point(275,220), new Point(275,217)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(302,200), new Point(306,200), new Point(306,208), new Point(302,221), new Point(297,223), new Point(292,222), new Point(289,218)}, new Color(217,212,206), new Color(217,212,206)));
        layers.add(makePolygonFill(new Point[]{new Point(310,207), new Point(313,207), new Point(313,210), new Point(313,220), new Point(311,223), new Point(308,222)}, new Color(217,212,206), new Color(217,212,206)));
        
        // Highlight
        layers.add(makePolygonFill(new Point[]{new Point(250,215), new Point(238,229), new Point(235,240), new Point(250,231), new Point(342,231), new Point(363,250), new Point(376,269), new Point(376,248),new Point(366,229),new Point(356,216), new Point(345,208),new Point(342,218),new Point(322,222),new Point(294,225), new Point(272,224), new Point(250,214)}, new Color(238,236,233), new Color(238,236,233)));
    }
   
    public void wine(ArrayList<BufferedImage> layers){
        // Shadow 1
        layers.add(makePolygonFill(new Point[]{new Point(178,381), new Point(179,380), new Point(185,379), new Point(193,378) ,new Point(201,378),new Point(209,379),new Point(212,380),new Point(208,382),new Point(199,384),new Point(190,385),new Point(184,385),new Point(178,382)}, new Color(197,91,96), new Color(197,91,96)));
        
        // Shadow 2 
        layers.add(makePolygonFill(new Point[]{new Point(181,380), new Point(186,379), new Point(193,378), new Point(198,378) ,new Point(196,381),new Point(191,383),new Point(186,383),new Point(181,382)}, new Color(200,103,106), new Color(200,103,106)));
   
        // Highlight
        layers.add(makePolygonFill(new Point[]{new Point(180,377), new Point(182,377), new Point(184,379), new Point(183,385) ,new Point(181,385),new Point(180,383)}, new Color(255,255,255), new Color(255,255,255)));
        layers.add(makePolygonFill(new Point[]{new Point(190,394), new Point(191,394), new Point(193,395), new Point(195,397) ,new Point(190,396)}, new Color(255,255,255), new Color(255,255,255)));
    }

    public void arm(ArrayList<BufferedImage> layers){
        // Shadow 1
        layers.add(makePolygonFill(new Point[]{new Point(198,392), new Point(203,402), new Point(203,393), new Point(202,382) ,new Point(199 ,384),new Point(198,387)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(183,387), new Point(186,387), new Point(187,395), new Point(189,400) ,new Point(183,397), new Point(182,392)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(203,383), new Point(204,394), new Point(212,401), new Point(212,395) ,new Point(209,387), new Point(204,382)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(213,383), new Point(217,383), new Point(220,396), new Point(217,400) ,new Point(216,398), new Point(213,385)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(206,413), new Point(214,410), new Point(216,415), new Point(228,444) ,new Point(223,441)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(212,412), new Point(217,415), new Point(227,413), new Point(225,409)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(223,412), new Point(226,412), new Point(235,423), new Point(239,420), new Point(251,434), new Point(248,437), new Point(242,432), new Point(241,438), new Point(233,428)}, new Color(236,182,149), new Color(236,182,149)));
        
        layers.add(makePolygonFill(new Point[]{new Point(345,447), new Point(365,442), new Point(368,451), new Point(362,452), new Point(359,451), new Point(354,453), new Point(350,452), new Point(347,453)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(360,462), new Point(363,462), new Point(367,468), new Point(369,468), new Point(372,465), new Point(371,472), new Point(363,475), new Point(361,468)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(351,463), new Point(354,463), new Point(358,471), new Point(361,471), new Point(362,474), new Point(353,473), new Point(352,468)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(345,460), new Point(346,460), new Point(351,469), new Point(352,471), new Point(352,475), new Point(347,474), new Point(344,468), new Point(344,462)}, new Color(236,182,149), new Color(236,182,149)));
        layers.add(makePolygonFill(new Point[]{new Point(342,455), new Point(341,464), new Point(343,466), new Point(346,474), new Point(343,476), new Point(336,468), new Point(336,463), new Point(339,455)}, new Color(236,182,149), new Color(236,182,149)));
        
        // Shadow 2
        layers.add(makePolygonFill(new Point[]{new Point(185,387), new Point(186,387), new Point(186,387), new Point(187,395), new Point(184,388), new Point(186,388), new Point(187,396),new Point(192,402), new Point(192,410), new Point(188,408), new Point(186,400), new Point(184,392), new Point(184,389)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(179,397), new Point(182,398), new Point(182,402), new Point(183,403), new Point(183,406), new Point(178,403)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(204,382), new Point(210,388), new Point(210,395), new Point(203,385)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(199,384), new Point(202,382), new Point(203,395)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(217,387), new Point(214,393), new Point(213,385), new Point(214,382) , new Point(217,384)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(205,412), new Point(224,407), new Point(226,411), new Point(217,412) , new Point(213,414), new Point(212,424), new Point(206,414)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(239,420), new Point(243,425), new Point(240,428), new Point(242,436) , new Point(233,424)}, new Color(219,164,128), new Color(219,164,128)));
        
        layers.add(makePolygonFill(new Point[]{new Point(344,447), new Point(364,442), new Point(366,446), new Point(359,446) , new Point(347,453)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(362,466), new Point(366,470), new Point(370,471), new Point(368,473) , new Point(363,474), new Point(360,469), new Point(361,466)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(351,466), new Point(353,466), new Point(357,472), new Point(361,473) , new Point(360,475), new Point(354,475), new Point(352,469)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(344,464), new Point(345,464), new Point(348,471), new Point(352,472) , new Point(352,475), new Point(347,474), new Point(344,469),new Point(343,464)}, new Color(219,164,128), new Color(219,164,128)));
        layers.add(makePolygonFill(new Point[]{new Point(336,462), new Point(338,462), new Point(338,466), new Point(342,471) , new Point(345,471), new Point(345,475), new Point(341,475),new Point(339,474), new Point(334,471), new Point(334,468), new Point(336,467)}, new Color(219,164,128), new Color(219,164,128)));
        
        // Highlight
        layers.add(makePolygonFill(new Point[]{new Point(200,401), new Point(201,401), new Point(202,409), new Point(200,409) , new Point(199,404)}, new Color(251,230,211), new Color(251,230,211)));
        layers.add(makePolygonFill(new Point[]{new Point(216,416), new Point(218,416), new Point(222,420), new Point(223,424) , new Point(225,431), new Point(220,426), new Point(217,420), new Point(216,417)}, new Color(251,230,211), new Color(251,230,211)));
        
        layers.add(makePolygonFill(new Point[]{new Point(367,453), new Point(363,455), new Point(366,461), new Point(371,459) , new Point(368,453)}, new Color(251,230,211), new Color(251,230,211)));
        layers.add(makePolygonFill(new Point[]{new Point(355,456), new Point(357,456), new Point(357,463), new Point(356,464) , new Point(354,464) , new Point(354,460), new Point(354,458)}, new Color(251,230,211), new Color(251,230,211)));
        layers.add(makePolygonFill(new Point[]{new Point(349,458), new Point(350,464), new Point(349,464), new Point(348,461)}, new Color(251,230,211), new Color(251,230,211)));
        
    }
    public void body(ArrayList<BufferedImage> layers){ 
        /* Black shirt */
        // Shadow 1
        layers.add(makePolygonFill(new Point[]{new Point(271,412), new Point(268,419), new Point(251,426),new Point(246,427) ,new Point(257,441), new Point(271,428),new Point(274,421)}, new Color(56,56,56), new Color(56,56,56)));
        
        layers.add(makePolygonFill(new Point[]{new Point(288,525), new Point(293,546), new Point(298,563), new Point(309,571), new Point(309,573), new  Point(294,574), new Point(291,572), new Point(290,564), new Point(289,532)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(296,573), new Point(306,574), new Point(299,589), new Point(297,589), new Point(296,589), new  Point(296,580)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(310,574), new Point(308,580), new Point(308,589), new Point(305,589), new Point(305,580), new  Point(307,575)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(336,580), new Point(337,580), new Point(321,594), new Point(330,594), new Point(339,591), new  Point(339,584), new Point(338,581)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(319,491), new Point(329,496), new Point(340,496), new Point(348,490), new Point(350,497), new  Point(348,503), new Point(344,509), new Point(338,513), new Point(330,515), new Point(323,515), new Point(320,497)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(252,500), new Point(247,541), new Point(238,534)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(248,528), new Point(251,535), new Point(266,546), new Point(243,538), new Point(245,531)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(212,539), new Point(213,545), new Point(223,553), new Point(238,562), new Point(226,559), new Point(214,553), new Point(208,546)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(211,543), new Point(236,561), new Point(209,546)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(215,536), new Point(212,551), new Point(208,545)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(245,546), new Point(246,552), new Point(243,557), new Point(241,557), new Point(240,555), new Point(242,553), new Point(244,546)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(288,489), new Point(278,524), new Point(287,510)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(238,535), new Point(265,548), new Point(262,553), new Point(248,546), new Point(245,547), new Point(239,537)}, new Color(49,49,49), new Color(49,49,49)));
        
        //Shadow 2
        layers.add(makePolygonFill(new Point[]{new Point(270,424), new Point(264,429), new Point(250,433), new Point(256,441), new Point(268,432), new Point(272,428)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(283,423), new Point(278,454), new Point(271,458), new Point(271,451), new Point(282,421)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(265,398), new Point(273,395), new Point(282,393), new Point(289,406), new Point(279,401), new Point(273,400)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(265,398), new Point(289,396), new Point(288,396), new Point(294,400), new Point(293,396), new Point(294,392), new Point(288,390)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(317,386), new Point(327,392), new Point(324,396), new Point(320,394), new Point(314,398), new Point(315,393)}, new Color(49,49,49), new Color(49,49,49)));
        layers.add(makePolygonFill(new Point[]{new Point(300,409), new Point(303,407), new Point(307,410), new Point(307,414), new Point(300,424)}, new Color(49,49,49), new Color(49,49,49)));

        layers.add(makePolygonFill(new Point[]{new Point(295,515), new Point(295,514), new Point(308,525),new Point(315,534) ,new Point(319,547), new Point(321,564),new Point(314,565), new  Point(307,561),new Point(299,546), new Point(293,525), new Point(292,517)}, new Color(60,60,60), new Color(60,60,60)));
        layers.add(makePolygonFill(new Point[]{new Point(297,489), new Point(304,487), new Point(311,488),new Point(314,491) ,new Point(317,512), new Point(304,499)}, new Color(60,60,60), new Color(60,60,60)));
        layers.add(makePolygonFill(new Point[]{new Point(272,488), new Point(282,480), new Point(282,493),new Point(267,538) ,new Point(261,536), new Point(258,527), new Point(258,520)}, new Color(60,60,60), new Color(60,60,60)));
        layers.add(makePolygonFill(new Point[]{new Point(287,453), new Point(277,457), new Point(275,466),new Point(277,471) ,new Point(291,472), new Point(300,468), new Point(305,464), new Point(303,458)}, new Color(60,60,60), new Color(60,60,60)));
        layers.add(makePolygonFill(new Point[]{new Point(302,473), new Point(312,471), new Point(320,471),new Point(342,483) ,new Point(341,487), new Point(334,489), new Point(325,489)}, new Color(60,60,60), new Color(60,60,60)));
        layers.add(makePolygonFill(new Point[]{new Point(223,552), new Point(237,552), new Point(243,554),new Point(247,552) ,new Point(259,558), new Point(256,565), new Point(248,565), new Point(235,558), new Point(222,552)}, new Color(60,60,60), new Color(60,60,60)));

        // Highlight
        layers.add(makePolygonFill(new Point[]{new Point(257,403), new Point(239,417), new Point(241,420),new Point(256,418) ,new Point(262,416), new Point(265,412), new Point(264,406), new Point(261,404)}, new Color(69,69,69), new Color(69,69,69)));
        layers.add(makePolygonFill(new Point[]{new Point(289,402), new Point(292,402), new Point(295,405),new Point(296,410) ,new Point(295,412)}, new Color(69,69,69), new Color(69,69,69)));
        layers.add(makePolygonFill(new Point[]{new Point(308,408), new Point(314,405), new Point(319,404),new Point(314,413)}, new Color(69,69,69), new Color(69,69,69)));
        layers.add(makePolygonFill(new Point[]{new Point(306,418), new Point(302,425), new Point(306,425)}, new Color(69,69,69), new Color(69,69,69)));
        
        layers.add(makePolygonFill(new Point[]{new Point(315,579), new Point(321,575), new Point(328,575),new Point(332,578) ,new Point(333,581), new Point(324,583)}, new Color(69,69,69), new Color(69,69,69)));
        layers.add(makePolygonFill(new Point[]{new Point(240,543), new Point(230,536),new Point(223,534) ,new Point(218,538), new Point(215,541), new Point(222,544),new Point(231,543), new Point(239,545)}, new Color(69,69,69), new Color(69,69,69)));
        layers.add(makePolygonFill(new Point[]{new Point(300,490), new Point(306,489),new Point(310,490) ,new Point(313,492), new Point(316,504), new Point(312,505),new Point(306,497), new Point(300,492)}, new Color(69,69,69), new Color(69,69,69)));
        layers.add(makePolygonFill(new Point[]{new Point(279,461), new Point(287,459),new Point(291,459) ,new Point(300,464), new Point(298,466), new Point(279,467),new Point(278,464)}, new Color(69,69,69), new Color(69,69,69)));
        
        /* White shirt */ 
        // Shadow 1
        layers.add(makePolygonFill(new Point[]{new Point(294,419), new Point(289,421),new Point(285,428) ,new Point(294,419), new Point(289,412), new Point(285,428),new Point(283,440), new Point(282,448), new Point(285,451), new Point(288,451) ,new Point(294,448), new Point(298,444), new Point(299,436), new Point(297,427)}, new Color(245,245,245), new Color(245,245,245)));
        layers.add(makePolygonFill(new Point[]{new Point(303,445), new Point(318,419),new Point(328,407) ,new Point(334,402), new Point(337,414), new Point(337,434),new Point(333,458), new Point(325,460), new Point(317,460), new Point(310,457) ,new Point(304,452)}, new Color(245,245,245), new Color(245,245,245)));
        layers.add(makePolygonFill(new Point[]{new Point(347,401), new Point(342,404),new Point(342,411) ,new Point(343,422), new Point(349,431), new Point(356,437),new Point(370,435), new Point(361,418)}, new Color(245,245,245), new Color(245,245,245)));
    
        // Shadow 2
        layers.add(makePolygonFill(new Point[]{new Point(290,405), new Point(295,410),new Point(300,407) ,new Point(299,423), new Point(293,415), new Point(290,411)}, new Color(207,207,207), new Color(207,207,207)));
        layers.add(makePolygonFill(new Point[]{new Point(307,409), new Point(319,413),new Point(315,420), new Point(306,414)}, new Color(207,207,207), new Color(207,207,207)));
        layers.add(makePolygonFill(new Point[]{new Point(327,391), new Point(331,393),new Point(318,414), new Point(315,412)}, new Color(207,207,207), new Color(207,207,207)));
        layers.add(makePolygonFill(new Point[]{new Point(292,453), new Point(306,458),new Point(300,450)}, new Color(207,207,207), new Color(207,207,207)));
    
        // Highlight
        layers.add(makePolygonFill(new Point[]{new Point(292,423), new Point(287,429),new Point(287,438),new Point(291,439),new Point(295,438),new Point(295,430),new Point(293,423)}, new Color(255,255,255), new Color(255,255,255)));
        layers.add(makePolygonFill(new Point[]{new Point(331,407), new Point(322,418),new Point(312,439),new Point(314,444),new Point(327,451),new Point(331,445),new Point(334,425), new Point(333,409)}, new Color(255,255,255), new Color(255,255,255)));
        layers.add(makePolygonFill(new Point[]{new Point(352,406), new Point(352,414),new Point(354,423),new Point(357,430),new Point(363,432),new Point(368,431)}, new Color(255,255,255), new Color(255,255,255)));
        
        // C
        layers.add(makePolygonFill(new Point[]{new Point(333,422), new Point(330,418),new Point(324,418) ,new Point(321,422), new Point(321,430), new Point(325,434),new Point(330,434), new Point(333,430)}, new Color(255,119,0), new Color(255,255,255)));
        layers.add(makePolygonFill(new Point[]{new Point(330,423), new Point(334,423),new Point(334,429) ,new Point(330,429)}, new Color(255,255,255), new Color(255,255,255)));
        
        // S
        layers.add(makePolygonFill(new Point[]{new Point(329,423), new Point(328,421),new Point(325,421) ,new Point(324,425)}, new Color(60,60,60), new Color(255,255,255)));
        layers.add(makePolygonFill(new Point[]{new Point(327,422), new Point(329,424),new Point(329,425),new Point(326,425)}, new Color(255,255,255), new Color(255,255,255)));
        layers.add(makePolygonFill(new Point[]{new Point(325,425), new Point(330,425),new Point(329,430) ,new Point(326,430), new Point(324,428)}, new Color(60,60,60), new Color(255,255,255)));
        layers.add(makePolygonFill(new Point[]{new Point(323,427), new Point(326,427),new Point(326,428),new Point(323,428)}, new Color(255,255,255), new Color(255,255,255)));
    }

     public void line(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Color customBrown = Color.decode("#684842");
        g2.setStroke(new BasicStroke(4));
        
        // Chair legs
        makeLine(g, 356, 526, 356,587, customBrown);
        makeLine(g, 356, 587, 368,587, customBrown);
        makeLine(g, 369, 587, 369,524, customBrown);
        makeLine(g, 377, 522, 377,563, customBrown);
        makeLine(g, 377, 563, 389,563, customBrown);
        makeLine(g, 389, 563, 389,515, customBrown);
        makeLine(g, 236, 520, 236,534, customBrown);
        makeLine(g, 235, 563, 235,585, customBrown);
        makeLine(g, 235, 585, 250,585, customBrown);
        makeLine(g, 250, 585, 250,566, customBrown);
    }
   
    /* TOOL */
    // Draw all BufferedImage to Graphics
    public void drawLayerToImages(Graphics g, ArrayList<BufferedImage> layers) {
        for (BufferedImage layer : layers) {
            g.drawImage(layer, 0, 0, null);
        }
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

    // Create Traingle in BufferedImage
    public BufferedImage MakePolygon(Point[] points, Color lineColor) {

        BufferedImage polyImage = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gPoly = polyImage.createGraphics();

        int[] xPoly = new int[points.length];
        int[] yPoly = new int[points.length];

        for (int i = 0; i < points.length; i++) {
            xPoly[i] = points[i].x;
            yPoly[i] = points[i].y;
        }

        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        gPoly.setColor(lineColor);
        gPoly.drawPolygon(poly);

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
    public void makeCurve(Graphics g, int x1, int y1, int x2 , int y2 , int x3, int y3, int x4, int y4 , int size){
    
        for(int i = 0; i <= 1000; i++){
            double t = i / 1000.0;

            int x = (int) (Math.pow((1 - t), 3) * x1 + 
                    (3 * t) * Math.pow( 1-t , 2) * x2 
                    + (3 * (t * t) * ( 1 - t )) * x3
                    + Math.pow(t, 3) * x4);

            int y = (int) (Math.pow((1 - t), 3) * y1 + 
                    (3 * t) * Math.pow( 1-t , 2) * y2 
                    + (3 * (t * t) * ( 1 - t )) * y3
                    + Math.pow(t, 3) * y4);
    
            plot(g, x, y, size);
        }
    }

    // Draw Line
    private void makeLine(Graphics g, int x1, int y1, int x2, int y2, Color lineColor) {
        g.setColor(lineColor);

        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = x1 < x2 ? 1 : -1;
        int sy = y1 < y2 ? 1 : -1;
        int err = dx - dy;

        while (x1 != x2 || y1 != y2) {
            g.drawLine(x1, y1, x1, y1);

            int err2 = 2 * err;
            if (err2 > -dy) {
                err -= dy;
                x1 += sx;
            }
            if (err2 < dx) {
                err += dx;
                y1 += sy;
            }
        }
    }

    // Draw a dot
    public void plot(Graphics g, int x, int y, int size) {
        g.fillRect(x, y, size, size);
    }
}