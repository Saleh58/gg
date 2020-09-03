/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jessentihemuka
 */
public class RingFireTrap extends FloorTrapSquare{
    
    public RingFireTrap(int r, int c) throws IOException {
        super(3, 10, r, c);
        this.message = "\nYou just went through a ring of fire... be careful!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//ringfire_trap.png")));
    }
    
}
