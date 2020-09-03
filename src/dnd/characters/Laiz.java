/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.BlackFyre;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author yousefelsayed
 */
        public class Laiz extends Monster{
    public Laiz(String name, int row, int col){
        super(name, "Laiz", new BlackFyre(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//Laiz2.png")));
        } catch (IOException ex) {
            Logger.getLogger(BigPharoah.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 12;
        this.hitPoints = 25;
        this.speed = 30;
    }
}

