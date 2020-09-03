/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Dali;
import dnd.characters.Corbo;
import dnd.characters.Monster;
import dnd.characters.Shark;
import dnd.characters.Thanos;
import dnd.dnditems.DnDItem;
import dnd.dnditems.Fists;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jessentihemuka
 */
public class JessesMap implements MapMakerIF{

    //this is the name of my map
    private final String title = "Jesse's Map"; 
    //this is the decription of my map
    public final String mapDesc = "Welcome to Jesse's Map. This map was created by Jesse Ntihemuka. "
            + "and I wish you a pleasant journey as you engage in this adventurous ride!";
    public final ImageIcon mapImg;
    
    //this is a screenshot of my map to show the player who selected it
    public JessesMap() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//jesses_map.png")));
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
    public ImageIcon getMapImg(){
        return mapImg;
    }

    @Override
    public WallSquare[] getWallSquares() {
        WallSquare[] walls = {
            //outside walls
            ////north wall
         /* EXIT
            new WallSquare(0,0),
            new WallSquare(0,1),
            new WallSquare(0,2),
            new WallSquare(0,3),
            new WallSquare(0,4),
            new WallSquare(0,5),
            new WallSquare(0,6)
           
            END OF NORTH EXIT    */
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
           
          
            //// Beginning of east wall
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
            
           
            /* ENTRANCE
            new WallSquare(11,19),
            new WallSquare(12,19),
             END OF ENTRANCE  */
            new WallSquare(13,19),
            new WallSquare(14,19),
            new WallSquare(15,19),
            new WallSquare(16,19),
            new WallSquare(17,19),
            new WallSquare(18,19),
         
            
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
            
            ////west wall
            
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
            
            //UPPER HALF 4 WALLS WITHING THE MAP
            new WallSquare(2,1),
            new WallSquare(2,2),
            new WallSquare(2,3),
            new WallSquare(2,4),
            new WallSquare(3,4),
            new WallSquare(4,4),
            new WallSquare(5,4),
            new WallSquare(6,4),
            new WallSquare(7,4),
            new WallSquare(8,4),
            
            new WallSquare(1,7),
            new WallSquare(2,7),
            new WallSquare(3,7),
            new WallSquare(4,7),
            new WallSquare(4,8),
            new WallSquare(4,9),
            
            new WallSquare(3,15),
            new WallSquare(3,16),
            new WallSquare(3,17),
            new WallSquare(3,18),
            
            
            new WallSquare(7,7),
            new WallSquare(7,8),
            new WallSquare(7,9),
            new WallSquare(7,10),
            new WallSquare(7,11),
            new WallSquare(7,12),
            new WallSquare(7,13),
            new WallSquare(7,14),
            new WallSquare(7,15),
            new WallSquare(7,16),
            
            
           // LOWER 4 WALLS WITHIN MAP
            new WallSquare(8,11),
            new WallSquare(9,11),
            new WallSquare(10,11),
            new WallSquare(11,11),
            new WallSquare(12,11),
            new WallSquare(13,11),
            new WallSquare(14,11),
            new WallSquare(15,11),
            
            new WallSquare(11,1),
            new WallSquare(11,2),
            new WallSquare(11,3),
            new WallSquare(11,4),
            new WallSquare(11,5),
            new WallSquare(11,6),
            new WallSquare(11,7),
            new WallSquare(11,8),
            
            new WallSquare(16,4),
            new WallSquare(16,5),
            new WallSquare(16,6),
            new WallSquare(16,7),
            new WallSquare(16,8),
            new WallSquare(16,9),
            new WallSquare(16,10),
            new WallSquare(16,11),
            new WallSquare(16,12),
            new WallSquare(16,13),
            new WallSquare(16,14),
            
            new WallSquare(10,14),
            new WallSquare(10,15),
            new WallSquare(10,16),
            new WallSquare(10,17),
            new WallSquare(10,18),
           
            new WallSquare(13,14),
            new WallSquare(13,15),
            new WallSquare(13,16),
            new WallSquare(13,17),
            new WallSquare(13,18),
            
            
            
            
           
            
        };
        return walls;
    
    }

    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException {
        DirtFloorSquare[] dirtFloor = {
           //EXIT FLOORS
            new DirtFloorSquare(0,0),
            new DirtFloorSquare(0,1),
            new DirtFloorSquare(0,2),
            new DirtFloorSquare(0,3),
            new DirtFloorSquare(0,4),
            new DirtFloorSquare(0,5),
            new DirtFloorSquare(0,6),
            new DirtFloorSquare(1,0),
            new DirtFloorSquare(1,1),
            new DirtFloorSquare(1,2),
            new DirtFloorSquare(1,3),
            new DirtFloorSquare(1,4),
            new DirtFloorSquare(1,5),
            new DirtFloorSquare(1,6),
            
            new DirtFloorSquare(1,8),
            new DirtFloorSquare(1,9),
            new DirtFloorSquare(1,10),
            new DirtFloorSquare(1,11),
            new DirtFloorSquare(1,12),
            new DirtFloorSquare(1,13),
            new DirtFloorSquare(1,14),
            new DirtFloorSquare(1,14),
            new DirtFloorSquare(1,15),
            new DirtFloorSquare(1,16),
            new DirtFloorSquare(1,17),
            new DirtFloorSquare(1,18),
          
            new DirtFloorSquare(2,5),
            new DirtFloorSquare(2,6),
            new DirtFloorSquare(2,8),
            new DirtFloorSquare(2,18),
            
            new DirtFloorSquare(3,1),
            new DirtFloorSquare(3,5),
            new DirtFloorSquare(3,6),
            new DirtFloorSquare(3,8),
            
            
            new DirtFloorSquare(3,1),
            new DirtFloorSquare(4,1),
            new DirtFloorSquare(5,1),
            new DirtFloorSquare(6,1),
            new DirtFloorSquare(7,1),
            new DirtFloorSquare(8,1),
            new DirtFloorSquare(9,1),
            new DirtFloorSquare(10,1),
            new DirtFloorSquare(12,1),
            new DirtFloorSquare(13,1),
            new DirtFloorSquare(14,1),
            new DirtFloorSquare(15,1),
            new DirtFloorSquare(16,1),
            new DirtFloorSquare(17,1),
            new DirtFloorSquare(18,1),
            
            new DirtFloorSquare(15,4),
            new DirtFloorSquare(15,5),
            new DirtFloorSquare(15,6),
            new DirtFloorSquare(15,7),
            new DirtFloorSquare(15,8),
            new DirtFloorSquare(15,9),
            new DirtFloorSquare (15,10),
            
            new DirtFloorSquare(4,18),
            new DirtFloorSquare(5,18),
            new DirtFloorSquare(6,18),
            new DirtFloorSquare(7,18),
            new DirtFloorSquare(8,18),
            new DirtFloorSquare(9,18),
            
            new DirtFloorSquare(9,14),
            new DirtFloorSquare(9,15),
            new DirtFloorSquare(9,16),
            new DirtFloorSquare(9,17),
            
            new DirtFloorSquare(14,14),
            new DirtFloorSquare(14,15),
            new DirtFloorSquare(14,16),
            new DirtFloorSquare(14,17),
            new DirtFloorSquare(14,18),
            
            
            new DirtFloorSquare(15,18),
            new DirtFloorSquare(16,18),
            new DirtFloorSquare(17,18),
            new DirtFloorSquare(18,18),
            
            new DirtFloorSquare(17,12),
            new DirtFloorSquare(17,13),
            new DirtFloorSquare(17,14),
            
            new DirtFloorSquare(6,10),
            new DirtFloorSquare(6,11),
            new DirtFloorSquare(6,12),
            new DirtFloorSquare(6,13),
            new DirtFloorSquare(6,14),
            new DirtFloorSquare(6,15),
            new DirtFloorSquare(6,16),
            
            new DirtFloorSquare(8,10),
            new DirtFloorSquare(9,10),
            new DirtFloorSquare(10,10),
            new DirtFloorSquare(11,10),
            new DirtFloorSquare(12,10),
            new DirtFloorSquare(13,10),
            new DirtFloorSquare(14,10),
            
        
            //ENTRANCE FLOORS
            new DirtFloorSquare(11,19),
            new DirtFloorSquare(12,19),         
            
        };
        return dirtFloor;
    }
    

