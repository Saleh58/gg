/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

/**
 *
 * @author yousefelsayed
 */
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class BoobyTrap extends FloorTrapSquare{
    
    public BoobyTrap(int r, int c) throws IOException {
        super(1, 12, r, c);
        this.message = "\nYou stepped on a booby trap... it hurts!";
        this.message = "\nThe Booby trap hurts doesn't it ?";

        trippedTrap = new ImageIcon(ImageIO.read(new File("img//TRAP1.png")));
    }
    
}

    
