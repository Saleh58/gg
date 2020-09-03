/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Monster;
import dnd.dnditems.BrokenBeerBottle;
import dnd.dnditems.DnDItem;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import dnd.characters.MarkBlair;

/**
 *
 * @author seanh
 */
public class SeansMap implements MapMakerIF {

    private final String title = "Sean's Excessively Hard Map";
    public final String mapDesc = "Welcome to Sean's Excessively Hard Map. The"
            + " title doesn't lie and speaks for itself. No one has ever made"
            + " it out. Your goal is to beat those odds. There are a few "
            + "different paths you will encounter. This dungeon drives people"
            + " mad. Don't be among them.";
    public final ImageIcon mapImg;

    public SeansMap() throws IOException {
        //assigns mapImg as the SeansMap picture in the img folder
        mapImg = new ImageIcon(ImageIO.read(new File("img//SeansMap.png")));
    }

    @Override
    public String getName() {
        //returns the name of the map
        return title;
    }

    @Override
    public String getMapDesc() {
        return mapDesc;
    }

    @Override
    public ImageIcon getMapImg() {
        //gets the map image
        return mapImg;
    }

    @Override
    public WallSquare[] getWallSquares() {
        WallSquare[] walls = {
            //outside walls
            ////north wall
            new WallSquare(0, 0),
            new WallSquare(0, 1),
            new WallSquare(0, 2),
            new WallSquare(0, 3),
            new WallSquare(0, 6),
            new WallSquare(0, 7),
            new WallSquare(0, 8),
            new WallSquare(0, 9),
            new WallSquare(0, 10),
            new WallSquare(0, 11),
            new WallSquare(0, 12),
            new WallSquare(0, 13),
            new WallSquare(0, 14),
            new WallSquare(0, 15),
            new WallSquare(0, 16),
            new WallSquare(0, 17),
            new WallSquare(0, 18),
            new WallSquare(0, 19),
            //sets east wall
            new WallSquare(1, 19),
            new WallSquare(2, 19),
            new WallSquare(3, 19),
            new WallSquare(4, 19),
            new WallSquare(5, 19),
            new WallSquare(6, 19),
            new WallSquare(7, 19),
            new WallSquare(8, 19),
            new WallSquare(9, 19),
            new WallSquare(10, 19),
            new WallSquare(11, 19),
            new WallSquare(12, 19),
            new WallSquare(13, 19),
            new WallSquare(14, 19),
            new WallSquare(15, 19),
            new WallSquare(16, 19),
            new WallSquare(17, 19),
            new WallSquare(18, 19),
            new WallSquare(19, 19),
            //sets west wall
            new WallSquare(0, 0),
            new WallSquare(1, 0),
            new WallSquare(2, 0),
            new WallSquare(3, 0),
            new WallSquare(4, 0),
            new WallSquare(5, 0),
            new WallSquare(6, 0),
            new WallSquare(7, 0),
            new WallSquare(8, 0),
            new WallSquare(9, 0),
            new WallSquare(10, 0),
            new WallSquare(11, 0),
            new WallSquare(12, 0),
            new WallSquare(13, 0),
            new WallSquare(14, 0),
            new WallSquare(15, 0),
            new WallSquare(16, 0),
            new WallSquare(17, 0),
            new WallSquare(18, 0),
            new WallSquare(19, 0),
            //south wall
            new WallSquare(19, 0),
            new WallSquare(19, 1),
            new WallSquare(19, 2),
            new WallSquare(19, 3),
            new WallSquare(19, 4),
            new WallSquare(19, 12),
            new WallSquare(19, 13),
            new WallSquare(19, 14),
            new WallSquare(19, 15),
            new WallSquare(19, 16),
            new WallSquare(19, 17),
            new WallSquare(19, 18),
            new WallSquare(19, 19),
            //inserts other miscellaneous walls within the dungeon
            new WallSquare(1, 8),
            new WallSquare(1, 12),
            new WallSquare(2, 3),
            new WallSquare(2, 8),
            new WallSquare(2, 12),
            new WallSquare(3, 3),
            new WallSquare(3, 8),
            new WallSquare(3, 12),
            new WallSquare(4, 3),
            new WallSquare(4, 8),
            new WallSquare(4, 12),
            new WallSquare(5, 3),
            new WallSquare(5, 4),
            new WallSquare(5, 5),
            new WallSquare(5, 6),
            new WallSquare(6, 6),
            new WallSquare(6, 7),
            new WallSquare(6, 14),
            new WallSquare(6, 15),
            new WallSquare(6, 16),
            new WallSquare(6, 17),
            new WallSquare(6, 18),
            new WallSquare(8, 14),
            new WallSquare(9, 5),
            new WallSquare(9, 14),
            new WallSquare(10, 5),
            new WallSquare(10, 6),
            new WallSquare(10, 7),
            new WallSquare(10, 8),
            new WallSquare(10, 9),
            new WallSquare(10, 14),
            new WallSquare(11, 9),
            new WallSquare(11, 14),
            new WallSquare(11, 15),
            new WallSquare(11, 16),
            new WallSquare(11, 17),
            new WallSquare(11, 18),
            new WallSquare(12, 9),
            new WallSquare(13, 9),
            new WallSquare(14, 9),
            new WallSquare(15, 4),
            new WallSquare(15, 5),
            new WallSquare(15, 6),
            new WallSquare(15, 7),
            new WallSquare(15, 8),
            new WallSquare(15, 9),
            new WallSquare(15, 10),
            new WallSquare(15, 11),
            new WallSquare(15, 12),
            new WallSquare(15, 13),
            new WallSquare(16, 4),
            new WallSquare(17, 4),
            new WallSquare(18, 4)
        };
        return walls;
    }

    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException {
        DirtFloorSquare[] dirtFloor = {
            //establishes which squares will be dirt floor squares
            new DirtFloorSquare(0, 4),
            new DirtFloorSquare(0, 5),
            new DirtFloorSquare(19, 5),
            new DirtFloorSquare(19, 6),
            new DirtFloorSquare(19, 7),
            new DirtFloorSquare(19, 8),
            new DirtFloorSquare(19, 9),
            new DirtFloorSquare(19, 10),
            new DirtFloorSquare(19, 11)

        };
        return dirtFloor;

    }

