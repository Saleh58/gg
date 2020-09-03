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
 * @author Nikoly
 */
public class Dossanto001ArrowTrap extends FloorTrapSquare{
    
    //sets damage for trap square and message
    public Dossanto001ArrowTrap( int r, int c) throws IOException {
        super(2, 12, r, c);
        this.message = "\nLooks like you have been hit by an arrow... you should be more careful";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//arrow.gif")));
    }
}
