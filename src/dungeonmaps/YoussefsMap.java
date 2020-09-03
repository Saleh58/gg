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
import dnd.characters.DeadlyMummie;
import dnd.characters.Laiz;
import dnd.characters.WhitePharoah;
        

/**
 *
 * @author yousefelsayed
 */
public class YoussefsMap implements MapMakerIF {
     private final String title = "Youssef's Map";
    
    public final String mapDesc = "Welcome to our pyramid , we really hope you"
            + "can actually get out :)";
    public final ImageIcon mapImg;
    public YoussefsMap() throws IOException {
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
            

             //new WallSquare(18,2),
             new WallSquare(17,3),
             new WallSquare(16,4),
             new WallSquare(15,5),
             new WallSquare(14,6),
             new WallSquare(12,8),
             new WallSquare(11,9),
             new WallSquare(11,10),
             new WallSquare(12,11),
             new WallSquare(13,12),
             new WallSquare(14,13),
             new WallSquare(15,14),
             new WallSquare(17,16),
             new WallSquare(15,14),
             new WallSquare(18,17),
             new WallSquare(19,18),
             new WallSquare(15,1),
             new WallSquare(15,2),
             new WallSquare(15,3),
             new WallSquare(14,1),
             new WallSquare(13,1),
             new WallSquare(12,1),
             
             //upper pyramid 
             new WallSquare(11,1),
             new WallSquare(10,2),
             new WallSquare(9,3),
             new WallSquare(8,4),
             new WallSquare(7,5),
             new WallSquare(6,6),
             new WallSquare(5,7),
             //new WallSquare(4,8),
             new WallSquare(3,9),
             new WallSquare(3,10),
             new WallSquare(4,11),
             new WallSquare(6,13),
             new WallSquare(7,14),
             new WallSquare(8,15),
             new WallSquare(9,16),
             new WallSquare(10,17),
             new WallSquare(11,18),
             
             //upper part of the map left side
             
             new WallSquare(2,1),
             new WallSquare(2,2),
             new WallSquare(2,3),
             new WallSquare(2,4),
             new WallSquare(2,5),
             new WallSquare(2,6),
             new WallSquare(2,7),
             new WallSquare(3,3),
             new WallSquare(4,3),
             new WallSquare(5,3),
             new WallSquare(3,5),
             new WallSquare(4,5),
             new WallSquare(5,5),
              
             // upper part right side
             
             new WallSquare(5,15),
             new WallSquare(5,16),
             new WallSquare(5,17),
             new WallSquare(6,17),
             new WallSquare(7,17),
             new WallSquare(7,18),
             new WallSquare(2,14),
             new WallSquare(2,15),
             new WallSquare(2,16),
             new WallSquare(2,17),
             new WallSquare(2,18),
            
             // middle part of the map (the area between the two pyramids)
             
             new WallSquare(8,12),
             new WallSquare(8,13),
             new WallSquare(8,14),
             new WallSquare(9,12),
             new WallSquare(10,12),
             
            
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

           // new WallSquare(19,7),
            //new WallSquare(19,8),
            //new WallSquare(19,9),

            new WallSquare(19,14),
            
                
            //entrance cliff on the side of mountain
            /*
            new WallSquare(19,10),
            new WallSquare(19,11),
            new WallSquare(19,12),
            new WallSquare(19,13),
            
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
            new WallSquare(17,12),
            new WallSquare(17,11),
            new WallSquare(17,10),
            new WallSquare(17,9),
            new WallSquare(17,8),
            new WallSquare(17,7),
            new WallSquare(17,6),
            new WallSquare(17,5),
            //new WallSquare(17,4),
            new WallSquare(17,12),
            new WallSquare(17,13),
            new WallSquare(17,14),
           // new WallSquare(17,15),
            //new WallSquare(17,16),
            new WallSquare(17,17),
            new WallSquare(17,18),
            //new WallSquare(18,9),
            new WallSquare(19,13),
            new WallSquare(19,12),
            new WallSquare(19,11),
            new WallSquare(19,10),
            new WallSquare(16,5),
            new WallSquare(18,3),
            new WallSquare(17,3),
            new WallSquare(16,3),

            //new WallSquare(18,0),
            
            ////end west wall
            
            
            //entrance
            new WallSquare(19,1),
            new WallSquare(19,2),
            new WallSquare(19,3),
            new WallSquare(19,4),
            new WallSquare(17,1),
            new WallSquare(17,2),
            new WallSquare(17,3),
            new WallSquare(17,4),
            new WallSquare(18,6),
            new WallSquare(17,6),
            
            //entrace between the two pyramids
            
            new WallSquare(10,5),
            new WallSquare(10,6),
            new WallSquare(10,7),
            new WallSquare(10,8),
            new WallSquare(10,9),
            new WallSquare(10,10),
            new WallSquare(6,10),
            new WallSquare(7,10),
            new WallSquare(8,10),
            new WallSquare(9,10),
            new WallSquare(8,5),
            new WallSquare(8,6),
            new WallSquare(8,7),
            new WallSquare(8,8),
            new WallSquare(7,8),
            new WallSquare(0,11),
            new WallSquare(0,12),
            new WallSquare(1,9),
            new WallSquare(1,10),
            new WallSquare(2,9),
            new WallSquare(2,10),
            
            
            
            
            
            
            
            // lower pyramid blocks
             
           
            
           
            
            

            
            
            
        };
        return walls;
    }
    
    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {

            new BigPharoah("George",2,2),
            new BigPharoah("Ruby", 15, 15),
            new BigPharoah("Joshy", 8, 8),
            new DeadlyMummie("nolan", 16, 6),

            //new BigPharoah("George",2,2),
            //new BigPharoah("Ruby", 15, 15),
            new BigPharoah("Joshy", 5, 10),
            new DeadlyMummie("nolan", 8, 4),
            new Laiz("Zach", 17, 12 ),
            new WhitePharoah("Gabe", 3, 3),
            new Laiz("Jon", 1, 3),
            new Laiz("Zach", 17, 12 ),
            new WhitePharoah("Gabe", 1, 13),
            new BigPharoah("Joshy", 12, 5),
            
            
            
            
            

           
            
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
            new BoobyTrap(2,10),
            new BoobyTrap(17,16),
            new BoobyTrap(17,15),

            //new SpikeTrapSquare(9,6),
            new SpikeTrapSquare(16,5),
            //new SpikeTrapSquare(4,13),
            //new SpikeTrapSquare(3,4),
            new SpikeTrapSquare(19,13),
            new SpikeTrapSquare(13,6),
            //new SpikeTrapSquare(1,10),
            //new BoobyTrap(2,10),
            new BoobyTrap(16,11),
            new BoobyTrap(16,16),
            new DynamiteMine(5,10),
            new DeadFall(3,17),
            new DeadFall(6,16),
            new DynamiteMine(3,13),
            new BoobyTrap(16,16),
            new DynamiteMine(5,10),
            new DynamiteMine(14,18),
            new BoobyTrap(12,7),
            
            
            

           
                
                //8 traps
        };
        return traps;
    }
    
    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException{
        DirtFloorSquare[] dirtFloor = {

            new DirtFloorSquare(0,11),
            new DirtFloorSquare(0,12),

            //new DirtFloorSquare(0,11),
            //new DirtFloorSquare(0,12),
            new DirtFloorSquare(18,0),
            
            

           // new DirtFloorSquare(17,10), //entrance message index: 2
           // new DirtFloorSquare(17,11), //entrance message index: 3
          //  new DirtFloorSquare(18,10),
           // new DirtFloorSquare(19,10),
            //new DirtFloorSquare(18,11),
            //new DirtFloorSquare(19,11),
           // new DirtFloorSquare(18,12),
            //ew DirtFloorSquare(19,12),
            //new DirtFloorSquare(18,13),
           // new DirtFloorSquare(19,13),

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

            //new DirtFloorSquare(18,14),
            //new DirtFloorSquare(19,14),
            //new DirtFloorSquare(18,15),
            //new DirtFloorSquare(19,15),
            //new DirtFloorSquare(18,16),
           //new DirtFloorSquare(19,16),
            //new DirtFloorSquare(18,17),
            //new DirtFloorSquare(19,17),
            new DirtFloorSquare(0,2),
            new DirtFloorSquare(0,3),
            new DirtFloorSquare(0,16),
            new DirtFloorSquare(0,17),

            
            
            
        };
        return dirtFloor;
    }
    
    @Override
    public MapSquare[] getMiscSquares() throws IOException{

        ChestSquare myChest = new ChestSquare(13,2);

        ChestSquare myChest2 = new ChestSquare(19,14);
        

        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new CursedBlade();
        MapSquare[] misc = {
            myChest,
            new PortalSquare(12,18,1,1),
            new PortalSquare(7,11,18,1)
                
            
                    
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
        squares[17][15].message = "\nI see that you've chosen the easy way out"
                + " I'm not sure its the best decision you can take !";
        squares[17][16].message = "\nI see that you've chosen the easy way out"
                + " I'm not sure its the best decision you can take !";
        squares[16][4].message = "\nMay the Pharoa's curse be with you :)";

        
        
        squares[13][16].message = "\nWhat about taking the other way ? i think "
                + "You would enjoy the other path ..... or maybe not";
   
        
        squares[17][15].message = "\nGoodluck on your journey , may the good "
                + "souls be with you :)!";
        squares[17][16].message = "\nI see that you've chosen the easy way out"
                + " I'm not sure its the best decision you can take !";
        
        squares[16][4].message = "\nMay the Pharoa's curse be with you :)";
        
        squares [18][1].message = "\n Welcome to the cursed pyramid "
       +"Your journey here is either going to be a long one or a very short one"
                +"good luck !!";
        
        squares [17][5].message ="\n You are now approaching the first level of "
                + "this pyramid , make sure you don't fall into a lot of traps "
                + "you really don't wanna feel all the pain"; 
        
         squares [13][6].message = "\n You are now approaching the darker level"
                 + "and let me tell you , YOU SHOULD BE REALLY SCARED";
         
         squares [13][7].message = "\n You are now approaching the darker level"
                 + "and let me tell you , YOU SHOULD BE REALLY SCARED";
         
          squares [1][2].message = "\n Congratulations you have done it , you"
                  + "are the first person that ever comes out alive out of this"
                  + "pyramid , but as you know the curse can still be stuck with"
                  + "you ;)";
          
          squares [1][3].message = "\n Congratulations you have done it , you"
                  + "are the first person that ever comes out alive out of this"
                  + "pyramid , but as you know the curse can still be stuck with"
                  + "you ;)";
          
          squares [9][7].message = "\n Going through this pathway ? don't you"
                  + "think it can be a perfect trap ? getting trapped in this "
                  + "small alleyway isn't the way you wanna die i guess";
          
          squares [0][16].message = "\n Congratulations you have done it , you"
                  + "are the first person that ever comes out alive out of this"
                  + "pyramid , but as you know the curse can still be stuck with"
                  + "you ;)";
          
          squares [0][17].message = "\n Congratulations you have done it , you"
                  + "are the first person that ever comes out alive out of this"
                  + "pyramid , but as you know the curse can still be stuck with"
                  + "you ;)";
         
          squares [1][6].message = "\n Laiz is COMING!!!"
                  + "If you don't be smart , YOU ARE DEAD!!";
          
          squares [1][13].message = "\n Laiz is COMING!!!"
                  + "If you don't be smart , YOU ARE DEAD!!";
                 

                
    }    

    @Override
    public MapCoord setEntrance() {

        return new MapCoord(18,0);
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {

            new MapCoord(0,11),

            new MapCoord(0,2),
            new MapCoord(0,3),
            new MapCoord(0,16),
            new MapCoord(0,17)
                
            };
        return exits;
    }
   
           
}
