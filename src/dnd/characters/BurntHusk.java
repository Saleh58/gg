/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jaker
 */
public class BurntHusk extends Monster {
    
    public BurntHusk(String name, int row, int col) {
        // the burnt husk is a slow moving enemy that is a burnt out
        //husk of its former self
        super(name, "Burnt Husk", row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//burntHusk.png")));
        } catch (IOException ex) {
            Logger.getLogger(Skeleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 5;
        this.hitPoints = 15;
        this.speed = 10;
    }
    
}
