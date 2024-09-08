import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.Queue;
import java.util.concurrent.TimeUnit;


class Test1 extends JPanel implements Runnable{
///////////////////
    
    public static void main(String[] args) {
        Test1 m = new Test1();
        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("B");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

       (new Thread(m)).start();
    }
    double Move1 = 0;
    double velocityBackGround = 50.0;


    double frame = 0;
    double framePerSec = 20.0;
    public void run(){

        double lastTime = System.currentTimeMillis();
        double currentTime ,  elapsedTime;

        while(true){
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;
            lastTime = System.currentTimeMillis();

            Move1 -= velocityBackGround * elapsedTime / 1000.0;
            if(Move1 <= -1200){
                Move1 = 600;
            }


            frame += framePerSec * elapsedTime / 1000.0;
            if(frame >= 40){
                System.out.println(frame);
                frame = 0;
                
            }
            repaint();
        }

        
    }


    public void paintComponent(Graphics g){
//////BG/////////
        BufferedImage buffer1 = new BufferedImage(2000,601,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g1 = buffer1.createGraphics();
        g1.setColor(new Color(179,229,250));
        g1.fillRect(0, 0, 2000, 600);
        g1.setColor(new Color(103,186,106));
        g1.fillRect(0, 415, 2000, 600);

        int [] x29 = {0,136,161,185,223,273,440,0,};
        int [] y29 = {383,301,296,295,299,327,415,415,};
        g1.setColor(new Color(35,165,151));
        g1.fillPolygon(x29, y29 , 8);
      
        int [] x30 = {251,356,391,466,522,600,600,429,};
        int [] y30 = {315,253,243,242,268,326,415,415,};
        g1.setColor(new Color(32,158,139));
        g1.fillPolygon(x30, y30 , 8);



/////cloud/////
        g1.setColor(new Color(255,255,255));
        g1.fillOval(36+(int)Move1,29, 80, 80);
        g1.fillOval(65+(int)Move1,11, 120, 120);
        g1.fillOval(136+(int)Move1,31, 80, 80);

        g1.fillOval(212+(int)Move1,119, 80, 80);
        g1.fillOval(259+(int)Move1,94, 120, 120);
        g1.fillOval(338+(int)Move1,119, 80, 80);

        g1.fillOval(36+(int)Move1+500,29, 80, 80);
        g1.fillOval(65+(int)Move1+500,11, 120, 120);
        g1.fillOval(136+(int)Move1+500,31, 80, 80);

        g1.fillOval(36+(int)Move1+700,29, 80, 80);
        g1.fillOval(65+(int)Move1+700,11, 120, 120);
        g1.fillOval(136+(int)Move1+700,31, 80, 80);

        g1.fillOval(212+(int)Move1+700,119, 80, 80);
        g1.fillOval(259+(int)Move1+700,94, 120, 120);
        g1.fillOval(338+(int)Move1+700,119, 80, 80);

        g1.fillOval(36+(int)Move1+1200,29, 80, 80);
        g1.fillOval(65+(int)Move1+1200,11, 120, 120);
        g1.fillOval(136+(int)Move1+1200,31, 80, 80);



        g.drawImage(buffer1, 0, 0, null);
       
        BufferedImage buffer0 = new BufferedImage(2001,601,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g0 = buffer0.createGraphics();
////child////////
        if(frame >= 0 && frame <= 10){
         //หน้า
         int [] x1 = {259,260,265,269,276,284,293,303,316,326,333,339,345,348,348,345,337,330,320,306,294,281,270,259,};
         int [] y1 = {225,219,209,201,194,188,185,183,186,191,194,202,209,219,231,248,258,265,271,276,275,271,264,250,};
         g0.setColor(new Color(255,228,204));
         g0.fillPolygon(x1 , y1 , 24);
         //คอ
         int [] x2 = {300,314,313,315,311,303,298,294,299,301,};
         int [] y2 = {274,275,279,281,286,287,285,281,281,278,};
         g0.setColor(new Color(255,228,204));
         g0.fillPolygon(x2 , y2 , 10);
         //เสื้อ
         int [] x3 = {282,288,292,296,301,307,313,318,321,324,323,321,311,314,306,296,290,286,};
         int [] y3 = {285,282,281,286,289,289,287,282,285,293,301,307,304,297,296,295,294,288,};
         int [] x4 = {279,284,293,299,304,310,317,317,275,278,};
         int [] y4 = {310,310,311,317,319,319,317,327,327,317,};
         g0.setColor(new Color(101,51,1));
         g0.fillPolygon(x3 , y3 , 18);
         g0.fillPolygon(x4 , y4 , 10);
         //แขน
         int [] x5 = {272,275,278,290,290,313,308,321,313,305,293,282,269,266,271,275,};
         int [] y5 = {286,284,285,297,297,298,304,309,318,318,309,308,305,301,297,294,};
         g0.setColor(new Color(255,228,204));
         g0.fillPolygon(x5 , y5 , 16);
         //เกง
         int [] x6 = {273,318,336,319,306,299,291,284,269,256,266,};
         int [] y6 = {327,327,395,396,400,339,339,395,392,393,348,};
         g0.setColor(new Color(0,102,51));
         g0.fillPolygon(x6 , y6 , 11);
         //เท้า
         int [] x7 = {255,268,284,282,243,242,241,};
         int [] y7 = {394,393,396,412,411,411,407,};
         int [] x8 = {306,319,336,348,348,343,308,};
         int [] y8 = {401,397,396,408,411,413,412,};
         g0.setColor(new Color(64,64,64));
         g0.fillPolygon(x7 , y7 , 7);
         g0.fillPolygon(x8 , y8 , 7);

         g0.setColor(new Color(0,0,0));
        midpointCircle(g0,302, 230, 46);//หัว
            //ผม
        benzierCurve(g0, 283,187, 278,182, 275,179, 271,176, 2);
        benzierCurve(g0, 297,183, 295,176, 294,171, 293,168, 2);
        benzierCurve(g0, 308,183, 311,176, 312,173, 314,168, 2);
        //หู
        benzierCurve(g0, 347,236, 356,239, 351,246, 344,248, 2);
        benzierCurve(g0, 260,249, 251,249, 257,259, 268,261, 2);

        //หน้า
        benzierCurve(g0, 306,219, 309,216, 313,214, 317,212, 2);
        benzierCurve(g0, 295,222, 290,220, 285,220, 280,219, 2);
        benzierCurve(g0, 295,222, 290,220, 285,220, 280,219, 2);
        g0.fillOval(289,231, 9, 11);
        g0.fillOval(310,226, 9, 11);
        benzierCurve(g0, 296,256, 306,260, 313,256, 317,252, 2);
        benzierCurve(g0, 314,249, 316,251, 318,252, 319,253, 2);
        //ไหล่ แขน
        benzierCurve(g0, 300,277, 300,276, 300,279, 300,281, 2);
        benzierCurve(g0, 314,277, 314,276, 314,279, 314,282, 2);
        benzierCurve(g0, 300,281, 295,282, 289,284, 280,286, 2);
        benzierCurve(g0, 314,282, 316,284, 318,285, 322,288, 2);
        benzierCurve(g0, 289,295, 285,289, 282,286, 275,283, 2);
        benzierCurve(g0, 275,283, 272,284, 270,288, 274,294, 2);
        benzierCurve(g0, 322,288, 326,300, 324,310, 315,317, 2);
        benzierCurve(g0, 315,317, 311,320, 304,320, 293,310, 2);
        benzierCurve(g0, 322,288, 315,299, 312,302, 304,309, 2);
        benzierCurve(g0, 322,288, 315,299, 312,302, 304,309, 2);
        benzierCurve(g0, 313,297, 290,295, 282,295, 272,295, 2);
        benzierCurve(g0, 272,295, 266,299, 266,304, 271,307, 2);
        benzierCurve(g0, 271,307, 283,309, 292,310, 304,309, 2);
        //ตัว
        benzierCurve(g0, 278,309, 276,319, 273,327, 270,334, 2);
        benzierCurve(g0, 270,334, 267,343, 264,353, 255,392, 2);
        benzierCurve(g0, 255,392, 250,398, 246,401, 242,406, 2);
        benzierCurve(g0, 242,406, 241,409, 241,411, 282,412, 2);
        benzierCurve(g0, 282,412, 286,386, 288,366, 291,341, 2);
        //ขาขวา
        benzierCurve(g0, 318,314, 318,324, 319,330, 320,336, 2);
        benzierCurve(g0, 320,336, 323,350, 329,370, 335,395, 2);
        benzierCurve(g0, 335,395, 340,399, 344,403, 347,407, 2);
        benzierCurve(g0, 347,407, 349,409, 347,411, 344,412, 2);
        benzierCurve(g0, 344,412, 333,412, 320,412, 308,412, 2);
        benzierCurve(g0, 308,412, 303,382, 301,362, 298,341, 2);
        benzierCurve(g0, 287,338, 291,340, 296,340, 300,338, 2);
        benzierCurve(g0, 294,282, 299,288, 310,289, 316,283, 2);
        benzierCurve(g0, 310,304, 314,306, 317,307, 320,308, 2);
        benzierCurve(g0, 274,327, 287,328, 305,328, 317,327, 2);
        benzierCurve(g0, 255,395, 265,392, 274,393, 284,395, 2);
        benzierCurve(g0, 307,400, 316,397, 329,396, 336,395, 2);  
        }

/////Man///////
        
        else if(frame >= 11 && frame <= 20){
        //ผม
        int [] x9 = {264,258,258,269,285,298,304,312,317,317,316,311,302,290,278,269,266,};
        int [] y9 = {110,97,84,70,65,72,70,74,83,95,104,93,84,81,84,93,100,};
        g0.setColor(new Color(0,0,0));
        g0.fillPolygon(x9 , y9 , 17);
        //หู
        int [] x10 = {315,321,320,314,};
        int [] y10 = {111,108,119,124,};
        int [] x11 = {264 , 259 , 261 , 268 ,};
        int [] y11 = {114,114,122,127};
        g0.setColor(new Color(255,228,204));
        g0.fillPolygon(x10 , y10 , 4);
        g0.fillPolygon(x11 , y11 , 4);
        //หน้า
        int [] x12 = {266,267,269,277,289,299,306,313,313,307,298,288,277,271,267,};
        int [] y12 = {110,100,92,85,82,83,88,103,131,140,149,149,144,135,121,};
        g0.setColor(new Color(255,228,204));
        g0.fillPolygon(x12, y12 , 15);
        //คอ
        int [] x13 = {284,294,305,307,314,306,296,289,282,278,285,};
        int [] y13 = {148,152,144,160,163,173,175,174,172,165,160,};
        g0.setColor(new Color(255,228,204));
        g0.fillPolygon(x13, y13 , 11);
        //เสื้อ
        int [] x14 = {277,289,298,306,316,332,337,343,347,353,336,331,329,329,331,333,303,273,273,274,273,270,269,266,248,251,253,267,};
        int [] y14 = {167,175,175,173,164,168,170,177,189,210,219,209,222,242,254,270,275,274,255,240,219,211,219,226,218,201,183,172,};
        g0.setColor(new Color(101,51,1));
        g0.fillPolygon(x14, y14 , 28);
        //แขน
        int [] x15 = {248,266,262,261,263,272,276,286,285,276,268,245,246,};
        int [] y15 = {219,226,235,244,253,274,278,282,285,282,289,247,226,};
        int [] x16 = {336,353,358,356,345,340,336,329,318,319,335,342,337,};
        int [] y16 = {220,211,229,246,272,285,287,280,280,277,270,238,224,};
        g0.setColor(new Color(255,228,204));
        g0.fillPolygon(x15, y15 , 13);
        g0.fillPolygon(x16, y16 , 13);
        //เกง
        int [] x17 = {275,300,321,317,321,330,336,340,344,344,343,343,330,316,316,318,315,311,308,298,298,298,298,300,300,282,272,268,268,277,287,287,287,};
        int [] y17 = {276,277,275,281,283,282,288,315,335,379,397,405,467,466,413,385,351,330,300,300,338,360,386,417,463,464,407,318,290,283,285,284,281,};
        g0.setColor(new Color(0,102,51));
        g0.fillPolygon(x17, y17 , 32);
        //เท้า
        int [] x18 = {283,300,301,306,297,289,};
        int [] y18 = {465,464,479,514,520,513,};
        int [] x19 = {315,330,335,342,358,357,314,310,313,316,};
        int [] y19 = {467,467,491,499,506,509,507,501,492,483,};
        g0.setColor(new Color(64,64,64));
        g0.fillPolygon(x18, y18 , 6);
        g0.fillPolygon(x19, y19 , 10);

        g0.setColor(new Color(0,0,0));
        //หัว
        benzierCurve(g0, 267 ,120, 263 ,104, 267 ,91, 285 ,81, 2);
        benzierCurve(g0, 283 ,81, 298 ,82, 309 ,90, 314 ,103, 2);
        benzierCurve(g0, 315 ,103, 314 ,128, 307 ,144, 295 ,150, 2);
        benzierCurve(g0, 295 ,150, 279 ,146, 275 ,142, 267 ,120, 2);
        //หู
        benzierCurve(g0, 315 ,111, 321 ,108, 320 ,119, 314 ,124, 2);
        benzierCurve(g0, 264 ,114, 256 ,114, 261 ,122, 268 ,127, 2);
        //ผม
        benzierCurve(g0, 263 ,111, 256 ,99, 256 ,83, 266 ,71, 2);
        benzierCurve(g0, 266 ,71, 282 ,64, 291 ,65, 297 ,73, 2);
        benzierCurve(g0, 297 ,73, 303 ,69, 319 ,75, 315 ,109, 2);       
        //หน้า
        g0.fillOval(278 ,113, 6, 9);
        g0.fillOval(298 ,111, 6, 9);
        benzierCurve(g0, 294 ,107, 298 ,102, 303 ,101, 307 ,103, 2);
        benzierCurve(g0, 286 ,108, 281 ,105, 276 ,105, 271 ,108, 2);
        benzierCurve(g0, 279 ,132, 289 ,138, 295 ,138, 303 ,130, 2);
        //คอ
        benzierCurve(g0, 284 ,148, 284 ,154, 284 ,157, 284 ,160, 2);
        benzierCurve(g0, 305 ,143, 306 ,152, 306 ,156, 308 ,159, 2);
        //ใหล่
        benzierCurve(g0, 284 ,161, 275 ,166, 261 ,175, 252 ,184, 2);
        benzierCurve(g0, 252 ,184, 251 ,198, 248 ,219, 245 ,241, 2);
        benzierCurve(g0, 245 ,241, 245 ,248, 252 ,262, 267 ,289, 2);
        benzierCurve(g0, 267 ,289, 276 ,283, 279 ,283, 283 ,285, 2);
        benzierCurve(g0, 283 ,285, 287 ,288, 289 ,284, 283 ,279, 2);
        benzierCurve(g0, 283 ,279, 278 ,278, 277 ,278, 275 ,277, 2);
        benzierCurve(g0, 275 ,277, 267 ,263, 263 ,254, 261 ,247, 2);
        benzierCurve(g0, 261 ,247, 262 ,235, 267 ,225, 270 ,211, 2);
        benzierCurve(g0, 308 ,159, 314 ,163, 323 ,165, 336 ,168, 2);
        benzierCurve(g0, 336 ,168, 345 ,181, 350 ,196, 353 ,209, 2);
        benzierCurve(g0, 353 ,209, 358 ,228, 358 ,247, 344 ,273, 2);
        benzierCurve(g0, 344 ,273, 341 ,285, 338 ,287, 337 ,287, 2);
        benzierCurve(g0, 337 ,287, 334 ,285, 332 ,283, 329 ,279, 2);
        benzierCurve(g0, 329 ,279, 317 ,283, 316 ,278, 334 ,271, 2);
        benzierCurve(g0, 334 ,271, 338 ,257, 339 ,248, 340 ,242, 2);
        benzierCurve(g0, 340 ,242, 342 ,239, 342 ,235, 331 ,210, 2);

        benzierCurve(g0, 278 ,165, 289 ,177, 304 ,177, 315 ,163, 2);
        benzierCurve(g0, 248 ,218, 255 ,220, 261 ,223, 265 ,226, 2);
        benzierCurve(g0, 353 ,210, 347 ,213, 341 ,216, 334 ,220, 2);
        //เสื้อ
        benzierCurve(g0, 267 ,203, 273 ,218, 274 ,254, 273 ,274, 2);
        benzierCurve(g0, 273 ,274, 295 ,276, 310 ,275, 334 ,271, 2);
        benzierCurve(g0, 334 ,271, 328 ,238, 329 ,218, 335 ,199, 2);
        //ขา
        benzierCurve(g0, 268 ,290, 270 ,359, 272 ,409, 280 ,456, 2);
        benzierCurve(g0, 280 ,456, 287 ,483, 288 ,506, 288 ,506, 2);
        benzierCurve(g0, 288 ,506, 294 ,522, 304 ,520, 306 ,507, 2);
        benzierCurve(g0, 306 ,507, 302 ,492, 298 ,476, 299 ,302, 2);
        benzierCurve(g0, 295 ,299, 302 ,301, 305 ,301, 312 ,299, 2);
        benzierCurve(g0, 337 ,288, 344 ,336, 344 ,399, 330 ,467, 2);
        benzierCurve(g0, 330 ,467, 330 ,489, 344 ,500, 355 ,504, 2);
        benzierCurve(g0, 355 ,504, 359 ,506, 358 ,511, 317 ,507, 2);
        benzierCurve(g0, 317 ,507, 310 ,503, 310 ,496, 316 ,489, 2);
        benzierCurve(g0, 316 ,489, 316 ,415, 322 ,394, 309 ,301, 2);
        benzierCurve(g0, 282 ,464, 287 ,464, 292 ,464, 299 ,464, 2);
        benzierCurve(g0, 315 ,466, 315 ,466, 315 ,466, 330 ,466, 2);
    }

///////Backache///////
    else if(frame >= 21 && frame <= 30){
        //ผม
        int [] x20 = {225,234,242,246,256,261,267,279,283,287,288,266,242,};
        int [] y20 = {174,151,150,149,149,153,155,161,161,165,184,170,167,};
        g0.setColor(new Color(0,0,0));
        g0.fillPolygon(x20, y20 , 13);
        //หน้า
        int [] x21 = {225,242,266,288,287,277,257,249,235,};
        int [] y21 = {174,167,170,186,201,219,233,234,219,};
        g0.setColor(new Color(255,228,204));
        g0.fillPolygon(x21, y21 , 9);
        //คอแขน
        int [] x22 = {263,282,286,290,290,284,273,};
        int [] y22 = {229,213,215,215,227,233,234,};
        int [] x23 = {277,287,297,302,298,294,289,285,281,277,278,282,280,};
        int [] y23 = {283,274,286,359,359,349,356,372,370,361,350,336,292,};
        int [] x24 = {352,344,362,377,379,378,381,380,376,372,368,368,365,363,364,361,360,};
        int [] y24 = {224,203,201,210,248,268,281,298,297,279,278,290,290,273,242,232,221,};
        g0.setColor(new Color(255,228,204));
        g0.fillPolygon(x22, y22 , 7);
        g0.fillPolygon(x23, y23 , 13);
        g0.fillPolygon(x24, y24 , 17);
        //เสื้อ
        int [] x25 = {252,257,264,273,278,286,290,291,305,323,343,351,338,363,364,338,318,306,305,286,277,262,251,};
        int [] y25 = {235,233,230,235,235,233,227,215,210,206,204,225,231,264,284,300,306,306,298,273,282,260,243,};
        g0.setColor(new Color(101,51,1));
        g0.fillPolygon(x25, y25 , 23);
        //เกง
        int [] x26 = {306,324,347,363,366,368,370,372,377,380,380,368,362,361,336,331,336,305,303,301,275,270,270,279,282,286,294,300,302,298,301,304,};
        int [] y26 = {307,305,296,285,292,280,279,281,300,317,327,358,383,456,457,366,339,382,396,452,455,395,379,367,373,373,351,361,358,341,319,313,};
        g0.setColor(new Color(0,102,51));
        g0.fillPolygon(x26, y26 , 32);
        //เท้า
        int [] x27 = {277,301,300,255,254,253,255,276,};
        int [] y27 = {455,453,478,490,488,482,477,462,};
        int [] x28 = {337,361,361,345,327,323,323,338,};
        int [] y28 = {458,456,479,488,488,488,482,468,};
        g0.setColor(new Color(64,64,64));
        g0.fillPolygon(x27, y27 , 8);
        g0.fillPolygon(x28, y28 , 8);
 
        g0.setColor(new Color(0,0,0));
        benzierCurve(g0, 225 ,174, 239 ,160, 268 ,165, 289 ,189, 2);
        benzierCurve(g0, 225 ,174, 225 ,206, 242 ,233, 255 ,234, 2);
        benzierCurve(g0, 255 ,234, 273 ,227, 282 ,216, 289 ,189, 2);
        benzierCurve(g0, 280 ,186, 286 ,184, 287 ,194, 280 ,199, 2);
        benzierCurve(g0, 249 ,190, 253 ,187, 259 ,184, 263 ,182, 2);
        benzierCurve(g0, 242 ,190, 238 ,187, 233 ,184, 231 ,183, 2);
        g0.fillOval(235 ,194, 9, 11);
        g0.fillOval(252 ,191, 9, 11);
        benzierCurve(g0, 242 ,216, 243 ,209, 252 ,208, 258 ,215, 2);
        benzierCurve(g0, 225 ,172, 226 ,163, 226 ,154, 246 ,148, 2);
        benzierCurve(g0, 246 ,148, 246 ,148, 270 ,149, 277 ,161, 2);
        benzierCurve(g0, 277 ,161, 283 ,160, 287 ,165, 290 ,190, 2);
        //คอ แขน
        benzierCurve(g0, 282 ,210, 286 ,215, 290 ,215, 296 ,213, 2);
        benzierCurve(g0, 264 ,230, 276 ,238, 290 ,231, 290 ,215, 2);
        benzierCurve(g0, 251 ,235, 251 ,243, 256 ,252, 276 ,282, 2);
        benzierCurve(g0, 276 ,282, 280 ,296, 282 ,319, 282 ,337, 2);
        benzierCurve(g0, 282 ,337, 282 ,340, 277 ,351, 277 ,362, 2);
        benzierCurve(g0, 277 ,362, 282 ,372, 285 ,372, 286 ,367, 2);
        benzierCurve(g0, 286 ,367, 288 ,360, 290 ,354, 294 ,349, 2);
        benzierCurve(g0, 294 ,349, 296 ,354, 297 ,359, 300 ,361, 2);
        benzierCurve(g0, 300 ,361, 303 ,359, 300 ,341, 298 ,286, 2);
        benzierCurve(g0, 298 ,212, 322 ,205, 344 ,202, 359 ,200, 2);
        benzierCurve(g0, 359 ,200, 359 ,200, 375 ,209, 375 ,209, 2);
        benzierCurve(g0, 375 ,209, 379 ,241, 379 ,241, 379 ,241, 2);
        benzierCurve(g0, 379 ,241, 378 ,268, 378 ,268, 382 ,295, 2);
        benzierCurve(g0, 382 ,295, 381 ,300, 378 ,300, 373 ,284, 2);
        benzierCurve(g0, 373 ,284, 372 ,277, 369 ,277, 367 ,288, 2);
        benzierCurve(g0, 367 ,288, 368 ,292, 363 ,289, 364 ,265, 2);
        benzierCurve(g0, 364 ,265, 365 ,244, 365 ,244, 360 ,221, 2);
        benzierCurve(g0, 360 ,221, 360 ,221, 360 ,221, 330 ,234, 2);
        //เสื้อ
        benzierCurve(g0, 271 ,258, 291 ,272, 305 ,296, 305 ,306, 2);
        benzierCurve(g0, 305 ,306, 337 ,301, 352 ,293, 363 ,283, 2);
        benzierCurve(g0, 339 ,230, 349 ,242, 357 ,254, 363 ,264, 2);
        //กางเกง
        benzierCurve(g0, 305 ,306, 305 ,312, 304 ,316, 301 ,320, 2);
        benzierCurve(g0, 279 ,365, 273 ,372, 270 ,380, 270 ,388, 2);
        benzierCurve(g0, 270 ,388, 272 ,415, 275 ,440, 277 ,453, 2);
        benzierCurve(g0, 277 ,453, 276 ,460, 267 ,470, 257 ,475, 2);
        benzierCurve(g0, 257 ,475, 250 ,482, 253 ,490, 267 ,489, 2);
        benzierCurve(g0, 267 ,489, 284 ,483, 284 ,483, 293 ,481, 2);
        benzierCurve(g0, 293 ,481, 301 ,479, 301 ,467, 301 ,453, 2);
        benzierCurve(g0, 301 ,453, 302 ,429, 302 ,410, 303 ,395, 2);
        benzierCurve(g0, 303 ,395, 305 ,382, 315 ,365, 335 ,338, 2);
        benzierCurve(g0, 336 ,338, 335 ,353, 331 ,362, 331 ,413, 2);
        benzierCurve(g0, 331 ,413, 332 ,427, 334 ,445, 338 ,458, 2);
        benzierCurve(g0, 338 ,458, 338 ,467, 330 ,475, 323 ,481, 2);
        benzierCurve(g0, 323 ,481, 319 ,487, 325 ,494, 360 ,480, 2);
        benzierCurve(g0, 360 ,480, 363 ,478, 362 ,468, 362 ,391, 2);
        benzierCurve(g0, 362 ,391, 363 ,379, 363 ,379, 375 ,343, 2);
        benzierCurve(g0, 375 ,343, 379 ,331, 380 ,313, 376 ,295, 2);
        //ดีเทล
        benzierCurve(g0, 344 ,203, 347 ,210, 350 ,218, 351 ,224, 2);
        benzierCurve(g0, 276 ,281, 279 ,279, 283 ,276, 285 ,274, 2);
        benzierCurve(g0, 276 ,455, 285 ,454, 294 ,453, 301 ,453, 2);
        benzierCurve(g0, 337 ,457, 344 ,456, 354 ,456, 360 ,456, 2);

        benzierCurve(g0, 384 ,254, 387 ,250, 390 ,247, 393 ,243, 2);
        benzierCurve(g0, 393 ,243, 393 ,246, 392 ,250, 392 ,253, 2);
        benzierCurve(g0, 392 ,253, 396 ,247, 399 ,243, 403 ,239, 2);

        benzierCurve(g0, 392 ,266, 397 ,263, 401 ,261, 406 ,258, 2);
        benzierCurve(g0, 406 ,258, 404 ,262, 403 ,265, 401 ,267, 2);
        benzierCurve(g0, 401 ,267, 407 ,264, 411 ,262, 417 ,258, 2);

        benzierCurve(g0, 388 ,279, 393 ,281, 400 ,282, 404 ,283, 2);
        benzierCurve(g0, 404 ,283, 400 ,285, 396 ,286, 395 ,286, 2);
        benzierCurve(g0, 395 ,286, 401 ,290, 405 ,293, 409 ,295, 2);
    
    }

        g.drawImage(buffer0, 0, 0, null);
    

    }    
        

    
    public void plot(Graphics g,int x,int y){
        g.fillRect((int)x, (int)y, 1, 1);
    }

    public void plot2(Graphics g,int x,int y, int size){
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
    
            plot2(g, x, y, size);
        }
    }   

    public BufferedImage floodFill(BufferedImage m , int x , int y, Color targetColor,Color replacementColor){
        Graphics2D g0 = m.createGraphics();
        Queue<Point> q = new LinkedList<>();

        if(x<=0){
            return m;
        }

        if(new Color(m.getRGB(x, y)).equals(targetColor)){
            g0.setColor(replacementColor);
            plot2(g0, x, y,1);
            q.add(new Point(x,y));
        }

        while(!q.isEmpty()){
            Point p = q.poll();

            //south
            if(p.y < 600 && new Color(m.getRGB(p.x, p.y + 1)).equals(targetColor)){
                g0.setColor(replacementColor);
                plot2(g0, p.x, p.y+1,1);
                q.add(new Point(p.x,p.y+1));
            }
            //north
            if(p.y > 0 && new Color(m.getRGB(p.x, p.y - 1)).equals(targetColor)){
                g0.setColor(replacementColor);
                plot2(g0, p.x, p.y-1,1);
                q.add(new Point(p.x,p.y-1));
            }
            //east
            if(p.x < 600 && new Color(m.getRGB(p.x + 1, p.y)).equals(targetColor)){
                g0.setColor(replacementColor);
                plot2(g0, p.x +1, p.y,1);
                q.add(new Point(p.x + 1,p.y));
            }
            //west
            if(p.x > 0 && new Color(m.getRGB(p.x - 1, p.y)).equals(targetColor)){
                g0.setColor(replacementColor);
                plot2(g0, p.x-1, p.y ,1);
                q.add(new Point(p.x -1 ,p.y));
            }
        }
        return m;
    }
    
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

   
    public void midpointCircle(Graphics g,int xc , int yc,int r){
        int x = 0;
        int y = r;
        int d = 1 - r;
        int dx = 2 * x;
        int dy = 2 * y;

        while(x <= y){
            plot2(g,x + xc,y + yc ,2);
            plot2(g,-x + xc,y + yc ,2);
            plot2(g,x + xc,-y + yc ,2);
            plot2(g,-x + xc,-y + yc ,2);
            plot2(g,y + xc,x + yc ,2);
            plot2(g,-y + xc,x + yc ,2);
            plot2(g,y + xc,-x + yc ,2);
            plot2(g,-y + xc,-x + yc ,2);
          
            
            x++;
            dx += 2;
            d = d + dx + 1;

            if(d >= 0){
                y--;
                dy -= 2;
                d = d - dy;
            }
        }
    
    }
 
    public void midpointEllipse(Graphics g,int xc , int yc,int a,int b){
        int a2 = a * a;
        int b2 = b * b;
        int x ,y,d,dx,dy;
        
        //REGION1
        x = 0;
        y = b;
        d = Math.round(b2 - a2*b + a2/4);
        dx = 0;
        dy = 2 * a2 * y;

        while(dx <= dy){
            plot2(g,x + xc,y + yc ,1);
            plot2(g,-x + xc,y + yc ,1);
            plot2(g,x + xc,-y + yc ,1);
            plot2(g,-x + xc,-y + yc ,1);
           
            x++;
            dx += 2*b2;
            d = d + dx + b2;

            if(d >= 0){
                y--;
                dy -= 2*a2;
                d = d - dy;
            }
        }

        //REGION2
        x = a;
        y = 0;
        d = Math.round(a2 - b2 * a + b2 /4);
        dx = 2 * b2 * x ; dy = 0;
    
        while(dx >= dy){
            
            plot2(g,x + xc,y + yc,1 );
            plot2(g,-x + xc,y + yc,1 );
            plot2(g,x + xc,-y + yc ,1);
            plot2(g,-x + xc,-y + yc ,1);
           
            
            y++;
            dy += 2*a2;
            d = d + dy + b2;

            if(d >= 0){
                x--;
                dx -= 2*b2;
                d = d - dx;
            }
        }

        
    }
    
}


