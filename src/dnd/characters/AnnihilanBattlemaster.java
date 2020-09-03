/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.Fists;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jared
 */

//constructor calls super constructor, this Monster has fists for a weapon
public class AnnihilanBattlemaster extends Monster {
   public AnnihilanBattlemaster(String name, int row, int col){
        super(name, "Annihilan Battlemaster", new Fists(), row, col);
        //unique image is used here
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//annihilanbattlemaster.png")));
        } catch (IOException ex) {
            Logger.getLogger(AnnihilanBattlemaster.class.getName()).log(Level.SEVERE, null, ex);
        }
        //key attributes
        this.armorClass = 25;
        this.hitPoints = 40;
        this.speed = 10;
    }
}
