/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jaker
 */
public class TheCookieMonsterRose extends Monster{
    
    public TheCookieMonsterRose(String name, int row, int col){
        //Cookie Monster is a boss with a low armor class but high hitpoints
        super(name, "CookieMonster", row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//CookieMonster.png")));
        } catch (IOException ex) {
            Logger.getLogger(Skeleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 5;
        this.hitPoints = 35;
        //everyone knows that the cookie monster is the fastest being alive
        this.speed = 80;
    }
    
    
}
