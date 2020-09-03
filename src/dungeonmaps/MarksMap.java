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
public class MarksMap implements MapMakerIF{
    
    private final String title = "Mark's Map";
    public final String mapDesc = "Welcome to Mark's Map. This map is used as a "
            + "template to make the DnD program.  Go kill some skeletons... Enjoy!";
    public final ImageIcon mapImg;
    public MarksMap() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//MarksMap.png")));
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
            ////exit
            //new WallSquare(0,11),
            //new WallSquare(0,12),
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
            
            new WallSquare(1,13),
            new WallSquare(2,13),
            new WallSquare(3,6),
            new WallSquare(3,7),
            new WallSquare(3,8),
            new WallSquare(3,9),
            new WallSquare(3,10),
            new WallSquare(3,11),
            new WallSquare(3,12),
            new WallSquare(3,13),
            new WallSquare(3,16),
            new WallSquare(3,17),
            new WallSquare(3,18),
            new WallSquare(4,6),
            new WallSquare(5,6),
            new WallSquare(6,6),
            new WallSquare(7,6),
            new WallSquare(7,9),
            new WallSquare(7,10),
            new WallSquare(7,11),
            new WallSquare(7,12),
            new WallSquare(7,13),
            new WallSquare(7,14),
            new WallSquare(7,15),
            new WallSquare(7,16),
            new WallSquare(8,3),
            new WallSquare(8,4),
            new WallSquare(8,5),
            new WallSquare(8,6),
            new WallSquare(8,9),
            new WallSquare(9,9),
            new WallSquare(10,9),
            new WallSquare(10,12),
            new WallSquare(10,13),
            new WallSquare(10,14),
            new WallSquare(10,15),
            new WallSquare(10,16),
            new WallSquare(10,17),
            new WallSquare(10,18),
            new WallSquare(11,1),
            new WallSquare(11,2),
            new WallSquare(11,3),
            new WallSquare(11,4),
            new WallSquare(11,5),
            new WallSquare(11,6),
            new WallSquare(11,9),
            new WallSquare(12,9),
            new WallSquare(13,9),
            new WallSquare(13,12),
            new WallSquare(13,13),
            new WallSquare(13,14),
            new WallSquare(13,15),
            new WallSquare(13,18),
            new WallSquare(14,9),
            new WallSquare(14,12),
            new WallSquare(15,9),
            new WallSquare(15,12),
            new WallSquare(16,9),
            new WallSquare(16,12),
            new WallSquare(17,9),
            new WallSquare(17,12),
            new WallSquare(17,13),
            new WallSquare(17,14),
            new WallSquare(17,15),
            new WallSquare(17,16),
            new WallSquare(17,17),
            new WallSquare(17,18),
            new WallSquare(18,9)
            
        };
        return walls;
    }
    
    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            new BigPharoah("George",2,2),
            new BigPharoah("Ruby", 15, 15)
        };
        return monsters;
    }
    
    @Override
    public FloorTrapSquare[] getTraps()throws IOException{
        FloorTrapSquare[] traps = {
            new SpikeTrapSquare(9,6),
            new SpikeTrapSquare(6,16),
            new SpikeTrapSquare(4,13),
            new SpikeTrapSquare(3,4),
            new SpikeTrapSquare(2,16),
            new SpikeTrapSquare(1,16),
            new SpikeTrapSquare(1,10),
            new SpikeTrapSquare(2,10)
        };
        return traps;
    }
    
    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException{
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(0,11),
            new DirtFloorSquare(0,12),
            new DirtFloorSquare(17,10), //entrance message index: 2
            new DirtFloorSquare(17,11), //entrance message index: 3
            new DirtFloorSquare(18,10),
            new DirtFloorSquare(19,10),
            new DirtFloorSquare(18,11),
            new DirtFloorSquare(19,11),
            new DirtFloorSquare(18,12),
            new DirtFloorSquare(19,12),
            new DirtFloorSquare(18,13),
            new DirtFloorSquare(19,13),
            new DirtFloorSquare(18,14),
            new DirtFloorSquare(19,14),
            new DirtFloorSquare(18,15),
            new DirtFloorSquare(19,15),
            new DirtFloorSquare(18,16),
            new DirtFloorSquare(19,16),
            new DirtFloorSquare(18,17),
            new DirtFloorSquare(19,17),
            new DirtFloorSquare(18,18),
            new DirtFloorSquare(19,18),
            new DirtFloorSquare(18,19),
            new DirtFloorSquare(19,19)
        };
        return dirtFloor;
    }
    
    @Override
    public MapSquare[] getMiscSquares() throws IOException{
        ChestSquare myChest = new ChestSquare(15,17);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new CursedBlade();
        MapSquare[] misc = {
            myChest,
            new PortalSquare(12,18,1,1)    
        };
        return misc;
    } 
    
    @Override
    public void addMessages(MapSquare[][] squares){
        
        squares[17][10].message = "\nYou are staring into a dark cold hallway.  There"
                + " are signs of battle and the odor of the fallen";
        squares[17][11].message = "\nYou are staring into a dark cold hallway.  There"
                + " are signs of battle and the odor of the fallen";
        squares[12][11].message = "\nAs you turn the corner you see a dimly lit "
                + "corridor with an opening on the south wall.  Smells of fresh "
                + "death. You hear faint sound of scaping and the slacking metal";
        squares[13][16].message = "\nYou peer into the a dark room.  You can see the "
                + "silhouette of two thin figures who seem very interested in "
                + "something in the middle of the room.";
        squares[6][17].message = "\nYou enter a large corridor with high ceilings "
                + "that turns to the left at the end. There is an opening "
                + "immediately to the north.";
        squares[11][7].message = "\nAs you approach the room before you, you can't "
                + "help but think this is as far most make it.  Decomposing "
                + "bodies scratter the floor of the room.";
        squares[11][8].message = "\nAs you approach the room before you, you can't "
                + "help but think this is as far most make it.  Decomposing "
                + "bodies scratter the floor of the room.";
        squares[8][1].message = "\nYou swing wide of the door robbing the waiting "
                + "skeleton of its surprise. Have at it!";
        squares[8][2].message = "\nYou are surpirsed by a skeleton that seems to"
                + "have been waiting for you. It slashes out.";
        squares[1][5].message = "\nYou can see light from outside coming from an"
                + " opening on the north wall. You are nearly there!";
        squares[2][5].message = "\nYou can see light from outside coming from an"
                + " opening on the north wall. You are nearly there!";
    }    

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(19,19);
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {
            new MapCoord(0,11),
            new MapCoord(0,11)
            };
        return exits;
    }
}