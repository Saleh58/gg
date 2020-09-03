/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;


import dnd.dnditems.Terminator;
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
public class Hooker extends Monster{
    public Hooker(String name, int row, int col){
        super(name, "Hooker", new Terminator(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//Hooker.png")));
        } catch (IOException ex) {
            Logger.getLogger(Skeleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 11;
        this.hitPoints = 13;
        this.speed = 27;
    }
}