    @Override
    //this is an array of my traps
    public FloorTrapSquare[] getTraps() throws IOException { 
         FloorTrapSquare[] traps = {
            new JawTrap (6,9),
            new RingFireTrap(9,6),
            new SpiderWebTrap (8,14), 
            new RingFireTrap(12,12), 
            new BrokenGlassTrap(17,7), 
            new JawTrap (14,3), 
            new BrokenGlassTrap(18,7), 
            new RingFireTrap(5,12), 
            new SpiderWebTrap (5,7), 
            
           
        };
        return traps;
    }

    @Override
    public MapSquare[] getMiscSquares() throws IOException { //for trial
          //ChestSquare myChest = new ChestSquare(2,17);
          //myChest.inventory = new DnDItem[1];
          //myChest.inventory[0] = new RustySword();
          
          Trampoline myTramp = new Trampoline(13,8);
          myTramp.inventory = new DnDItem[1];
          myTramp.inventory[0] = new Fists();
        MapSquare[] misc = {
            myTramp
        };
        return misc;    
    }

    @Override
    public Monster[] getMonsters() { 
         Monster[] monsters = {
           // new Skeleton("Fred", 15, 13),
            new Thanos("Thanos", 10, 13),
            new Shark("Shark", 4, 14), 
            new Dali("Dali", 4, 6),
            new Corbo("Corbo", 16,16),
            new Thanos("Thanos", 10, 8),
            new Shark("Shark", 18, 3)
            
        };
        return monsters;
    }

