/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.Gandham003Whip;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Joshi Gandham
 */
public class GandhamDrogon extends Monster{
    public GandhamDrogon(String name, int row, int col){
        super(name, "GandhamDrogon", new Gandham003Whip(), row, col);
        try {
            pic = new ImageIcon(ImageIO.read(new File("img//drogon.jpg")));
        } catch (IOException ex) {
            Logger.getLogger(Skeleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.armorClass = 10;
        this.hitPoints = 10;
        this.speed = 30;
    }
}
