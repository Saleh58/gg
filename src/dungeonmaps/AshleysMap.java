/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.GuardianDrake;
import dnd.characters.Mimic;
import dnd.characters.Monster;
import dnd.characters.UndeadGrick;
import dnd.dnditems.AncientWarHammer;
import dnd.dnditems.DnDItem;
import dnd.dnditems.RustySword;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author 18147
 */
public class AshleysMap implements MapMakerIF{
    
    private final String title = "Ashley's Map";
    public final String mapDesc = "Straight out of Ashley's favorite"+
            " campaign, do you dare to enter?";
    public final ImageIcon mapImg;
    public AshleysMap() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//AshleysMap.png")));
    }
    
    //first step - imported all @override methods
    //added body to each method in order of import

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

            new WallSquare(0,19),
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
            //enterence
            //new WallSquare(19,18),
            //new WallSquare(19,17),
            new WallSquare(19,16),
            new WallSquare(19,15),
            new WallSquare(19,14),
            new WallSquare(19,13),
            new WallSquare(19,12),
            new WallSquare(19,11),
            new WallSquare(19,10),
            new WallSquare(19,9),
            new WallSquare(19,8),
            new WallSquare(19,7),
            new WallSquare(19,6),
            new WallSquare(19,5),
            new WallSquare(19,4),
            new WallSquare(19,3),
            new WallSquare(19,2),
            new WallSquare(19,1),
            new WallSquare(19,0),

            //exit
            //new WallSquare(1,0),
            //new WallSquare(2,0),
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

            //inside walls vertical
            new WallSquare(3,5),
            new WallSquare(4,5),
            new WallSquare(5,5),
            new WallSquare(5,5),
            new WallSquare(6,5),
            new WallSquare(7,5),
            new WallSquare(8,5),
            new WallSquare(9,5),
            new WallSquare(10,5),
            new WallSquare(11,5),
            new WallSquare(12,5),
            new WallSquare(13,5),
            new WallSquare(14,5),
            new WallSquare(15,5),
            new WallSquare(16,5),

            new WallSquare(1,8),
            new WallSquare(2,8),
            new WallSquare(3,8),
            new WallSquare(4,8),
            new WallSquare(5,8),
            new WallSquare(6,8),
            new WallSquare(7,8),
            new WallSquare(8,8),


            new WallSquare(6,13),
            new WallSquare(7,13),
            new WallSquare(8,13),
            new WallSquare(9,13),
            new WallSquare(10,13),
            new WallSquare(11,13),
            new WallSquare(12,13),
            new WallSquare(13,13),
            new WallSquare(14,13),
            new WallSquare(15,13),
            new WallSquare(16,13),

            new WallSquare(1,16),
            new WallSquare(2,16),
            new WallSquare(3,16),
            new WallSquare(4,16),
            new WallSquare(5,16),
            new WallSquare(6,16),
            new WallSquare(7,16),

            new WallSquare(11,16),
            new WallSquare(12,16),
            new WallSquare(13,16),
            new WallSquare(14,16),
            new WallSquare(15,16),
            new WallSquare(16,16),
            new WallSquare(17,16),
            new WallSquare(18,16),
            new WallSquare(19,16),


            //inside walls horizontal
            new WallSquare(3,1),
            new WallSquare(3,2),
            new WallSquare(3,3),
            new WallSquare(3,4),

            new WallSquare(9,1),
            new WallSquare(9,2),
            new WallSquare(9,3),

            new WallSquare(16,6),
            new WallSquare(16,7),
            new WallSquare(16,8),

            new WallSquare(6,9),
            new WallSquare(6,10),
            new WallSquare(6,11),
            new WallSquare(6,12),
            new WallSquare(6,13),

            new WallSquare(16,11),
            new WallSquare(16,12),
        };
        return walls;
    }

    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException {
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(1,0),
            new DirtFloorSquare(1,1),
            new DirtFloorSquare(2,0),
            new DirtFloorSquare(2,1),
            
            new DirtFloorSquare(19,18),
            new DirtFloorSquare(19,17),
            new DirtFloorSquare(18,18),
            new DirtFloorSquare(18,17),
            
        };
        return dirtFloor;
        
    }

    @Override
    public FloorTrapSquare[] getTraps() throws IOException {
       FloorTrapSquare[] traps = {
            new SpikeTrapSquare(8,6),
            new SpikeTrapSquare(9,16),
            //poison ooze squares
            new PoisonOozeSquare(9,4),
            new PoisonOozeSquare(2,10),
            
            //yellow mold - smalls so bad it deals damage?
           
        };
       return traps;
    }

    @Override
    public MapSquare[] getMiscSquares() throws IOException {
        ChestSquare myChest = new ChestSquare(7,12);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new RustySword();
        myChest.inventory[0] = new AncientWarHammer();
        
        BookshelfSquare myBookshelf = new BookshelfSquare(8,1);
        myBookshelf.inventory = new DnDItem[1];
        MapSquare[] misc = {
            myChest,
            myBookshelf,
        };
        return misc;
    }

    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            new Mimic("chompchop",1,9),
            new Mimic("goodbye fingers",18,1),
            
            
            new UndeadGrick("IWILLBITEYOU",3,12),
            new UndeadGrick("MrSlimy",4,4),
            
            new GuardianDrake ("Danger Lizard",15,12),
        };
        return monsters;
    }
    
    //similar to the dialogue of the DM
    @Override
    public void addMessages(MapSquare[][] squares) {
        //entrence message [17,18] [17,17]
        squares[17][18].message = "\nYou've entered into what seems to be a "
                + "dark and mysterious looking hallway, noticing ancient images"
                + " inscribed on the walls. Legends speak of deserted "
                + "strongholds from a warriors age past. What treasure might "
                + "have been forgotten here... ";
        squares[17][17].message = "\nYou've entered into what seems to be a "
                + "dark and mysterious looking hallway, noticing ancient images"
                + " inscribed on the walls. You've heard legends of deserted "
                + "strongholds from a warriors age past. What treasure might "
                + "have been forgotten here... ";
        //door to left and something at the end of the hallway [11,17] [11,18]
        squares[11][17].message = "\nYou notice a doorway to your left, but the"
                + " hallway ahead of you continues into darkness…";
        squares[11][18].message = "\nYou notice a doorway to your left, but the"
                + " hallway ahead of you continues into darkness…";
        //enter and come to an innerpass, right or left [10,16] [9,16] [8,16]
        squares[10][16].message = "\nYou have come to another hallway "
                + "stretching to your right and left. ";
        squares[9][16].message = "\nYou have come to another hallway stretching"
                + " to your right and left. ";
        squares[8][16].message = "\nYou have come to another hallway stretching"
                + " to your right and left. ";
        //opens to large room [6,14] [6,15]
        squares[6][14].message = "\nThe doorway opens to a large room, with"
                + " dark shadows and figures on the far wall and corners of"
                + " the room.";
        squares[6][15].message = "\nThe doorway opens to a large room, with"
                + " dark shadows and figures on the far wall and corners of"
                + " the room.";
        //rounded corner, see an opeing on right and room ahead [17,14] [18,14]
        squares[17][14].message = "\nYou round the corner to see another"
                + " hallway. In the dark you see am open doorway to the right"
                + " and a room opening at the end. The sounds of bones rattling"
                + " come from the room ahead.";
        squares[18][14].message = "\nYou round the corner to see another"
                + " hallway. In the dark you see am open doorway to the right"
                + " and a room opening at the end. The sounds of bones rattling"
                + " come from the room ahead.";
        //opens to big room, alter in the middle, door back left [16,9] [16,10]
        squares[16][9].message = "\nYou enter to see a huge room with what "
                + "seems to be a nest of various bones, armor and broken wood "
                + "in the center.";
        squares[16][10].message = "\nYou enter to see a huge room with what "
                + "seems to be a nest of various bones, armor and broken wood "
                + "in the center.";
        //large room with door at the back [18,4] [17,4]
        squares[18][4].message = "\nOnce you enter, you can see the remains of "
                + "what looked to be an armory, as rusty and broken weapons are"
                + " scattered about. You also notice what could be a door on "
                + "the back wall…";
        squares[17][4].message = "\nOnce you enter, you can see the remains of "
                + "what looked to be an armory, as rusty and broken weapons are"
                + " scattered about. You also notice what could be a door on "
                + "the back wall…";
        //looks like a secret room [9,4]
        squares[9][4].message = "\nIt appears you found a hidden room in the "
                + "armory! But be weary!";
        //could this be the way out? [5,6][5,7]
        squares[5][6].message = "\nThere’s light up ahead…could this be the "
                + "way out?";
        squares[5][7].message = "\nThere’s light up ahead…could this be the "
                + "way out?";  
    }

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(19,18);
    }

    //includes pits or places where characters die instantly
    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {
            new MapCoord(1,0),
            new MapCoord(2,0)
                
           //bottomless pit? 
                
           //fake exits?
           //[6,0][7,0],[19,2][19,3],[0,13][0,14]
            };
        return exits;
    }
    
}
