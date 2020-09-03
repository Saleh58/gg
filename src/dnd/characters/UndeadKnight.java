/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.FlamingSword;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jkni1
 */
public class UndeadKnight extends Monster{
    public UndeadKnight(String name, int row, int col){
        super(name, "Undead Knight", new FlamingSword(), row , col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//undeadknight.png")));
        } catch (IOException ex) {
            Logger.getLogger(UndeadKnight.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 13;
        this.hitPoints = 13;
        this.speed = 30;
    }
    
    
}
