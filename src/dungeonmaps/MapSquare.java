/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Actor;
import dnd.dnditems.DnDItem;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;

/**
 *
 * @author SP20CIS182
 */
public class MapSquare extends JButton{
    public String message;
    public final int row;
    public final int col;
    public final MapCoord coord;
    public boolean isOccuppied = false;
    public boolean passable;
    public Actor occupant = null;
    private Icon img;
    public ArrayList<DnDItem> inventory = new ArrayList();
    public MapSquare(Icon img,int r, int c, boolean pass){
        super(img);
        this.img = img;
        row = r;
        col = c;
        coord = new MapCoord(r,c);
        passable = pass;
        message = "none";
        this.setPreferredSize(new Dimension(35,35));
        this.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
    }
    
    public MapSquare(Icon img, MapCoord coord, boolean pass){
        super(img);
        this.img = img;
        row = coord.row;
        col = coord.col;
        this.coord =coord;
        passable = pass;
        message = "none";
        this.setPreferredSize(new Dimension(35,35));
        this.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
    }
    
    public void setImg(Icon icon){
        this.img = icon;
    }
    
    public void resetIcon(){
        this.setIcon(img);
    }
    
}
