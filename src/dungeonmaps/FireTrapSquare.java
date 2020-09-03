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
 * @author sethg
 */
public class FireTrapSquare extends FloorTrapSquare{
    
    public FireTrapSquare(int r, int c) throws IOException {
        super(2, 8, r, c);
         this.message = "\nYou stepped on a spike trap... it hurts!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//fire.png")));
    }
    
}
