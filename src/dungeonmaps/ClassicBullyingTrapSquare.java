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
 * @author seanh
 */
//is a FloorTrapSquare
public class ClassicBullyingTrapSquare extends FloorTrapSquare {

    //creates a trap that deals 2 damage and gives a message that deals a 
    //psychological blow
    public ClassicBullyingTrapSquare(int r, int c) throws IOException {
        super(2, 12, r, c);
        //message that is displayed that bullies people
        this.message = "\nYou stepped on a classic bullying trap. You're an idiot"
                + " and everyone knows it. Take two damage you loser \n Nerd.";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//ClassicBullying.png")));

    }

}
