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
 * @author Joshi Gandham
 */
public class Gandham003Gastrap extends FloorTrapSquare {
    
    public Gandham003Gastrap(int r, int c) throws IOException {
        super(1, 10, r, c);
        this.message = "You are inhaling poisonous gas... you will run out of breath!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//danger.jpg")));
    }
    
}
    

