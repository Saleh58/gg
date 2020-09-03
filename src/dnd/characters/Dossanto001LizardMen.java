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
 * @author Nikoly
 */
public class Dossanto001LizardMen extends Monster{
    
    public Dossanto001LizardMen(String name, int row, int col) {
        super(name, "Lizard Man", row, col);
        
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//lizard_man.jpg")));
        } catch (IOException ex) {
            Logger.getLogger(Dossanto001LizardMen.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 12;
        this.speed = 30;
        this.hitPoints = 10;
    }
    
}
