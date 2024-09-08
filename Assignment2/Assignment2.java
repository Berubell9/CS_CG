import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;
import java.util.concurrent.TimeUnit;


class Assignment2_64050051_64050122 extends JPanel implements Runnable{
///////////////////
    double Move1 = 0;
    double velocityBackGround = 10.0;
    
    double Move2 = 0;
    double velocityGround = 30.0;

    double cloudMove = 0;
    double velocityCloud = 20.0;

    double frame = 0;
    double framePerSec = 30.0;

    double sun = 0;
    double sunMove = 5.0;
    
    public static void main(String[] args) {
        Assignment2_64050051_64050122 m = new Assignment2_64050051_64050122();

        JFrame f = new JFrame();
        f.add(m);
        f.setTitle("kirbo");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        (new Thread(m)).start();
    }

    public void run(){

        double lastTime = System.currentTimeMillis();
        double currentTime ,  elapsedTime;

        while(true){
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;
            lastTime = System.currentTimeMillis();
       
        
            Move1 -= velocityBackGround * elapsedTime / 1000.0;
            
            Move2 -= velocityGround * elapsedTime / 1000.0;
            if(Move2 <= -3200){
                Move2 = 0;
            }
            
            cloudMove -= velocityCloud * elapsedTime / 1000.0;
            
            frame += framePerSec * elapsedTime / 1000.0;
            if(frame >= 40){
                System.out.println(frame);
                frame = 0;
                
            }
            
            sun += sunMove * elapsedTime / 1000.0;
            
            if(sun >= 10){
                sun = 10;
                sunMove = -sunMove;
            }
            if(sun <= 0){
                sun = 0;
                sunMove = -sunMove;
            }
            repaint();
        }

        
    }


