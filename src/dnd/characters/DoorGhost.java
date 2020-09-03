/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.RustySword;
import dnd.dnditems.SharpenedHands;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Daria
 */
public class DoorGhost extends Monster{
    public DoorGhost(String name, int row, int col){
        super(name, "Door Ghost", new SharpenedHands(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//doorBoy.png")));
        } catch (IOException ex) {
            Logger.getLogger(DoorGhost.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 15;
        this.hitPoints = 30;
        this.speed = 40;
    }
}
