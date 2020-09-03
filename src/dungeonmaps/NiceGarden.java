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
 * @author seanh
 */
//is a MapSquare which in this case will be a miscellaneous square that is a 
//nice garden
public class NiceGarden extends MapSquare{
    
    //creates an item array in which I can place a broken beer bottle
    public DnDItem[] inventory;
    
    //places the image of the garden on my computer onto the square
    public NiceGarden(int r, int c) throws IOException {
        super(new ImageIcon(ImageIO.read(new File("img//Nice_Garden.png"))), r, c, true);
    }
    
    
    
}