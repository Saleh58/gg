/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.JuliasSwampMonster;
import dnd.characters.Monster;
import dnd.dnditems.DnDItem;
import dnd.dnditems.JuliasMagicBeans;
import dnd.dnditems.RustySword;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author julia
 */
public class JuliasMap implements MapMakerIF{
    private final String title = "Julia's Map";
    public final String mapDesc = "Welcome to Julia's Map.";
    public final ImageIcon mapImg;
    public JuliasMap() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//JuliasMap.png")));
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
            
            //inner walls
            ////mini west wall
            new WallSquare(5,1),
            new WallSquare(5,2),
            //mini north wall
            new WallSquare(1,9),
            new WallSquare(2,9),
            //bent north wall
            new WallSquare(1,5),
            new WallSquare(2,5),
            new WallSquare(3,5),
            new WallSquare(4,5),
            new WallSquare(4,6),
            new WallSquare(4,7),
            new WallSquare(4,8),
            new WallSquare(4,9),
            //northeast standalone wall           
            new WallSquare(2,12),
            new WallSquare(2,13),
            new WallSquare(2,14),
            new WallSquare(3,14),
            new WallSquare(4,14),
            new WallSquare(4,15),
            new WallSquare(4,16),
            new WallSquare(4,17),
            new WallSquare(5,17),
            new WallSquare(6,17),
            //middle standalone wall
            new WallSquare(6,9),
            new WallSquare(7,9),
            new WallSquare(8,9),
            new WallSquare(9,9),
            new WallSquare(9,10),
            new WallSquare(9,11),
            new WallSquare(9,12),
            new WallSquare(10,12),
            new WallSquare(11,12),
            new WallSquare(12,12),
            new WallSquare(13,12),
            new WallSquare(14,12),
            //east room walls
            new WallSquare(10,15),
            new WallSquare(9,15),
            new WallSquare(8,15),
            new WallSquare(8,16),
            new WallSquare(8,17),
            new WallSquare(8,18),
            
