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
public class Thanos extends Monster{
    
    public Thanos(String name, int row, int col){ //He snapped the universe in half in one snap
        super(name, "Thanos", new RustySword(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//thanos_monster.png")));
        } catch (IOException ex) {
            Logger.getLogger(Thanos.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 10;
        this.hitPoints = 15;
        this.speed = 25;
    }
    
}
