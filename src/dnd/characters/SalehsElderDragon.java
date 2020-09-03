/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.IcedPunch;
import dnd.dnditems.SalehsDarkMagic;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author saleh
 */
public class SalehsElderDragon extends Monster{
    
     public SalehsElderDragon(String name, int row, int col){
         //The name of the monster and it's location
        super(name, "The Elder Dragon", new SalehsDarkMagic(), row, col);
        try {
            //sett the image of the monster
            pic = new ImageIcon(ImageIO.read(new File("img//ElderDragon.png")));
        } catch (IOException ex) {
            Logger.getLogger(SalehsIceGolem.class.getName()).log(Level.SEVERE, null, ex);
        }
        //set the monster's status
        this.armorClass = 18;
        this.hitPoints = 20;
        this.speed = 35;
    }

    
}
