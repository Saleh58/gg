/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.RustySword;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jessentihemuka
 */
public class Corbo extends Monster{ //this is my monster. Corbo is a bird in french
    public Corbo(String name, int row, int col){
        super(name, "Corbo", new RustySword(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//corbo_monster.png")));
        } catch (IOException ex) {
            Logger.getLogger(Corbo.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 20;
        this.hitPoints = 10;
        this.speed = 15;
    }
}
