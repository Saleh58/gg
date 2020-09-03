/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.DnDWeapon;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Nikoly
 */
public class Dossanto001Dragon extends Monster{
    
    public Dossanto001Dragon(String name,int row, int col) {
        super(name, "Dragon", row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//dragon.jpg")));
        } catch (IOException ex) {
            Logger.getLogger(Dossanto001Dragon.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 18;
        this.speed = 10;
        this.hitPoints = 30;
    }
}
