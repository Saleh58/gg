/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;


/**
 *
 * @author yousefelsayed
 */

    
    
import dnd.dnditems.SnowSword;
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
public class WhitePharoah extends Monster{
    public WhitePharoah(String name, int row, int col){
        super(name, "WhitePharoah", new SnowSword(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//WhitePharoah.png")));
        } catch (IOException ex) {
            Logger.getLogger(BigPharoah.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 12;
        this.hitPoints = 12;
        this.speed = 30;
    }
}
    
 