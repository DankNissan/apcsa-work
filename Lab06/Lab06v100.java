// Lab06v100.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*; 
                                                                

public class Lab06v100 extends Applet
{
    
    public void paint(Graphics g)   
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);
        
        
        // Draw Random Lines
        for (int x = 0; x < 100; x++) {
            g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            g.drawLine((int) (Math.random() * 391 + 10), (int) (Math.random() * 291 + 10), (int) (Math.random() * 391 + 10), (int) (Math.random() * 291 + 10));
        }

                
        
        // Draw Random Squares
        for (int x = 0; x < 100; x++) {
            g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            g.fillRect((int) (Math.random() * 341 + 400), (int) (Math.random() * 241 + 10), 50, 50);
        }


        
        // Draw Random Circles
        for (int x = 0; x < 100; x++) {
            int diameter = (int) (Math.random() * 201);
            g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            g.drawOval((int) (Math.random() * (391 - diameter) + 10), (int) (Math.random() * (291 - diameter) + 300), diameter, diameter);
            
        }


        
        // Draw 3-D Box
        g.setColor(Color.red);
        Polygon square = new Polygon();
        square.addPoint(500, 400);
        square.addPoint(500, 500);
        square.addPoint(600, 500);
        square.addPoint(600, 400);
        g.fillPolygon(square);
        g.setColor(Color.blue);
        Polygon triangle = new Polygon();
        triangle.addPoint(550, 400);
        triangle.addPoint(600, 400);
        triangle.addPoint(550, 350);
        g.fillPolygon(triangle);
        g.setColor(Color.yellow);
        Polygon trapezium = new Polygon();
        trapezium.addPoint(550, 400);
        trapezium.addPoint(550, 350);
        trapezium.addPoint(450, 350);
        trapezium.addPoint(500,400);
        g.fillPolygon(trapezium);
        g.setColor(Color.green);
        Polygon paralellogram = new Polygon();
        paralellogram.addPoint(450, 350);
        paralellogram.addPoint(500, 400);
        paralellogram.addPoint(500, 500);
        paralellogram.addPoint(450, 450);
        g.fillPolygon(paralellogram);
        
        
    
    
    
    
    }
        
}



    
 