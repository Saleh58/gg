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
 * @author elebe001
 */
public class PitTrap extends FloorTrapSquare{
    
    public PitTrap(int r, int c) throws IOException {
        super(7, 18, r, c);
        this.message = "\nYou've fallen into the pit of the Alkazula tribe";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//PitTrap.png")));
    }
    
}
