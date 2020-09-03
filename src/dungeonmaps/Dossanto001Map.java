/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Dossanto001Dragon;
import dnd.characters.Dossanto001LizardMen;
import dnd.characters.Monster;
import dnd.dnditems.DnDItem;
import dnd.dnditems.Dossanto001Katana;
import dnd.dnditems.RustySword;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Nikoly
 */
public class Dossanto001Map implements MapMakerIF{
    
    private final String title = "Nikoly's Map";
    public final String MapDesc = "Welcome to Nikoly's Map have fun exploring";
    public final ImageIcon mapImg;
    public Dossanto001Map() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//NikolysMap.png")));
    }

    @Override
    public String getName() {
        return title;
    }

    @Override
    public String getMapDesc() {
        return MapDesc;
    }

    @Override
    public ImageIcon getMapImg() {
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
            
            //west wall
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
            new WallSquare(19,0),
            
            //south wall
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
            new WallSquare(19,19),
            
            //east wall
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
            
            //inside wall 1
            new WallSquare(1,13),
            new WallSquare(2,13),
            new WallSquare(2,14),
            new WallSquare(2,15),
            new WallSquare(3,15),
            new WallSquare(4,15),
            new WallSquare(5,15),
            new WallSquare(6,15),
            new WallSquare(7,15),
            new WallSquare(8,15),
            
            //inside wall 2
            new WallSquare(11,10),
            new WallSquare(11,11),
            new WallSquare(11,12),
            new WallSquare(11,13),
            new WallSquare(11,14),
            new WallSquare(11,15),
            new WallSquare(11,16),
            new WallSquare(11,17),
            new WallSquare(11,18),
            
            //inside wall 3
            new WallSquare(11,3),
            new WallSquare(12,3),
            new WallSquare(13,3),
            new WallSquare(14,3),
            new WallSquare(14,4),
            new WallSquare(14,5),
            new WallSquare(14,6),
            new WallSquare(14,7),
            new WallSquare(14,8),
            new WallSquare(15,8),
            new WallSquare(15,9),
            new WallSquare(15,10),
            new WallSquare(15,11),
            new WallSquare(16,11),
            new WallSquare(16,12),
            new WallSquare(16,13),
            new WallSquare(16,14),
            new WallSquare(16,15),
            
            //secret room north wall
            new WallSquare(3,3),
            new WallSquare(3,4),
            new WallSquare(3,5),
            new WallSquare(3,6),
            new WallSquare(3,7),
            new WallSquare(3,8),
            new WallSquare(3,9),
            new WallSquare(3,10),
            
            //secret room west wall
            new WallSquare(4,3),
            new WallSquare(5,3),
            new WallSquare(6,3),
            new WallSquare(7,3),
            new WallSquare(8,3),
            new WallSquare(9,3),
            new WallSquare(10,3),
            
            //secret room south wall
            new WallSquare(10,4),
            new WallSquare(10,5),
            new WallSquare(10,6),
            new WallSquare(10,7),
            new WallSquare(10,8),
            new WallSquare(10,9),
            new WallSquare(10,10),
            
            //secret room east wall
            new WallSquare(4,10),
            new WallSquare(5,10),
            new WallSquare(6,10),
            new WallSquare(7,10),
            new WallSquare(8,10),
            new WallSquare(9,10),
        };
        return walls;
    }

    //no dirt floor squares
    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException {
        DirtFloorSquare[] dirtFloor = {
            
        };
        return dirtFloor;
    }

    //this is where all the traps are set up
    @Override
    public FloorTrapSquare[] getTraps() throws IOException {
        FloorTrapSquare[] traps = {
            new Dossanto001ArrowTrap(4,17),
            new Dossanto001ArrowTrap(2,12),
            new Dossanto001ArrowTrap(3,1),
            new Dossanto001ArrowTrap(6,12),
            new Dossanto001ArrowTrap(15,3),
            new Dossanto001ArrowTrap(15,12),
            new Dossanto001ArrowTrap(14,16),
        };
        return traps;
    }

    //this is where all the miscellaneous squares are including chests, portals
    //and the carpet square
    @Override
    public MapSquare[] getMiscSquares() throws IOException {
        //chests inside secret room
        ChestSquare myChest = new ChestSquare(4,4);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new Dossanto001Katana();
        myChest.message = "A chest? In a secret room? Got to be good";
        ChestSquare myChest1 = new ChestSquare(5,4);
        myChest1.inventory = new DnDItem[1];
        myChest1.inventory[0]= new Dossanto001Katana();
        myChest1.message = "A chest? In a secret room? Got to be good";
        
        //chest outside of secret room
        ChestSquare myChest2 = new ChestSquare(10,11);
        myChest2.inventory = new DnDItem[1];
        myChest2.inventory[0]= new RustySword();
        myChest2.message = "You found a chest. Take this weapon to "+
                "help you defeat this dungeon";
        
        //portals
        PortalSquare myPortal =  new PortalSquare(11,4,9,9);
        PortalSquare myPortal1 = new PortalSquare(9,8,11,5);
        MapSquare[] misc = {
            myChest,
            myChest1,
            myChest2,
            myPortal,
            myPortal1,
            
            //first carpet area
            new Dossanto001CarpetSquare(5,17),
            new Dossanto001CarpetSquare(6,17),
            new Dossanto001CarpetSquare(7,17),
            new Dossanto001CarpetSquare(9,12),
            new Dossanto001CarpetSquare(9,13),
            new Dossanto001CarpetSquare(5,14),
            
            //another carpet area
            new Dossanto001CarpetSquare(2,6),
            new Dossanto001CarpetSquare(2,7),
            new Dossanto001CarpetSquare(2,8),
            new Dossanto001CarpetSquare(2,9),
            
            //more carpet area
            new Dossanto001CarpetSquare(4,6),
            new Dossanto001CarpetSquare(4,7),
            new Dossanto001CarpetSquare(4,8),
            new Dossanto001CarpetSquare(4,9),
            
            //even more carpet; this is starting to loo expensive
            new Dossanto001CarpetSquare(6,1),
            new Dossanto001CarpetSquare(7,1),
            new Dossanto001CarpetSquare(8,1),
            new Dossanto001CarpetSquare(9,1),
            new Dossanto001CarpetSquare(10,1),
            new Dossanto001CarpetSquare(11,1),
            new Dossanto001CarpetSquare(12,1),
            
            //wow there is more carpet
            new Dossanto001CarpetSquare(12,7),
            new Dossanto001CarpetSquare(12,8),
            new Dossanto001CarpetSquare(12,9),
            new Dossanto001CarpetSquare(12,10),
            new Dossanto001CarpetSquare(12,11),
            
            //last bit of carpet
            new Dossanto001CarpetSquare(17,2),
            new Dossanto001CarpetSquare(17,3),
            new Dossanto001CarpetSquare(17,4),
            new Dossanto001CarpetSquare(17,5),
            new Dossanto001CarpetSquare(17,6),
            
            
         
        };
        return misc;
    }

    @Override
    public Monster[] getMonsters() {
        
        //sets up all the monsters 
        Monster[] monsters = {
        new Dossanto001Dragon("Emerald",17,9),
        new Dossanto001LizardMen("Richard", 9,16),
        new Dossanto001LizardMen("Matthew", 3,2),
        new Dossanto001LizardMen("William", 5,7),
        new Dossanto001LizardMen("John", 7,5),
        new Dossanto001LizardMen("Paul", 7,9),
        new Dossanto001LizardMen("Elizabeth", 13,14),
        new Dossanto001LizardMen("Mary", 13,4),
        new Dossanto001LizardMen("Margaret", 14,9),
        new Dossanto001LizardMen("Karen", 6,13),
        };
        return monsters;
    }

    //added messages throughout the map
    @Override
    public void addMessages(MapSquare[][] map) {
        map[1][18].message = "\nHey, there! You have entered a lizard dungeon " +
                "be prepared to have an awesome adventure. " + 
                "Proceed with caution as there are monsters and traps everywhere.";
        map[2][19].message = "\nHey, there! You have entered a lizard dungeon " +
                "be prepared to have an awesome adventure. " + 
                "Proceed with caution as there are monsters and traps everywhere.";
        map[9][15].message = "\nCongrats on defeating your first monster, " +
                "but the battle has barely begun... Proceed if you are brave " +
                "as ahead there is loot to be gained.";
        map[10][15].message = "\nCongrats on defeating your first monster, " +
                "but the battle has barely begun... Proceed if you are brave " +
                "as ahead there is loot to be gained.";
        map[2][10].message = "\nAs you have come this far, perhaps I should tell"+
                " you the story of this dungeon...";
        map[1][10].message = "\nAs you have come this far, perhaps I should tell"+
                " you the story of this dungeon...";
        map[1][5].message = "\nLong ago a dragon lived in peace at the edge "+
                "of the world with his kin. He was a major threat to other " +
                "societies, yet he never left his domain area.";
        map[2][5].message = "\nLong ago a dragon lived in peace at the edge "+
                "of the world with his kin. He was a major threat to other " +
                "societies, yet he never left his domain area.";
        map[5][2].message = "\nOther societies, threated by the existance of "+
                "this dragon, killed him. Angry at the turn of events " +
                "the cursed spirit of the dragon and his kin were sealed in " +
                "this dungeon. Now he kills everything...";
        map[5][3].message = "\nOther societies, threated by the existance of "+
                "this dragon, killed him. Angry at the turn of events " +
                "the cursed spirit of the dragon and his kin were sealed in " +
                "this dungeon. Now he kills everything...";
        map[14][2].message = "\nNow, he just wants peace. Please defeat him "+
                "and free his soul from the endless torment of revenge.";
        map[14][3].message = "\nNow, he just wants peace. Please defeat him "+
                "and free his soul from the endless torment of revenge.";
        map[18][15].message = "\nAccomplished heroes, you have one final task. "
                + "If you follow the above path, a portal will lead you to a "+
                "secret room. There will be some prizes for your accomplishments.";
        map[17][15].message = "\nAccomplished heroes, you have one final task. "
                + "If you follow the above path, a portal will lead you to a "+
                "secret room. There will be some prizes for your accomplishments.";
        map[8][9].message = "\n You have entered a secret room. " +
                "Defeat the monsters and gain your loot!!!";
        map[8][8].message = "\n You have entered a secret room. " +
                "Defeat the monsters and gain your loot!!!";
        map[12][5].message = "\n You have exited the secret room.";
        map[11][6].message = "\n You have exited the secret room.";
        map[12][7].message = "\n You have exited the secret room.";
        map[12][4].message = "\n You have exited the secret room.";
        map[18][17].message = "\nThank you again brave warriors for your help!!! " +
                "You have conquered the Cursed Dragon dungeon";
        map[18][18].message = "\nThank you again brave warriors for your help!!! "
                + "You have conquered the Cursed Dragon dungeon";
        
    }

    //entrance
    @Override
    public MapCoord setEntrance() {
        return new MapCoord(1,19);
    }

    //exit
    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits = {
            new MapCoord(19,17),
            new MapCoord(19,18),
        };
        return exits;
    }
    
    
}
