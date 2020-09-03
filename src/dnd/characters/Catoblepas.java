/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.Fang;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jdrudy
 */
public class Catoblepas extends Monster{
    public Catoblepas(String name, int row, int col){
        super(name, "Catoblepas", new Fang(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//catoblepas.jpg")));
        } catch (IOException ex) {
            Logger.getLogger(Catoblepas.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 14;
        this.hitPoints = 84;
        this.speed = 30;
    }
}
