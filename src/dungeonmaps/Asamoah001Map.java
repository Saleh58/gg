/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Bugbear;
import dnd.characters.Dragon;
import dnd.characters.Gobelin;
import dnd.characters.Manticore;
import dnd.characters.Monster;
import dnd.characters.Skeleton;
import dnd.dnditems.DnDItem;
import dnd.dnditems.RustySword;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author SP20CIS182
 */
public class Asamoah001Map implements MapMakerIF{
    
    private final String title = "Asamoah001's Map";
    public final String mapDesc = "Welcome to Asamoah001's Map. This map is used as a "
            + "template to make the DnD program.  Go kill some skeletons... Enjoy!";
    public final ImageIcon mapImg;
    public Asamoah001Map() throws IOException {
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
            new WallSquare(18,4),
            new WallSquare(17,4),
            new WallSquare(16,4),
            new WallSquare(15,4),
            new WallSquare(14,4),
            new WallSquare(14,9),
            new WallSquare(14,8),
            new WallSquare(14,7),
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
            new WallSquare(18,9),
            
        };
        return walls;
    }
    
    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            new Manticore("Paul's Manticore",1,10),
            new Bugbear("Paul's Bugbear", 2, 2),
            new Dragon ("Paul's Dragon ", 12,18),
            new Manticore("Paul's", 7, 3),
            new Skeleton("Paul's", 13, 2),
            new Dragon ("Paul's Dragon ", 16, 6),
            new Gobelin("Paul's Gobelin", 1, 18),
            new Gobelin("Paul's Gobelin", 5, 11),
        };
        return monsters;
    }
    
    @Override
    public FloorTrapSquare[] getTraps()throws IOException{
        FloorTrapSquare[] traps = {
            new SpikeTrapSquare(9,6),
            new FireTrap (12,16),
            new SpikeTrapSquare(18,3),
            new EarthTrap(3,4),
            new WindTrap(2,16),
            new WaterTrap(1,16),
            new BearTrap(15,14),
            new FireTrap (12,16),
        };
        return traps;
    }
    
    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException{
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(0,11),
            new DirtFloorSquare(0,12),
            new DirtFloorSquare(17,10),
            new DirtFloorSquare(17,11),
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
            new DirtFloorSquare(19,19),
            new DirtFloorSquare(16,11),
            new DirtFloorSquare(16,10),
            new DirtFloorSquare(15,11),
            new DirtFloorSquare(15,10),
            new DirtFloorSquare(14,11),
            new DirtFloorSquare(14,10),
            new DirtFloorSquare(13,11),
            new DirtFloorSquare(13,10),
            new DirtFloorSquare(12,10),
            new DirtFloorSquare(12,11),
            new DirtFloorSquare(11,10),
            new DirtFloorSquare(11,11),
            new DirtFloorSquare(10,10),
            new DirtFloorSquare(10,11),
            new DirtFloorSquare(9,10),
            new DirtFloorSquare(9,11),
            new DirtFloorSquare(8,10),
            new DirtFloorSquare(8,11),
            new DirtFloorSquare(8,17),
            new DirtFloorSquare(8,17),
            new DirtFloorSquare(8,18),
            new DirtFloorSquare(8,18),
            new DirtFloorSquare(9,17),
            new DirtFloorSquare(9,17),
            new DirtFloorSquare(9,18),
            new DirtFloorSquare(9,18),
            new DirtFloorSquare(8,12),
            new DirtFloorSquare(8,13),
            new DirtFloorSquare(8,14),
            new DirtFloorSquare(8,15),
            new DirtFloorSquare(8,16),
            new DirtFloorSquare(9,12),
            new DirtFloorSquare(9,13),
            new DirtFloorSquare(9,14),
            new DirtFloorSquare(9,15),
            new DirtFloorSquare(9,16),
            new DirtFloorSquare(11,12),
            new DirtFloorSquare(11,13),
            new DirtFloorSquare(11,14),
            new DirtFloorSquare(11,15),
            new DirtFloorSquare(11,16),
            new DirtFloorSquare(11,12),
            new DirtFloorSquare(11,13),
            new DirtFloorSquare(11,14),
            new DirtFloorSquare(11,15),
            new DirtFloorSquare(11,16),
            new DirtFloorSquare(12,12),
            new DirtFloorSquare(12,13),
            new DirtFloorSquare(12,14),
            new DirtFloorSquare(12,15),
            new DirtFloorSquare(12,16),
            new DirtFloorSquare(12,12),
            new DirtFloorSquare(12,13),
            new DirtFloorSquare(12,14),
            new DirtFloorSquare(12,15),
            new DirtFloorSquare(12,16),
            new DirtFloorSquare(12,17),
            new DirtFloorSquare(12,18),
            new DirtFloorSquare(11,17),
            new DirtFloorSquare(11,18),
            new DirtFloorSquare(14,13),
            new DirtFloorSquare(14,14),
            new DirtFloorSquare(14,15),
            new DirtFloorSquare(14,16),
            new DirtFloorSquare(14,17),
            new DirtFloorSquare(14,18),
            new DirtFloorSquare(15,13),
            new DirtFloorSquare(15,15),
            new DirtFloorSquare(15,16),
            new DirtFloorSquare(15,17),
            new DirtFloorSquare(15,18),
            new DirtFloorSquare(16,13),
            new DirtFloorSquare(16,14),
            new DirtFloorSquare(16,15),
            new DirtFloorSquare(16,16),
            new DirtFloorSquare(16,17),
            new DirtFloorSquare(16,18),
            new DirtFloorSquare(13,16),
            new DirtFloorSquare(13,17),
            new DirtFloorSquare(13,12),
            new DirtFloorSquare(13,13),
            new DirtFloorSquare(13,14),
            new DirtFloorSquare(13,15),
            new DirtFloorSquare(13,18),
            new DirtFloorSquare(15,14),
        
        };
        return dirtFloor;
    }
    
    @Override
    public MapSquare[] getMiscSquares() throws IOException{
        ChestSquare myChest = new ChestSquare(12,1);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new RustySword();
        MapSquare[] misc = {
            myChest,
            new PortalSquare(10,12,5,5),
            new PortalSquare(1,17,18,1),
            new MagicBox(2,5),
            new MagicBox(16,8),
        };
        return misc;
    } 
    
    
    
    @Override
    public void addMessages(MapSquare[][] squares){
         
        squares[1][17].message = "\nYou have ented a telePortal zoon...haha.";
        squares[18][1].message = "\nYou welcome out of a telePortal zoon...Good!.";
        squares[10][12].message = "\nYou have ented a telePortal zoon...haha.";
        squares[5][5].message = "\nYou welcome out of a telePortal zoon...Good!.";
        squares[16][8].message = "\nYou have open a white Magic Box.";
        squares[2][5].message = "\nYou have open a dark Magic Box.";
        squares[19][18].message = "\nYou are starting into a dark cold journey.";
        squares[18][18].message = "\nYou are starting into a dark cold journey.";
        squares[17][10].message = "\nYou are staring into a dark cold hallway"
                + "There. are signs of battle and the odor of the fallen";
        squares[17][11].message = "\nYou are staring into a dark cold hallway."
                + "There. are signs of battle and the odor of the fallen";
        squares[12][11].message = "\nAs you turn the corner you see a dimly lit "
                + "corridor with an opening on the south wall.  Smells of fresh "
                + "death. You hear faint sound of scaping and the slacking metal";
        squares[11][12].message = "\nAs you turn the corner you see a dimly lit "
                + "death. You hear faint sound of scaping and the slacking metal";
        squares[10][12].message = "\nAs you turn the corner you see a dimly lit "
                + "corridor with an opening on the south wall.";
        squares[13][16].message = "\nYou peer into the a dark room.  You can see "
                +" there Smells of fresh blood. silhouette of two thin figures who "
                + "seem very interested in "
                + "something in the conners of the room.Watchout";
        squares[8][11].message = "\nAs you turn the corner you see a dimly lit "
                + "corridor with an opening on the south wall.  Smells of fresh "
                + "death await you";
        squares[7][11].message = "\nAs you turn the corner you see a dimly lit "
                + "corridor with an opening on the north-west wall. Smells of "
                + "bloody death. You hear faint sound of scaping and the slacking "
                + "metal";
        squares[6][17].message = "\nYou enter a large corridor with high ceilings "
                + "that turns to the left at the end. There is an opening "
                + "immediately to the north.";
        squares[6][18].message = "\nYou enter a large corridor with high ceilings "
                + "that turns to the left at the end. There is an opening "
                + "immediately to the north.";
        squares[5][9].message = "\nYou enter a large corridor with high ceilings "
                + "that turns to the left lead to the south." ;
        squares[4][9].message = "\nYou enter a large corridor with high ceilings "
                + "that turns to the left lead to the south." ;
        squares[11][7].message = "\nAs you approach the room before you, you can't "
                + "help but think this is as far most make it.  Decomposing "
                + "bodies scratter the floor of the room.";
        squares[8][7].message = "\nAs you approach the room before you, you can't "
                + "help but think this is as far most make it.  Decomposing "
                + "bodies scratter the floor of the room.";
        squares[7][7].message = "\nAs you approach the room before you, you can't "
                + "help but think this is as far most make it.  move further south"; 
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
