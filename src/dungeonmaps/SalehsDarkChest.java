/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.dnditems.DnDItem;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author saleh
 */
public class SalehsDarkChest extends MapSquare{
    // calling DnDItems array
     public DnDItem[] inventory;
    
    public SalehsDarkChest(int r, int c) throws IOException {
        // chest's image
        super(new ImageIcon(ImageIO.read(new File("img//black_chest.png"))), r, c, true);
    }
   
    
}
