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
import dnd.dnditems.CursedBlade;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
<<<<<<< HEAD
 * @author yousefelsayed
=======
 * @author SP20CIS182
>>>>>>> 6f70eb858bcc27b6da5734d8f0f8fd4386d91dd4
 */
public class DeadlyMummie extends Monster{
    public DeadlyMummie(String name, int row, int col){
        super(name, "DeadlyMummie", new CursedBlade(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//DeadlyMummie2.png")));
        } catch (IOException ex) {
            Logger.getLogger(BigPharoah.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 30;
        this.hitPoints = 30;
        this.speed = 30;
    }
}

    