    public void paintComponent(Graphics g){
        BufferedImage buffer0 = new BufferedImage(2001,601,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = buffer0.createGraphics();
       
         
        g2.setColor(new Color(255,255,255,0));
        g2.fillRect(0, 0, 2000, 600);
        
        g2.setColor(new Color(96,183,255));
        
        ///////back////////////////////
        benzierCurve(g2,0+(int)Move1,330,0+(int)Move1,330,195+(int)Move1,330,210+(int)Move1,325,1);
        benzierCurve(g2,210+(int)Move1,325,230+(int)Move1,315,220+(int)Move1,280,340+(int)Move1,280,1);
        benzierCurve(g2,340+(int)Move1,280,485+(int)Move1,280,445+(int)Move1,285,475+(int)Move1,320,1);
        benzierCurve(g2,475+(int)Move1,320,475+(int)Move1,320,885+(int)Move1,335,895+(int)Move1,320,1);
        benzierCurve(g2,895+(int)Move1,320,905+(int)Move1,310,940+(int)Move1,275,1065+(int)Move1,275,1);
        benzierCurve(g2,1065+(int)Move1,275,1210+(int)Move1,270,1325+(int)Move1,265,1410+(int)Move1,325,1);
        benzierCurve(g2,1410+(int)Move1,325,1410+(int)Move1,325,1680+(int)Move1,330,1680+(int)Move1,330,1);
        benzierCurve(g2,1680+(int)Move1,330,1680+(int)Move1,330,1750+(int)Move1,295,1790+(int)Move1,295,1);
        benzierCurve(g2,1790+(int)Move1,295,1830+(int)Move1,295,1915+(int)Move1,325,1960+(int)Move1,330,1);
       // benzierCurve(g2,1960+(int)Move,330,1960+(int)Move,330,2000+(int)Move,330,2500+(int)Move,330,1);
        g2.drawLine(1960+(int)Move1,330,2500+(int)Move1,330);
        g2.drawLine(0, 350, 2000, 350);
        buffer0 = floodFill(buffer0,720,360,Color.BLACK,new Color(150,194,185));
        buffer0 = floodFill(buffer0,300,335,Color.BLACK,new Color(67,146,224));
        buffer0 = floodFill(buffer0,340,220,Color.BLACK,new Color(96,183,255));
        
        
        g.drawImage(buffer0, 0, 0, null);

        //////////back Object//////////////
        BufferedImage buffer4 = new BufferedImage(2001,601,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g5 = buffer4.createGraphics();

       
        g5.setColor(new Color(255,255, 255, 0));
        g5.fillRect(0, 0, 2000, 600);
        g5.setColor(new Color(41,142,161));
        benzierCurve(g5,0+(int)Move1,180,0+(int)Move1,180,150+(int)Move1,180,150+(int)Move1,350,1);
        benzierCurve(g5,0+(int)Move1,210,0+(int)Move1,210,120+(int)Move1,205,120+(int)Move1,350,1);
        benzierCurve(g5,0+(int)Move1,245,0+(int)Move1,245,80+(int)Move1,240,80+(int)Move1,350,1);
        benzierCurve(g5,10+(int)Move1,245,10+(int)Move1,245,65+(int)Move1,265,70+(int)Move1,350,1);
        g5.drawLine(65+(int)Move1,350, 150+(int)Move1,350);
        g5.drawLine(0+(int)Move1,180, 0+(int)Move1,245);
        benzierCurve(g5,480+(int)Move1,350,480+(int)Move1,350,515+(int)Move1,180,680+(int)Move1,185,1);
        benzierCurve(g5,680+(int)Move1,185,850+(int)Move1,190,835+(int)Move1,335,835+(int)Move1,350,1);
        g5.drawLine(65+(int)Move1,350, 835+(int)Move1,350);
        benzierCurve(g5,500+(int)Move1,350,500+(int)Move1,350,545+(int)Move1,225,630+(int)Move1,190,1);
        benzierCurve(g5,525+(int)Move1,350,525+(int)Move1,350,565+(int)Move1,200,670+(int)Move1,205,1);
        benzierCurve(g5,670+(int)Move1,205,790+(int)Move1,205,805+(int)Move1,270,820+(int)Move1,350,1);
        benzierCurve(g5,570+(int)Move1,350,570+(int)Move1,350,565+(int)Move1,240,675+(int)Move1,245,1);

        benzierCurve(g5,675+(int)Move1,245,785+(int)Move1,245,780+(int)Move1,335,785+(int)Move1,350,1);
        benzierCurve(g5,680+(int)Move1,245,730+(int)Move1,245,760+(int)Move1,295,765+(int)Move1,350,1);

        buffer4 = floodFill(buffer4,147+(int)Move1,347,Color.BLACK,new Color(41,142,161));
        buffer4 = floodFill(buffer4,117+(int)Move1,347,Color.BLACK,new Color(135,167,167));
        buffer4 = floodFill(buffer4,77+(int)Move1,347,Color.BLACK,new Color(81,131,147));

        buffer4 = floodFill(buffer4,834+(int)Move1,347,Color.BLACK,new Color(41,142,161));
        buffer4 = floodFill(buffer4,818+(int)Move1,347,Color.BLACK,new Color(137,168,166));
        buffer4 = floodFill(buffer4,783+(int)Move1,347,Color.BLACK,new Color(81,131,147));
        buffer4 = floodFill(buffer4,592+(int)Move1,211,Color.BLACK,new Color(67,194,159));

        benzierCurve(g5,480+(int)Move1+700,350,480+(int)Move1+700,350,515+(int)Move1+700,180,680+(int)Move1+700,185,1);
        benzierCurve(g5,680+(int)Move1+700,185,850+(int)Move1+700,190,835+(int)Move1+700,335,835+(int)Move1+700,350,1);
        g5.drawLine(65+(int)Move1+700,350, 835+(int)Move1+700,350);
        benzierCurve(g5,500+(int)Move1+700,350,500+(int)Move1+700,350,545+(int)Move1+700,225,630+(int)Move1+700,190,1);
        benzierCurve(g5,525+(int)Move1+700,350,525+(int)Move1+700,350,565+(int)Move1+700,200,670+(int)Move1+700,205,1);
        benzierCurve(g5,670+(int)Move1+700,205,790+(int)Move1+700,205,805+(int)Move1+700,270,820+(int)Move1+700,350,1);
        benzierCurve(g5,570+(int)Move1+700,350,570+(int)Move1+700,350,565+(int)Move1+700,240,675+(int)Move1+700,245,1);

        benzierCurve(g5,675+(int)Move1+700,245,785+(int)Move1+700,245,780+(int)Move1+700,335,785+(int)Move1+700,350,1);
        benzierCurve(g5,680+(int)Move1+700,245,730+(int)Move1+700,245,760+(int)Move1+700,295,765+(int)Move1+700,350,1);
        buffer4 = floodFill(buffer4,834+(int)Move1+700,347,Color.BLACK,new Color(41,142,161));
        buffer4 = floodFill(buffer4,818+(int)Move1+700,347,Color.BLACK,new Color(137,168,166));
        buffer4 = floodFill(buffer4,783+(int)Move1+700,347,Color.BLACK,new Color(81,131,147));
        buffer4 = floodFill(buffer4,592+(int)Move1+700,211,Color.BLACK,new Color(67,194,159));

        g.drawImage(buffer4, 0, 0, null);

        ////////////cloud//////////////
        BufferedImage buffer1 = new BufferedImage(2001,601,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g1 = buffer1.createGraphics();
       
        g1.setColor(new Color(255,255, 255, 0));
        g1.fillRect(0, 0, 2000, 600);
        ///////////////sun////////////////
        g1.setColor(new Color(253, 169, 61));
        g1.fillOval(360, 45+(int)sun, 170, 170);
        g1.setColor(Color.black);
        benzierCurve(g1, 395, 82+(int)sun,  395, 82+(int)sun,415, 115+(int)sun,415, 115+(int)sun, 3);
        benzierCurve(g1, 415, 115+(int)sun,  415, 115+(int)sun,445, 84+(int)sun,445, 84+(int)sun, 3);
        benzierCurve(g1, 394, 140+(int)sun,  394, 140+(int)sun,413, 111+(int)sun,445, 145+(int)sun, 3);
        g1.fillOval(392, 109+(int)sun, 10, 10);
        g1.fillOval(432, 110+(int)sun, 10, 10);

        g1.setColor(new Color(247,247,247));
        g1.fillOval(60+(int)cloudMove, 40, 180, 120);
        g1.fillOval(165+(int)cloudMove, 5, 400, 180);
        g1.fillOval(490+(int)cloudMove, 40, 180, 120);

        g1.fillOval(890+(int)cloudMove, 80, 265, 100);
        g1.fillOval(990+(int)cloudMove, 30, 265, 100);
        g1.fillOval(1100+(int)cloudMove, 90, 265, 100);
       
        g1.fillOval(1710+(int)cloudMove, 80, 260, 65);
        g1.fillOval(1840+(int)cloudMove, 40, 260, 65);
        g1.fillOval(1960+(int)cloudMove, 80, 260, 65);
     
        g.drawImage(buffer1, 0, 0, null);
        
        
        ///////////background object////////////
        BufferedImage buffer3 = new BufferedImage(4000,601,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g4 = buffer3.createGraphics();
        g4.setColor(new Color(255,255, 255, 0));
        g4.fillRect(0, 0, 4000, 600);
        
        g4.setColor(new Color(59,165,83));
        benzierCurve(g4,560+(int)Move2,400,560+(int)Move2,400,620+(int)Move2,180,820+(int)Move2,180,1);
        benzierCurve(g4,820+(int)Move2,180,1000+(int)Move2,180,1040+(int)Move2,400,1040+(int)Move2,400,1);
        g4.setColor(new Color(229,206,163));
        benzierCurve(g4,680+(int)Move2,400,680+(int)Move2,400,720+(int)Move2,280,800+(int)Move2,280,1);
        benzierCurve(g4,800+(int)Move2,280,880+(int)Move2,280,930+(int)Move2,375,930+(int)Move2,400,1);
        g4.setColor(new Color(59,165,83));
        benzierCurve(g4,590+(int)Move2,400,590+(int)Move2,400,610+(int)Move2,260,732+(int)Move2,197,1);
        benzierCurve(g4,625+(int)Move2,400,625+(int)Move2,400,660+(int)Move2,380,665+(int)Move2,325,1);
        benzierCurve(g4,665+(int)Move2,325,655+(int)Move2,300,695+(int)Move2,275,745+(int)Move2,260,1);
        benzierCurve(g4,745+(int)Move2,260,790+(int)Move2,240,795+(int)Move2,210,860+(int)Move2,250,1);
        benzierCurve(g4,860+(int)Move2,250,860+(int)Move2,250,950+(int)Move2,235,940+(int)Move2,320,1);
        benzierCurve(g4,940+(int)Move2,320,940+(int)Move2,320,1000+(int)Move2,380,995+(int)Move2,400,1);
       
        g4.setColor(new Color(215,177,145));  
        benzierCurve(g4,885+(int)Move2,400,885+(int)Move2,400,825+(int)Move2,295,768+(int)Move2,287,1);
        g4.drawLine(560+(int)Move2,400, 1040+(int)Move2,400);
        
        buffer3 = floodFill(buffer3,706+(int)Move2,210,Color.BLACK,new Color(59,165,83));
        buffer3 = floodFill(buffer3,1038+(int)Move2,398,Color.BLACK,new Color(63,138,76));
        buffer3 = floodFill(buffer3,993+(int)Move2,398,Color.BLACK,new Color(229,206,163));
        buffer3 = floodFill(buffer3,923+(int)Move2,398,Color.BLACK,new Color(215,177,145));

        g4.setColor(new Color(59,165,83));
        benzierCurve(g4,560+(int)Move2+1000,400,560+(int)Move2+1000,400,620+(int)Move2+1000,180,820+(int)Move2+1000,180,1);
        benzierCurve(g4,820+(int)Move2+1000,180,1000+(int)Move2+1000,180,1040+(int)Move2+1000,400,1040+(int)Move2+1000,400,1);
        g4.setColor(new Color(229,206,163));
        benzierCurve(g4,680+(int)Move2+1000,400,680+(int)Move2+1000,400,720+(int)Move2+1000,280,800+(int)Move2+1000,280,1);
        benzierCurve(g4,800+(int)Move2+1000,280,880+(int)Move2+1000,280,930+(int)Move2+1000,375,930+(int)Move2+1000,400,1);
        g4.setColor(new Color(59,165,83));
        benzierCurve(g4,590+(int)Move2+1000,400,590+(int)Move2+1000,400,610+(int)Move2+1000,260,732+(int)Move2+1000,197,1);
        benzierCurve(g4,625+(int)Move2+1000,400,625+(int)Move2+1000,400,660+(int)Move2+1000,380,665+(int)Move2+1000,325,1);
        benzierCurve(g4,665+(int)Move2+1000,325,655+(int)Move2+1000,300,695+(int)Move2+1000,275,745+(int)Move2+1000,260,1);
        benzierCurve(g4,745+(int)Move2+1000,260,790+(int)Move2+1000,240,795+(int)Move2+1000,210,860+(int)Move2+1000,250,1);
        benzierCurve(g4,860+(int)Move2+1000,250,860+(int)Move2+1000,250,950+(int)Move2+1000,235,940+(int)Move2+1000,320,1);
        benzierCurve(g4,940+(int)Move2+1000,320,940+(int)Move2+1000,320,1000+(int)Move2+1000,380,995+(int)Move2+1000,400,1);
        g4.setColor(new Color(215,177,145));  
        benzierCurve(g4,885+(int)Move2+1000,400,885+(int)Move2+1000,400,825+(int)Move2+1000,295,768+(int)Move2+1000,287,1);
        g4.drawLine(560+(int)Move2+1000,400, 1040+(int)Move2+1000,400);
        
        buffer3 = floodFill(buffer3,706+(int)Move2+1000,210,Color.BLACK,new Color(59,165,83));
        buffer3 = floodFill(buffer3,1038+(int)Move2+1000,398,Color.BLACK,new Color(63,138,76));
        buffer3 = floodFill(buffer3,993+(int)Move2+1000,398,Color.BLACK,new Color(229,206,163));
        buffer3 = floodFill(buffer3,923+(int)Move2+1000,398,Color.BLACK,new Color(215,177,145));

        g4.setColor(new Color(59,165,83));
        benzierCurve(g4,560+(int)Move2+2200,400,560+(int)Move2+2200,400,620+(int)Move2+2200,180,820+(int)Move2+2200,180,1);
        benzierCurve(g4,820+(int)Move2+2200,180,1000+(int)Move2+2200,180,1040+(int)Move2+2200,400,1040+(int)Move2+2200,400,1);
        g4.setColor(new Color(229,206,163));
        benzierCurve(g4,680+(int)Move2+2200,400,680+(int)Move2+2200,400,720+(int)Move2+2200,280,800+(int)Move2+2200,280,1);
        benzierCurve(g4,800+(int)Move2+2200,280,880+(int)Move2+2200,280,930+(int)Move2+2200,375,930+(int)Move2+2200,400,1);
        g4.setColor(new Color(59,165,83));
        benzierCurve(g4,590+(int)Move2+2200,400,590+(int)Move2+2200,400,610+(int)Move2+2200,260,732+(int)Move2+2200,197,1);
        benzierCurve(g4,625+(int)Move2+2200,400,625+(int)Move2+2200,400,660+(int)Move2+2200,380,665+(int)Move2+2200,325,1);
        benzierCurve(g4,665+(int)Move2+2200,325,655+(int)Move2+2200,300,695+(int)Move2+2200,275,745+(int)Move2+2200,260,1);
        benzierCurve(g4,745+(int)Move2+2200,260,790+(int)Move2+2200,240,795+(int)Move2+2200,210,860+(int)Move2+2200,250,1);
        benzierCurve(g4,860+(int)Move2+2200,250,860+(int)Move2+2200,250,950+(int)Move2+2200,235,940+(int)Move2+2200,320,1);
        benzierCurve(g4,940+(int)Move2+2200,320,940+(int)Move2+2200,320,1000+(int)Move2+2200,380,995+(int)Move2+2200,400,1);
       
        g4.setColor(new Color(215,177,145));  
        benzierCurve(g4,885+(int)Move2+2200,400,885+(int)Move2+2200,400,825+(int)Move2+2200,295,768+(int)Move2+2200,287,1);
        g4.drawLine(560+(int)Move2+2200,400, 1040+(int)Move2+2200,400);
        
        buffer3 = floodFill(buffer3,706+(int)Move2+2200,210,Color.BLACK,new Color(59,165,83));
        buffer3 = floodFill(buffer3,1038+(int)Move2+2200,398,Color.BLACK,new Color(63,138,76));
        buffer3 = floodFill(buffer3,993+(int)Move2+2200,398,Color.BLACK,new Color(229,206,163));
        buffer3 = floodFill(buffer3,923+(int)Move2+2200,398,Color.BLACK,new Color(215,177,145));

        
        g.drawImage(buffer3, 0, 0, null);
        
        
        
        
        /////////ground
        BufferedImage buffer2 = new BufferedImage(2001,601,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g3 = buffer2.createGraphics();

        g3.setColor(new Color(255,255, 255, 0));
        g3.fillRect(0, 0, 4000, 600);

        g3.setColor(new Color(66,172,76));
        benzierCurve(g3,0+(int)Move2,520,0+(int)Move2,520,150+(int)Move2,530,300+(int)Move2,530,1);
        benzierCurve(g3,300+(int)Move2,530,445+(int)Move2,525,675+(int)Move2,510,760+(int)Move2,515,1);
        benzierCurve(g3,760+(int)Move2,515,845+(int)Move2,515,1170+(int)Move2,535,1220+(int)Move2,530,1);
        benzierCurve(g3,1220+(int)Move2,530,1265+(int)Move2,535,1625+(int)Move2,510,1695+(int)Move2,510,1);
        benzierCurve(g3,1695+(int)Move2,510,1765+(int)Move2,515,1980+(int)Move2,535,2000+(int)Move2,535,1);
        benzierCurve(g3,2000+(int)Move2,535,2000+(int)Move2,535,2500+(int)Move2,495,2600+(int)Move2,505,1);
        benzierCurve(g3,2600+(int)Move2,505,2700+(int)Move2,510,2980+(int)Move2,530,3000+(int)Move2,525,1);
        benzierCurve(g3,3000+(int)Move2,525,3000+(int)Move2,525,3440+(int)Move2,490,3590+(int)Move2,510,1);
        benzierCurve(g3,3590+(int)Move2,510,3745+(int)Move2,520,4005+(int)Move2,515,4015+(int)Move2,515,1);
        g3.setColor(new Color(182,138,61));
        g3.drawLine(0, 440, 4000, 440);
        g3.setColor(new Color(77,181,78));
        benzierCurve(g3,0+(int)Move2,400,0+(int)Move2,400,200+(int)Move2,365,345+(int)Move2,365,1);
        benzierCurve(g3,345+(int)Move2,365,485+(int)Move2,365,650+(int)Move2,395,815+(int)Move2,395,1);
        benzierCurve(g3,815+(int)Move2,395,980+(int)Move2,400,1100+(int)Move2,360,1290+(int)Move2,360,1);
        benzierCurve(g3,1290+(int)Move2,360,1480+(int)Move2,365,1610+(int)Move2,395,1765+(int)Move2,390,1);
        benzierCurve(g3,1765+(int)Move2,390,1920+(int)Move2,390,2000+(int)Move2,370,2000+(int)Move2,370, 1);
        benzierCurve(g3,2000+(int)Move2,370,2000+(int)Move2,370,2235+(int)Move2,355,2435+(int)Move2,385,1);
        benzierCurve(g3,2435+(int)Move2,385,2435+(int)Move2,385,2695+(int)Move2,405,2830+(int)Move2,380,1);
        benzierCurve(g3,2830+(int)Move2,380,2830+(int)Move2,380,2930+(int)Move2,365,3000+(int)Move2,370,1);
        benzierCurve(g3,3000+(int)Move2,370,3000+(int)Move2,370,3240+(int)Move2,365,3470+(int)Move2,390,1);
        benzierCurve(g3,3470+(int)Move2,390,3490+(int)Move2,400,4000+(int)Move2,350,4015+(int)Move2,375,1);
        
        buffer2 = floodFill(buffer2,300,580,Color.BLACK,new Color(66,172,76));
        buffer2 = floodFill(buffer2,300,410,Color.BLACK,new Color(77,181,78));
        buffer2 = floodFill(buffer2,300,460,Color.BLACK,new Color(182,138,61));

        g.drawImage(buffer2, 0, 0, null);

        //////kirby////////

        BufferedImage buffer5 = new BufferedImage(2001,601,BufferedImage.TYPE_INT_ARGB);
        Graphics2D g6 = buffer5.createGraphics();

        g6.setColor(new Color(255,255, 255, 0));
        g6.fillRect(0, 0, 600, 600);
        /////////////////frame 1////////////////////
        g6.setColor(new Color(38, 38, 38));

        
        if(frame >= 0 && frame <= 10){
            /////////////////frame 1////////////////////
            midpointCircle(g6,304,400,70);
            benzierCurve(g6,260,395,260,395,238,420,258,420,1);
            benzierCurve(g6,258,420,278,422,277,397,277,397,1);
            benzierCurve(g6,250,445,250,445,236,478,270,485,1);
            benzierCurve(g6,270,485,305,492,324,481,301,470,1);
            benzierCurve(g6,310,469,310,469,382,472,378,437,1);
            benzierCurve(g6,378,437,376,433,377,426,368,429,1);
            benzierCurve(g6,324,396,327,405,341,402,338,390,1);
            benzierCurve(g6,338,390,338,390,337,395,342,396,1);
            benzierCurve(g6,324,396,324,396,327,400,321,406,1);

            g6.setColor(new Color(231, 92, 122));
            midpointEllipse(g6,314,398,5,3);
            midpointEllipse(g6,347,390,5,3);
            buffer5 = floodFill(buffer5, 347, 390, Color.BLACK, new Color(231, 92, 122));
            buffer5 = floodFill(buffer5, 314, 398, Color.BLACK, new Color(231, 92, 122));

            buffer5 = floodFill(buffer5, 300, 410, Color.BLACK, new Color(254, 192, 214));
            buffer5 = floodFill(buffer5, 270, 470, Color.BLACK, new Color(253, 28, 69));
            buffer5 = floodFill(buffer5, 360, 445, Color.BLACK, new Color(253, 28, 69));
        }else if(frame >= 11 && frame <= 20){
            /////////////////frame 2/////////////////
            midpointCircle(g6,300,410,70);
            benzierCurve(g6,289,372,289,372,312,344,331,367,1);
            benzierCurve(g6,331,367,331,367,346,385,305,402,1);
            benzierCurve(g6,233,429,233,429,213,440,228,460,1);
            benzierCurve(g6,228,460,243,480,277,487,276,474,1);
            benzierCurve(g6,344,464,344,464,389,454,390,406,1);
            benzierCurve(g6,390,406,390,406,391,390,370,400,1);
            benzierCurve(g6,338,405,339,417,354,405,352,397,1);
            benzierCurve(g6,352,397,352,397,352,404,356,404,1);
            benzierCurve(g6,338,405,338,405,341,409,337,412,1);
                
            g6.setColor(new Color(231, 92, 122));
            midpointEllipse(g6,330,408,5,3);
            midpointEllipse(g6,359,399,5,3);
            buffer5 = floodFill(buffer5, 330,408, Color.BLACK, new Color(231, 92, 122));
            buffer5 = floodFill(buffer5, 359,399, Color.BLACK, new Color(231, 92, 122));

            buffer5 = floodFill(buffer5, 300, 410, Color.BLACK, new Color(254, 192, 214));
            buffer5 = floodFill(buffer5, 375, 425, Color.BLACK, new Color(253, 28, 69));
            buffer5 = floodFill(buffer5, 244, 458, Color.BLACK, new Color(253, 28, 69));
        }else if(frame >= 21 && frame <= 30){
                ////////////////////frame 3/////////////
            midpointCircle(g6,300,400,70);
            benzierCurve(g6,251,395,251,395,238,422,258,422,1);
            benzierCurve(g6,258,422,280,422,279,400,278,399,1);
            benzierCurve(g6,246,442,246,442,228,453,263,472,1);
            benzierCurve(g6,263,472,290,491,327,479,320,468,1);
            benzierCurve(g6,306,482,306,484,350,495,356,478,1);
            benzierCurve(g6,356,478,356,478,352,466,331,474,1);
            benzierCurve(g6,331,474,331,474,348,464,346,451,1);
            benzierCurve(g6,327,398,331,408,344,400,341,391,1);
            benzierCurve(g6,341,391,341,391,341,398,345,398,1);
            benzierCurve(g6,327,398,327,398,329,402,327,404,1);

            g6.setColor(new Color(231, 92, 122));
            midpointEllipse(g6,317,399,5,3);
            midpointEllipse(g6,350,393,5,3);
            buffer5 = floodFill(buffer5, 350,393, Color.BLACK, new Color(231, 92, 122));
            buffer5 = floodFill(buffer5, 317,399, Color.BLACK, new Color(231, 92, 122));

            buffer5 = floodFill(buffer5, 300, 410, Color.BLACK, new Color(254, 192, 214));
            buffer5 = floodFill(buffer5, 280, 470, Color.BLACK, new Color(253, 28, 69));
            buffer5 = floodFill(buffer5, 330, 465, Color.BLACK, new Color(253, 28, 69));
        }else if(frame >= 31 && frame <= 45){
                //////////////frame4////////////////////
            midpointCircle(g6,300,410,70);
            benzierCurve(g6,235,411,210,411,201,457,240,440,1);
            benzierCurve(g6,355,365,365,354,412,372,370,396,1);
            benzierCurve(g6,268,471,262,452,332,416,351,438,1);
            benzierCurve(g6,351,438,370,462,278,492,269,471,1);
            benzierCurve(g6,277,476,273,494,356,490,337,464,1);
            benzierCurve(g6,320,410,320,417,338,415,334,402,1);
            benzierCurve(g6,334,402,334,402,332,409,339,409,1);
            benzierCurve(g6,320,410,320,410,324,414,319,416,1);

            g6.setColor(new Color(231, 92, 122));
            midpointEllipse(g6,312,412,5,3);
            midpointEllipse(g6,342,403,5,3);
            buffer5 = floodFill(buffer5, 312,412, Color.BLACK, new Color(231, 92, 122));
            buffer5 = floodFill(buffer5, 342,403, Color.BLACK, new Color(231, 92, 122));

            buffer5 = floodFill(buffer5, 300, 410, Color.BLACK, new Color(254, 192, 214));
            buffer5 = floodFill(buffer5, 375, 375, Color.BLACK, new Color(254, 192, 214));
            buffer5 = floodFill(buffer5, 225, 430, Color.BLACK, new Color(254, 192, 214));
                
            buffer5 = floodFill(buffer5, 310, 456, Color.BLACK, new Color(253, 28, 69));
            buffer5 = floodFill(buffer5, 312, 475, Color.BLACK, new Color(254, 192, 214));
            buffer5 = floodFill(buffer5, 312, 480, Color.BLACK, new Color(253, 28, 69));
        }
      
        // try {
        //     TimeUnit.MILLISECONDS.sleep(300);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }    

        g.drawImage(buffer5, 0, 0, null);
         
    }

    
    public void plot(Graphics g,int x,int y){
        g.fillRect((int)x, (int)y, 1, 1);
    }

    public void plot2(Graphics g,int x,int y, int size){
        g.fillRect(x, y, size, size);
    }

    public void naiveLine(Graphics g, int x1 , int y1 , int x2 , int y2){
        double dx = x2 - x1;
        double dy = y2 - y1;

        double m = dy / dx;
        double b = y1 - m  * x1;

        for(int x = x1 ; x <= x2; x++){
            int y = (int)Math.round(m * x + b);
            plot(g, x, y);
        }
    }

    
    public void ddaLine(Graphics g,int x1 , int y1 ,int x2,int y2){
        double dx = x2 - x1;
        double dy = y2 - y1;

        double m = dy / dx;
        double x, y;
       
        if(m <= 1 && m >= 0)
        {
            y = Math.min(y1, y2);
            for(x = Math.min(x1, x2); x <= Math.max(x1, x2); x++){
                y += m;
                plot(g, (int)x, (int)y);
            }
        }else if(m >= -1 && m < 0)
        {
            y = Math.max(y1, y2);
            for(x = Math.max(x1, x2); x >= Math.min(x1, x2); x--){
                y += m;
                plot(g, (int)x, (int)y);
            }
        }else if(m > 1)
        {
            x = Math.min(x1, x2);
            for(y = Math.min(y1, y2); y <= Math.max(y1, y2); y++){
                x += 1/m;
                plot(g, (int)x, (int)y);
            }
        }else
        {
            x = Math.max(x1, x2);
            for(y = Math.max(y1, y2); y >= Math.min(y1, y2); y--){
                x += 1/m;
                plot(g, (int)x, (int)y);
            }
        }
    }


    public void besenhemLine(Graphics g,int x1 , int y1 ,int x2,int y2){
        double dx = Math.abs(x2 - x1);
        double dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;
        boolean isSwap = false;

        if(dy > dx){
            swap(dx, dy);
            isSwap = true;
        }

        double D = 2 * dy - dx;

        int x = x1;
        int y = y1;

        for(int i = 1; i <= dx; i++){
            plot(g, x, y);

            if(D >= 0){
                if(isSwap) x += sx;
                else y += sy;

                D -= 2 * dx;
            }

            if(isSwap) y += sy;
            else x += sx;

            D += 2 * dy;
        }

    }

    public void swap(double dx, double dy){
        double temp = dx;
        dx = dy;
        dy = temp;
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
        Graphics2D g2 = m.createGraphics();
        Queue<Point> q = new LinkedList<>();

        if(x<=0){
            return m;
        }

        if(new Color(m.getRGB(x, y)).equals(targetColor)){
            g2.setColor(replacementColor);
            plot2(g2, x, y,1);
            q.add(new Point(x,y));
        }

        while(!q.isEmpty()){
            Point p = q.poll();

            //south
            if(p.y < 600 && new Color(m.getRGB(p.x, p.y + 1)).equals(targetColor)){
                g2.setColor(replacementColor);
                plot2(g2, p.x, p.y+1,1);
                q.add(new Point(p.x,p.y+1));
            }
            //north
            if(p.y > 0 && new Color(m.getRGB(p.x, p.y - 1)).equals(targetColor)){
                g2.setColor(replacementColor);
                plot2(g2, p.x, p.y-1,1);
                q.add(new Point(p.x,p.y-1));
            }
            //east
            if(p.x < 600 && new Color(m.getRGB(p.x + 1, p.y)).equals(targetColor)){
                g2.setColor(replacementColor);
                plot2(g2, p.x +1, p.y,1);
                q.add(new Point(p.x + 1,p.y));
            }
            //west
            if(p.x > 0 && new Color(m.getRGB(p.x - 1, p.y)).equals(targetColor)){
                g2.setColor(replacementColor);
                plot2(g2, p.x-1, p.y ,1);
                q.add(new Point(p.x -1 ,p.y));
            }
        }
        return m;
    }
    
   
    public void midpointCircle(Graphics g,int xc , int yc,int r){
        int x = 0;
        int y = r;
        int d = 1 - r;
        int dx = 2 * x;
        int dy = 2 * y;

        while(x <= y){
            plot2(g,x + xc,y + yc ,1);
            plot2(g,-x + xc,y + yc ,1);
            plot2(g,x + xc,-y + yc ,1);
            plot2(g,-x + xc,-y + yc ,1);
            plot2(g,y + xc,x + yc ,1);
            plot2(g,-y + xc,x + yc ,1);
            plot2(g,y + xc,-x + yc ,1);
            plot2(g,-y + xc,-x + yc ,1);
          
            
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


