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
 * @author SP20CIS182
 */
public class PortalSquare extends MapSquare{
    
    public final MapCoord destCoord;
    
    public PortalSquare(int originRow, int originCol, int destRow, int destCol) throws IOException {
        super(new ImageIcon(ImageIO.read(new File("img//portal.png"))), originRow, originCol, true);
        message = "Proof";
        destCoord = new MapCoord(destRow,destCol);
    }
    
}
