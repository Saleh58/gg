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


 
public class DeadFall extends FloorTrapSquare{
    
    public DeadFall(int r, int c) throws IOException {
        super(1, 12, r, c);
        this.message = "\nOh no its a dead fall , you're kinda dead buddy!!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//Deadfall trap 1.png")));
        
    }
    
}


