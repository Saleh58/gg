/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.AnnihilanBattlemaster;
import dnd.characters.Monster;
import dnd.characters.Skeleton;
import dnd.dnditems.DnDItem;
import dnd.dnditems.RustySword;
import dnd.dnditems.TruesilverChampion;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author jared
 */
public class JaredsMap implements MapMakerIF {

    private final String title = "Jared's Map";
    public final String mapDesc = "Welcome to Jared's Map. Remember, there is "
            + "but one rule: hunt or be hunted.";
    public final ImageIcon mapImg;
    
    public JaredsMap() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//JaredsMap.png")));
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
            
            //east wall
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
            
            //south wall
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
            
            //weast wall
            new WallSquare(1,0),
            //exit
            //new WallSquare(2,0),
            //new WallSquare(3,0),
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
            //spawn
            //new WallSquare(17,0),
            //new WallSquare(18,0),
            
            //interior walls           
            new WallSquare(1,5),
            new WallSquare(2,5),
            new WallSquare(2,7),
            new WallSquare(3,7),
            new WallSquare(4,1),
            new WallSquare(4,2),
            new WallSquare(4,3),
            new WallSquare(4,4),
            new WallSquare(4,5),
            new WallSquare(4,6),
            new WallSquare(4,7),
            new WallSquare(4,8),
            new WallSquare(3,11),
            new WallSquare(3,12),
            new WallSquare(3,13),
            new WallSquare(1,16),
            new WallSquare(2,16),
            new WallSquare(3,16),
            new WallSquare(1,13),
            new WallSquare(2,13),
            new WallSquare(5,8),
            new WallSquare(6,8),
            new WallSquare(7,8),
            new WallSquare(8,8),
            new WallSquare(8,9),
            new WallSquare(8,10),
            new WallSquare(7,3),
            new WallSquare(7,4),
            new WallSquare(7,5),
            new WallSquare(8,3),
            new WallSquare(9,3),
            new WallSquare(10,3),
            new WallSquare(10,4),
            new WallSquare(10,5),
            new WallSquare(11,5),
            new WallSquare(12,5),
            new WallSquare(13,5),
            new WallSquare(14,5),
            new WallSquare(15,5),
            new WallSquare(16,5),
            new WallSquare(17,5),
            new WallSquare(18,5),
            new WallSquare(13,3),
            new WallSquare(13,4),
            new WallSquare(13,6),
            new WallSquare(13,7),
            new WallSquare(13,8),
            new WallSquare(13,9),
            new WallSquare(16,1),
            new WallSquare(16,2),
            new WallSquare(17,7),
            new WallSquare(18,7),
            new WallSquare(6,12),
            new WallSquare(7,12),
            new WallSquare(8,12),
            new WallSquare(9,12),
            new WallSquare(10,12),
            new WallSquare(11,12),
            new WallSquare(12,12),
            new WallSquare(13,12),
            new WallSquare(14,12),
            new WallSquare(15,12),
            new WallSquare(15,9),
            new WallSquare(15,10),
            new WallSquare(15,11),
            new WallSquare(16,9),
            new WallSquare(17,9),
            new WallSquare(17,11),
            new WallSquare(17,12),
            new WallSquare(17,13),
            new WallSquare(15,14),
            new WallSquare(16,14),
            new WallSquare(17,14),
            new WallSquare(18,14),
            new WallSquare(13,13),
            new WallSquare(13,14),
            new WallSquare(13,15),
            new WallSquare(13,16),
            new WallSquare(7,13),
            new WallSquare(7,14),
            new WallSquare(7,15),
            new WallSquare(8,15),
            new WallSquare(9,15),
            new WallSquare(9,16),
            new WallSquare(9,17),
            new WallSquare(9,18)
        };
        return walls;
    }

    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException {
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(2,0),
            new DirtFloorSquare(3,0),
            new DirtFloorSquare(17,0),
            new DirtFloorSquare(17,1),
            new DirtFloorSquare(17,2),
            new DirtFloorSquare(18,0),
            new DirtFloorSquare(18,1),
            new DirtFloorSquare(18,2)
        };
        return dirtFloor;
    }

    @Override
    public FloorTrapSquare[] getTraps() throws IOException {
        FloorTrapSquare[] traps = {
            new SpikeTrapSquare(14,4),
            new SpikeTrapSquare(3,5),
            new SpikeTrapSquare(1,7),
            new SpikeTrapSquare(9,11),
            new PunjiStickTrapSquare(18,11),
            new PunjiStickTrapSquare(8,16),
            new PunjiStickTrapSquare(3,17)
        };
        return traps;
    }

    @Override
    public MapSquare[] getMiscSquares() throws IOException {
        ChestSquare myChest1 = new ChestSquare(8,13);
        myChest1.inventory = new DnDItem[1];
        myChest1.inventory[0] = new TruesilverChampion();
        ChestSquare myChest2 = new ChestSquare(1,17);
        myChest2.inventory = new DnDItem[1];
        myChest2.inventory[0] = new TruesilverChampion();
        ExplorersHatSquare myHat = new ExplorersHatSquare(7,2);
        
        MapSquare[] misc = {
            myChest1,
            myChest2,
            myHat   
        };
        return misc;
    }

    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            new Skeleton("Andrew",1, 11),
            new AnnihilanBattlemaster("Heraclius", 2, 2), //good
            new Skeleton("Bartholomew", 2, 6),
            new Skeleton("Charlie", 15, 3),
            new Skeleton("Elmer", 6, 4),
            new Skeleton("Frank", 3, 8),
            new Skeleton("Frankie", 3, 9),
            new Skeleton("George", 11, 7),
            new Skeleton("Geo", 9, 10),
            new AnnihilanBattlemaster("Kyle", 9, 9),
            new Skeleton("Lars", 12, 7),
            new Skeleton("Leon1", 12, 10),
            new Skeleton("Marco", 11, 1),
            new Skeleton("Niko", 11, 2),
            new Skeleton("Robbie", 16, 16),
            new Skeleton("Steve", 16, 17),
            new Skeleton("Trent", 16, 18),
            new AnnihilanBattlemaster("Ulysses", 17, 18),
            new Skeleton("Vixen", 17, 16),
            new Skeleton("Augustus", 17, 17), //ab
            new Skeleton("Wob", 18, 6),
            new Skeleton("Xavier1", 10, 15),
            new Skeleton("Xavier2", 11, 15),
            new Skeleton("Xavier3", 12, 15),
            new Skeleton("Bill", 5, 12),
            new Skeleton("Bob", 4, 12),
            new Skeleton("Deuce", 7, 17),
            new Skeleton("Donk", 6, 17),
        };
        return monsters;
    }

    @Override
    public void addMessages(MapSquare[][] squares) {
        
        squares[17][2].message = "\nWelcome to the Jungle. "
                + "I do hope you brought some friends, because I did.";
        squares[14][2].message = "\nCheck your corners and stay frosty. " 
                + "You could find some loot, ferocious foes, or pointy things.";
        squares[3][2].message = "\nYou really came all this way and really "
                + "left Indiana Jones' hat back there?";
        squares[5][4].message = "\nWasn't that an awesome hat?";
        squares[11][9].message = "\nTwo roads diverged in a dark, " 
                + "eerie dungeon.";
        squares[0][2].message = "\nI would say you should be proud for "
                + "navigating my maze, but you left the hat behind.";
        squares[0][3].message = "\nI would say you should be proud for "
                + "navigating my maze, but you left the hat behind.";
        squares[3][10].message = "\n Heraclius almost pitys you, " 
                + "becasue you stumbled onto his platter.";
        squares[14][14].message = "\n That certainly is a lot of my minions. "
                + "They are not guarding anything valuable, so do not fret.";
        squares[3][4].message = "\nI know, I know! You are sick of the traps."
                + "To your benefit, there are no more of them ahead";
        squares[1][18].message = "\nCongratulations, you reached this corner "
                + "where I stash my methamphetamine. You may have some if "
                + "if you like...";
    }

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(17,0);
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {
            new MapCoord(2,0),
            new MapCoord(3,0)
            };
        return exits;
    }
    
}
