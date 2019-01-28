
import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Head
{
    public Head()
    {   
    }
    
    public void draw(Graphics g, int x, int y)
    {
        
        g.setColor(Color.yellow);
        g.fillRect(x, y + 15, 50, 60);
        g.setColor(Color.black);
        g.drawRect(x, y + 15, 50, 60);
    }
}
