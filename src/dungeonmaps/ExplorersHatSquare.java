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
 * @author jared
 */
public class ExplorersHatSquare extends MapSquare {
    //constructor calls the MapSqaure constructor
    //has a specific image
    public ExplorersHatSquare(int r, int c) throws IOException {
        super(new ImageIcon(ImageIO.read(new File("img//explorershat.png"))), r, c, true);
        //has a unique message when traveled on
        message = "You find a high crowned sable fedora lying on the ground. " +
                "You attempt to put it on, but it does not fit. " +
                "You decide to leave it there for others to awe in its beauty.";
    }
}
