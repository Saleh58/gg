package dungeonmaps;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

//Borela001MiscSquares is supposed to give players a massive health boost in the case they find it
//it is essentially an ancient scroll that heals the one player who manages to find it
//due to the purpose of the square being very similar to the functionality of a floor trap square, I decided to inherit it
public class Borela001MiscSquare extends FloorTrapSquare {
    //The constructor of the miscsquare
    public Borela001MiscSquare(int r, int c) throws IOException {
        //the parameter for damage is set to be -15, so when a player walks on the square, they take -15 damage, or gain 15 health
        super(-15, 12, r, c);
        //after the trap is tripped, the image icon of where the scroll was changes to a minecraft enchanting table icon
        trippedTrap = new ImageIcon(ImageIO.read(new File("img//Borela001MiscSquare.png")));
        //a message also appears regarding the lost ancient scrolls and what they do 
        this.message = "\n You have read the lost ancient scrolls and have brought yourself" + 
        "\na great increase in health during this gruesome journey";

    }
    
}