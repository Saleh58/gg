/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.Bite;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author 18147
 */
public class Mimic extends Monster{
    
    public Mimic (String name, int row, int col){
        super(name, "Mimic", new Bite(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//Mimic.png")));
        } catch (IOException ex) {
            Logger.getLogger(Mimic.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 5;
        this.hitPoints = 5;
        this.speed = 0;
    }
}
