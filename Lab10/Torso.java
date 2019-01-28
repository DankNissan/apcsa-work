
import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Torso
{
    public Torso()
    {
    }
    
    public void draw(Graphics g, int x, int y)
    {        
        
        g.setColor(Color.blue);
        g.fillRect(x - 25, y + 75, 100, 100);
        g.setColor(Color.black);
        g.drawRect(x - 25, y + 75, 100, 100);
    }
}
