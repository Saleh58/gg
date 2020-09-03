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
 * @author elebe001
 */
public class Grillock extends Monster{
    public Grillock(String name, int row, int col){
        super(name, "Grillock", new Fists(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//Grillock.png")));
        } catch (IOException ex) {
            Logger.getLogger(Grillock.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 11;
        this.hitPoints = 12;
        this.speed = 30;
    }
}
