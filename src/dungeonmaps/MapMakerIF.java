/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Monster;
import java.io.IOException;
import javax.swing.ImageIcon;

/**
 *
 * @author SP20CIS182
 */
public interface MapMakerIF {
    public abstract String getName();
    public abstract String getMapDesc();
    public abstract ImageIcon getMapImg();
    public abstract WallSquare[] getWallSquares();
    public abstract DirtFloorSquare[] getDirtFloor()throws IOException;
    public abstract FloorTrapSquare[] getTraps()throws IOException;
    public abstract MapSquare[] getMiscSquares()throws IOException;
    public abstract Monster[] getMonsters();
    public abstract void addMessages(MapSquare[][] map);
    public abstract MapCoord setEntrance();//give at least six squares to the left or have six squares above
    public abstract MapCoord[] setExits();
}
