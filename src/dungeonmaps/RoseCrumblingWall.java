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
 * @author jaker
 */
public class RoseCrumblingWall extends MapSquare{
    
    public RoseCrumblingWall(int r, int c) throws IOException {
        /*this is a misc sqaure that looks like a crumbling wall
        *it will initially not be passable but when you go up to it 
        *it will give you a prompt sayign it could be broken and ask 
        *if you want to try to break it and then will check if your strength 
        is high enough and if it it will break it and allow it to be passable
        but if not it will not break and tell you that and remain unpassable
        */
        
        super(new ImageIcon(ImageIO.read(new File("img//crumbling_wall.png"))), r, c, false);
        
    }
    
}
