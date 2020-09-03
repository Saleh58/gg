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
 * @author jkni1
 */
public class LavaTrapSquare extends FloorTrapSquare{
    
    public LavaTrapSquare(int r, int c) throws IOException {
        super(2, 13, r, c);
        this.message = "\nYou stepped on a lava trap... it burns your soul!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//lava.png")));
    }
    
    
}
