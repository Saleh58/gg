/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.FlameThrower;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author elebe001
 */
public class Loc extends Monster{
    public Loc(String name, int row, int col){
        super(name, "Loc", new FlameThrower(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//Loc.png")));
        } catch (IOException ex) {
            Logger.getLogger(Loc.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 15;
        this.hitPoints = 13;
        this.speed = 28;
    }
}