    @Override
    //these are the messages to guide the player through the adventure
    public void addMessages(MapSquare[][] map) { 
         map[0][0].message = "\nThis is the end";
         map[1][0].message = "\nThis is the end";
         map[11][19].message = "\nYou have begun!";
         map[12][19].message = "\nYou have begun!";
         
         //this is the south route
         map[12][14].message = "\nBehold...Either face your challenge, or you will suffer greatly";
         map[11][13].message = "\nThis is your chance to avenge Iron Man and Black Panther!!";
         map[11][12].message = "\nWe got a Thanos Sympathizer in the building!!";
         map[12][13].message = "\nWe got a Thanos Sympathizer in the building!!";
         map[13][13].message = "\nLooks like you chose the longer route! Enjoy";
         map[13][12].message = "\nLooks like you chose the longer route! Enjoy";
         map[15][15].message = "\nDo you have enough strength to fight Corbo?";
         map[15][16].message = "\nDo you have enough strength to fight Corbo?";
         map[17][14].message = "\nAlong this path, a war just broke out, watch out for DEBRIS!";
         map[18][14].message = "\nWatch out for Debris along this path!!";
         map[17][8].message = "\nNo turning Back!";
         map[18][8].message = "\nNo turning back!";
         map[17][6].message = "\nSorry, I warned you!";
         map[18][6].message = "\nSorry, I warned you!";
         map[18][4].message = "\nShark is a ferocious predator, let's see what you got in the tank!";
         map[17][4].message = "\nShark is a ferocious predator, let's see what you got in the tank!";
         map[15][3].message = "\nOnly Strong ankles will survive!!";
         map[11][9].message = "\nThis is your second chance to avenge Iron Man and Black Panther!!";
         map[10][9].message = "\nThis is your second chance to avenge Iron Man and Black Panther!!";
         map[9][9].message = "\nWe got a Thanos superfan in the building!!";
         map[9][8].message = "\nWe got a Thanos superfan in the building!!";
         map[9][7].message = "\nYou might need a fire extinguisher ahead..";
         map[10][6].message = "\nYou might need a fire extinguisher ahead..";
         map[10][7].message = "\nYou might need a fire extinguisher ahead..";
         map[9][5].message = "\nI tried to warn you, again!";
         map[8][6].message = "\nI tried to warn you, again!";
         map[5][6].message = "\nDali is a symbol for revolution, if you attack him, I'll know"
                 + " where you stand!!";
         map[5][5].message = "\nDali is a symbol for revolution, if you attack him, I'll know"
                 + " where you stand!!";
         map[4][5].message = "\nVIVA LA REVOLUTION! Bella Ciao! Bella Ciao!";
         map[1][3].message = "\nI hope you had a fun adventure!";
         map[0][3].message = "\nI hope you had a fun adventure!";
         map[2][5].message = "\nI can finally see the light at the end of the tunnel!";
         map[2][6].message = "\nI can finally see the light at the end of the tunnel!";
         
         //this is the north route
         map[10][12].message = "\nWe got a Thanos Sympathizer in the building!!";
         map[9][13].message = "\nThanks for avenging the Black Panther, an unlimited supply of vibranium"
                 + " is awaiting for you inn WAKANDA!";
         map[8][13].message = "\nLook around you.. A sticky substance is waiting on your misstep...";
         map[7][17].message = "\nBeware this alley! Alot of invisible obstacles on your way!";
         map[5][16].message = "\nIt's bad to take shortcuts in life!";
         map[5][15].message = "\nA ferocious Shark is roaming around, dare to face it?";
         map[5][14].message = "\nA ferocious Shark is roaming around, dare to face it?";
         map[6][10].message = "\nOnly Strong ankles will survive!!";
         map[5][13].message = "\nYou might need a fire extinguisher ahead..";
         map[5][8].message = "\nWatch for SPIDERS!!";
                 
    }

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(11,19);
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord [] exits = {
            new MapCoord(0,0),
            new MapCoord(1,0)
        };
    return exits;
            
    }
    
}
