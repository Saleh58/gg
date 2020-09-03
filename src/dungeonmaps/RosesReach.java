/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Monster;
import dnd.characters.TheCookieMonsterRose;
import dnd.characters.BurntHusk;
import dnd.dnditems.DnDItem;
import dnd.dnditems.TridentRose;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jaker
 */
public class RosesReach implements MapMakerIF{
    
    private final String title = "Rose's Reach";
    public final String mapDesc = "Rose's Reach is a mysterious dungeon just " 
            + "recently discovered. So far all who have ventured within have not returned";
    public final ImageIcon mapImg;
    public RosesReach() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//RosesReachMap.png")));
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
            
            //exit at (4,19)
            
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
            
            //entrance at (19.9) and (19,10)
            
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
            
            
            //inner walls
            //wall section
            new WallSquare(15,12),
            new WallSquare(16,12),
            new WallSquare(17,12),
            new WallSquare(18,12),
            
            //wall section
            new WallSquare(12,7),
            new WallSquare(12,8),
            new WallSquare(12,9),
            new WallSquare(12,10),
            new WallSquare(12,11),
            new WallSquare(12,12),
            new WallSquare(12,13),
            new WallSquare(12,14),
            new WallSquare(12,15),
            new WallSquare(12,16),
            
            //wall section
            new WallSquare(13,7),
            new WallSquare(14,7),
            new WallSquare(15,7),
            new WallSquare(16,7),
            
            //wall section
            new WallSquare(16,2),
            new WallSquare(16,3),
            new WallSquare(16,4),
            new WallSquare(16,5),
            new WallSquare(16,6),
            
            //wall section
            new WallSquare(13,2),
            new WallSquare(14,2),
            new WallSquare(14,2),
            new WallSquare(15,2),
            
            //wall section
            new WallSquare(1,3),
            new WallSquare(2,3),
            
            //wall section
            new WallSquare(5,3),
            new WallSquare(6,3),
            new WallSquare(7,3),
            new WallSquare(8,3),
            new WallSquare(9,3),
            
            //wall section
            new WallSquare(9,4),
            new WallSquare(9,5),
            new WallSquare(9,6),
            new WallSquare(9,7),
            new WallSquare(9,8),
            new WallSquare(9,9),
            new WallSquare(9,10),
            new WallSquare(9,11),
            new WallSquare(9,12),
            new WallSquare(9,13),
            new WallSquare(9,14),
            new WallSquare(9,15),
            new WallSquare(9,16),
            new WallSquare(9,17),
            new WallSquare(9,18),
            
            //wall section
            new WallSquare(3,16),
            new WallSquare(3,17),
            new WallSquare(3,18),
            
            //wall section
            new WallSquare(5,16),
            new WallSquare(5,17),
            new WallSquare(5,18),
       
        };
        return walls;
    }

    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException {
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(19,9),
            new DirtFloorSquare(19,10),
            new DirtFloorSquare(4,16),
            new DirtFloorSquare(4,17),
            new DirtFloorSquare(4,18),
            new DirtFloorSquare(4,19),
        };
        return dirtFloor;
    }

    @Override
    public FloorTrapSquare[] getTraps() throws IOException {
        FloorTrapSquare[] traps = {
            new RosesMimicTrap(16,9),
            new RosesMimicTrap(14,5),
            new SpikeTrapSquare(18,5),
            new SpikeTrapSquare(16,15),
            new RoseSnakePitTrap(17,3),
            new RoseSnakePitTrap(7,10)
        };
        return traps;
    }

    @Override
    public MapSquare[] getMiscSquares() throws IOException {
        ChestSquare theChest = new ChestSquare(18,18);
        theChest.inventory = new DnDItem[1];
        theChest.inventory[0] = new TridentRose();
        MapSquare[] misc = {
            theChest,
            new RoseCrumblingWall(13,1)    
        };
        return misc;
    }

    @Override
    public Monster[] getMonsters()  {
        Monster[] monsters = {
            new TheCookieMonsterRose("Cookie Monster",4,15),
            new BurntHusk("Bad Cookie", 17,7),
            new BurntHusk("Burnt Barry", 18,7),
            new BurntHusk("Charred Charlie", 17,17),
            new BurntHusk("Ashy Alex", 14,3),
            new BurntHusk("Scorched Sam", 2,6),
            new BurntHusk("Fired Fred", 4,6),
            new BurntHusk("Scalded Stephanie", 6,6),
            new BurntHusk("Singed Steven", 8,6),
        };
        return monsters;
    }

    @Override
    public void addMessages(MapSquare[][] squares) {
        squares[18][10].message = "\nYou enter a dark yet oddly warm room. " 
                + "There is a faint smell of chocolate chip cookies";
        squares[17][6].message = "\nYou head off into a dark corridor littered " 
                + "with corpses of the dead.";
        squares[18][6].message = "\nYou head off into a dark corridor littered " 
                + "with corpses of the dead.";
        squares[16][1].message = "\nYou turn right into a narrow hallway barely " 
                + "big enough for you to stand in. Ahead lies a crumbling wall.";
        squares[3][3].message = "\nAhead of you lies a large open space in which " 
                + "you can see four sentries at the ready. The smell of cookies grows stronger.";
        squares[4][3].message = "\nAhead of you lies a large open space in which " 
                + "you can see four sentries at the ready. The smell of cookies grows stronger.";
        squares[14][3].message = "\nA tiny room lies in from you. There is a " 
                +"body on the ground next to a chest.";
        squares[14][4].message = "\nA tiny room lies in from you. There is a " 
                +"body on the ground next to a chest.";
        squares[14][6].message = "\nA tiny room lies in from you. There is a " 
                +"body on the ground next to a chest.";
        squares[14][12].message = "\nYou enter a larger room than the previous "
                + "one. Dimly lit by a torch in the corner";
        squares[13][12].message = "\nYou enter a larger room than the previous "
                + "one. Dimly lit by a torch in the corner";
        squares[1][12].message = "\nAhead of you lies a familiar figure. One you "
                + "hoped you would never have to face... The Cookie Monster";
        squares[1][12].message = "\nAhead of you lies a familiar figure. One you "
                + "hoped you would never have to face... The Cookie Monster";
        squares[2][12].message = "\nAhead of you lies a familiar figure. One you "
                + "hoped you would never have to face... The Cookie Monster";
        squares[3][12].message = "\nAhead of you lies a familiar figure. One you "
                + "hoped you would never have to face... The Cookie Monster";
        squares[4][12].message = "\nAhead of you lies a familiar figure. One you "
                + "hoped you would never have to face... The Cookie Monster";
        squares[5][12].message = "\nAhead of you lies a familiar figure. One you "
                + "hoped you would never have to face... The Cookie Monster";
        squares[6][12].message = "\nAhead of you lies a familiar figure. One you "
                + "hoped you would never have to face... The Cookie Monster";
        squares[7][12].message = "\nAhead of you lies a familiar figure. One you "
                + "hoped you would never have to face... The Cookie Monster";
        squares[8][12].message = "\nAhead of you lies a familiar figure. One you "
                + "hoped you would never have to face... The Cookie Monster";
        squares[14][1].message = "\nThe wall in front of you is crumbling and "
                + "could possibly break with a hard enough push";
        
    }


    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits = {
        new MapCoord(4,19),
    };
        return exits;
    }

    @Override
    public MapCoord setEntrance() {
         return new MapCoord(19,10);
    }
    
}
