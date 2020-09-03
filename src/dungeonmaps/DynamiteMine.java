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
 * @author yousefelsayed
 */
public class DynamiteMine extends FloorTrapSquare{
    
    public DynamiteMine(int r, int c) throws IOException {
        super(1, 12, r, c);
        this.message = "\nBoom Boom Boom !!!! , you still alive man ?!!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//DynamiteMine.png")));
        
    }
    
}

