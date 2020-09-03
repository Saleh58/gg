/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Nikoly
 */
public class Dossanto001CarpetSquare extends MapSquare{
    
    //picture and message for carpet square
    public Dossanto001CarpetSquare( int r, int c) throws IOException {
        super(new ImageIcon(ImageIO.read(new File("img//red_carpet.jpg"))), r, c, true);
        this.message = "\nWow, for a lizard dungeon this place is quite stylish!";
    }
    
}
