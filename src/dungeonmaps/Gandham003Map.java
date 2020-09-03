/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.GandhamDemogorgon;
import dnd.characters.GandhamDrogon;
import dnd.characters.GandhamNightking;
import dnd.characters.GandhamZombie;
import dnd.characters.Monster;
import dnd.dnditems.DnDItem;
import dnd.dnditems.RustySword;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
/**
 *
 * @author Joshi Gandham
 */
public class Gandham003Map implements MapMakerIF{
    
    private final String title = "Gandham003Map";
    public final String mapDesc = "Welcome to Gandham003's Map."
            + "Get Ready for an Adventure... Enjoy!";
    public final ImageIcon mapImg;
    public Gandham003Map() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//Gandham003Map.png")));
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
            ////exit
            // new WallSquare(0,1),
            // new WallSquare(0,2),
            ////end exit
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
            new WallSquare(19,10),
            new WallSquare(19,11),
            new WallSquare(19,12),
            
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
            
            ////end west north wall
            
            new WallSquare(1,3),
            new WallSquare(2,3),
            new WallSquare(3,3),
            new WallSquare(4,3),
            
            //end west wall
            new WallSquare(7,1),
            new WallSquare(7,2),
            new WallSquare(7,3),
            new WallSquare(7,4),
            new WallSquare(7,5),
            new WallSquare(7,6),
            
            //end west upper wall
            new WallSquare(4,6),
            new WallSquare(5,6),
            new WallSquare(6,6),
            
            //mid west wall
            new WallSquare(1,9),
            new WallSquare(2,9),
            new WallSquare(3,9),
            new WallSquare(4,9),
            new WallSquare(5,9),
            new WallSquare(6,9),
            new WallSquare(7,9),
            new WallSquare(8,9),
            new WallSquare(9,9),
            new WallSquare(10,9),
            new WallSquare(11,9),
            
            //mid west south wall
            new WallSquare(11,3),
            new WallSquare(11,4),
            new WallSquare(11,5),
            new WallSquare(11,6),
            new WallSquare(11,7),
            new WallSquare(11,8),
            
            //mid west down wall
            new WallSquare(12,3),
            new WallSquare(13,3),
            new WallSquare(14,3),
            new WallSquare(15,3),
            
            //west south wall
            new WallSquare(15,4),
            new WallSquare(15,5),
            new WallSquare(15,6),
            
            //mid east wall
            new WallSquare(3,12),
            new WallSquare(4,12),
            new WallSquare(5,12),
            new WallSquare(6,12),
            new WallSquare(7,12),
            new WallSquare(8,12),
            new WallSquare(9,12),
            new WallSquare(10,12),
            new WallSquare(11,12),
            new WallSquare(12,12),
            new WallSquare(13,12),
            new WallSquare(14,12),
            new WallSquare(15,12),
            new WallSquare(16,12),
            new WallSquare(17,12),
            new WallSquare(18,12),
            
            //north east wall
            new WallSquare(3,13),
            new WallSquare(3,14),
            new WallSquare(3,15),
            
            //down to north east wall
            new WallSquare(7,13),
            new WallSquare(7,14),
            new WallSquare(7,15),
            new WallSquare(7,16),
            
            //wall linked with east boundry 
            new WallSquare(10,16),
            new WallSquare(10,17),
            new WallSquare(10,18),
            
            //down south east wall
            new WallSquare(13,13),
            new WallSquare(13,14),
            new WallSquare(13,15),
            
