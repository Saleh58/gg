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
 * @author jaker
 */
public class RosesMimicTrap extends FloorTrapSquare {
    
    public RosesMimicTrap(int r, int c) throws IOException {
        //trap does one damage and has no camo as it is disguised as a chest
        super(1, 0, r, c);
        ImageIcon mimic = new ImageIcon(ImageIO.read(new File("img//floor_chest.png")));
        this.setIcon(mimic);
        this.message = "\nThat chest was a mimic! You took 1 damage";
    }
    
}
