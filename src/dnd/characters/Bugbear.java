/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.RustySword;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author SP20CIS182
 */
public class Bugbear extends Monster{
    public Bugbear(String name, int row, int col){
        super(name, "Bugbear", new RustySword(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//Bugbear .png")));
        } catch (IOException ex) {
            Logger.getLogger(Bugbear.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 10;
        this.hitPoints = 17;
        this.speed = 30;
    }
}


