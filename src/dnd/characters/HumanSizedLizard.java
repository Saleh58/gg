/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.DnDWeapon;
import dnd.dnditems.RubyBlade;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Djroc
 */
public class HumanSizedLizard extends Monster {
    
    public HumanSizedLizard(String name, int row, int col) {
        super(name, "Human Sized Lizard", new RubyBlade(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//HS Lizard.png")));
        } catch (IOException ex) {
            Logger.getLogger(HumanSizedLizard.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 15;
        this.hitPoints = 10;
    }
}
