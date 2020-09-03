/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.Bite;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author 18147
 */
public class UndeadGrick extends Monster{
    public UndeadGrick(String name, int row, int col){
        super(name, "Undead Grick", new Bite(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//UndeadGrick.png")));
        } catch (IOException ex) {
            Logger.getLogger(UndeadGrick.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 8;
        this.hitPoints = 8;
        this.speed = 15;
    }
}
