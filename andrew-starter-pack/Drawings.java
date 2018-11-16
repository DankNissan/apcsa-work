
import java.awt.*;
import java.applet.*;
import java.util.*;

public class Drawings // 3 methods here
{
    public static void drawHeader(Graphics g)
    {
        g.setColor(Color.red);
        g.fillRect(0,0,800,50);
    }
    public static void drawGround(Graphics g)
    {
        g.setColor(Color.black);
        g.fillRect(0,550,800,50);
    }
}
