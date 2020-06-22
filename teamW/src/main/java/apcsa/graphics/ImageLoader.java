package apcsa.graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {
    public static BufferedImage loadImage(String path) {
        try {
            File file = new File(path);
            if(file.exists()) {
                return ImageIO.read(file);
            }
            else {
                System.out.println("Image File Doesn't Exist: " + path);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}