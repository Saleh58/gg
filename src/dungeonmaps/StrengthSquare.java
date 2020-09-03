package dungeonmaps;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Djroc
 */
public class StrengthSquare extends MapSquare {
    
    public StrengthSquare(int r, int c) throws IOException {
        super(new ImageIcon(ImageIO.read(new File("img//StrengthPotion.png"))), r, c, true);
        message = "You enter a closed off room with a chest in the corner,"
                + "with a monster in front of you, and you think traps are nearby."
                + "Sensing that others have fallen here, yout determination and "
                + "power increases!";
        //increases characters strength by 2
        
    }
    
}
