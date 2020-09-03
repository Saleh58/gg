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
public class EarthTrap extends FloorTrapSquare{
    
    public EarthTrap (int r, int c) throws IOException {
        super(3,4, r, c);
        this.message = "\nYou stepped on a Wind trap... you powered by earth !";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//EarthTrap.png")));
    }
    
}
