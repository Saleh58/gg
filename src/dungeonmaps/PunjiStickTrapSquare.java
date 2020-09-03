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
 * @author jared
 */
public class PunjiStickTrapSquare extends FloorTrapSquare {
    //constructor calls FloorTrapSquare constructor
    //has a damage output of 5 points
    public PunjiStickTrapSquare(int r, int c) throws IOException{
        super(5, 12, r, c);
        //unique message
        this.message = "\n Looks like you have fallen in a Punji Stick Trap" +
                "You have taken 5 points of damage.";
        //unique image to be displays when tripped
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//punjitrap.png")));
    }
    
}
