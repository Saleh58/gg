/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.SandwichSword;
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
public class HatMan extends Monster{
    public HatMan(String name, int row, int col){
        super(name, "????", new SandwichSword(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//hat_man.png")));
        } catch (IOException ex) {
            Logger.getLogger(HatMan.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 1000;
        this.hitPoints = 1000;
        this.speed = 1000;
    }
}
