/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.BrokenBeerBottle;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author seanh
 */
//extends the Monster class to create the Mark Blair monster
public class MarkBlair extends Monster{
       public MarkBlair(String name, int row, int col){
        super(name, "Mark Blair", new BrokenBeerBottle(), row, col);
        try {
            //Sets picture, guxpress helped a lot
            pic = new ImageIcon(ImageIO.read(new File("img//MarkBlair.png")));
        } catch (IOException ex) {
            Logger.getLogger(MarkBlair.class.getName()).log(Level.SEVERE, null, ex);
        }
        //sets armor rating
        this.armorClass = 15;
        //sets hitpoints
        this.hitPoints = 9;
        //sets Mark Blair speed
        this.speed = 20;
    }
}


