/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.IcedPunch;
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
public class SalehsIceGolem extends Monster{
    //The name of the monster and it's location
    public SalehsIceGolem(String name, int row, int col){
        super(name, "Ice Golem", new IcedPunch(), row, col);
        try {
            //sett the image of the monster
            pic = new ImageIcon(ImageIO.read(new File("img//IceGolem.png")));
        } catch (IOException ex) {
            Logger.getLogger(SalehsIceGolem.class.getName()).log(Level.SEVERE, null, ex);
        }
        //set the monster's status
        this.armorClass = 12;
        this.hitPoints = 12;
        this.speed = 30;
    }
}
