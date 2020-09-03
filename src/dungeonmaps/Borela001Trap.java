package dungeonmaps;

import java.io.IOException;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import java.io.File;

public class Borela001Trap extends FloorTrapSquare {
    //Extends floor trap square since it deals direct damage
    public Borela001Trap(int r, int c) throws IOException {
        //the trap deals 6 damage
        super(6, 12, r, c);
        //a message is displayed to notify the player of the trap
        this.message = "\n a sudden surge of pain gushes through you, and you writhe in agony as the dead bear their mark";
        //the traps image changes to a different image, also from minecraft
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//Borela001Trap.png")));
    }
    
}