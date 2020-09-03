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
 * @author kotagiri
 */
public class Kotagiri002Health extends MapSquare{
    
    public final int heal;
    public boolean armed = true;
    
    public Kotagiri002Health(int heal, int row, int column, boolean pass) throws IOException {
        super(new ImageIcon(ImageIO.read(new File("img//health-potion.png"))), row, column, pass);
        this.heal = heal;
        this.message = "\nYou steped on necter you get healed, go kill them";
    }
    
    
}