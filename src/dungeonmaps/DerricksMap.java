/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.HumanSizedLizard;
import dnd.characters.Monster;
import dnd.characters.Skeleton;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Djroc
 */
public class DerricksMap implements MapMakerIF {

    
    private final String title = "Derrick's Dungeon (Middle Section)";
    public final String mapDesc = "Welcome to the center piece of Derrick's"
            + "Dungeon, be careful of the traps and Lizards!";
    public final ImageIcon mapImg;
    public DerricksMap() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//DerricksMap.png")));
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
            //Border Walls (Left)
            new WallSquare(0,0),
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
            new WallSquare(19,0),
            //Border Walls (Bottom)
            new WallSquare(19,1),
            new WallSquare(19,2),
            new WallSquare(19,3),
            new WallSquare(19,4),
            new WallSquare(19,5),
            new WallSquare(19,6),
            new WallSquare(19,7),
            new WallSquare(19,8),
            new WallSquare(19,9),
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
            //Border Walls (Right)
            new WallSquare(0,19),
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
            //Border Walls (Top)
            new WallSquare(0,3),
            new WallSquare(0,4),
            new WallSquare(0,5),
            new WallSquare(0,6),
            new WallSquare(0,7),
            new WallSquare(0,8),
            new WallSquare(0,9),
            new WallSquare(0,10),
            new WallSquare(0,11),
            new WallSquare(0,12),
            new WallSquare(0,13),
            new WallSquare(0,14),
            new WallSquare(0,15),
            new WallSquare(0,16),
            new WallSquare(0,17),
            new WallSquare(0,18),
            //Inside Walls (Top Right)
            new WallSquare(9,18),
            new WallSquare(9,17),
            new WallSquare(9,16),
            new WallSquare(8,15),
            new WallSquare(7,14),
            new WallSquare(5,12),
            new WallSquare(4,11),
            //Inside Walls (Bottom Right)
            new WallSquare(12,13),
            new WallSquare(12,14),
            new WallSquare(12,15),
            new WallSquare(12,16),
            new WallSquare(13,16),
            new WallSquare(14,16),
            new WallSquare(15,16),
            new WallSquare(16,16),
            new WallSquare(17,16),
            new WallSquare(18,16),
            new WallSquare(16,11),
            new WallSquare(16,12),
            new WallSquare(16,13),
            //Middle Wall
            new WallSquare(1,10),
            new WallSquare(2,10),
            new WallSquare(3,10),
            new WallSquare(4,10),
            new WallSquare(5,10),
            new WallSquare(6,10),
            new WallSquare(7,10),
            new WallSquare(8,10),
            new WallSquare(9,10),
            new WallSquare(10,10),
            new WallSquare(11,10),
            new WallSquare(12,10),
            new WallSquare(13,10),
            new WallSquare(14,10),
            new WallSquare(15,10),
            new WallSquare(16,10),
            new WallSquare(1,9),
            new WallSquare(2,9),
            //inside walls (Left)
            new WallSquare(7,1),
            new WallSquare(7,2),
            new WallSquare(7,3),
            new WallSquare(7,4),
            new WallSquare(7,5),
            new WallSquare(7,6),
            new WallSquare(7,7),
            new WallSquare(12,3),
            new WallSquare(12,4),
            new WallSquare(12,5),
            new WallSquare(12,6),
            new WallSquare(12,7),
            new WallSquare(12,8),
            new WallSquare(12,9),
            
        };
        return walls;
        
       

    }

    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException {
         DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(17,19),
             new DirtFloorSquare(18,19)
         };
         return dirtFloor;
    }

    @Override
    public FloorTrapSquare[] getTraps() throws IOException {
         FloorTrapSquare[] traps = {
            new CeilingDart(3,3),
            new CeilingDart(5,14),
            new CeilingDart(8,7),
            new CeilingDart(8,9),
            new CeilingDart(9,3),
            new CeilingDart(11,6),
            new CeilingDart(15,4),
            new CeilingDart(17,8),
            new CeilingDart(18,12),
            new CeilingDart(12,12),
            new CeilingDart(15,17)
        };
         return traps;
    }

    @Override
    public MapSquare[] getMiscSquares() throws IOException {
        MapSquare[] myMisc ={
            new ChestSquare(2,17), 
            new ChestSquare(18,1),
            new StrengthSquare(8,13),
            new StrengthSquare(15,8)
     };
        
    
        return myMisc;
        
    }

    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            new Skeleton("Paul",12,12),
            new HumanSizedLizard("Big Liz",5,14),
            new Skeleton("Ombre",15,17),
            new HumanSizedLizard("Princess Liz",18,12),
            new Skeleton("Kyle",17,8),
            new Skeleton("Ronald",15,4),
            new Skeleton("Duck",11,6),
            new Skeleton("Chilled",8,7),
            new Skeleton("Leo",8,9),
            new HumanSizedLizard("Prince Liz",9,3),
            new HumanSizedLizard("Queen Lizard",3,3)
            
            
            
        };
        return monsters;
    }

    @Override
    public void addMessages(MapSquare[][] squares) {
       squares[18][18].message = "\nYou now enter the middle section of the huge"
               + "dungeon, with just a skeleton in front of you, this seems easy";
       squares[17][18].message = "\nYou now enter the middle section of the huge"
               + "dungeon, with just a skeleton in front of you, this seems easy";
       squares[10][16].message = "\nThis empty room has two ways, one with"
               + "a huge Lizard, the other with a skeleton, but you see a chest"
               + "behind the Lizard!";
       squares[11][16].message = "\nThis empty room has two ways, one with"
               + "a huge Lizard, the other with a skeleton, but you see a chest"
               + "behind the Lizard!";
       squares[17][13].message = "\nThis hallway leads to a series of fierce "
               + "battles with traps nearby as well. A Chest is also visible";
       squares[18][13].message = "\nThis hallway leads to a series of fierce "
               + "battles with traps nearby as well. A Chest is also visible";
       squares[12][1].message = "\nYou have been through many battles, you feel"
               + " the exit is near and there are a plethra of enemies in your way";
       squares[12][2].message = "\nYou have been through many battles, you feel"
               + " the exit is near and there are a plethra of enemies in your way";
       squares[0][1].message = "\nYou have survived... but you're quest is far"
               + " from over...";
       squares[0][2].message = "\nYou have survived... but you're quest is far"
               + " from over...";
       
    }

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(18,19);
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {
            new MapCoord(0,1),
            new MapCoord(0,2)
            };
        return exits;
    }
    
}
