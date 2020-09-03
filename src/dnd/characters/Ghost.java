/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.Chain;
import dnd.dnditems.RustySword;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Daria
 */
public class Ghost extends Monster{
    public Ghost(String name, int row, int col){
        super(name, "Ghost", new Chain(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//ghost.png")));
        } catch (IOException ex) {
            Logger.getLogger(Ghost.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 10;
        this.hitPoints = 13;
        this.speed = 25;
    }
}
