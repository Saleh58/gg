/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Monster;
import dnd.characters.HatMan;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

//created by daythan haskins

public class DaythansMap implements MapMakerIF{
    
    private final String title = "Chaos and Sandwiches";
    public final String mapDesc = "he he ... Insane Rambling... he he"
            + "I highly doubt you'll enjoy, but good luck anyway.";
    public final ImageIcon mapImg;
    public DaythansMap() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//DaythansMap.png")));
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
            //north wall
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
            new WallSquare(18,19),
            new WallSquare(19,19),
            
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
            
            ////west wall
            new WallSquare(1,0),
            new WallSquare(2,0),
            new WallSquare(3,0),
            new WallSquare(4,0),
            new WallSquare(5,0),
            new WallSquare(6,0),
            new WallSquare(7,0),
            new WallSquare(8,0),

            new WallSquare(11,0),
            new WallSquare(12,0),
            new WallSquare(13,0),
            new WallSquare(14,0),
            new WallSquare(15,0),
            new WallSquare(16,0),
            new WallSquare(17,0),
            new WallSquare(18,0),
            new WallSquare(19,0)
            
        };
        return walls;
    }
    
    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            
            //upper hord
            new HatMan("???",2,1),
            new HatMan("???",2,2),
            new HatMan("???",2,3),
            new HatMan("???",2,4),
            new HatMan("???",2,5),
            new HatMan("???",2,6),
            new HatMan("???",2,7),
            new HatMan("???",2,8),
            new HatMan("???",2,9),
            new HatMan("???",2,10),
            new HatMan("???",2,11),
            new HatMan("???",2,12),
            new HatMan("???",2,13),
            new HatMan("???",2,14),
            new HatMan("???",2,15),
            new HatMan("???",2,16),
            new HatMan("???",2,17),
            new HatMan("???",2,18),
            new HatMan("???",3,1),
            new HatMan("???",3,2),
            new HatMan("???",3,3),
            new HatMan("???",3,4),
            new HatMan("???",3,5),
            new HatMan("???",3,6),
            new HatMan("???",3,7),
            new HatMan("???",3,8),
            new HatMan("???",3,9),
            new HatMan("???",3,10),
            new HatMan("???",3,11),
            new HatMan("???",3,12),
            new HatMan("???",3,13),
            new HatMan("???",3,14),
            new HatMan("???",3,15),
            new HatMan("???",3,16),
            new HatMan("???",3,17),
            new HatMan("???",3,18),
            new HatMan("???",4,1),
            new HatMan("???",4,2),
            new HatMan("???",4,3),
            new HatMan("???",4,4),
            new HatMan("???",4,5),
            new HatMan("???",4,6),
            new HatMan("???",4,7),
            new HatMan("???",4,8),
            new HatMan("???",4,9),
            new HatMan("???",4,10),
            new HatMan("???",4,11),
            new HatMan("???",4,12),
            new HatMan("???",4,13),
            new HatMan("???",4,14),
            new HatMan("???",4,15),
            new HatMan("???",4,16),
            new HatMan("???",4,17),
            new HatMan("???",4,18),
            
            //lower hord
            
            new HatMan("???",15,1),
            new HatMan("???",15,2),
            new HatMan("???",15,3),
            new HatMan("???",15,4),
            new HatMan("???",15,5),
            new HatMan("???",15,6),
            new HatMan("???",15,7),
            new HatMan("???",15,8),
            new HatMan("???",15,9),
            new HatMan("???",15,10),
            new HatMan("???",15,11),
            new HatMan("???",15,12),
            new HatMan("???",15,13),
            new HatMan("???",15,14),
            new HatMan("???",15,15),
            new HatMan("???",15,16),
            new HatMan("???",15,17),
            new HatMan("???",15,18),
            new HatMan("???",16,1),
            new HatMan("???",16,2),
            new HatMan("???",16,3),
            new HatMan("???",16,4),
            new HatMan("???",16,5),
            new HatMan("???",16,6),
            new HatMan("???",16,7),
            new HatMan("???",16,8),
            new HatMan("???",16,9),
            new HatMan("???",16,10),
            new HatMan("???",16,11),
            new HatMan("???",16,12),
            new HatMan("???",16,13),
            new HatMan("???",16,14),
            new HatMan("???",16,15),
            new HatMan("???",16,16),
            new HatMan("???",16,17),
            new HatMan("???",16,18),
            new HatMan("???",17,1),
            new HatMan("???",17,2),
            new HatMan("???",17,3),
            new HatMan("???",17,4),
            new HatMan("???",17,5),
            new HatMan("???",17,6),
            new HatMan("???",17,7),
            new HatMan("???",17,8),
            new HatMan("???",17,9),
            new HatMan("???",17,10),
            new HatMan("???",17,11),
            new HatMan("???",17,12),
            new HatMan("???",17,13),
            new HatMan("???",17,14),
            new HatMan("???",17,15),
            new HatMan("???",17,16),
            new HatMan("???",17,17),
            new HatMan("???",17,18),
        };
        return monsters;
    }
    
    @Override
    public FloorTrapSquare[] getTraps()throws IOException{
        FloorTrapSquare[] traps = {
            new PitOfMucus(7,4),
            new PitOfMucus(12,4),
            new PitOfMucus(12,12),
            new PitOfMucus(9,13),
            new PitOfMucus(6,16)
        };
        return traps;
    }
    
    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException{
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(9,0),
            new DirtFloorSquare(10,0)
        };
        return dirtFloor;
    }
    
    @Override
    public MapSquare[] getMiscSquares() throws IOException{
        GoldenCarpet[] misc = {
            //upper fake gold
            new GoldenCarpet(1,1),
            new GoldenCarpet(1,2),
            new GoldenCarpet(1,3),
            new GoldenCarpet(1,4),
            new GoldenCarpet(1,5),
            new GoldenCarpet(1,6),
            new GoldenCarpet(1,7),
            new GoldenCarpet(1,8),
            new GoldenCarpet(1,9),
            new GoldenCarpet(1,10),
            new GoldenCarpet(1,11),
            new GoldenCarpet(1,12),
            new GoldenCarpet(1,13),
            new GoldenCarpet(1,14),
            new GoldenCarpet(1,15),
            new GoldenCarpet(1,16),
            new GoldenCarpet(1,17),
            new GoldenCarpet(1,18),
            
            //lower fake gold
            new GoldenCarpet(18,1),
            new GoldenCarpet(18,2),
            new GoldenCarpet(18,3),
            new GoldenCarpet(18,4),
            new GoldenCarpet(18,5),
            new GoldenCarpet(18,6),
            new GoldenCarpet(18,7),
            new GoldenCarpet(18,8),
            new GoldenCarpet(18,9),
            new GoldenCarpet(18,10),
            new GoldenCarpet(18,11),
            new GoldenCarpet(18,12),
            new GoldenCarpet(18,13),
            new GoldenCarpet(18,14),
            new GoldenCarpet(18,15),
            new GoldenCarpet(18,16),
            new GoldenCarpet(18,17),
            new GoldenCarpet(18,18)
                
    };
        return misc;
    } 
    
    @Override
    public void addMessages(MapSquare[][] squares){
        
        squares[9][18].message = "\nYou awaken, your sword a sandwich, no exit behind"
                + " but a door before you";
        squares[1][9].message = "\nYou have found the exit through blood or through"
                + " peace, yet you long to return for the dream of gold in the dark";
        squares[1][10].message = "\nYou have found the exit through blood or through"
                + " peace, yet you long to return for the dream of gold in the dark";
        squares[9][17].message = "\nDark armies line the wall, sandwiches in hand"
                + " do you dare fight to the glittering gold beyond?";
        squares[10][17].message = "\nDark armies line the wall, sandwiches in hand"
                + " do you dare fight to the glittering gold beyond?";
        squares[11][18].message = "\nDark armies line the wall, sandwiches in hand"
                + " do you dare fight to the glittering gold beyond?";
        squares[8][18].message = "\nDark armies line the wall, sandwiches in hand"
                + " do you dare fight to the glittering gold beyond?";
    }    

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(9,18);
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {
            new MapCoord(9,0),
            new MapCoord(10,0)
            };
        return exits;
    }
}
