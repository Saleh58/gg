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
 * @author SP20CIS182
 */
public class WaterTrap extends FloorTrapSquare{
    
    public WaterTrap (int r, int c) throws IOException {
        super(1,16, r, c);
        this.message = "\nYou stepped on a water trap... you are in deep water!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//WaterTrap.png")));
    }
    
}
