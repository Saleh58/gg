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
 * @author jessentihemuka
 */
public class Dali extends Monster{ //this is another monster inspired by Money Heist on Netlfix (watch it)
    public Dali(String name, int row, int col){
        super(name, "Dali", new Fists(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//dali_monster.png")));
        } catch (IOException ex) {
            Logger.getLogger(Dali.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 25;
        this.hitPoints = 17;
        this.speed = 22;
    }
}
