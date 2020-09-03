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
public class Elebe001BearTrap extends FloorTrapSquare{
    
    public Elebe001BearTrap(int r, int c) throws IOException {
        super(7, 18, r, c);
        this.message = "\nOH YESS!!, You've stepped on a bear trap";
        //needs this image... not exist
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//BearTrap.png")));
    }
    
}
