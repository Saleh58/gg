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
 * @author SP20CIS182
 */
public class Manticore extends Monster{
    public Manticore(String name, int row, int col){
        super(name, "Manticore", new RustySword(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//Manticore.png")));
        } catch (IOException ex) {
            Logger.getLogger(Manticore.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 20;
        this.hitPoints = 15;
        this.speed = 20;
    }
}


