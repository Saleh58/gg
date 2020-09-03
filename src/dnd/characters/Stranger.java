/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.Fists;
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
public class Stranger extends Monster{
    public Stranger(String name, int row, int col){
        super(name, "Strangler", new Fists(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//Stranger.png")));
        } catch (IOException ex) {
            Logger.getLogger(Stranger.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 16;
        this.hitPoints = 11;
        this.speed = 29;
    }
}
