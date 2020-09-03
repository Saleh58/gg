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
 * @author julia
 */
public class JuliasPotatoTrapSquare extends FloorTrapSquare{
    //creates a potato trap with location; damage done is 3; throws exception 
    public JuliasPotatoTrapSquare(int r, int c) throws IOException {
        super(3, 12, r, c);
        //this message is displayed when the character is on this square
        this.message = "\nA huge potato falls from the ceiling and hits you in the head... it hurts!";
        //image of potato appears when tripped
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//potato.png")));
    }
}
