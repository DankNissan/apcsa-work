
import java.awt.*;
import java.applet.*;
import java.util.*;

public class andrewstarterpack extends Applet
{
        private static final long serialVersionUID = 2530894095587089544L;
    
        private Image pete;
        private Image shoes;
        private Image minion;
    
    public void init() {
        
        pete = getImage(getDocumentBase(), "pete.png");
        shoes = getImage(getDocumentBase(), "shoes.png");
        minion = getImage(getDocumentBase(), "minion.png");
        
    }
    public void paint(Graphics g)
    {
        Drawings.drawHeader(g);
        Drawings.drawGround(g);
        Text.drawTitle(g);
        Text.peteLabel(g);
        Text.af1Label(g);
        Text.basketballLabel(g);
        g.drawImage(pete, 100, 100, this);
        g.drawImage(shoes, 90, 500, this);
        g.drawImage(minion, 350, 100, this);
    }
}
