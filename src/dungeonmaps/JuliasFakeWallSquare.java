/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import java.awt.Color;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author julia
 */
public class JuliasFakeWallSquare extends MapSquare{
    
    //this exists because I can't make the regular wall squares passable without messing with that class
    public JuliasFakeWallSquare(int r, int c) {
        super(null, r, c, true);
        this.setBackground(Color.darkGray);
        message = "\nIt was a secret passage!  The end is right there!";
    }
    
}
