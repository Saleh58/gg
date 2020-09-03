/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.SalehsSwordAndShield;
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
public class SalehsViking extends Monster{
    //The name of the monster and it's location
     public SalehsViking(String name, int row, int col){
        super(name, "MountainDefender", new SalehsSwordAndShield(), row, col);
        try {
            //sett the image of the monster
            pic = new ImageIcon(ImageIO.read(new File("img//MountainDefender.png")));
        } catch (IOException ex) {
            Logger.getLogger(SalehsIceGolem.class.getName()).log(Level.SEVERE, null, ex);
        }
        //set the monster's status
        this.armorClass = 14;
        this.hitPoints = 14;
        this.speed = 30;
     } 
}
