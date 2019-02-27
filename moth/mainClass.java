import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class mainClass {

    public static void main(String[] args) {
        try {
            Image picture = ImageIO.read(new File("moth.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}