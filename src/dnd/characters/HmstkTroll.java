/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.BloodiedClubs;
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
public class HmstkTroll extends Monster{
    //This is a joke monster
    public HmstkTroll(String name, int row, int col){
        super(name, "Homestuck Troll", new BloodiedClubs(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//hmstkTroll.png")));
        } catch (IOException ex) {
            Logger.getLogger(HmstkTroll.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 14;
        this.hitPoints = 16;
        this.speed = 20;
    }
}
