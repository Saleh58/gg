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
 * @author 18147
 */
public class BookshelfSquare extends MapSquare{
    
    public DnDItem[] inventory;

    public BookshelfSquare(int r, int c) throws IOException {
        super(new ImageIcon(ImageIO.read(new File("img//Bookshelf.png"))), r, c, true);
    }
    
    
    
}
