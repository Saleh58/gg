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
public class SnareTrap extends FloorTrapSquare{
    
    public SnareTrap(int r, int c) throws IOException {
        super(13, 13, r, c);
        this.message = "\nFROM THE GROUND AROSE, A WIRE TRAP!!!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//SnareTrap.png")));
    }
    
}
