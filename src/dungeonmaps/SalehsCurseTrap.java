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
 * @author saleh
 */
public class SalehsCurseTrap extends FloorTrapSquare{
    
    public SalehsCurseTrap(int r, int c) throws IOException {
        // super's location
        super(1, 12, r, c);
        // the maseage when step on the trap
        this.message = "\nYou have got the curse of our Elder Dragon... You won't leave this place alive!";
        // trap's image
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//CursedTrap.png")));
    }
    
}