             //down south east entrance wall
            new WallSquare(17,16),
            new WallSquare(17,17),
            new WallSquare(17,18)
        };

        return walls;
    }

    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException {
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(0,1),
            new DirtFloorSquare(0,2),
            new DirtFloorSquare(1,1),
            new DirtFloorSquare(1,2),
            new DirtFloorSquare(17,13),
            new DirtFloorSquare(17,14),
            new DirtFloorSquare(17,15),
            new DirtFloorSquare(18,13),
            new DirtFloorSquare(18,14),
            new DirtFloorSquare(18,15),
            new DirtFloorSquare(18,16),
            new DirtFloorSquare(18,17),
            new DirtFloorSquare(18,18),
            new DirtFloorSquare(18,19),
            new DirtFloorSquare(19,13),
            new DirtFloorSquare(19,14),
            new DirtFloorSquare(19,15),
            new DirtFloorSquare(19,16),
            new DirtFloorSquare(19,17),
            new DirtFloorSquare(19,17),
            new DirtFloorSquare(19,18),
            new DirtFloorSquare(19,19),
           
        };
        return dirtFloor;
    }

    @Override
    public FloorTrapSquare[] getTraps() throws IOException  {
        FloorTrapSquare[] traps = {
            new Gandham003Gastrap(1,6),
            new Gandham003Gastrap(17,1),
            new Gandham003Gastrap(14,10),
            new Gandham003Gastrap(9,14),
            new Gandham003Gastrap(13,17)
        };
        return traps;
    }

    @Override
    public MapSquare[] getMiscSquares() throws IOException {
          ChestSquare myChest = new ChestSquare(12,17);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new RustySword();
        MapSquare[] misc = {
            myChest,
            new PortalSquare(2,13,14,10)    
        };
        return misc;
    }


    @Override
    public Monster[] getMonsters() { // Created monsters for attack and damage.
        Monster[] monsters = {
            new GandhamZombie("Clown",2,18), //assigning the position of the monster with name.
            new GandhamDemogorgon("Rockstar", 9, 2),
            new GandhamDrogon("Dorgon", 13, 7),
            new GandhamZombie("Demodog", 4, 10),
            new GandhamNightking("The Night King", 4, 1)
            };
        return monsters;
    }

    @Override
    public void addMessages(MapSquare[][] squares) { //commenting the sherk path.
        
        squares[17][13].message = "\nYou are looking into a wide corridor.  There"
                + " are signs of great battles";
        squares[17][14].message = "\nYou are looking into a wide corridor.  There"
                + " are signs of great battles";
        squares[17][15].message = "\nYou are looking into a wide corridor.  There"
                + " are signs of great battles";
        squares[12][11].message = "\n As you turn the corner you will see a lanther light"
                + "with an opening on the south wall.  Smells of flesh "
                + " You hear faint sound of scaping and the slacking metal";
        squares[13][16].message = "\nYou peer into the a dark room.  You can see the "
                + "status that gievs you blessings to win the game";
        squares[14][16].message = "\nYou are straing into the a dark room.  Look aound "
                + "and move..something is waiting for you!!";
        squares[14][17].message = "\nYou are straing into the a dark room.  Look aound "
                + "and move..something is waiting for you!!";
        squares[14][18].message = "\nYou are straing into the a dark room.  Look aound "
                + "and move..something is waiting for you!!";
        squares[10][13].message = "\nYou enter a large corridor with high ceilings "
                + "that turns to the left at the end. And turn "
                + "immediately to the north.";
        squares[10][14].message = "\nYou enter a large corridor with high ceilings "
                + "that turns to the left at the end. And turn "
                + "immediately to the north.";
        squares[10][15].message = "\nYou enter a large corridor with high ceilings "
                + "that turns to the left at the end. And turn "
                + "immediately to the north.";
        squares[3][16].message = "\nAs you approach the room before you, you can't "
                + "help but think this is as far most make it.  Decomposing "
                + "bodies scratter the floor of the room.";
        squares[3][17].message = "\nAs you approach the room before you, you can't "
                + "help but think this is as far most make it.  Decomposing "
                + "bodies scratter the floor of the room.";
        squares[3][18].message = "\nAs you approach the room before you, you can't "
                + "help but think this is as far most make it.  Decomposing "
                + "bodies scratter the floor of the room.";
        squares[1][14].message = "\nThere is something in the passage "
                + "keep an eye on.";
        squares[2][14].message = "\nThere is something in the passage "
                + "keep an eye on.";
        squares[3][10].message = "\nYou are entering a long "
                + "hallway where you can samell" + "the blood!!";
        squares[3][11].message = "\nYou are entering a long "
                + "hallway where you can samell" + "the blood!!";
        squares[11][10].message = "\nYou are at the entrance" 
                + "of the large room and you are straing at the dead bodies.";
        squares[11][11].message = "\nYou are at the entrance" 
                + "of the large room and you are straing at the dead bodies.";
        squares[16][2].message = "\nYou are about to enter"
                + " into a hallway where it extends towards the north!";
        squares[17][2].message = "\nYou are about to enter"
                + " into a hallway where it extends towards the north!";
        squares[18][2].message = "\nYou are about to enter"
                + " into a hallway where it extends towards the north!";
        squares[10][1].message = "\nYou are at the passage"
                + " where it strechs to the right and its fully dark!!";
        squares[10][2].message = "\nYou are at the passage"
                + " where it strechs to the right and its fully dark!!";
        squares[3][6].message = "\nYou are at the NOTH ROOM it"
                + " is full of surprises watch out!";
        squares[3][7].message = "\nYou are at the NOTH ROOM it"
                + " is full of surprises watch out!";
        squares[3][8].message = "\nYou are at the NOTH ROOM it"
                + " is full of surprises watch out!";
        squares[5][1].message = "\nYou are about to"
                + " face your last enemy or ESCAPE!!!!";
        squares[5][2].message = "\nYou are about to"
                + " face your last enemy or ESCAPE!!!!";
        squares[1][1].message = "\nYou can see light from outside coming from an"
                + " opening on the north wall. You are now a HERO!!";
        squares[1][2].message = "\nYou can see light from outside coming from an"
                + " opening on the north wall. You are now a HERO!!";
    
    }

    @Override
    public MapCoord setEntrance() {
       return new MapCoord(19,19); //adding map coordinates for entrance.
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {   //adding coordinates for exit.
            new MapCoord(0,1),
            new MapCoord(0,2)
            };
        return exits;
    }
}
        
    
