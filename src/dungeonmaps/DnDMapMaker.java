/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Monster;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SP20CIS182
 */
public class DnDMapMaker {
    public static ArrayList<String>mapNames; 
    public static ArrayList<MapMakerIF> maps;
    public static MapMakerIF selectedMaker = null;
    
    public DnDMapMaker(){
        mapNames = new ArrayList();
        maps = new ArrayList();
    }
    public void addMapMakerIF(MapMakerIF maker){
        maps.add(maker);
        mapNames.add(maker.getName());
    }
    
    public boolean chooseSelectedMap(String mapName){
        for(MapMakerIF maker : maps){
            if(maker.getName().equals(mapName)){
                selectedMaker = maker;
            }
        }
        return false;
    }
    
    public MapSquare[][] populateMap(MapSquare[][] map){
        
        for(WallSquare square : selectedMaker.getWallSquares()){
            map[square.row][square.col] = square;
        }
        try {
            for(DirtFloorSquare square : selectedMaker.getDirtFloor()){
                map[square.row][square.col] = square;
            }
            for(FloorTrapSquare square : selectedMaker.getTraps()){
                map[square.row][square.col] = square;
            }
            for(MapSquare square : selectedMaker.getMiscSquares()){
                map[square.row][square.col] = square;
            }
        } catch (IOException ex) {
            Logger.getLogger(DnDMapMaker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(Monster monst : selectedMaker.getMonsters()){
            MapSquare home = map[monst.coord.row][monst.coord.col];
            home.occupant = monst;
            home.setIcon(monst.pic);
        }
        
        selectedMaker.addMessages(map);
        return map;
    }

    public MapCoord setEntrance(){
        return selectedMaker.setEntrance();
    }
    
    public MapCoord[] setExits(){
        return selectedMaker.setExits();
    }
    
}