            new WallSquare(12,15),
            new WallSquare(13,15),
            new WallSquare(14,15),
            new WallSquare(14,16),
            new WallSquare(14,17),
            new WallSquare(14,18),
            //southwest wall
            new WallSquare(16,1),
            new WallSquare(16,2),
            new WallSquare(16,3),
            new WallSquare(16,4),
            new WallSquare(15,3),
            new WallSquare(14,3),
            new WallSquare(13,3),
            new WallSquare(12,3),
            new WallSquare(11,3),
            new WallSquare(10,3),
            new WallSquare(9,3),
            //south-middle wall
            new WallSquare(16,6),
            new WallSquare(16,7),
            new WallSquare(16,8),
            new WallSquare(16,9),
            new WallSquare(18,9),
            new WallSquare(15,9),
            new WallSquare(14,9),
            new WallSquare(13,9),
            new WallSquare(12,9),
            new WallSquare(11,9),
             
        };
        return walls;
    }

    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException {
        DirtFloorSquare[] dirtFloor = {
            //exit
            new DirtFloorSquare(17,0),
            new DirtFloorSquare(18,0),            
            //entrance 
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
    public FloorTrapSquare[] getTraps() throws IOException {
        
        FloorTrapSquare[] traps = {
            new JuliasPotatoTrapSquare(16,18),
            new JuliasPotatoTrapSquare(6,18),
            new JuliasPotatoTrapSquare(9,14),
            new JuliasPotatoTrapSquare(12,11),
            new JuliasPotatoTrapSquare(2,8),
            new JuliasPotatoTrapSquare(4,3),
            new JuliasPotatoTrapSquare(7,2)
        };
        return traps;
    }

    @Override
    public MapSquare[] getMiscSquares() throws IOException {        
        JuliasMysteriousRockSquare myRock = new JuliasMysteriousRockSquare(2,7);       
        myRock.inventory = new DnDItem[1];
        myRock.inventory[0] = new JuliasMagicBeans();
        ChestSquare chest = new ChestSquare(1,1);
        chest.inventory = new DnDItem[3];
        chest.inventory[0] = new RustySword();
        JuliasFakeWallSquare fakeWall = new JuliasFakeWallSquare(17,9);
        MapSquare[] misc = {
            myRock,
            chest,
            fakeWall
        };
        return misc;
    }

    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            new JuliasSwampMonster("Roger",3,3),
            new JuliasSwampMonster("Edward",2,16),
            new JuliasSwampMonster("Fredrick",5,12),
            new JuliasSwampMonster("James",9,6),
            new JuliasSwampMonster("Harold",1,13),
            new JuliasSwampMonster("Larry",10,17),
            new JuliasSwampMonster("John",14,11),
            new JuliasSwampMonster("Penny",18,3)
        };
        return monsters;
    }

    @Override
    public void addMessages(MapSquare[][] squares) {
        //entry messages
        squares[18][12].message = "\nYou're in a large cavernous room looking into two long "
                + "hallways.  There appears to be a swamp monster down one, but you can't "
                + "seem to see what's down the other.  The air is heavy with a smell you "
                + "can't quite place.";
        squares[17][12].message = "\nYou're in a large cavernous room looking into two long "
                + "hallways.  There appears to be a swamp monster down one, but you can't "
                + "seem to see what's down the other.  The air is heavy with a smell you "
                + "can't quite place.";
        squares[17][13].message = "\nYou're in a large cavernous room looking into two long "
                + "hallways.  There appears to be a swamp monster down one, but you can't "
                + "seem to see what's down the other.  The air is heavy with a smell you "
                + "can't quite place.";
        squares[17][14].message = "\nYou step into a large caverous room and see two hallways."
                + "The one closest to you is long and dark, but you see something move "
                + "around the corner of the one further.  The air is heavy with a smell you"
                + " can't quite place.";
        squares[17][15].message = "\nYou step into a large caverous room and see two hallways."
                + "The one closest to you is long and dark, but you see something move "
                + "around the corner of the one further.  The air is heavy with a smell you"
                + " can't quite place.";
        squares[17][16].message = "\nYou step into a large caverous room and see two hallways."
                + "The one closest to you is long and dark, but you see something move "
                + "around the corner of the one further.  The air is heavy with a smell you"
                + " can't quite place.";
        squares[17][17].message = "\nYou step into a large caverous room and see two hallways."
                + "The one closest to you is long and dark, but you see something move "
                + "around the corner of the one further.  The air is heavy with a smell you"
                + " can't quite place.";
        squares[17][18].message = "\nYou step into a large caverous room and see two hallways."
                + "The one closest to you is long and dark, but you see something move "
                + "around the corner of the one further.  The air is heavy with a smell you"
                + " can't quite place.";
        
        //northwest corner room
        squares[5][3].message = "\nThere's a monster in there.... but what's that in ther corner?";
        squares[5][4].message = "\nThere's a monster in there.... but what's that in ther corner?";
        
        //secret passage hint (for when it works)
        squares[17][10].message = "\nYou notice a large crack in the wall to your left.  What could that be?";
        
        //large center room entrance message
        squares[10][9].message = "\nAn expansive room unfolds in front of you.  There's a swamp monster in there"
                + ", but it doesn't see you yet.";
        squares[5][9].message = "\nAn expansive room unfolds in front of you.  There's a swamp monster in there"
                + ", but it doesn't see you yet.";
        
        //tiny north room entrance
        squares[3][9].message = "\nYou enter small room with a mysterious looking rock in the center.";
        
        //hallway message
        squares[13][13].message = "\nThe smell grows heavier - almost stinging to the eyes. What is it?";
        squares[13][14].message = "\nThe smell grows heavier - almost stinging to the eyes. What is it?";
        
        //east room message
        squares[11][15].message = "\nIt occurs to you what you've been smelling: the metallic scent of freshly"
                + " drawn blood. This place looks like it it's been empty for years, what could the scent possibly"
                + " be coming from? Do you really want to enter this room?";
        
        //end of hall message
        squares[9][13].message = "\nA small opening reveals itself.  There's a disgusting creature facing you."
                + " You steel yourself for battle.";
        squares[9][14].message = "\nA small opening reveals itself.  There's a disgusting creature facing you."
                + " You steel yourself for battle.";
        
        //northeast pocket
        squares[6][18].message = "\nThe air is stuffy back here, do you really want to go down this narrow "
                + "passage?  My advice?  Stay away.";
        squares[1][11].message = "\nThe air is stuffy back here, do you really want to go down this narrow "
                + "passage?  For God's sake, there's a monster in there.";
        
        //westmost hall
        squares[6][3].message = "\nIs this the passage to the end?";
        squares[7][3].message = "\nIs this the passage to the end?";
        squares[8][3].message = "\nIs this the passage to the end?";
        
        //final hallway message
        squares[16][5].message = "\nThe end is right around the corner, but there's a swamp monster "
                + "in your path. What will you do?";     
    }
    

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(19,19);
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {
            new MapCoord(17,0),
            new MapCoord(18,0)
            };
        return exits;
    }
    
}
