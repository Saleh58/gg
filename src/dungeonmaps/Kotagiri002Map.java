/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Kotagiri002Troll;
import dnd.characters.Monster;
import dnd.dnditems.DnDItem;
import dnd.dnditems.RustySword;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


/**
 *
 * @author kotagiri
 */

public class Kotagiri002Map implements MapMakerIF{

    public final String title = "Kotagiri Map"; //assigning title name. 
    //Adding description to the mapDescription.
    public final String mapDesc = "This is Kotagiri002 Dungens and dragons map. "
            + "Please enjoy killing monsters and exploring story";
    public final ImageIcon mapImg;
    public Kotagiri002Map() throws IOException {    //adding the map image
        mapImg = new ImageIcon(ImageIO.read(new File("img//kotagiriMap.png")));
    }
    
    @Override
    public String getName() {
        return title;
    }

    @Override
    public String getMapDesc() {
        return mapDesc; //return the map desc 
        }

    @Override
    public ImageIcon getMapImg() {
    return mapImg; //return the map Image   
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
            
            new WallSquare(1,10),
            new WallSquare(2,10),
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
            new WallSquare(6,6),
            new WallSquare(7,6),
            new WallSquare(8,2),
            new WallSquare(8,3),
            new WallSquare(8,4),
            new WallSquare(8,5),
            new WallSquare(8,6),
            new WallSquare(10,3),
            new WallSquare(11,3),
            new WallSquare(12,3),
            new WallSquare(13,3),
            new WallSquare(14,3),
            new WallSquare(15,3),
            new WallSquare(13,9),
            new WallSquare(12,9),
            new WallSquare(11,9),
            new WallSquare(10,9),
            new WallSquare(9,9),
            new WallSquare(8,9),
            new WallSquare(7,9),
            new WallSquare(6,9),
            new WallSquare(6,10),
            new WallSquare(6,11),
            new WallSquare(6,12),
            new WallSquare(6,13),
            new WallSquare(7,13),
            new WallSquare(8,13),
            new WallSquare(10,13),
            new WallSquare(11,13),
            new WallSquare(12,13),
            new WallSquare(13,13),
            new WallSquare(13,12),
            new WallSquare(13,14),
            //new WallSquare(13,15),
            new WallSquare(13,16),
            new WallSquare(12,16),
            new WallSquare(11,16),
            new WallSquare(10,16),
            new WallSquare(9,16),
            new WallSquare(8,16),
            new WallSquare(7,16),
            new WallSquare(14,12),
            new WallSquare(15,12),
            new WallSquare(16,12),
            new WallSquare(17,12),
	    new WallSquare(17,13),
	    new WallSquare(17,14),
            new WallSquare(17,15),
            new WallSquare(17,16),
            new WallSquare(17,17),
            new WallSquare(17,18),
	    new WallSquare(17,9),
            new WallSquare(18,9)
            
        };

        return walls;
    }

    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException {
        DirtFloorSquare[] dirtFloor = { //Creating the dirt floor int the entrance.
            new DirtFloorSquare(0,11),
            new DirtFloorSquare(0,12),  //arranging the floor on specified path.
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
        };
        return dirtFloor;
    }

    @Override
    public FloorTrapSquare[] getTraps() throws IOException  {
        FloorTrapSquare[] traps = { //creating the traps to hurt. 
                 /* Creating four poison trap objects with different damages at different positions
        and enabling them with true parameter*/
            new Kotagiri002Poisontrap(3, 7),
            new Kotagiri002Poisontrap(2, 9),
            new Kotagiri002Poisontrap(1, 3),
            new Kotagiri002Poisontrap(4, 10)
        };
        return traps;
    }

    @Override
    public MapSquare[] getMiscSquares() throws IOException {
         ChestSquare myChest = new ChestSquare(15,17);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new RustySword();
        //Creating the health miscellous weapon and positioning it.
        Kotagiri002Health heal1 = new Kotagiri002Health(5, 11, 5, true);
        Kotagiri002Health heal2 = new Kotagiri002Health(5, 4, 4, true);
        MapSquare[] misc = {
            myChest, heal1, heal2
        };
        return misc;
    }


    @Override
    public Monster[] getMonsters() { // Created monsters for attack and damage.
        Monster[] monsters = {
            //Adding monsters to the monster class and positioning it.
            new Kotagiri002Troll("Seji", 6, 2),
            new Kotagiri002Troll("Tzane", 7, 14),
            new Kotagiri002Troll("Highgri", 16, 16),
            new Kotagiri002Troll("Gija",16,6)
        };
        return monsters;
    }

    @Override
    public void addMessages(MapSquare[][] squares) { //commenting the sherk path.
        
        squares[17][10].message = "\n You are starting into a gaint hall.  There"
                + " are great monsters or great treasure waiting for you";
        squares[16][11].message = "\n You are starting into a gaint hall.  There" 
                + " are great monsters or great treasure waiting for you";
        squares[15][9].message = "\n As you turn the corner you will see a lanther light"
                + "with an opening on the south wall.  Smells of flesh "
                + " You hear faint sound of scaping and the slacking metal";
        squares[16][3].message = "\nYou peer into the a dark room.  You can see the "
                + "status that gievs you blessings to win the game";
        squares[8][1].message = "\nYou enter a large corridor with high ceilings "
                + "that turns to the left at the end. And turn "
                + "immediately to the north.";
        squares[5][8].message = "\nAs you approach the room before you, you can't "
                + "help but think this is as far most make it.  Decomposing "
                + "bodies scratter the floor of the room.";
        squares[6][14].message = "\nAs you approach the room before you, you can't "
                + "help but think this is as far most make it.  Decomposing "
                + "bodies scratter the floor of the room.";
        squares[5][16].message = "\nYou swing wide of the door robbing the waiting "
                + "skeleton of its surprise. Have at it!";
        squares[13][17].message = "\nYou are surpirsed by a skeleton that seems to"
                + "have been waiting for you. It slashes out.";
        squares[3][15].message = "\nYou can see light from outside coming from an"
                + " opening on the north wall. You are nearly there!";
        squares[3][12].message = "\nYou can see light from outside coming from an"
                + " opening on the north wall. You are nearly there!";
    
    }

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(19,19); //adding map coordinates for entrance.
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {   //adding coordinates for exit.
            new MapCoord(0,11),
            new MapCoord(0,12)
            };
        return exits;
    }
}