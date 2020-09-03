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
public class WindTrap extends FloorTrapSquare{
    
    public WindTrap (int r, int c) throws IOException {
        super(2,16, r, c);
        this.message = "\nYou stepped on a Wind trap... you gone !";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//WindTrap.png")));
    }
    
}
