
import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Leg
{
    
    private int shift = 0;
    
    public Leg(String side)
    {
        
        if (side.equals("left")) 
            shift = -25;
        if (side.equals("right"))
            shift = 25;
            
    }
    
    public void draw(Graphics g, int x, int y)
    {
        
        g.setColor(Color.green);
        g.fillRect(x + shift, y + 175, 50, 100);
        g.setColor(Color.black);
        g.drawRect(x + shift, y + 175, 50, 100);
    }
    
}
