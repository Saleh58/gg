/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Monster;
import dnd.characters.Skeleton;
import dnd.characters.UndeadKnight;
import dnd.dnditems.DnDItem;
import dnd.dnditems.FlamingSword;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jkni1
 */
public class JohnsMap implements MapMakerIF{
    
    private final String title = "John's Map";
    public final String mapDesc = "Welcome to John's Map. Enjoy!";
    public final ImageIcon mapImg;
    public JohnsMap() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//JohnsMap.png")));
    }
    
    @Override
    public String getName(){
        return title;
    }
    
    @Override
    public String getMapDesc(){
        return mapDesc;
    }
    
    public ImageIcon getMapImg(){
        return mapImg;
    }
    
    @Override
    public WallSquare[] getWallSquares() {
        WallSquare[] walls = {
      //outside walls
            ////north wall
            new WallSquare(0,0),
            new WallSquare(0,1),
            new WallSquare(0,2),
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
            new WallSquare(19,19),
            ////entrance
            //new WallSquare(18,19),
            
            
            
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
            ////end south wall
            
            ////west wall
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
            
            new WallSquare(2,3),
            new WallSquare(2,11),
            new WallSquare(2,12),
            new WallSquare(2,13),
            new WallSquare(3,3),
            new WallSquare(3,13),
            new WallSquare(3,14),
            new WallSquare(3,15),
            new WallSquare(4,3),
            new WallSquare(4,4),
            new WallSquare(4,5),
            new WallSquare(4,6),
            new WallSquare(4,7),
            new WallSquare(4,15),
            new WallSquare(5,7),
            new WallSquare(5,8),
            new WallSquare(5,9),
            new WallSquare(5,15),
            new WallSquare(6,9),
            new WallSquare(6,13),
            new WallSquare(6,14),
            new WallSquare(6,15),
            new WallSquare(7,7),
            new WallSquare(7,8),
            new WallSquare(7,9),
            new WallSquare(7,13),
            new WallSquare(8,7),
            new WallSquare(8,13),
            new WallSquare(9,7),
            new WallSquare(9,13),
            new WallSquare(10,7),
            new WallSquare(10,13),
            new WallSquare(10,16),
            new WallSquare(11,7),
            new WallSquare(11,13),
            new WallSquare(11,16),
            new WallSquare(12,3),
            new WallSquare(12,4),
            new WallSquare(12,5),
            new WallSquare(12,6),
            new WallSquare(12,7),
            new WallSquare(12,13),
            new WallSquare(12,14),
            new WallSquare(12,15),
            new WallSquare(12,16),
            new WallSquare(13,3),
            new WallSquare(13,16),
            new WallSquare(14,3),
            new WallSquare(14,16),
            new WallSquare(15,3),
            new WallSquare(15,16),
            new WallSquare(16,1),
            new WallSquare(16,2),
            new WallSquare(16,3),
            new WallSquare(16,16),
            new WallSquare(16,17),
            new WallSquare(16,18),
            
            
        };
        return walls;
    }
    
    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            new Skeleton("Teddy",7,11),//message
            new Skeleton("Bob",7,12),//message
            new UndeadKnight("Gilpin the Mighty", 1, 3),//message
            new UndeadKnight("Hubelent the Valiant",8,17)//message
        };
        return monsters;
    }
    
    @Override
    public FloorTrapSquare[] getTraps()throws IOException{
        FloorTrapSquare[] traps = {
            new SpikeTrapSquare(17,15),
            new LavaTrapSquare(11,9),
            new LavaTrapSquare(8,3),
            new SpikeTrapSquare(1,10),
            new SpikeTrapSquare(1,2),
        };
        return traps;
    }
    
    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException{
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(18,19),
            new DirtFloorSquare(18,18),
            new DirtFloorSquare(18,17), //entrance message 
            new DirtFloorSquare(18,16), 
        };
        return dirtFloor;
    }
    
    @Override
    public MapSquare[] getMiscSquares() throws IOException{
        ChestSquare myChest = new ChestSquare(15,17);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new FlamingSword();
        MapSquare[] misc = {
            myChest,
            new BottomlessPit(1,15,18,11)    
        };
        return misc;
    } 
    
    @Override
    public void addMessages(MapSquare[][] squares){
        
        squares[18][17].message = "\nYou enter the dungeon, not sure as to what"
                + "may lie ahead of you";
        squares[18][16].message = "\nYou look ahead, but cannot see more than"
                + "a couple feet in front of you";
        squares[8][11].message = "\nA skeleton awaits for you to challenge"
                + "his boneyness";
        squares[8][12].message = "\nA skeleton awaits for you to challenge"
                + "his boneyness";
        squares[1][10].message = "\nThis hallway looks very suspicious"
                + "you wonder if you should make way in";
        squares[1][4].message = "\nAs you are nearing the end of your journey"
                + "you see another long dark hallway and become curious"
                + "as to what is down there";
    }

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(18,19);
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {
            new MapCoord(1,0),//exit message
            };
        return exits;
    }
}


