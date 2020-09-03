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
public class Skeleton extends Monster{
    public Skeleton(String name, int row, int col){
        super(name, "Skeleton", new RustySword(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//skeleton.png")));
        } catch (IOException ex) {
            Logger.getLogger(Skeleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 12;
        this.hitPoints = 12;
        this.speed = 30;
    }
}
