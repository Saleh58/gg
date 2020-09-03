/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Monster;
import dnd.characters.BigPharoah;
import dnd.dnditems.DnDItem;
import dnd.dnditems.CursedBlade;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author SP20CIS182
 */
public class TestMap implements MapMakerIF{
    public final String title = "Test Map";
    public final String mapDesc = "This is a test map... not much here!";
    public final ImageIcon mapImg;
    public TestMap() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//TestMap.png")));
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
            //new WallSquare(18,19),//entrance
            new WallSquare(19,19),
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
            
            //Capital T
            new WallSquare(3,2),
            new WallSquare(3,3),
            new WallSquare(3,4),
            new WallSquare(3,5),
            new WallSquare(3,6),
            new WallSquare(4,4),
            new WallSquare(5,4),
            new WallSquare(6,4),
            new WallSquare(7,4),
            new WallSquare(8,4),
            new WallSquare(9,4),
            new WallSquare(10,4),
            //Capital E
            new WallSquare(5,6),
            new WallSquare(5,7),
            new WallSquare(5,8),
            new WallSquare(6,6),
            new WallSquare(7,6),
            new WallSquare(8,6),
            new WallSquare(8,7),
            new WallSquare(8,8),
            new WallSquare(9,6),
            new WallSquare(10,6),
            new WallSquare(11,6),
            new WallSquare(12,6),
            new WallSquare(12,7),
            new WallSquare(12,8),
            //Capital S
            new WallSquare(7,10),
            new WallSquare(7,11),
            new WallSquare(7,12),
            new WallSquare(8,10),
            new WallSquare(9,10),
            new WallSquare(10,10),
            new WallSquare(10,11),
            new WallSquare(10,12),
            new WallSquare(11,12),
            new WallSquare(12,12),
            new WallSquare(13,12),
            new WallSquare(14,12),
            new WallSquare(14,11),
            new WallSquare(14,10),
            //Lower Case t
            new WallSquare(9,15),
            new WallSquare(10,15),
            new WallSquare(11,14),
            new WallSquare(11,15),
            new WallSquare(11,16),
            new WallSquare(12,15),
            new WallSquare(13,15),
            new WallSquare(14,15),
            new WallSquare(15,15),
            new WallSquare(16,15),
            new WallSquare(16,16)
            
        };
        return walls;
    }
    
    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            new BigPharoah("Fred", 15, 13),
            new BigPharoah("Larry", 5, 11),
            new BigPharoah("Lucy", 7, 2)
        };
        return monsters;
    }
    
    @Override
    public FloorTrapSquare[] getTraps()throws IOException{
        FloorTrapSquare[] traps = {
            new SpikeTrapSquare(1,1),
            new SpikeTrapSquare(18,18)
        };
        return traps;
    }
    
    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException{
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(18,19),
            new DirtFloorSquare(1,0)
        };
        return dirtFloor;
    }
    
    public MapSquare[] getMiscSquares() throws IOException{
        ChestSquare myChest = new ChestSquare(2,17);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new CursedBlade();
        MapSquare[] misc = {
            myChest
        };
        return misc;
    } 
    
    @Override
    public void addMessages(MapSquare[][] squares){
        squares[1][0].message = "\nThis is the end";
        squares[17][18].message = "\nYou have begun!";
        squares[17][17].message = "\nYou have begun!";
        squares[18][17].message = "\nYou have begun!";
        
    }
    
    @Override
    public MapCoord setEntrance() {
        return new MapCoord(18,19);
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {
            new MapCoord(18,19)
        };
        return exits;
    }
}

