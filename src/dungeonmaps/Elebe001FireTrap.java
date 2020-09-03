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
 * @author elebe001
 */
public class Elebe001FireTrap extends FloorTrapSquare{
    
    public Elebe001FireTrap(int r, int c) throws IOException {
        super(9, 6, r, c);
        this.message = "\nBURN! BURN!! BURN!!!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//FireTrap.png")));
    }
    
}
