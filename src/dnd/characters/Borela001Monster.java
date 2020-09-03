package dnd.characters;

import dnd.dnditems.RustySword;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

//this is the name of the class
public class Borela001Monster extends Monster {
    //the parameters of the name and the position will be needed with every instance of a withering angel
    public Borela001Monster(String name, int row, int col) {
        //the monster constructor is called and the withering angel is initialized with a default rustysword()
        super(name, "withering angel", new RustySword(), row, col);
        try {
            //the image of the monster is read in, it is a pciture of a dementor from harry potter
            pic = new ImageIcon(ImageIO.read(new File("img//Borela001Monster.png")));
        } catch (IOException ex) {
            Logger.getLogger(Borela001Monster.class.getName()).log(Level.SEVERE, null, ex);
        }
        //the withering angel has these specific stats, a pretty powerful foe, however not much can be tested due to the fighting
        //mechanics not being implemented into the code
        this.armorClass = 15;
        this.hitPoints = 18;
        this.speed = 30;
    }

}