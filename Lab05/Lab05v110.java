// Lab05vst.java
// This is the student, starting version of the Lab05 assignment.


import java.awt.*;
import java.applet.*;


public class Lab05v110 extends Applet
{
	public void paint(Graphics g)
	{
		g.drawRect(10,10,980,630);
		g.drawRect(254,166,492,317);
		for (int k = 0; k <= 50; k++)
		{
		    g.drawLine(k * 19 + 10, 640, 990, 640 - 12 * k);
		    g.drawLine(1000 - (k * 19 + 10), 640, 10, 640 - 12 * k);
		    g.drawLine(k * 19 + 10, 10, 990, 10 + 12 * k);
		    g.drawLine(1000 - (k * 19 + 10), 10, 10, 10 + 12 * k);
		    g.drawLine(254 + k * 10, 483, 254, 166 + k * 6);
		    g.drawLine(254 + k * 10, 166, 254, 483 - k * 6);
		    g.drawLine(746 - k * 10, 166, 746, 483 - k * 6);
		    g.drawLine(746 - k * 10, 483, 746, 166 + k * 6);
		  }
		g.drawString("Moth memes are dead @kate", 500, 325);
	}
}

