/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.Kotagiri002Hammer;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Kotagiri
 */
public class Kotagiri002Troll extends Monster{
    
    public Kotagiri002Troll(String name, int row, int col) {
        super(name, "Kotagiri002Troll", new Kotagiri002Hammer(), row, col);
        try{
            pic = new ImageIcon(ImageIO.read(new File("img//Troll-image.png")));
        } catch (IOException ex) {
            Logger.getLogger(Kotagiri002Troll.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 10;
        this.hitPoints = 10;
        this.speed = 24;
    }
    
}
