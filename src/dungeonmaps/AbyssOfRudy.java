/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Catoblepas;
import dnd.characters.Monster;
import dnd.characters.Skeleton;
import dnd.dnditems.DnDItem;
import dnd.dnditems.GoldDagger;
import dnd.dnditems.RustySword;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jdrudy
 */
public class AbyssOfRudy implements MapMakerIF{
    
    private final String title = "Rudy's Abyss";
    public final String mapDesc = "Welcome to Jake Rudy's Abyss... This map is "
            + "designed to test the player's skill. Watch out for traps and "
            + "try to think strategically! Most of all, have fun!";
    public final ImageIcon mapImg;
    public AbyssOfRudy() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//abyssOfRudy.png")));
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
            ////exit
            new WallSquare(2,19),
            new WallSquare(3,19),
            new WallSquare(4,19),
            ////end exit
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
            new WallSquare(18,19),
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
            ////entrance
            new WallSquare(2,0),
            new WallSquare(3,0),
            new WallSquare(4,0),
            ////end entrance
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
            
            //1st blockade
            new WallSquare(1,6),
            new WallSquare(2,6),
            new WallSquare(3,6),
            new WallSquare(4,6),
            new WallSquare(5,6),
            new WallSquare(6,6),
            //new WallSquare(7,6),
            new WallSquare(8,6),
            
            //columns
            new WallSquare(4,10),
            new WallSquare(4,15),
            new WallSquare(6,10),
            new WallSquare(6,15),
            
            //center wall
            new WallSquare(10,1),
            new WallSquare(10,2),
            new WallSquare(10,3),
            new WallSquare(10,4),
            new WallSquare(10,5),
            new WallSquare(10,6),
            new WallSquare(10,7),
            new WallSquare(10,8),
            new WallSquare(10,9),
            new WallSquare(10,10),
            //new WallSquare(10,11),
            //new WallSquare(10,12),
            new WallSquare(10,13),
            new WallSquare(10,14),
            new WallSquare(10,15),
            //new WallSquare(10,16),
            //new WallSquare(10,17),
            new WallSquare(10,18),
            
