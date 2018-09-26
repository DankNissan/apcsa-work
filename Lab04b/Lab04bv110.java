import java.awt.*;
import java.applet.*;


public class Lab04bv110 extends Applet
{

    public void paint(Graphics g)
    {
        // Draw CUBE
        g.drawRect(100,100,200,200);
        g.drawRect(140,140,200,200);
        g.drawLine(100,100,140,140);
        g.drawLine(300,100,340,140);
        g.drawLine(100,300,140,340);
        g.drawLine(300,300,340,340);
        
        //Draw SPHERE
        g.drawOval(120,120,200,200);
        g.drawOval(146,120,148,200);
        g.drawOval(174,120, 92,200);
        g.drawOval(200,120, 40,200);
        g.drawOval(120,146,200,148);
        g.drawOval(120,174,200, 92);
        g.drawOval(120,200,200, 40);
        
        //Draw INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(500,100,200,200);
        g.drawLine(500,200,600,300);
        g.drawLine(500,200,650,116);
        g.drawLine(650,116,600,300);
        g.drawOval(530,165, 92, 92);
        
        //Draw APCSA
        g.fillRect(100,400, 60,100);
        g.fillRect(180,400, 60,100);
        g.fillRect(260,400, 60,100);
        g.fillRect(340,400, 60,100);
        g.fillRect(420,400, 60,100);
        g.setColor(Color.white);
        g.fillRect(120,450, 20, 50);
        g.fillRect(120,415, 20, 20);
        g.fillRect(200,450, 40, 50);
        g.fillRect(200,415, 20, 20);
        g.fillRect(280,420, 40, 60);
        g.fillRect(340,460, 40, 20);
        g.fillRect(360,420, 40, 20);
        g.fillRect(440,450, 20, 50);
        g.fillRect(440,415, 20, 20);
        
        //Draw PACMEN FLOWER
        g.setColor(Color.black);
        g.fillArc(700,350, 50, 50,135,270);
        g.fillArc(732,382, 50, 50, 45,270);
        g.fillArc(700,414, 50, 50,-45,270);
        g.fillArc(668,382, 50, 50,-135,270);
    }

}


