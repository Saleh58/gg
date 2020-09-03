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
public class JawTrap extends FloorTrapSquare{
    
    public JawTrap(int r, int c) throws IOException {
        super(6, 6, r, c);
        this.message = "\nBye Bye to your foot!!! Watch your step next time";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//jaw_trap2.png")));
    }
    
}