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
 * @author jdrudy
 */
public class SlimeTrapSquare extends MobilityFloorTrap{

    public SlimeTrapSquare(int damage, int camo, int r, int c, 
            int movementPenalty) throws IOException {
        super(0, 5, r, c, 2);
        this.message = "\nYou stepped on a slime trap... you feel slower!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//slimeTrap.png")));
    }
    
}
