
import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Arm
{
    
    private int shift = 0;
    
    public Arm(String side)
    {
        if (side.equals("left")) 
            shift = -75;
        if (side.equals("right"))
            shift = 75;
    }
    
    public void draw(Graphics g, int x, int y)
    {
        
        g.setColor(Color.yellow);
        g.fillRect(x + shift, y + 75, 50, 100);
        g.setColor(Color.black);
        g.drawRect(x + shift, y + 75, 50, 100);
    }
}
