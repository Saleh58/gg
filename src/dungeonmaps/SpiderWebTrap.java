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
 * @author jessentihemuka
 */
public class SpiderWebTrap extends FloorTrapSquare {
    
     public SpiderWebTrap(int r, int c) throws IOException {
        super(5, 9, r, c);
        this.message = "\nWOOOAAAAH... SO STICKY!! SPIDERMAN JUST GOT YOU!!!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//spider_web.png")));
    }
    
}