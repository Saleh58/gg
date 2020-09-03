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
 * @author Joshi Gandham
 */
public class GandhamNightking extends Monster{
    public GandhamNightking(String name, int row, int col){
        super(name, "GandhamNightking", new RustySword(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//king.jpg")));
        } catch (IOException ex) {
            Logger.getLogger(Skeleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 15;
        this.hitPoints = 15;
        this.speed = 30;
    }
}
