/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author julia
 */
public class JuliasSwampMonster extends Monster{
    
    public JuliasSwampMonster(String name, int row, int col){
        super(name, "Swamp Monster", row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//SwampMonster.png")));
        } catch (IOException ex) {
            Logger.getLogger(Skeleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 5;
        this.hitPoints = 20;
        this.speed = 5;
    }
    
}
