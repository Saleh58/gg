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
 * @author Kotagiri
 */
public class Kotagiri002Poisontrap extends FloorTrapSquare {
    
    public Kotagiri002Poisontrap(int r, int c) throws IOException {
        super(1, 10, r, c);
        this.message = "\nYou stepped on a poison trap... it kills!";
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//Poison_Trap.png")));
    }
    
}