import java.awt.*;
import javax.swing.*;

public class FW extends JPanel {

    private void drawBresenhamLine(Graphics g, int x1, int y1, int x2, int y2, Color lineColor) {
        g.setColor(lineColor); // กำหนดสีของเส้นตรงที่จะวาด

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
    public void plot(Graphics g,int x,int y, int size){
        g.fillRect(x, y, size, size);
    }
    public void benzierCurve(Graphics g, int x1, int y1, int x2 , int y2 , int x3, int y3, int x4, int y4 , int size){
    
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
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Color customGray = Color.decode("#383838");
        Color customPastelperple = Color.decode("#df85c2");
        Color customPerple = Color.decode("#7518ae");
        Color customLightperple = Color.decode("#d45ae8");
        Color customPink = Color.decode("#ff55aa");
        Color customLightpink = Color.decode("#ffb1ce");
        Color customSky = Color.decode("#3df6f5");
        Color customOrange = Color.decode("#fd8c59");
        Color customGreen = Color.decode("#daf42c");
        Color customYellow = Color.decode("#ffdc8f");

        setBackground(customGray); 

        // พลุม่วง
        drawBresenhamLine(g, 121, 162, 119, 94, customPerple);
        drawBresenhamLine(g, 122, 163, 119, 94, customPerple);
        drawBresenhamLine(g, 122, 161, 119, 93, customPerple);
        drawBresenhamLine(g, 122, 162, 118, 92, customPerple);
        drawBresenhamLine(g, 122, 162, 119, 91, customPerple);
        drawBresenhamLine(g, 122, 162, 120, 90, customPerple);
        drawBresenhamLine(g, 123, 162, 121, 90, customPerple);
        drawBresenhamLine(g, 122, 162, 121, 89, customPerple);     
        drawBresenhamLine(g, 122, 162, 122, 90, customPerple);
        drawBresenhamLine(g, 122, 162, 123, 91, customPerple);
        drawBresenhamLine(g, 122, 162, 124, 92, customPerple);

        drawBresenhamLine(g, 134, 163, 173, 110, customPerple);
        drawBresenhamLine(g, 133, 164, 173, 110, customPerple);
        drawBresenhamLine(g, 133, 162, 173, 110, customPerple);
        drawBresenhamLine(g, 133, 163, 172, 111, customPerple);
        drawBresenhamLine(g, 133, 163, 173, 112, customPerple);
        drawBresenhamLine(g, 133, 163, 173, 113, customPerple);
        drawBresenhamLine(g, 134, 163, 173, 109, customPerple);
        drawBresenhamLine(g, 134, 163, 174, 109, customPerple);
        drawBresenhamLine(g, 134, 163, 175, 109, customPerple);
        drawBresenhamLine(g, 134, 163, 176, 109, customPerple);
        drawBresenhamLine(g, 134, 163, 177, 109, customPerple);
        drawBresenhamLine(g, 134, 163, 177, 110, customPerple);
        drawBresenhamLine(g, 134, 163, 177, 111, customPerple);
        drawBresenhamLine(g, 134, 163, 177, 112, customPerple);
        drawBresenhamLine(g, 135, 163, 177, 113, customPerple);

        drawBresenhamLine(g, 134, 172, 202, 157, customPerple);
        drawBresenhamLine(g, 134, 172, 203, 157, customPerple);
        drawBresenhamLine(g, 134, 172, 204, 157, customPerple);
        drawBresenhamLine(g, 134, 172, 204, 158, customPerple);
        drawBresenhamLine(g, 134, 172, 205, 158, customPerple);
        drawBresenhamLine(g, 135, 173, 205, 159, customPerple);
        drawBresenhamLine(g, 134, 172, 205, 160, customPerple);
        drawBresenhamLine(g, 134, 172, 205, 161, customPerple);
        drawBresenhamLine(g, 134, 172, 205, 162, customPerple);
        drawBresenhamLine(g, 134, 172, 204, 162, customPerple);

        drawBresenhamLine(g, 137, 184, 191, 212, customPerple);
        drawBresenhamLine(g, 137, 184, 191, 213, customPerple);
        drawBresenhamLine(g, 137, 184, 191, 214, customPerple);
        drawBresenhamLine(g, 137, 184, 191, 215, customPerple);
        drawBresenhamLine(g, 139, 186, 191, 216, customPerple);
        drawBresenhamLine(g, 138, 185, 190, 216, customPerple);
        drawBresenhamLine(g, 137, 184, 189, 216, customPerple);
        drawBresenhamLine(g, 137, 184, 188, 216, customPerple);
        drawBresenhamLine(g, 137, 184, 187, 216, customPerple);
        drawBresenhamLine(g, 137, 184, 186, 215, customPerple);

        drawBresenhamLine(g, 126, 187, 152, 250, customPerple);
        drawBresenhamLine(g, 126, 187, 152, 251, customPerple);
        drawBresenhamLine(g, 126, 187, 152, 252, customPerple);
        drawBresenhamLine(g, 126, 187, 152, 253, customPerple);
        drawBresenhamLine(g, 128, 190, 152, 254, customPerple);
        drawBresenhamLine(g, 127, 189, 152, 255, customPerple);
        drawBresenhamLine(g, 126, 187, 152, 255, customPerple);
        drawBresenhamLine(g, 126, 187, 151, 255, customPerple);
        drawBresenhamLine(g, 126, 187, 150, 255, customPerple);
        drawBresenhamLine(g, 126, 187, 149, 255, customPerple);
        drawBresenhamLine(g, 126, 187, 148, 254, customPerple);

        drawBresenhamLine(g, 117, 187, 96, 254, customPerple);
        drawBresenhamLine(g, 117, 187, 96, 255, customPerple);
        drawBresenhamLine(g, 117, 187, 95, 254, customPerple);
        drawBresenhamLine(g, 117, 187, 95, 255, customPerple);
        drawBresenhamLine(g, 117, 187, 94, 255, customPerple);
        drawBresenhamLine(g, 117, 187, 93, 255, customPerple);
        drawBresenhamLine(g, 117, 187, 92, 255, customPerple);
        drawBresenhamLine(g, 117, 187, 92, 254, customPerple);
        drawBresenhamLine(g, 117, 187, 91, 254, customPerple);
        drawBresenhamLine(g, 117, 187, 91, 253, customPerple);
        drawBresenhamLine(g, 117, 187, 91, 252, customPerple);
        drawBresenhamLine(g, 117, 187, 91, 251, customPerple);

        drawBresenhamLine(g, 107, 183, 61, 213, customPerple);
        drawBresenhamLine(g, 107, 183, 60, 213, customPerple);
        drawBresenhamLine(g, 107, 183, 59, 214, customPerple);
        drawBresenhamLine(g, 107, 183, 58, 214, customPerple);
        drawBresenhamLine(g, 107, 183, 58, 213, customPerple);
        drawBresenhamLine(g, 107, 183, 57, 214, customPerple);
        drawBresenhamLine(g, 107, 183, 56, 214, customPerple);
        drawBresenhamLine(g, 107, 183, 56, 213, customPerple);
        drawBresenhamLine(g, 107, 183, 56, 212, customPerple);
        drawBresenhamLine(g, 107, 183, 56, 211, customPerple);
        drawBresenhamLine(g, 107, 183, 56, 210, customPerple);
        drawBresenhamLine(g, 107, 183, 57, 209, customPerple);

        drawBresenhamLine(g, 109, 172, 40, 162, customPerple);
        drawBresenhamLine(g, 109, 172, 39, 162, customPerple);
        drawBresenhamLine(g, 109, 172, 38, 161, customPerple);
        drawBresenhamLine(g, 109, 172, 38, 160, customPerple);
        drawBresenhamLine(g, 109, 172, 38, 159, customPerple);
        drawBresenhamLine(g, 109, 172, 39, 159, customPerple);
        drawBresenhamLine(g, 109, 172, 39, 158, customPerple);
        drawBresenhamLine(g, 109, 172, 40, 158, customPerple);
        drawBresenhamLine(g, 109, 172, 40, 157, customPerple);

        drawBresenhamLine(g, 110, 161, 70, 117, customPerple);
        drawBresenhamLine(g, 110, 161, 70, 116, customPerple);
        drawBresenhamLine(g, 110, 161, 70, 115, customPerple);
        drawBresenhamLine(g, 110, 161, 70, 114, customPerple);
        drawBresenhamLine(g, 110, 161, 70, 113, customPerple);
        drawBresenhamLine(g, 110, 161, 71, 113, customPerple);
        drawBresenhamLine(g, 110, 161, 72, 113, customPerple);
        drawBresenhamLine(g, 110, 161, 72, 113, customPerple);
        drawBresenhamLine(g, 110, 161, 72, 114, customPerple);
        drawBresenhamLine(g, 110, 161, 73, 114, customPerple);
        drawBresenhamLine(g, 110, 161, 74, 114, customPerple);

        drawBresenhamLine(g, 112, 148, 93, 104, customLightperple);
        drawBresenhamLine(g, 112, 148, 93, 103, customLightperple);
        drawBresenhamLine(g, 112, 148, 93, 102, customLightperple);
        drawBresenhamLine(g, 112, 148, 93, 101, customLightperple);
        drawBresenhamLine(g, 112, 148, 93, 100, customLightperple);
        drawBresenhamLine(g, 112, 148, 94, 100, customLightperple);
        drawBresenhamLine(g, 112, 148, 95, 100, customLightperple);
        drawBresenhamLine(g, 112, 148, 96, 100, customLightperple);

        drawBresenhamLine(g, 131, 148, 146, 102, customLightperple);
        drawBresenhamLine(g, 131, 148, 147, 100, customLightperple);
        drawBresenhamLine(g, 131, 148, 148, 100, customLightperple);
        drawBresenhamLine(g, 131, 148, 149, 100, customLightperple);
        drawBresenhamLine(g, 131, 148, 150, 100, customLightperple);
        drawBresenhamLine(g, 131, 148, 150, 101, customLightperple);
        drawBresenhamLine(g, 131, 148, 150, 102, customLightperple);
        drawBresenhamLine(g, 131, 148, 150, 103, customLightperple);

        drawBresenhamLine(g, 145, 160, 186, 135, customLightperple);
        drawBresenhamLine(g, 145, 160, 188, 134, customLightperple);
        drawBresenhamLine(g, 145, 160, 189, 134, customLightperple);
        drawBresenhamLine(g, 145, 160, 190, 134, customLightperple);
        drawBresenhamLine(g, 145, 160, 190, 135, customLightperple);
        drawBresenhamLine(g, 145, 160, 190, 136, customLightperple);
        drawBresenhamLine(g, 145, 160, 190, 137, customLightperple);
        drawBresenhamLine(g, 145, 160, 189, 134, customLightperple);
        drawBresenhamLine(g, 145, 160, 188, 138, customLightperple);

        drawBresenhamLine(g, 148, 178, 199, 187, customLightperple);
        drawBresenhamLine(g, 148, 178, 199, 188, customLightperple);
        drawBresenhamLine(g, 148, 178, 199, 189, customLightperple);
        drawBresenhamLine(g, 148, 178, 199, 190, customLightperple);
        drawBresenhamLine(g, 148, 178, 198, 190, customLightperple);
        drawBresenhamLine(g, 148, 178, 197, 190, customLightperple);
        drawBresenhamLine(g, 148, 178, 196, 190, customLightperple);
        drawBresenhamLine(g, 148, 178, 195, 190, customLightperple);
        drawBresenhamLine(g, 148, 178, 195, 190, customLightperple);
        drawBresenhamLine(g, 148, 178, 194, 190, customLightperple);
        drawBresenhamLine(g, 148, 178, 193, 190, customLightperple);
        
        drawBresenhamLine(g, 139, 194, 173, 232, customLightperple);
        drawBresenhamLine(g, 139, 194, 173, 233, customLightperple);
        drawBresenhamLine(g, 139, 194, 173, 234, customLightperple);
        drawBresenhamLine(g, 139, 194, 173, 235, customLightperple);
        drawBresenhamLine(g, 139, 194, 172, 235, customLightperple);
        drawBresenhamLine(g, 139, 194, 171, 235, customLightperple);
        drawBresenhamLine(g, 139, 194, 170, 235, customLightperple);
        drawBresenhamLine(g, 139, 194, 169, 235, customLightperple);

        drawBresenhamLine(g, 122, 200, 124, 252, customLightperple);
        drawBresenhamLine(g, 122, 200, 123, 253, customLightperple);
        drawBresenhamLine(g, 122, 200, 122, 253, customLightperple);
        drawBresenhamLine(g, 122, 200, 121, 253, customLightperple);
        drawBresenhamLine(g, 122, 200, 120, 252, customLightperple);
        drawBresenhamLine(g, 122, 200, 121, 251, customLightperple);

        drawBresenhamLine(g, 105, 194, 74, 235, customLightperple);
        drawBresenhamLine(g, 105, 194, 73, 235, customLightperple);
        drawBresenhamLine(g, 105, 194, 72, 235, customLightperple);
        drawBresenhamLine(g, 105, 194, 71, 235, customLightperple);
        drawBresenhamLine(g, 105, 194, 71, 234, customLightperple);
        drawBresenhamLine(g, 105, 194, 71, 233, customLightperple);
        drawBresenhamLine(g, 105, 194, 71, 232, customLightperple);

        drawBresenhamLine(g, 95, 178, 46, 190, customLightperple);
        drawBresenhamLine(g, 95, 178, 45, 190, customLightperple);
        drawBresenhamLine(g, 95, 178, 45, 189, customLightperple);
        drawBresenhamLine(g, 95, 178, 44, 189, customLightperple);
        drawBresenhamLine(g, 95, 178, 44, 188, customLightperple);
        drawBresenhamLine(g, 95, 178, 45, 187, customLightperple);
        drawBresenhamLine(g, 95, 178, 46, 186, customLightperple);

        drawBresenhamLine(g, 98, 160, 54, 137, customLightperple);
        drawBresenhamLine(g, 98, 160, 54, 136, customLightperple);
        drawBresenhamLine(g, 98, 160, 54, 135, customLightperple);
        drawBresenhamLine(g, 98, 160, 55, 135, customLightperple);
        drawBresenhamLine(g, 98, 160, 54, 134, customLightperple);
        drawBresenhamLine(g, 98, 160, 55, 134, customLightperple);
        drawBresenhamLine(g, 98, 160, 55, 134, customLightperple);
        drawBresenhamLine(g, 98, 160, 57, 134, customLightperple);

        //จุดม่วง
        drawBresenhamLine(g, 75, 135, 75, 139, customLightperple);
        drawBresenhamLine(g, 76, 135, 76, 139, customLightperple);
        drawBresenhamLine(g, 74, 136, 78, 136, customLightperple);
        drawBresenhamLine(g, 74, 137, 78, 137, customLightperple);

        drawBresenhamLine(g, 109, 110, 109, 114, customLightperple);
        drawBresenhamLine(g, 110, 110, 110, 114, customLightperple);
        drawBresenhamLine(g, 108, 111, 112, 111, customLightperple);
        drawBresenhamLine(g, 108, 112, 112, 112, customLightperple);

        drawBresenhamLine(g, 177, 152, 177, 157, customLightperple);
        drawBresenhamLine(g, 178,152, 178, 157, customLightperple);
        drawBresenhamLine(g, 179, 152,179, 157, customLightperple);
        drawBresenhamLine(g, 176, 153, 181, 153, customLightperple);
        drawBresenhamLine(g, 176, 154, 181, 154, customLightperple);
        drawBresenhamLine(g, 176, 155, 181, 155, customLightperple);

        drawBresenhamLine(g, 83, 207, 83, 211, customLightperple);
        drawBresenhamLine(g, 84, 207, 84, 211, customLightperple);
        drawBresenhamLine(g, 82, 208, 86, 208, customLightperple);
        drawBresenhamLine(g, 82, 209, 86, 209, customLightperple);


        drawBresenhamLine(g, 123, 172, 123, 177, customLightperple);
        drawBresenhamLine(g, 124, 172, 124, 177, customLightperple);
        drawBresenhamLine(g, 125, 172, 125, 177, customLightperple);
        drawBresenhamLine(g, 122, 173, 127, 173, customLightperple);
        drawBresenhamLine(g, 122, 174, 127, 174, customLightperple);
        drawBresenhamLine(g, 122, 175, 127, 175, customLightperple);

        drawBresenhamLine(g, 81, 157, 81, 161, customPerple);
        drawBresenhamLine(g, 82, 157, 82, 161, customPerple);
        drawBresenhamLine(g, 80, 158, 84, 158, customPerple);
        drawBresenhamLine(g, 80, 159, 84, 159, customPerple);
        
        drawBresenhamLine(g, 127, 155, 127, 159, customPerple);
        drawBresenhamLine(g, 128, 155, 128, 159, customPerple);
        drawBresenhamLine(g, 126, 156, 130, 156, customPerple);
        drawBresenhamLine(g, 126, 157, 130, 157, customPerple);

        drawBresenhamLine(g, 155, 185, 155, 189, customPerple);
        drawBresenhamLine(g, 156, 185, 156, 189, customPerple);
        drawBresenhamLine(g, 154, 186, 158, 186, customPerple);
        drawBresenhamLine(g, 154, 187, 158, 187, customPerple);

        drawBresenhamLine(g, 183, 196, 183, 200, customPerple);
        drawBresenhamLine(g, 184, 196, 184, 200, customPerple);
        drawBresenhamLine(g, 182, 197, 186, 197, customPerple);
        drawBresenhamLine(g, 182, 198, 186, 198, customPerple);

        drawBresenhamLine(g, 169, 214, 169,218, customPerple);
        drawBresenhamLine(g, 170, 214, 170,218, customPerple);
        drawBresenhamLine(g, 168, 215, 172,215, customPerple);
        drawBresenhamLine(g, 168, 216, 172,216, customPerple);

        drawBresenhamLine(g, 146, 213, 146,218, customPerple);
        drawBresenhamLine(g, 147, 213, 147,218, customPerple);
        drawBresenhamLine(g, 148, 213, 148,218, customPerple);
        drawBresenhamLine(g, 145, 214, 150,214, customPerple);
        drawBresenhamLine(g, 145, 215, 150,215, customPerple);
        drawBresenhamLine(g, 145, 216, 150,216, customPerple);

        drawBresenhamLine(g, 113, 218, 113,223, customPerple);
        drawBresenhamLine(g, 114, 218, 114,223, customPerple);
        drawBresenhamLine(g, 115, 218, 115,223, customPerple);
        drawBresenhamLine(g, 112, 219, 117,219, customPerple);
        drawBresenhamLine(g, 112, 220, 117,220, customPerple);
        drawBresenhamLine(g, 112, 221, 117,221, customPerple);


        //พลุชมพู
        drawBresenhamLine(g, 487, 162, 485, 91, customPink);
        drawBresenhamLine(g, 487, 162, 485, 90, customPink);
        drawBresenhamLine(g, 487, 162, 486, 89, customPink);
        drawBresenhamLine(g, 487, 162, 487, 89, customPink);
        drawBresenhamLine(g, 487, 162, 488, 89, customPink);
        drawBresenhamLine(g, 487, 162, 489, 90, customPink);
        drawBresenhamLine(g, 487, 162, 489, 91, customPink);
        drawBresenhamLine(g, 487, 162, 489, 90, customPink);
        drawBresenhamLine(g, 487, 162, 490, 91, customPink);

        drawBresenhamLine(g, 498, 162, 539, 109, customPink);
        drawBresenhamLine(g, 498, 162, 540, 109, customPink);
        drawBresenhamLine(g, 498, 162, 541, 109, customPink);
        drawBresenhamLine(g, 498, 162, 542, 109, customPink);
        drawBresenhamLine(g, 498, 162, 542, 110, customPink);
        drawBresenhamLine(g, 498, 162, 542, 111, customPink);
        drawBresenhamLine(g, 498, 162, 542, 112, customPink);
        drawBresenhamLine(g, 498, 162, 542, 113, customPink);

        drawBresenhamLine(g, 500, 172, 569, 157, customPink);
        drawBresenhamLine(g, 500, 172, 569, 158, customPink);
        drawBresenhamLine(g, 500, 172, 570, 158, customPink);
        drawBresenhamLine(g, 500, 172, 571, 159, customPink);
        drawBresenhamLine(g, 500, 172, 571, 160, customPink);
        drawBresenhamLine(g, 500, 172, 571, 158, customPink);
        drawBresenhamLine(g, 500, 172, 571, 161, customPink);
        drawBresenhamLine(g, 500, 172, 571, 162, customPink);
        drawBresenhamLine(g, 500, 172, 569, 163, customPink);

        drawBresenhamLine(g, 503, 184, 557, 213, customPink);
        drawBresenhamLine(g, 503, 184, 556, 212, customPink);
        drawBresenhamLine(g, 503, 184, 557, 214, customPink);
        drawBresenhamLine(g, 503, 184, 557, 215, customPink);
        drawBresenhamLine(g, 503, 184, 557, 213, customPink);
        drawBresenhamLine(g, 503, 184, 556, 215, customPink);
        drawBresenhamLine(g, 503, 184, 556, 216, customPink);
        drawBresenhamLine(g, 503, 184, 555, 216, customPink);
        drawBresenhamLine(g, 503, 184, 554, 216, customPink);
        drawBresenhamLine(g, 503, 184, 553, 216, customPink);

        drawBresenhamLine(g, 492, 187, 518, 252, customPink);
        drawBresenhamLine(g, 492, 187, 518, 253, customPink);
        drawBresenhamLine(g, 492, 187, 518, 254, customPink);
        drawBresenhamLine(g, 492, 187, 517, 254, customPink);
        drawBresenhamLine(g, 492, 187, 517, 255, customPink);
        drawBresenhamLine(g, 492, 187, 516, 255, customPink);
        drawBresenhamLine(g, 492, 187, 515, 255, customPink);
        drawBresenhamLine(g, 492, 187, 516, 255, customPink);
        drawBresenhamLine(g, 492, 187, 515, 255, customPink);
        drawBresenhamLine(g, 492, 187, 514, 254, customPink);

        drawBresenhamLine(g, 483, 187, 460, 255, customPink);
        drawBresenhamLine(g, 483, 187, 459, 255, customPink);
        drawBresenhamLine(g, 483, 187, 458, 255, customPink);
        drawBresenhamLine(g, 483, 187, 460, 255, customPink);
        drawBresenhamLine(g, 483, 187, 457, 255, customPink);
        drawBresenhamLine(g, 483, 187, 457, 254, customPink); 
        drawBresenhamLine(g, 483, 187, 457, 253, customPink);
        drawBresenhamLine(g, 483, 187, 456, 253, customPink);
        drawBresenhamLine(g, 483, 187, 456, 252, customPink);
        drawBresenhamLine(g, 483, 187, 456, 251, customPink);

        drawBresenhamLine(g, 473, 183, 425, 214, customPink);
        drawBresenhamLine(g, 473, 183, 424, 214, customPink);
        drawBresenhamLine(g, 473, 183, 423, 214, customPink);
        drawBresenhamLine(g, 473, 183, 422, 214, customPink);
        drawBresenhamLine(g, 473, 183, 422, 213, customPink);
        drawBresenhamLine(g, 473, 183, 421, 213, customPink);
        drawBresenhamLine(g, 473, 183, 421, 212, customPink);
        drawBresenhamLine(g, 473, 183, 421, 211, customPink);
        drawBresenhamLine(g, 473, 183, 422, 210, customPink);

        drawBresenhamLine(g, 474, 172, 405, 162, customPink);
        drawBresenhamLine(g, 474, 172, 405, 161, customPink);
        drawBresenhamLine(g, 474, 172, 404, 160, customPink);
        drawBresenhamLine(g, 474, 172, 404, 159, customPink);
        drawBresenhamLine(g, 474, 172, 404, 158, customPink);
        drawBresenhamLine(g, 474, 172, 405, 158, customPink);
        drawBresenhamLine(g, 474, 172, 406, 158, customPink);
        drawBresenhamLine(g, 474, 172, 407, 158, customPink);
        drawBresenhamLine(g, 474, 172, 408, 158, customPink);
        drawBresenhamLine(g, 474, 172, 409, 159, customPink);

        drawBresenhamLine(g, 475, 160, 435, 116, customPink);
        drawBresenhamLine(g, 475, 160, 435, 117, customPink);
        drawBresenhamLine(g, 475, 160, 435, 115, customPink);
        drawBresenhamLine(g, 475, 160, 435, 114, customPink);
        drawBresenhamLine(g, 475, 160, 436, 114, customPink);
        drawBresenhamLine(g, 475, 160, 436, 115, customPink);
        drawBresenhamLine(g, 475, 160, 436, 113, customPink);
        drawBresenhamLine(g, 475, 160, 437, 113, customPink);
        drawBresenhamLine(g, 475, 160, 438, 113, customPink);
        drawBresenhamLine(g, 475, 160, 439, 113, customPink);

        drawBresenhamLine(g, 478, 148, 459, 103, customLightpink);
        drawBresenhamLine(g, 478, 148, 459, 102, customLightpink);
        drawBresenhamLine(g, 478, 148, 459, 101, customLightpink);
        drawBresenhamLine(g, 478, 148, 460, 101, customLightpink);
        drawBresenhamLine(g, 478, 148, 460, 100, customLightpink);
        drawBresenhamLine(g, 478, 148, 461, 100, customLightpink);
        drawBresenhamLine(g, 478, 148, 462, 100, customLightpink);
        drawBresenhamLine(g, 478, 148, 462, 101, customLightpink);

        drawBresenhamLine(g, 496, 148, 512, 101, customLightpink);
        drawBresenhamLine(g, 496, 148, 513, 101, customLightpink);
        drawBresenhamLine(g, 496, 148, 513, 100, customLightpink);
        drawBresenhamLine(g, 496, 148, 514, 100, customLightpink);
        drawBresenhamLine(g, 496, 148, 513, 100, customLightpink);
        drawBresenhamLine(g, 496, 148, 514, 101, customLightpink);
        drawBresenhamLine(g, 496, 148, 515, 100, customLightpink);
        drawBresenhamLine(g, 496, 148, 515, 101, customLightpink);
        drawBresenhamLine(g, 496, 148, 515, 102, customLightpink);
        drawBresenhamLine(g, 496, 148, 515, 103, customLightpink);
        drawBresenhamLine(g, 496, 148, 515, 104, customLightpink);

        drawBresenhamLine(g, 510, 160, 554, 134, customLightpink);
        drawBresenhamLine(g, 510, 160, 555, 134, customLightpink);
        drawBresenhamLine(g, 510, 160, 555, 135, customLightpink);
        drawBresenhamLine(g, 510, 160, 556, 135, customLightpink);
        drawBresenhamLine(g, 510, 160, 556, 136, customLightpink);
        drawBresenhamLine(g, 510, 160, 556, 137, customLightpink);
        drawBresenhamLine(g, 510, 160, 554, 138, customLightpink);

        drawBresenhamLine(g, 514, 178, 565, 187, customLightpink);
        drawBresenhamLine(g, 514, 178, 565, 188, customLightpink);
        drawBresenhamLine(g, 514, 178, 565, 189, customLightpink);
        drawBresenhamLine(g, 514, 178, 564, 189, customLightpink);
        drawBresenhamLine(g, 514, 178, 564, 190, customLightpink);
        drawBresenhamLine(g, 514, 178, 563, 191, customLightpink);
        drawBresenhamLine(g, 514, 178, 562, 191, customLightpink);
        drawBresenhamLine(g, 514, 178, 561, 191, customLightpink);

        drawBresenhamLine(g, 504, 194, 539, 232, customLightpink);
        drawBresenhamLine(g, 504, 194, 539, 233, customLightpink);
        drawBresenhamLine(g, 504, 194, 539, 234, customLightpink);
        drawBresenhamLine(g, 504, 194, 538, 234, customLightpink);
        drawBresenhamLine(g, 504, 194, 538, 235, customLightpink);
        drawBresenhamLine(g, 504, 194, 537, 235, customLightpink);
        drawBresenhamLine(g, 504, 194, 536, 235, customLightpink);
        drawBresenhamLine(g, 504, 194, 535, 235, customLightpink);

        drawBresenhamLine(g, 487, 200, 490, 252, customLightpink);
        drawBresenhamLine(g, 487, 200, 489, 252, customLightpink);
        drawBresenhamLine(g, 487, 200, 489, 253, customLightpink);
        drawBresenhamLine(g, 487, 200, 488, 253, customLightpink);
        drawBresenhamLine(g, 487, 200, 488, 254, customLightpink);
        drawBresenhamLine(g, 487, 200, 487, 254, customLightpink);
        drawBresenhamLine(g, 487, 200, 486, 253, customLightpink);
        drawBresenhamLine(g, 487, 200, 485, 252, customLightpink);

        drawBresenhamLine(g, 470, 194, 440, 236, customLightpink);
        drawBresenhamLine(g, 470, 194, 439, 236, customLightpink);
        drawBresenhamLine(g, 470, 194, 438, 236, customLightpink);
        drawBresenhamLine(g, 470, 194, 437, 236, customLightpink);
        drawBresenhamLine(g, 470, 194, 437, 235, customLightpink);
        drawBresenhamLine(g, 470, 194, 436, 235, customLightpink);
        drawBresenhamLine(g, 470, 194, 436, 234, customLightpink);
        drawBresenhamLine(g, 470, 194, 436, 233, customLightpink);

        drawBresenhamLine(g, 461, 178, 414, 189, customLightpink);
        drawBresenhamLine(g, 461, 178, 413, 190, customLightpink);
        drawBresenhamLine(g, 461, 178, 412, 190, customLightpink);
        drawBresenhamLine(g, 461, 178, 411, 190, customLightpink);
        drawBresenhamLine(g, 461, 178, 410, 190, customLightpink);
        drawBresenhamLine(g, 461, 178, 410, 189, customLightpink);
        drawBresenhamLine(g, 461, 178, 410, 188, customLightpink);
        drawBresenhamLine(g, 461, 178, 410, 187, customLightpink);
        drawBresenhamLine(g, 461, 178, 411, 186, customLightpink);
        drawBresenhamLine(g, 461, 178, 412, 186, customLightpink);

        drawBresenhamLine(g, 464, 160, 419, 138, customLightpink);
        drawBresenhamLine(g, 464, 160, 419, 137, customLightpink);
        drawBresenhamLine(g, 464, 160, 419, 136, customLightpink);
        drawBresenhamLine(g, 464, 160, 419, 135, customLightpink);
        drawBresenhamLine(g, 464, 160, 420, 135, customLightpink);
        drawBresenhamLine(g, 464, 160, 420, 134, customLightpink);
        drawBresenhamLine(g, 464, 160, 421, 134, customLightpink);
        drawBresenhamLine(g, 464, 160, 422, 134, customLightpink);
        drawBresenhamLine(g, 464, 160, 423, 134, customLightpink);


        //จุด
        drawBresenhamLine(g, 441, 135, 441, 139, customLightpink);
        drawBresenhamLine(g, 442, 135, 442, 139, customLightpink);
        drawBresenhamLine(g, 440, 136, 444, 136, customLightpink);
        drawBresenhamLine(g, 440, 137, 444, 137, customLightpink);

        drawBresenhamLine(g, 475, 110, 475, 114, customLightpink);
        drawBresenhamLine(g, 476, 110, 476, 114, customLightpink);
        drawBresenhamLine(g, 474, 111, 478, 111, customLightpink);
        drawBresenhamLine(g, 474, 112, 478, 112, customLightpink);

        drawBresenhamLine(g, 543, 152, 543, 157, customLightpink);
        drawBresenhamLine(g, 544, 152, 544, 157, customLightpink);
        drawBresenhamLine(g, 545, 152, 545, 157, customLightpink);
        drawBresenhamLine(g, 542, 153, 547, 153, customLightpink);
        drawBresenhamLine(g, 542, 154, 547, 154, customLightpink);
        drawBresenhamLine(g, 542, 155, 547, 155, customLightpink);

        drawBresenhamLine(g, 449, 207, 449, 211, customLightpink);
        drawBresenhamLine(g, 450, 207, 450, 211, customLightpink);
        drawBresenhamLine(g, 448, 208, 452, 208, customLightpink);
        drawBresenhamLine(g, 448, 209, 452, 209, customLightpink);


        drawBresenhamLine(g, 489, 172, 489, 177, customLightpink);
        drawBresenhamLine(g, 490, 172, 490, 177, customLightpink);
        drawBresenhamLine(g, 491, 172, 491, 177, customLightpink);
        drawBresenhamLine(g, 488, 173, 493, 173, customLightpink);
        drawBresenhamLine(g, 488, 174, 493, 174, customLightpink);
        drawBresenhamLine(g, 488, 175, 493, 175, customLightpink);

        drawBresenhamLine(g, 447, 157, 447, 161, customPink);
        drawBresenhamLine(g, 448, 157, 448, 161, customPink);
        drawBresenhamLine(g, 446, 158, 450, 158, customPink);
        drawBresenhamLine(g, 446, 159, 450, 159, customPink);
        
        drawBresenhamLine(g, 493, 155, 493, 159, customPink);
        drawBresenhamLine(g, 494, 155, 494, 159, customPink);
        drawBresenhamLine(g, 492, 156, 496, 156, customPink);
        drawBresenhamLine(g, 492, 157, 496, 157, customPink);

        drawBresenhamLine(g, 521, 185, 521, 189, customPink);
        drawBresenhamLine(g, 522, 185, 522, 189, customPink);
        drawBresenhamLine(g, 520, 186, 524, 186, customPink);
        drawBresenhamLine(g, 520, 187, 524, 187, customPink);

        drawBresenhamLine(g, 549, 196, 549, 200, customPink);
        drawBresenhamLine(g, 550, 196, 550, 200, customPink);
        drawBresenhamLine(g, 548, 197, 552, 197, customPink);
        drawBresenhamLine(g, 548, 198, 552, 198, customPink);

        drawBresenhamLine(g, 535, 214, 535,218, customPink);
        drawBresenhamLine(g, 536, 214, 536,218, customPink);
        drawBresenhamLine(g, 534, 215, 538,215, customPink);
        drawBresenhamLine(g, 534, 216, 538,216, customPink);

        drawBresenhamLine(g, 512, 213, 512,218, customPink);
        drawBresenhamLine(g, 513, 213, 513,218, customPink);
        drawBresenhamLine(g, 514, 213, 514,218, customPink);
        drawBresenhamLine(g, 511, 214, 516,214, customPink);
        drawBresenhamLine(g, 511, 215, 516,215, customPink);
        drawBresenhamLine(g, 511, 216, 516,216, customPink);

        drawBresenhamLine(g, 479, 218, 479,223, customPink);
        drawBresenhamLine(g, 480, 218, 480,223, customPink);
        drawBresenhamLine(g, 481, 218, 481,223, customPink);
        drawBresenhamLine(g, 478, 219, 483,219, customPink);
        drawBresenhamLine(g, 478, 220, 483,220, customPink);
        drawBresenhamLine(g, 478, 221, 483,221, customPink);

        //พลุบนหัวฟ้้า
        drawBresenhamLine(g, 307, 180, 305, 168, customSky);
        drawBresenhamLine(g, 307, 180, 306, 167, customSky);
        drawBresenhamLine(g, 307, 180, 307, 166, customSky);
        drawBresenhamLine(g, 307, 180, 308, 167, customSky);
        drawBresenhamLine(g, 307, 180, 309, 168, customSky);

        drawBresenhamLine(g, 377, 209, 384, 198, customSky);
        drawBresenhamLine(g, 377, 209, 385, 198, customSky);
        drawBresenhamLine(g, 377, 209, 386, 198, customSky);
        drawBresenhamLine(g, 377, 209, 387, 198, customSky);
        drawBresenhamLine(g, 377, 209, 387, 199, customSky);
        drawBresenhamLine(g, 377, 209, 387, 200, customSky);
       
        drawBresenhamLine(g, 396, 261, 406, 255, customSky);
        drawBresenhamLine(g, 396, 261, 407, 255, customSky);
        drawBresenhamLine(g, 396, 261, 408, 255, customSky);
        drawBresenhamLine(g, 396, 261, 409, 256, customSky);
        drawBresenhamLine(g, 396, 261, 409, 257, customSky);
        drawBresenhamLine(g, 396, 261, 409, 258, customSky);

        drawBresenhamLine(g, 406, 291, 446, 288, customSky);
        drawBresenhamLine(g, 406, 291, 446, 289, customSky);
        drawBresenhamLine(g, 406, 291, 447, 289, customSky);
        drawBresenhamLine(g, 406, 291, 448, 290, customSky);
        drawBresenhamLine(g, 406, 291, 447, 291, customSky);
        drawBresenhamLine(g, 406, 291, 446, 291, customSky);
        drawBresenhamLine(g, 406, 291, 446, 292, customSky);
        
        drawBresenhamLine(g, 381, 316, 414, 327, customSky);
        drawBresenhamLine(g, 381, 316, 414, 328, customSky);
        drawBresenhamLine(g, 381, 316, 414, 329, customSky);
        drawBresenhamLine(g, 381, 316, 414, 330, customSky);
        drawBresenhamLine(g, 381, 316, 413, 330, customSky);
        drawBresenhamLine(g, 381, 316, 412, 330, customSky);

        drawBresenhamLine(g, 394, 340, 429, 358, customSky);
        drawBresenhamLine(g, 394, 340, 429, 359, customSky);
        drawBresenhamLine(g, 394, 340, 429, 360, customSky);
        drawBresenhamLine(g, 394, 340, 428, 360, customSky);
        drawBresenhamLine(g, 394, 340, 427, 360, customSky);
        drawBresenhamLine(g, 394, 340, 426, 360, customSky);

        drawBresenhamLine(g, 398, 368, 428, 391, customSky);
        drawBresenhamLine(g, 398, 368, 428, 392, customSky);
        drawBresenhamLine(g, 398, 368, 428, 393, customSky);
        drawBresenhamLine(g, 398, 368, 427, 393, customSky);
        drawBresenhamLine(g, 398, 368, 427, 394, customSky);
        drawBresenhamLine(g, 398, 368, 426, 394, customSky);
        drawBresenhamLine(g, 398, 368, 425, 394, customSky);

        drawBresenhamLine(g, 206, 328, 198, 333, customSky);
        drawBresenhamLine(g, 206, 328, 197, 333, customSky);
        drawBresenhamLine(g, 206, 328, 196, 333, customSky);
        drawBresenhamLine(g, 206, 328, 195, 333, customSky);
        drawBresenhamLine(g, 206, 328, 195, 332, customSky);
        drawBresenhamLine(g, 206, 328, 195, 331, customSky);

        drawBresenhamLine(g, 190, 334, 154, 348, customSky);
        drawBresenhamLine(g, 190, 334, 153, 348, customSky);
        drawBresenhamLine(g, 190, 334, 152, 348, customSky);
        drawBresenhamLine(g, 190, 334, 153, 347, customSky);
        drawBresenhamLine(g, 190, 334, 151, 347, customSky);
        drawBresenhamLine(g, 190, 334, 151, 346, customSky);
        drawBresenhamLine(g, 190, 334, 151, 345, customSky);

        drawBresenhamLine(g, 220, 275, 211, 276, customSky);
        drawBresenhamLine(g, 220, 275, 210, 275, customSky);
        drawBresenhamLine(g, 220, 275, 211, 274, customSky);
        drawBresenhamLine(g, 220, 275, 211, 273, customSky);
        drawBresenhamLine(g, 220, 275, 212, 273, customSky);
        drawBresenhamLine(g, 220, 275, 211, 276, customSky);

        drawBresenhamLine(g, 241, 211, 220, 189, customSky);
        drawBresenhamLine(g, 241, 211, 220, 188, customSky);
        drawBresenhamLine(g, 241, 211, 220, 187, customSky);
        drawBresenhamLine(g, 241, 211, 221, 187, customSky);
        drawBresenhamLine(g, 241, 211, 221, 186, customSky);
        drawBresenhamLine(g, 241, 211, 222, 186, customSky);
        drawBresenhamLine(g, 241, 211, 223, 186, customSky);

        //พลุบนหัวส้ม
        drawBresenhamLine(g, 306, 158, 305, 119, customOrange);
        drawBresenhamLine(g, 307, 159, 306, 119, customOrange);
        drawBresenhamLine(g, 307, 159, 306, 118, customOrange);
        drawBresenhamLine(g, 307, 159, 307, 117, customOrange);
        drawBresenhamLine(g, 307, 159, 308, 118, customOrange);
        drawBresenhamLine(g, 307, 159, 308, 119, customOrange);
        drawBresenhamLine(g, 308, 158, 309, 119, customOrange);

        drawBresenhamLine(g, 357, 205, 375, 172, customOrange);
        drawBresenhamLine(g, 357, 205, 376, 172, customOrange);
        drawBresenhamLine(g, 357, 205, 376, 171, customOrange);
        drawBresenhamLine(g, 357, 205, 377, 171, customOrange);
        drawBresenhamLine(g, 357, 205, 378, 171, customOrange);
        drawBresenhamLine(g, 357, 205, 378, 172, customOrange);
        drawBresenhamLine(g, 357, 205, 378, 173, customOrange);
        drawBresenhamLine(g, 357, 205, 378, 174, customOrange);

        drawBresenhamLine(g, 389, 194, 406, 171, customOrange);
        drawBresenhamLine(g, 389, 194, 407, 171, customOrange);
        drawBresenhamLine(g, 389, 194, 407, 170, customOrange);
        drawBresenhamLine(g, 389, 194, 408, 170, customOrange);
        drawBresenhamLine(g, 389, 194, 409, 170, customOrange);
        drawBresenhamLine(g, 389, 194, 409, 171, customOrange);
        drawBresenhamLine(g, 389, 194, 409, 172, customOrange);
        drawBresenhamLine(g, 389, 194, 409, 173, customOrange);

        drawBresenhamLine(g, 381, 249, 388, 243, customOrange);
        drawBresenhamLine(g, 381, 249, 389, 243, customOrange);
        drawBresenhamLine(g, 381, 249, 390, 243, customOrange);
        drawBresenhamLine(g, 381, 249, 390, 244, customOrange);
        drawBresenhamLine(g, 381, 249, 391, 243, customOrange);
        drawBresenhamLine(g, 381, 249, 391, 244, customOrange);
        drawBresenhamLine(g, 381, 249, 391, 245, customOrange);
        
        drawBresenhamLine(g, 394, 241, 426, 220, customOrange);
        drawBresenhamLine(g, 394, 241, 427, 220, customOrange);
        drawBresenhamLine(g, 394, 241, 428, 220, customOrange);
        drawBresenhamLine(g, 394, 241, 428, 221, customOrange);
        drawBresenhamLine(g, 394, 241, 429, 221, customOrange);
        drawBresenhamLine(g, 394, 241, 429, 222, customOrange);
        drawBresenhamLine(g, 394, 241, 429, 223, customOrange);

        drawBresenhamLine(g, 412, 254, 441, 242, customOrange);
        drawBresenhamLine(g, 412, 254, 442, 242, customOrange);
        drawBresenhamLine(g, 412, 254, 443, 242, customOrange);
        drawBresenhamLine(g, 412, 254, 444, 242, customOrange);
        drawBresenhamLine(g, 412, 254, 444, 243, customOrange);
        drawBresenhamLine(g, 412, 254, 444, 244, customOrange);
        drawBresenhamLine(g, 412, 254, 444, 245, customOrange);

        drawBresenhamLine(g, 391, 290, 399, 289, customOrange);
        drawBresenhamLine(g, 391, 290, 400, 289, customOrange);
        drawBresenhamLine(g, 391, 290, 400, 290, customOrange);
        drawBresenhamLine(g, 391, 290, 401, 290, customOrange);
        drawBresenhamLine(g, 391, 290, 401, 291, customOrange);
        drawBresenhamLine(g, 391, 290, 400, 292, customOrange);
        drawBresenhamLine(g, 391, 290, 399, 292, customOrange);

        drawBresenhamLine(g, 414, 309, 425, 309, customOrange);
        drawBresenhamLine(g, 414, 309, 425, 310, customOrange);
        drawBresenhamLine(g, 414, 309, 426, 310, customOrange);
        drawBresenhamLine(g, 414, 309, 427, 310, customOrange);
        drawBresenhamLine(g, 414, 309, 427, 311, customOrange);
        drawBresenhamLine(g, 414, 309, 427, 312, customOrange);
        drawBresenhamLine(g, 414, 309, 426, 312, customOrange);
        drawBresenhamLine(g, 414, 309, 425, 312, customOrange);
        drawBresenhamLine(g, 414, 309, 425, 313, customOrange);

        drawBresenhamLine(g, 368, 340, 380, 347, customOrange);
        drawBresenhamLine(g, 368, 340, 380, 348, customOrange);
        drawBresenhamLine(g, 368, 340, 380, 349, customOrange);
        drawBresenhamLine(g, 368, 340, 380, 350, customOrange);
        drawBresenhamLine(g, 368, 340, 379, 350, customOrange);
        drawBresenhamLine(g, 368, 340, 378, 350, customOrange);
        drawBresenhamLine(g, 368, 340, 377, 350, customOrange);

        drawBresenhamLine(g, 239, 350, 225, 366, customOrange);
        drawBresenhamLine(g, 239, 350, 224, 366, customOrange);
        drawBresenhamLine(g, 239, 350, 223, 366, customOrange);
        drawBresenhamLine(g, 239, 350, 222, 366, customOrange);
        drawBresenhamLine(g, 239, 350, 222, 365, customOrange);
        drawBresenhamLine(g, 239, 350, 222, 364, customOrange);
        drawBresenhamLine(g, 239, 350, 222, 363, customOrange);

        drawBresenhamLine(g, 222, 342, 193, 362, customOrange);
        drawBresenhamLine(g, 222, 342, 192, 362, customOrange);
        drawBresenhamLine(g, 222, 342, 191, 362, customOrange);
        drawBresenhamLine(g, 222, 342, 190, 362, customOrange);
        drawBresenhamLine(g, 222, 342, 190, 361, customOrange);
        drawBresenhamLine(g, 222, 342, 190, 360, customOrange);
        drawBresenhamLine(g, 222, 342, 190, 359, customOrange);

        drawBresenhamLine(g, 231, 320, 217, 327, customOrange);
        drawBresenhamLine(g, 231, 320, 216, 328, customOrange);
        drawBresenhamLine(g, 231, 320, 215, 328, customOrange);
        drawBresenhamLine(g, 231, 320, 214, 328, customOrange);
        drawBresenhamLine(g, 231, 320, 213, 328, customOrange);
        drawBresenhamLine(g, 231, 320, 213, 327, customOrange);
        drawBresenhamLine(g, 231, 320, 213, 326, customOrange);

        drawBresenhamLine(g, 230, 306, 196, 311, customOrange);
        drawBresenhamLine(g, 230, 306, 195, 311, customOrange);
        drawBresenhamLine(g, 230, 306, 194, 311, customOrange);
        drawBresenhamLine(g, 230, 306, 193, 311, customOrange);
        drawBresenhamLine(g, 230, 306, 192, 310, customOrange);
        drawBresenhamLine(g, 230, 306, 192, 309, customOrange);
        drawBresenhamLine(g, 230, 306, 193, 308, customOrange);
        drawBresenhamLine(g, 230, 306, 194, 308, customOrange);

        drawBresenhamLine(g, 184, 271, 147, 265, customOrange);
        drawBresenhamLine(g, 184, 271, 146, 265, customOrange);
        drawBresenhamLine(g, 184, 271, 146, 264, customOrange);
        drawBresenhamLine(g, 184, 271, 145, 264, customOrange);
        drawBresenhamLine(g, 184, 271, 145, 263, customOrange);
        drawBresenhamLine(g, 184, 271, 146, 263, customOrange);
        drawBresenhamLine(g, 184, 271, 146, 262, customOrange);
        drawBresenhamLine(g, 184, 271, 147, 262, customOrange);
        drawBresenhamLine(g, 184, 271, 148, 262, customOrange);

        drawBresenhamLine(g, 212, 212, 192, 197, customOrange);
        drawBresenhamLine(g, 212, 212, 192, 196, customOrange);
        drawBresenhamLine(g, 212, 212, 192, 195, customOrange);
        drawBresenhamLine(g, 212, 212, 192, 194, customOrange);
        drawBresenhamLine(g, 212, 212, 193, 194, customOrange);
        drawBresenhamLine(g, 212, 212, 194, 194, customOrange);
        drawBresenhamLine(g, 212, 212, 195, 194, customOrange);

        drawBresenhamLine(g, 255, 202, 236, 172, customOrange);
        drawBresenhamLine(g, 255, 202, 236, 171, customOrange);
        drawBresenhamLine(g, 255, 202, 236, 170, customOrange);
        drawBresenhamLine(g, 255, 202, 237, 170, customOrange);
        drawBresenhamLine(g, 255, 202, 237, 169, customOrange);
        drawBresenhamLine(g, 255, 202, 238, 169, customOrange);
        drawBresenhamLine(g, 255, 202, 239, 169, customOrange);
        drawBresenhamLine(g, 255, 202, 240, 170, customOrange);

        drawBresenhamLine(g, 330, 167, 334, 130, customGreen);
        drawBresenhamLine(g, 330, 167, 335, 130, customGreen);
        drawBresenhamLine(g, 330, 167, 335, 129, customGreen);
        drawBresenhamLine(g, 330, 167, 336, 129, customGreen);
        drawBresenhamLine(g, 330, 167, 337, 128, customGreen);
        drawBresenhamLine(g, 330, 167, 337, 129, customGreen);
        drawBresenhamLine(g, 330, 167, 338, 129, customGreen);

        drawBresenhamLine(g, 342, 197, 351, 164, customGreen);
        drawBresenhamLine(g, 342, 197, 352, 163, customGreen);
        drawBresenhamLine(g, 342, 197, 353, 162, customGreen);
        drawBresenhamLine(g, 342, 197, 354, 162, customGreen);
        drawBresenhamLine(g, 342, 197, 355, 163, customGreen);
        drawBresenhamLine(g, 342, 197, 354, 163, customGreen);
        drawBresenhamLine(g, 342, 197, 355, 164, customGreen);
        drawBresenhamLine(g, 342, 197, 355, 165, customGreen);

        drawBresenhamLine(g, 377, 233, 392, 218, customGreen);
        drawBresenhamLine(g, 377, 233, 393, 218, customGreen);
        drawBresenhamLine(g, 377, 233, 394, 218, customGreen);
        drawBresenhamLine(g, 377, 233, 395, 218, customGreen);
        drawBresenhamLine(g, 377, 233, 395, 219, customGreen);
        drawBresenhamLine(g, 377, 233, 395, 220, customGreen);
        drawBresenhamLine(g, 377, 233, 395, 221, customGreen);

        drawBresenhamLine(g, 433, 313, 470, 318, customGreen);
        drawBresenhamLine(g, 433, 313, 471, 318, customGreen);
        drawBresenhamLine(g, 433, 313, 471, 319, customGreen);
        drawBresenhamLine(g, 433, 313, 472, 319, customGreen);
        drawBresenhamLine(g, 433, 313, 472, 320, customGreen);
        drawBresenhamLine(g, 433, 313, 471, 321, customGreen);
        drawBresenhamLine(g, 433, 313, 472, 321, customGreen);
        drawBresenhamLine(g, 433, 313, 471, 322, customGreen);
        drawBresenhamLine(g, 433, 313, 470, 322, customGreen);

        drawBresenhamLine(g, 187, 310, 176, 312, customGreen);
        drawBresenhamLine(g, 187, 310, 176, 311, customGreen);
        drawBresenhamLine(g, 187, 310, 175, 311, customGreen);
        drawBresenhamLine(g, 187, 310, 174, 310, customGreen);
        drawBresenhamLine(g, 187, 310, 175, 309, customGreen);
        drawBresenhamLine(g, 187, 310, 176, 309, customGreen);
        drawBresenhamLine(g, 187, 310, 176, 308, customGreen);

        drawBresenhamLine(g, 326, 186, 327, 173, customYellow);
        drawBresenhamLine(g, 326, 186, 328, 172, customYellow);
        drawBresenhamLine(g, 326, 186, 329, 172, customYellow);
        drawBresenhamLine(g, 326, 186, 330, 172, customYellow);
        drawBresenhamLine(g, 326, 186, 330, 173, customYellow);
        drawBresenhamLine(g, 326, 186, 330, 174, customYellow);

        drawBresenhamLine(g, 379, 169, 383, 160, customYellow);
        drawBresenhamLine(g, 379, 169, 384, 159, customYellow);
        drawBresenhamLine(g, 379, 169, 385, 159, customYellow);
        drawBresenhamLine(g, 379, 169, 386, 159, customYellow);
        drawBresenhamLine(g, 379, 169, 387, 160, customYellow);
        drawBresenhamLine(g, 379, 169, 387, 161, customYellow);

        drawBresenhamLine(g, 384, 277, 417, 270, customPastelperple);
        drawBresenhamLine(g, 384, 277, 418, 270, customPastelperple);
        drawBresenhamLine(g, 384, 277, 419, 270, customPastelperple);
        drawBresenhamLine(g, 384, 277, 419, 271, customPastelperple);
        drawBresenhamLine(g, 384, 277, 420, 271, customPastelperple);
        drawBresenhamLine(g, 384, 277, 420, 272, customPastelperple);
        drawBresenhamLine(g, 384, 277, 420, 273, customPastelperple);
        drawBresenhamLine(g, 384, 277, 419, 274, customPastelperple);

        drawBresenhamLine(g, 380, 331, 390, 335, customPastelperple);
        drawBresenhamLine(g, 380, 331, 391, 336, customPastelperple);
        drawBresenhamLine(g, 380, 331, 391, 337, customPastelperple);
        drawBresenhamLine(g, 380, 331, 390, 337, customPastelperple);
        drawBresenhamLine(g, 380, 331, 390, 338, customPastelperple);
        drawBresenhamLine(g, 380, 331, 390, 338, customPastelperple);
        drawBresenhamLine(g, 380, 331, 389, 338, customPastelperple);
        drawBresenhamLine(g, 380, 331, 388, 338, customPastelperple);

        drawBresenhamLine(g, 386, 356, 395, 362, customPastelperple);
        drawBresenhamLine(g, 386, 356, 395, 363, customPastelperple);
        drawBresenhamLine(g, 386, 356, 395, 364, customPastelperple);
        drawBresenhamLine(g, 386, 356, 395, 365, customPastelperple);
        drawBresenhamLine(g, 386, 356, 394, 365, customPastelperple);
        drawBresenhamLine(g, 386, 356, 393, 365, customPastelperple);
        drawBresenhamLine(g, 386, 356, 392, 365, customPastelperple);

        drawBresenhamLine(g, 234, 334, 225, 338, customPastelperple);
        drawBresenhamLine(g, 234, 334, 225, 339, customPastelperple);
        drawBresenhamLine(g, 234, 334, 225, 340, customPastelperple);
        drawBresenhamLine(g, 234, 334, 226, 340, customPastelperple);
        drawBresenhamLine(g, 234, 334, 226, 341, customPastelperple);
        drawBresenhamLine(g, 234, 334, 227, 341, customPastelperple);
        drawBresenhamLine(g, 234, 334, 228, 341, customPastelperple);

        drawBresenhamLine(g, 210, 291, 172, 293, customPastelperple);
        drawBresenhamLine(g, 210, 291, 171, 292, customPastelperple);
        drawBresenhamLine(g, 210, 291, 170, 292, customPastelperple);
        drawBresenhamLine(g, 210, 291, 169, 291, customPastelperple);
        drawBresenhamLine(g, 210, 291, 170, 290, customPastelperple);
        drawBresenhamLine(g, 210, 291, 171, 289, customPastelperple);

        drawBresenhamLine(g, 204, 274, 190, 273, customPastelperple);
        drawBresenhamLine(g, 204, 274, 189, 272, customPastelperple);
        drawBresenhamLine(g, 204, 274, 188, 271, customPastelperple);
        drawBresenhamLine(g, 204, 274, 189, 270, customPastelperple);
        drawBresenhamLine(g, 204, 274, 190, 270, customPastelperple);
        drawBresenhamLine(g, 204, 274, 191, 270, customPastelperple);

        drawBresenhamLine(g, 221, 261, 203, 256, customPastelperple);
        drawBresenhamLine(g, 221, 261, 202, 256, customPastelperple);
        drawBresenhamLine(g, 221, 261, 202, 255, customPastelperple);
        drawBresenhamLine(g, 221, 261, 202, 254, customPastelperple);
        drawBresenhamLine(g, 221, 261, 202, 253, customPastelperple);
        drawBresenhamLine(g, 221, 261, 203, 252, customPastelperple);
        drawBresenhamLine(g, 221, 261, 204, 253, customPastelperple);

        drawBresenhamLine(g, 222, 243, 189, 224, customPastelperple);
        drawBresenhamLine(g, 222, 243, 189, 223, customPastelperple);
        drawBresenhamLine(g, 222, 243, 189, 222, customPastelperple);
        drawBresenhamLine(g, 222, 243, 189, 221, customPastelperple);
        drawBresenhamLine(g, 222, 243, 190, 221, customPastelperple);
        drawBresenhamLine(g, 222, 243, 191, 221, customPastelperple);
        drawBresenhamLine(g, 222, 243, 192, 221, customPastelperple);
        drawBresenhamLine(g, 222, 243, 193, 221, customPastelperple);

        drawBresenhamLine(g, 226, 223, 215, 216, customPastelperple);
        drawBresenhamLine(g, 226, 223, 215, 215, customPastelperple);
        drawBresenhamLine(g, 226, 223, 215, 214, customPastelperple);
        drawBresenhamLine(g, 226, 223, 216, 214, customPastelperple);
        drawBresenhamLine(g, 226, 223, 217, 214, customPastelperple);

        drawBresenhamLine(g, 265, 173, 250, 138, customPastelperple);
        drawBresenhamLine(g, 265, 173, 250, 137, customPastelperple);
        drawBresenhamLine(g, 265, 173, 251, 137, customPastelperple);
        drawBresenhamLine(g, 265, 173, 251, 136, customPastelperple);
        drawBresenhamLine(g, 265, 173, 252, 136, customPastelperple);
        drawBresenhamLine(g, 265, 173, 253, 136, customPastelperple);
        drawBresenhamLine(g, 265, 173, 254, 137, customPastelperple);

        drawBresenhamLine(g, 290, 186, 282, 149, customPastelperple);
        drawBresenhamLine(g, 290, 186, 282, 148, customPastelperple);
        drawBresenhamLine(g, 290, 186, 282, 147, customPastelperple);
        drawBresenhamLine(g, 290, 186, 282, 146, customPastelperple);
        drawBresenhamLine(g, 290, 186, 283, 146, customPastelperple);
        drawBresenhamLine(g, 290, 186, 284, 146, customPastelperple);
        drawBresenhamLine(g, 290, 186, 285, 146, customPastelperple);
        drawBresenhamLine(g, 290, 186, 285, 147, customPastelperple);
        drawBresenhamLine(g, 290, 186, 285, 148, customPastelperple);
        drawBresenhamLine(g, 290, 186, 286, 147, customPastelperple);

        drawBresenhamLine(g, 272, 191, 265, 179, customLightpink);
        drawBresenhamLine(g, 272, 191, 265, 178, customLightpink);
        drawBresenhamLine(g, 272, 191, 266, 177, customLightpink);
        drawBresenhamLine(g, 272, 191, 267, 177, customLightpink);
        drawBresenhamLine(g, 272, 191, 268, 177, customLightpink);
        drawBresenhamLine(g, 272, 191, 269, 178, customLightpink);

        g.setColor(Color.WHITE);
        //H
        benzierCurve(g, 121,40, 126,34, 146,34,154, 32, 3);
        benzierCurve(g, 130,18, 131,10, 130,53,130, 57, 4);
        benzierCurve(g, 149,18, 147,23, 145,36,145, 47, 4);
        benzierCurve(g, 145,47, 148,59, 155,58,159, 49, 3);
        //A
        benzierCurve(g, 173,33, 163,36, 160,44,160, 50, 3);
        benzierCurve(g, 160,50, 163,52, 167,47,173, 43, 2);
        benzierCurve(g, 173,32, 173,40, 173,50,173, 55, 3);
        benzierCurve(g, 173,55, 175,59, 178,59,186, 44, 2);
        //P
        benzierCurve(g, 188,26, 189,44, 188,58,188, 67, 4);
        benzierCurve(g, 191,40, 197,32, 203,32,204, 40, 3);
        benzierCurve(g, 204,40, 200,48, 196,52,191, 52, 3);
        benzierCurve(g, 191,46, 198,42, 203,40,212, 39, 2);
        //P
        benzierCurve(g, 212,26, 213,44, 212,58,212, 67, 4);
        benzierCurve(g, 216,39, 221,32, 227,33,228, 41, 3);
        benzierCurve(g, 228,41, 225,47, 220,52,215, 52, 3);
        benzierCurve(g, 215,47, 221,43, 228,40,235, 40, 2);
        //Y
        benzierCurve(g, 238,25, 236,33, 236,43,241, 47, 3);
        benzierCurve(g, 241,48, 244,49, 249,42,252, 28, 2);
        benzierCurve(g, 252,27, 250,50, 250,56,247, 63, 4);
        benzierCurve(g, 246,63, 243,67, 238,67,239, 58, 3);
        benzierCurve(g, 239,58, 245,53, 254,47,261, 41, 2);
        //N
        benzierCurve(g, 281,19, 281,31, 281,46,281, 56, 4);
        benzierCurve(g, 284,30, 290,21, 295,18,298, 22, 2);
        benzierCurve(g, 298,23, 299,33, 299,50,301, 55, 3);
        benzierCurve(g, 301,56, 303,58, 307,57,313, 49, 2);
        //E
        benzierCurve(g, 319,29, 314,35, 313,49,319, 53, 4);
        benzierCurve(g, 319,29, 326,30, 326,37,317, 42,2);
        benzierCurve(g, 318,53, 320,55, 325,53,332, 44,2);
        //W
        benzierCurve(g, 335,32, 334,43, 334,53,336, 58,4);
        benzierCurve(g, 335,58, 343,57, 342,51,344, 43,2);
        benzierCurve(g, 345,33, 346,47, 348,52,350, 55,4);
        benzierCurve(g, 351,55, 353,57, 359,54,360, 32,2);
        benzierCurve(g, 360,32, 358,28, 355,30,357, 37,2);
        benzierCurve(g, 357,37, 360,40, 362,42,371, 41,2);
        //Y
        benzierCurve(g, 394,24, 393,33, 394,39,396, 44,4);
        benzierCurve(g, 397,45, 396,49, 405,45,409, 26,2);
        benzierCurve(g, 409,24, 410,34, 409,44,403, 56,3);
        benzierCurve(g, 403,56, 399,63, 390,64,386, 60,2);
        benzierCurve(g, 386,60, 390,54, 403,49,418, 43,2);
        //E
        benzierCurve(g, 426,29, 420,36, 420,47,424, 53,4);
        benzierCurve(g, 426,29, 435,32, 436,38,422, 43,2);
        benzierCurve(g, 424,53, 426,56, 431,54,438, 43,2);
        //A
        benzierCurve(g, 452,32, 444,33, 439,41,440, 51,2);
        benzierCurve(g, 440,51, 444,50, 447,44,451, 36,2);
        benzierCurve(g, 452,32, 452,42, 452,51,452, 57,3);
        benzierCurve(g, 452,57, 455,60, 459,55,465, 42,2);
        //R
        benzierCurve(g, 467,28, 467,38, 465,47,463, 56,3);
        benzierCurve(g, 467,28, 471,29, 475,30,479, 30,2);
        benzierCurve(g, 477,30, 476,40, 475,49,478, 58,4);
        benzierCurve(g, 477,58, 480,61, 484,57,492, 40,2);
        //2
        benzierCurve(g, 255,89, 261,77, 265,76,268, 78,3);
        benzierCurve(g, 268,78, 269,86, 267,94,264, 103,3);
        benzierCurve(g, 264,103, 257,112, 249,107,257, 100,2);
        benzierCurve(g, 257,100, 261,105, 265,107,270, 108,2);
        //0
        benzierCurve(g, 286,79, 280,88, 278,97,281, 106,3);
        benzierCurve(g, 281,106, 289,105, 290,93,289, 86,3);
        benzierCurve(g, 290,86, 289,82, 288,79,286, 79,3);
        //2
        benzierCurve(g, 299,89, 305,77, 309,76,312, 78,3);
        benzierCurve(g, 312,78, 313,86, 311,94,308, 103,3);
        benzierCurve(g, 308,103, 301,112, 293,107,301, 100,2);
        benzierCurve(g, 301,100, 305,105, 309,107,314, 108,2);
        //4
        benzierCurve(g, 328,78, 317,101, 333,97,342, 94,3);
        benzierCurve(g, 333,78, 333,89, 333,99,333, 111,3);
        
        







        
        









        


        









        
    }

    
    public static void main(String[] args) {
        JFrame frame = new JFrame("HNY");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FW panel = new FW();
        frame.add(panel);

        frame.add(new FW());
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
