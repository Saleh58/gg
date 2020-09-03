/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.SethsDragon;
import dnd.characters.Monster;
import dnd.characters.Skeleton;
import dnd.dnditems.DnDItem;
import dnd.dnditems.HeavyHammer;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author sethg
 */
public class SethsMap implements MapMakerIF {
    private final String title = "Seth's Map";
    public final String mapDesc = "Welcome to Seth's Map. Have fun in the "
            + "dungon!!";
    public final ImageIcon mapImg;
    public SethsMap() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//SethsMap.png")));
    }

    @Override
    public String getName() {
        return title;
    }

    @Override
    public String getMapDesc() {
        return mapDesc;
    }

    @Override
    public ImageIcon getMapImg() {
        return mapImg;
    }

    @Override
    public WallSquare[] getWallSquares() {
       WallSquare[] walls = {
            //outside walls
            ////north wall
            new WallSquare(0,0),
            new WallSquare(0,2),
            new WallSquare(0,3),
            new WallSquare(0,4),
            new WallSquare(0,5),
            new WallSquare(0,6),
            new WallSquare(0,7),
            new WallSquare(0,8),
            new WallSquare(0,9),
            new WallSquare(0,10),
            ////exit
            //new WallSquare(0,1),
           
            ////end exit
            new WallSquare(0,13),
            new WallSquare(0,14),
            new WallSquare(0,15),
            new WallSquare(0,16),
            new WallSquare(0,17),
            new WallSquare(0,18),
            new WallSquare(0,19),
            ////east wall
            new WallSquare(1,19),
            new WallSquare(2,19),
            new WallSquare(3,19),
            new WallSquare(4,19),
            new WallSquare(5,19),
            new WallSquare(6,19),
            new WallSquare(7,19),
            new WallSquare(8,19),
            new WallSquare(9,19),
            new WallSquare(10,19),
            new WallSquare(11,19),
            new WallSquare(12,19),
            new WallSquare(13,19),
            new WallSquare(14,19),
            new WallSquare(15,19),
            new WallSquare(16,19),
            new WallSquare(17,19),
            ////entrance
            //new WallSquare(18,19),
            //new WallSquare(19,19),
            ////end east wall
            
            ////south wall
            new WallSquare(19,0),
            new WallSquare(19,1),
            new WallSquare(19,2),
            new WallSquare(19,3),
            new WallSquare(19,4),
            new WallSquare(19,5),
            new WallSquare(19,6),
            new WallSquare(19,7),
            new WallSquare(19,8),
            new WallSquare(19,9),
            //entrance cliff on the side of mountain
            /*
            new WallSquare(19,10),
            new WallSquare(19,11),
            new WallSquare(19,12),
            new WallSquare(19,13),
            new WallSquare(19,14),
            new WallSquare(19,15),
            new WallSquare(19,16),
            new WallSquare(19,17),
            new WallSquare(19,18),
            new WallSquare(19,19),
            */
            ////end south wall
            
            ////weast wall
            new WallSquare(1,0),
            new WallSquare(2,0),
            new WallSquare(3,0),
            new WallSquare(4,0),
            new WallSquare(5,0),
            new WallSquare(6,0),
            new WallSquare(7,0),
            new WallSquare(8,0),
            new WallSquare(9,0),
            new WallSquare(10,0),
            new WallSquare(11,0),
            new WallSquare(12,0),
            new WallSquare(13,0),
            new WallSquare(14,0),
            new WallSquare(15,0),
            new WallSquare(16,0),
            new WallSquare(17,0),
            new WallSquare(18,0),
            
            ////end west wall
            //start of other walls
            
            new WallSquare(1,2),
            new WallSquare(1,3),
            new WallSquare(2,2),
            new WallSquare(2,3),
            new WallSquare(3,2),
            new WallSquare(3,3),
            new WallSquare(3,5),
            new WallSquare(3,6),
            new WallSquare(3,7),
            new WallSquare(3,8),
            new WallSquare(3,9),
            new WallSquare(3,12),
            new WallSquare(3,13),
            new WallSquare(3,14),
            new WallSquare(3,15),
            new WallSquare(3,16),
            new WallSquare(4,2),
            new WallSquare(4,3),
            new WallSquare(4,5),
            new WallSquare(4,12),
            new WallSquare(5,2),
            new WallSquare(5,3),
            new WallSquare(5,5),
            new WallSquare(5,12),
            new WallSquare(6,3),
            new WallSquare(6,5),
            new WallSquare(6,12),
            new WallSquare(7,3),
            new WallSquare(7,5),
            new WallSquare(7,12),
            new WallSquare(8,3),
            new WallSquare(8,5),
            new WallSquare(8,12),
            new WallSquare(9,5),
            new WallSquare(9,7),
            new WallSquare(9,8),
            new WallSquare(9,9),
            new WallSquare(9,10),
            new WallSquare(9,11),
            new WallSquare(9,12),
            new WallSquare(10,5),
            new WallSquare(10,7),
            new WallSquare(10,8),
            new WallSquare(10,9),
            new WallSquare(10,10),
            new WallSquare(10,11),
            new WallSquare(10,12),
            new WallSquare(10,15),
            new WallSquare(10,16),
            new WallSquare(10,17),
            new WallSquare(10,18),
            new WallSquare(13,1),
            new WallSquare(13,2),
            new WallSquare(13,3),
            new WallSquare(13,4),
            new WallSquare(13,7),
            new WallSquare(13,8),
            new WallSquare(13,9),
            new WallSquare(13,10),
            new WallSquare(13,11),
            new WallSquare(13,12),
            new WallSquare(13,15),
            new WallSquare(13,16),
            new WallSquare(13,17),
            new WallSquare(13,18),
            new WallSquare(14,4),
            new WallSquare(14,7),
            new WallSquare(14,12),
            new WallSquare(14,15),
            new WallSquare(14,16),
            new WallSquare(14,17),
            new WallSquare(14,18),
            new WallSquare(15,4),
            new WallSquare(15,7),
            new WallSquare(15,12),
            new WallSquare(16,4),
            new WallSquare(16,7),
            new WallSquare(16,12),
            new WallSquare(17,4),
            new WallSquare(17,12),
            new WallSquare(18,12)
      //end of other walls
       };
       return walls;
               
    }

    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException {
         DirtFloorSquare[] dirtFloor = {
             new DirtFloorSquare(1,1),
             new DirtFloorSquare(2,1),
             new DirtFloorSquare(3,1),
             new DirtFloorSquare(4,1),
             new DirtFloorSquare(5,1),
             new DirtFloorSquare(6,1),
             new DirtFloorSquare(6,2),
             new DirtFloorSquare(7,1),
             new DirtFloorSquare(7,2),
             new DirtFloorSquare(15,17),
             new DirtFloorSquare(15,18),
             new DirtFloorSquare(16,17),
             new DirtFloorSquare(16,18),
             new DirtFloorSquare(17,17),
             new DirtFloorSquare(17,18),
             new DirtFloorSquare(18,17),
             new DirtFloorSquare(18,18)
         };
         return dirtFloor;
    }

    @Override
    public FloorTrapSquare[] getTraps() throws IOException {
        FloorTrapSquare[] traps = {
            new SpikeTrapSquare(1,5),
            new SpikeTrapSquare(3,17),
            new SpikeTrapSquare(17,7),
            new FireTrapSquare(2,5),
            new FireTrapSquare(3,18),
            new FireTrapSquare(8,1),
            new FireTrapSquare(7,6)
        };
        return traps;
    }

    @Override
    public MapSquare[] getMiscSquares() throws IOException {
        ChestSquare myChest = new ChestSquare(16,2);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new HeavyHammer();
        MapSquare[] misc = {
            myChest,
            new PortalSquare(12,18,1,1)    
        };
        return misc;
    }

    @Override
    public Monster[] getMonsters() {
         Monster[] monsters = {
             new Skeleton("Henry",5,15),
             new SethsDragon ("Steve", 15,10),
                 
         };
        return monsters;
    }

    @Override
    public void addMessages(MapSquare[][] map) {
        
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits = {
            new MapCoord(1,0)
        };
        return exits;
    }

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(19,19);
    }
    
}
