/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jessentihemuka
 */
public class BrokenGlassTrap extends FloorTrapSquare{ //this is one of my traps
    
     public BrokenGlassTrap(int r, int c) throws IOException {
        super(4, 17, r, c);
        this.message = "\nBroken glass ALERT!! Somebody forgot to clean the floor!!  ";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//broken_glass.png")));
    }
    
}