            //2nd blockade
            new WallSquare(11,10),
            new WallSquare(12,10),
            //new WallSquare(13,10),
            //new WallSquare(14,10),
            new WallSquare(15,10),
            
        };
        return walls;
    }
    
    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            new Catoblepas("Frank", 15, 2),
            new Skeleton("Mac", 13, 2),
            new Skeleton("Charlie", 17, 2),
            new Skeleton("Dennis", 18, 12),
            new Skeleton("Dee", 18, 14),
            new Skeleton("Cricket", 18, 16),
            new Skeleton("Gail", 8, 3),
            new Skeleton("Artemis", 6, 13),
        };
        return monsters;
    }
    
    @Override
    public FloorTrapSquare[] getTraps()throws IOException{
        FloorTrapSquare[] traps = {
            new SpikeTrapSquare(7,6),
            new SpikeTrapSquare(14,9),
            new SpikeTrapSquare(13,9),
            new SpikeTrapSquare(11,16),
            new SpikeTrapSquare(11,12),
        };
        return traps;
    }
    
    public MobilityFloorTrap[] getMobilityTraps()throws IOException{
        MobilityFloorTrap[] traps = {
            new SlimeTrapSquare(0, 5, 9, 11, 2),
            new SlimeTrapSquare(0, 5, 9, 17, 2),
            new SlimeTrapSquare(0, 5, 17, 9, 2)
        };
        return traps;
    }
    
    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException{
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(0,2), //entrance message index: 1
            new DirtFloorSquare(0,3), //entrance message index: 2
            new DirtFloorSquare(0,4), //entrance message index: 3
            new DirtFloorSquare(1,2), 
            new DirtFloorSquare(1,3),
            new DirtFloorSquare(1,4),
            new DirtFloorSquare(1,1),
            new DirtFloorSquare(1,5),
            new DirtFloorSquare(18,1),
            new DirtFloorSquare(18,2),
            new DirtFloorSquare(18,3),
            new DirtFloorSquare(18,4),
            new DirtFloorSquare(18,5),
            new DirtFloorSquare(19,2),
            new DirtFloorSquare(19,3),
            new DirtFloorSquare(19,4),
        };
        return dirtFloor;
    }
    
    @Override
    public MapSquare[] getMiscSquares() throws IOException{
        ChestSquare myChest = new ChestSquare(4,16);
        ChestSquare frankChest = new ChestSquare (11,1);
        
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new RustySword();
        
        frankChest.inventory = new DnDItem[2];
        frankChest.inventory[1] = new GoldDagger();
        MapSquare[] misc = {
            myChest,
            frankChest,
            new RubbleFloorSquare(5,10),
            new RubbleFloorSquare(4,11),
            new RubbleFloorSquare(5,11),
            new RubbleFloorSquare(6,11),
            new RubbleFloorSquare(4,12),
            new RubbleFloorSquare(5,12),
            new RubbleFloorSquare(6,12),
            new RubbleFloorSquare(4,13),
            new RubbleFloorSquare(5,13),
            new RubbleFloorSquare(6,13),
            new RubbleFloorSquare(4,14),
            new RubbleFloorSquare(5,14),
            new RubbleFloorSquare(6,14),
            new RubbleFloorSquare(5,15)
        };
        return misc;
    } 
    
    @Override
    public void addMessages(MapSquare[][] squares){
        
        squares[0][2].message = "\nYou have finally arrived to your destination"
                + ". The infamous Abyss of Rudy.";
        squares[0][3].message = "\nYou have finally arrived to your destination"
                + ". The infamous Abyss of Rudy.";
        squares[0][4].message = "\nYou have finally arrived to your destination"
                + ". The infamous Abyss of Rudy.";
        squares[1][2].message = "\nBefore you stands an angry looking skeleton!";
        squares[1][3].message = "\nBefore you stands an angry looking skeleton!";
        squares[1][4].message = "\nBefore you stands an angry looking skeleton!";
        squares[7][6].message = "\nYou enter into a large room with four large"
                + " pillars and a skeleton standing inside.";
        squares[9][6].message = "\nYou enter into a large room with four large"
                + " pillars and a skeleton standing inside.";
        squares[10][11].message = "\nBefore you is a long room, with three "
                + "skeletons gathered near the end of the room.";
        squares[10][12].message = "\nBefore you is a long room, with three "
                + "skeletons gathered near the end of the room.";
        squares[10][16].message = "\nBefore you is a long room, with three "
                + "skeletons gathered near the end of the room.";
        squares[10][17].message = "\nBefore you is a long room, with three "
                + "skeletons gathered near the end of the room.";
        squares[13][10].message = "\nYou enter the room and your nostrils are "
                + "immediately assaulted by a horrendous stench, which you "
                + "notice is coming from the monstrous boar-like creature with"
                + " the long neck at the back of the room. It is surrounded by "
                + "two skeletons.";
        squares[14][10].message = "\nYou enter the room and your nostrils are "
                + "immediately assaulted by a horrendous stench, which you "
                + "notice is coming from the monstrous boar-like creature with"
                + " the long neck at the back of the room. It is surrounded by "
                + "two skeletons.";
        squares[16][10].message = "\nYou enter the room and your nostrils are "
                + "immediately assaulted by a horrendous stench, which you "
                + "notice is coming from the monstrous boar-like creature with"
                + " the long neck at the back of the room. It is surrounded by "
                + "two skeletons.";
        squares[17][10].message = "\nYou enter the room and your nostrils are "
                + "immediately assaulted by a horrendous stench, which you "
                + "notice is coming from the monstrous boar-like creature with"
                + " the long neck at the back of the room. It is surrounded by "
                + "two skeletons.";
        squares[18][10].message = "\nYou enter the room and your nostrils are "
                + "immediately assaulted by a horrendous stench, which you "
                + "notice is coming from the monstrous boar-like creature with"
                + " the long neck at the back of the room. It is surrounded by "
                + "two skeletons.";
        squares[19][2].message = "\nYou have managed to escape Rudy's Abyss! "
                + "Conglaturations!!!";
        squares[19][3].message = "\nYou have managed to escape Rudy's Abyss! "
                + "Conglaturations!!!";
        squares[19][4].message = "\nYou have managed to escape Rudy's Abyss! "
                + "Conglaturations!!!";
    }    

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(0,2);
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {
            new MapCoord(2,19),
            new MapCoord(3,19),
            new MapCoord(4,19)
            };
        return exits;
    }
}