    @Override
    public FloorTrapSquare[] getTraps() throws IOException {
        //insert the various traps, both Classic Bullying and Spike Trap
        FloorTrapSquare[] traps = {
            new ClassicBullyingTrapSquare(1, 5),
            new ClassicBullyingTrapSquare(1, 13),
            new ClassicBullyingTrapSquare(2, 1),
            new SpikeTrapSquare(2, 5),
            new SpikeTrapSquare(2, 9),
            new ClassicBullyingTrapSquare(2, 18),
            new ClassicBullyingTrapSquare(3, 6),
            new ClassicBullyingTrapSquare(4, 2),
            new ClassicBullyingTrapSquare(4, 7),
            new ClassicBullyingTrapSquare(4, 14),
            new ClassicBullyingTrapSquare(5, 7),
            new ClassicBullyingTrapSquare(6, 1),
            new ClassicBullyingTrapSquare(7, 6),
            new ClassicBullyingTrapSquare(8, 16),
            new ClassicBullyingTrapSquare(8, 17),
            new ClassicBullyingTrapSquare(9, 17),
            new ClassicBullyingTrapSquare(10, 1),
            new ClassicBullyingTrapSquare(12, 2),
            new ClassicBullyingTrapSquare(12, 6),
            new ClassicBullyingTrapSquare(12, 7),
            new ClassicBullyingTrapSquare(12, 14),
            new ClassicBullyingTrapSquare(13, 8),
            new ClassicBullyingTrapSquare(13, 11),
            new ClassicBullyingTrapSquare(13, 15),
            new ClassicBullyingTrapSquare(15, 3),
            new ClassicBullyingTrapSquare(16, 12),
            new ClassicBullyingTrapSquare(17, 18),
            new ClassicBullyingTrapSquare(18, 1)
        };
        return traps;
    }

    @Override
    public MapSquare[] getMiscSquares() throws IOException {
        //create a myGarden square
        NiceGarden myGarden = new NiceGarden(12, 8);
        //add a Broken Beer Bottle to the inventory of the nice garden
        myGarden.inventory = new DnDItem[1];
        myGarden.inventory[0] = new BrokenBeerBottle();
        MapSquare[] misc = {
            myGarden
        };
        return misc;
    }

    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            //add Mark Blair monsters into the game at specific squares
            new MarkBlair("Mark", 1, 2),
            new MarkBlair("Mark", 7, 4),
            new MarkBlair("Mark", 10, 11),
            new MarkBlair("Mark", 2,1),
            new MarkBlair("Mark", 1,13)    
        };
        return monsters;
    }

    @Override
    public void addMessages(MapSquare[][] map) {
        map[2][1].message = "\n You've hit a scary Mark Blair!!!";
        map[2][1].message = "\n It's Mark Blair. OH NOOOOOOOOOO";
        map[1][2].message = "\nYou've hit a scary Mark Blair. AHHHHHHH";
        map[7][4].message = "\nYou've hit a scary Mark Blair. RUNNNNNNNNN";
        map[10][11].message = "\nIt's Mark Blair. You're screwed.";
        map[16][13].message = "\nYou're about to round the corner. You're "
                + "terrified, and rightly so. It'll get hard";
        map[17][13].message = "\nYou're about to round the corner. "
                + "You're terrified, and rightly so. It'll get hard";
        map[18][13].message = "\nYou're about to round the corner. "
                + "You're terrified, and rightly so. It'll get hard";
        map[14][13].message = "\nYou have a lot of options. Pick wisely but they"
                + " all suck, just varying in their suckiness";
        map[13][13].message = "\nYou have a lot of options. Pick wisely but they"
                + " all suck, just varying in their suckiness";
        map[12][13].message = "\nYou have a lot of options. Pick wisely but they"
                + " all suck, just varying in their suckiness";
        map[7][14].message = "\nDecide if this is worth it before you proceed";
        map[1][18].message = "\nIf you went up here you have completely wasted"
                + " your time";
        map[4][6].message = "\nWell this was dumb wasn't it fella?";
        map[3][6].message = "\nWell this was dumb wasn't it fella?";
        map[3][7].message = "\nWell this was dumb wasn't it fella?";
        map[8][5].message = "\nYou've made it this far. You're bloody, but alive";
        map[7][5].message = "\nYou've made it this far. You're bloody, but alive";
        map[0][4].message = "\nCongratulations. This has never been done before.";
        map[0][5].message = "\nCongratulations. This has never been done before.";

    }

    @Override
    public MapCoord setEntrance() {
        //sets entrance
        return new MapCoord(19, 11);
    }

    @Override
    public MapCoord[] setExits() {
        //sets the squares that constitute an exit
        MapCoord[] exits = {
            new MapCoord(0, 4),
            new MapCoord(0, 5)
        };
        return exits;
    }

}
