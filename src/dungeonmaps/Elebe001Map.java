/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Beholder;
import dnd.characters.Grillock;
import dnd.characters.Hooker;
import dnd.characters.Loc;
import dnd.characters.Monster;
import dnd.characters.Skeleton;
import dnd.characters.Stranger;
import dnd.dnditems.DnDItem;
import dnd.dnditems.RustySword;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author elebe001
 */
public class Elebe001Map implements MapMakerIF{
    
    private final String title = "elebe001 Map";
    public final String mapDesc = "Welcome to elebe001's. This map is used as a "
            + "template to make the DnD program.  Go around my universe and explore!!";
    public final ImageIcon mapImg;
    public Elebe001Map() throws IOException {
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
            new WallSquare(0,4),
            new WallSquare(0,5),
            new WallSquare(0,6),
            new WallSquare(0,7),
            new WallSquare(0,8),
            new WallSquare(0,9),
            new WallSquare(0,10),
            ////exit
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
            ////entrance           
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
     
            */
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
            
       
            new WallSquare(3,6),
            new WallSquare(3,7),
            new WallSquare(3,8),
            new WallSquare(3,11),
            new WallSquare(3,12),
            new WallSquare(3,13),
            new WallSquare(3,16),
            new WallSquare(3,17),
            new WallSquare(3,18),
                    
            new WallSquare(7,4),
            new WallSquare(7,6),
            new WallSquare(7,9),
          
            new WallSquare(8,4),
            new WallSquare(8,9),
            
            new WallSquare(9,4),
            new WallSquare(9,9),
            new WallSquare(9,17),
            
            
            new WallSquare(10,4),
            new WallSquare(10,5),
            new WallSquare(10,6),
            new WallSquare(10,9),
            new WallSquare(10,11),
            new WallSquare(10,12),
            new WallSquare(10,13),
            new WallSquare(10,17),
            
            
            new WallSquare(11,1),
            new WallSquare(11,2),
            new WallSquare(11,3),
            new WallSquare(11,4),
            new WallSquare(11,5),
            new WallSquare(11,6),
            new WallSquare(11,9),
            new WallSquare(11,11),
            
            new WallSquare(18,3),
            new WallSquare(17,3),
            new WallSquare(16,3),
            new WallSquare(15,3),
            new WallSquare(15,4),
            new WallSquare(15,5),
            new WallSquare(15,6),
            new WallSquare(16,6),
            new WallSquare(17,6),
            
            
            new WallSquare(13,9),
            
            new WallSquare(5,6),
            new WallSquare(6,6),
            new WallSquare(7,6),
            
            new WallSquare(4,6),
            new WallSquare(4,11),
            
            new WallSquare(5,2),
            new WallSquare(5,3),
            new WallSquare(5,4),
            new WallSquare(5,6),
            new WallSquare(5,11),           
         

            
            
            new WallSquare(6,4),
            new WallSquare(6,11),
            new WallSquare(6,12),
            new WallSquare(6,13),
            new WallSquare(6,14),
            new WallSquare(6,15),
            new WallSquare(6,16),
            new WallSquare(6,17),
            new WallSquare(6,18),
        
            new WallSquare(9,11),
            new WallSquare(9,12),
            new WallSquare(9,13),
            new WallSquare(9,18),
             
             
            new WallSquare(10,11),
            new WallSquare(10,12),
            new WallSquare(10,13),
            new WallSquare(10,18),


            new WallSquare(11,9),
            new WallSquare(11,11),
            new WallSquare(12,11),
            
            new WallSquare(15,11),
            new WallSquare(16,11),
            new WallSquare(17,11),
            
            new WallSquare(12,12),
            new WallSquare(12,9),
            new WallSquare(13,12),
            new WallSquare(14,12),
            new WallSquare(15,12),
            new WallSquare(15,11),
            new WallSquare(15,12),

            new WallSquare(14,9),
            new WallSquare(15,9),
            new WallSquare(16,9),

            new WallSquare(17,9),
            new WallSquare(18,11),
            new WallSquare(18,12),
            new WallSquare(18,13),
            new WallSquare(18,14),
            new WallSquare(18,15),
            new WallSquare(18,16),
            new WallSquare(18,17),
            new WallSquare(18,18),
            new WallSquare(18,9)
            
        };
        return walls;
    }
    
    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            new Skeleton("elebe's monster",2,2),
            new Hooker("elebe's Hooker", 11, 18),
            new Beholder("elebe's Beholder", 16, 8),
            new Loc("elebe's Loc", 9, 2),
            new Stranger("elebe's Stranger", 5, 12),
            new Grillock("elebe's Grillock", 15, 16)
        };
        return monsters;
    }
    
    @Override
    public FloorTrapSquare[] getTraps()throws IOException{
        FloorTrapSquare[] traps = {
            new SpikeTrapSquare(1,6),
            new Elebe001FireTrap(9,6),
            new PitTrap(7,18),
            new Elebe001BearTrap(5,18),
            new BombTrap(15,2),
            new SnareTrap(17,12),
            new ElectricTrap(3,1)
        };
        return traps;
    }
    
    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException{
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(5,8),
            new DirtFloorSquare(6,8),
            new DirtFloorSquare(7,8),
            new DirtFloorSquare(8,8),
            new DirtFloorSquare(9,8),
            new DirtFloorSquare(10,8),
            new DirtFloorSquare(11,8),
            new DirtFloorSquare(12,8),
            new DirtFloorSquare(13,2),
            new DirtFloorSquare(13,3),
            new DirtFloorSquare(13,3),
            new DirtFloorSquare(13,4),
            new DirtFloorSquare(13,5),
            new DirtFloorSquare(13,6),
            new DirtFloorSquare(13,7),
            new DirtFloorSquare(13,8),
            new DirtFloorSquare(14,2),
            new DirtFloorSquare(14,3),
            new DirtFloorSquare(14,4),
            new DirtFloorSquare(14,5),
            new DirtFloorSquare(14,6),
            new DirtFloorSquare(14,7),
            new DirtFloorSquare(14,8),
           // new DirtFloorSquare(0,11),
            //new DirtFloorSquare(0,12),
            
            
            new DirtFloorSquare(8,11),
            new DirtFloorSquare(8,12),
            new DirtFloorSquare(8,13),
            new DirtFloorSquare(8,14),
            new DirtFloorSquare(9,14),
            new DirtFloorSquare(10,14),
            new DirtFloorSquare(11,13),
            new DirtFloorSquare(12,13),
            new DirtFloorSquare(13,13),
            new DirtFloorSquare(14,13),
            new DirtFloorSquare(15,13),
            new DirtFloorSquare(16,12),
            new DirtFloorSquare(16,13),
            new DirtFloorSquare(17,13),
            new DirtFloorSquare(17,13),
            new DirtFloorSquare(17,14),
            new DirtFloorSquare(17,15),
            new DirtFloorSquare(17,16),
            new DirtFloorSquare(17,17),
            new DirtFloorSquare(17,18),
            new DirtFloorSquare(17,12),
            new DirtFloorSquare(11,12),
            new DirtFloorSquare(11,18),
            new DirtFloorSquare(12,18),
            new DirtFloorSquare(13,18),
            new DirtFloorSquare(14,18),
            new DirtFloorSquare(15,18),
            new DirtFloorSquare(16,18),
            new DirtFloorSquare(9,17),
            new DirtFloorSquare(10,17),
            new DirtFloorSquare(7,18),
            new DirtFloorSquare(8,18),
            
            new DirtFloorSquare(1,1),
            new DirtFloorSquare(2,1),
            new DirtFloorSquare(3,1),
            new DirtFloorSquare(4,1),
            new DirtFloorSquare(5,1),
            new DirtFloorSquare(6,1),
            new DirtFloorSquare(7,1),
            new DirtFloorSquare(8,1),
            new DirtFloorSquare(9,1),
            new DirtFloorSquare(10,1),
            new DirtFloorSquare(13,1),
            new DirtFloorSquare(14,1),
        };
        return dirtFloor;
    }
    
    @Override
    public MapSquare[] getMiscSquares() throws IOException{
        ChestSquare myChest = new ChestSquare(12,14);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new RustySword();
        MapSquare[] misc = {
            myChest,
            new PortalSquare(17,16,1,8),
            new PortalSquare(16,4,5,14),
            new PoseidonBox(3,5),
            new PoseidonBox(12,1),  
        };
        return misc;
    } 
    
    
    
    @Override
    public void addMessages(MapSquare[][] squares){
        
        squares[19][18].message = "\nWELCOME, YOUR JOURNEY BEGINS HERE!!!";
        squares[0][3].message = "\nGOODBYE SOLDIER, WELL DONE!!!";
        squares[17][10].message = "\nYou are staring into a dark cold hallway."
                + " There are signs of battle and the odor of the fallen";
        squares[15][10].message = "\nAs you continue your journey, beware of evil"
                + " that may befall you";
        squares[3][14].message = "\nYou just found the cave of the deadly"
                + " war Lords";
        squares[3][15].message = "\nYou just found the cave of the deadly war"
                + " Lords";
        squares[16][6].message = "\nYou peer into the a dark room.  You can see"
                + "that there has been a lot of fallen soldiers in here!!"; 
        squares[5][1].message = "\nYou have entered a space built by the roman"
                + " empire"
                + " -- BE VERY WARNED";
        squares[11][7].message = "\nAs you approach the room before you, you cant"
                + " help but think this is as far most make it.  Decomposing"
                + " bodies scratter the floor of the room.";
        squares[6][5].message = "\nYou are at the end of your QUEST!. Don't lose"
                + " your dear life at the very end";
        squares[18][6].message = "\nOops another dead end.. Or is it though??.";
        squares[3][5].message = "\nYou have found the PoseidonBox of the Great"
                + " God Zeus";
        squares[12][14].message = "\nWith this Chest Square, You get more grace";
        squares[17][16].message = "\nYou just got to a maze, see you at the other"
                + " end in time";
        squares[12][3].message = "\nOops, Sorry but leave my real. Away you Go";
        squares[11][18].message = "\nHooker gone down";
        squares[16][8].message = "\nYou have been conquered you Monster ha ha!";
        squares[9][2].message = "\nDear Loc, I told you this day would come";
        squares[5][12].message = "\nThe Stranger Monster has been doomed by my"
                + " blade";
        squares[15][16].message = "\nGrillock || There you are. I GOT YOU!!";
     
    }    

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(19,19);
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {
            new MapCoord(0,3)
            };
        return exits;
    }
}
