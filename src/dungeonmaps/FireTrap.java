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
 * @author SP20CIS182
 */
public class FireTrap extends FloorTrapSquare{
    
    public FireTrap (int r, int c) throws IOException {
        super(12,16, r, c);
        this.message = "\nYou stepped on a fire trap... you are on fire!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//FireTrap.png")));
    }
    
}
