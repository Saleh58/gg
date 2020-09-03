/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.Claw;
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
public class GuardianDrake extends Monster{
    public GuardianDrake(String name, int row, int col){
        super(name, "Guardian Drake", new Claw(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//GuardianDrake.png")));
        } catch (IOException ex) {
            Logger.getLogger(GuardianDrake.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 12;
        this.hitPoints = 15;
        this.speed = 35;
    }
    
}
