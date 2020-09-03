package dungeonmaps;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import dnd.characters.Borela001Monster;
import dnd.characters.Monster;
import dnd.characters.Skeleton;
import dnd.dnditems.Borela001Weapon;
import dnd.dnditems.DnDItem;

public class Borela001Map implements MapMakerIF {
    //name of the map that will bve displayed in the map 
    private final String mapName = "Likhith's Deathly Hallows";
    //description of the map
    private final String mapDesc  = "During the spring time, many peasants wander in here to appreciate the beauty of the trees."
    + " No one has ever returned from there and it is rumoured that"
    + " the walls in the deathly hallows help you understand the \nmeaning of existence";
    //the image icon for showing the preview in the map selection gui
    public final ImageIcon deathlyHallowsMapImg;
    //the constructor which reads in the desired preview png file
    public Borela001Map() throws IOException {
        deathlyHallowsMapImg = new ImageIcon(ImageIO.read(new File("img//Borela001Map.png")));
    }

    //this method returns the name of the map which is used in MapSelectorGUI
    @Override
    public String getName() {
        return mapName;
    }
    //this method returns the map descrition
    @Override
    public String getMapDesc() {
        return mapDesc;
    }
    //this method gets the image preview of the map
    @Override
    public ImageIcon getMapImg() {
        return deathlyHallowsMapImg;
    }
    //this method returns an array of all the wallsquares, which are then put into the map in DnDMapMaker
    @Override
    public WallSquare[] getWallSquares() {
        //This is the array of all the gridpositions where walls are (row, column)
        WallSquare[] deathlyHallowWallSquares = {
            new WallSquare(1, 1),
            new WallSquare(1, 2),
            new WallSquare(1, 3),
            new WallSquare(1, 4),
            new WallSquare(1, 5),
            new WallSquare(1, 6),
            new WallSquare(1, 16),
            new WallSquare(1, 17),
            new WallSquare(1, 18),
            new WallSquare(1, 19),
            new WallSquare(2, 1),
            new WallSquare(2, 16),
            new WallSquare(2, 19),
            new WallSquare(3, 1),
            new WallSquare(3, 16),
            new WallSquare(3, 19),
            new WallSquare(4, 1),
            new WallSquare(4, 5),
            new WallSquare(4, 6),
            new WallSquare(4, 7),
            new WallSquare(4, 8),
            new WallSquare(4, 9),
            new WallSquare(4, 16),
            new WallSquare(4, 19),
            new WallSquare(5, 1),
            new WallSquare(5, 16),
            new WallSquare(5, 19),
            new WallSquare(6, 1),
            new WallSquare(6, 16),
            new WallSquare(6, 19),
            new WallSquare(7, 4),
            new WallSquare(7, 5),
            new WallSquare(7, 6),
            new WallSquare(7, 7),
            new WallSquare(7, 8),
            new WallSquare(7, 9),
            new WallSquare(7, 15),
            new WallSquare(7, 16),
            new WallSquare(7, 19),
            new WallSquare(8, 9),
            new WallSquare(8, 19),
            new WallSquare(9, 9),
            new WallSquare(9, 19),
            new WallSquare(10, 3),
            new WallSquare(10, 9),
            new WallSquare(10, 15),
            new WallSquare(10, 16),
            new WallSquare(10, 17),
            new WallSquare(10, 18),
            new WallSquare(10, 19),
            new WallSquare(11, 3),
            new WallSquare(11, 9),
            new WallSquare(12, 3),
            new WallSquare(12, 9),
            new WallSquare(13, 3),
            new WallSquare(13, 9),
            new WallSquare(13, 17),
            new WallSquare(14, 3),
            new WallSquare(14, 9),
            new WallSquare(14, 17),
            new WallSquare(15, 3),
            new WallSquare(15, 4),
            new WallSquare(15, 5),
            new WallSquare(15, 6),
            new WallSquare(15, 7),
            new WallSquare(15, 8),
            new WallSquare(15, 9),
            new WallSquare(16, 18),
            new WallSquare(16, 19),
            new WallSquare(18, 2),
            new WallSquare(18, 3),
            new WallSquare(18, 4),
            new WallSquare(18, 5),
            new WallSquare(18, 6),
            new WallSquare(18, 7),
            new WallSquare(18, 8),
            new WallSquare(18, 9),
            new WallSquare(18, 10),
            new WallSquare(18, 11),
            new WallSquare(18, 12),
            new WallSquare(18, 13),
            new WallSquare(18, 14)
        };
        //returning the array just initialized
        return deathlyHallowWallSquares;
    }
    //this method is similar to getWallSquares in all aspects except it deals with a different type of square, dirt
    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException {
        DirtFloorSquare[] deathlyHallowsDirtFloorSquares = {
            new DirtFloorSquare(0, 7),
            new DirtFloorSquare(0, 8),
            new DirtFloorSquare(0, 9),
            new DirtFloorSquare(0, 10),
            new DirtFloorSquare(0, 11),
            new DirtFloorSquare(0, 12),
            new DirtFloorSquare(0, 13),
            new DirtFloorSquare(0, 14),
            new DirtFloorSquare(0, 15),
            new DirtFloorSquare(1, 7),
            new DirtFloorSquare(1, 8),
            new DirtFloorSquare(1, 15),
            new DirtFloorSquare(17, 13),
            new DirtFloorSquare(17, 14),
            new DirtFloorSquare(17, 15),
            new DirtFloorSquare(17, 16),
            new DirtFloorSquare(17, 17),
            new DirtFloorSquare(17, 18),
            new DirtFloorSquare(17, 19),
            new DirtFloorSquare(18, 15),
            new DirtFloorSquare(18, 16),
            new DirtFloorSquare(18, 17),
            new DirtFloorSquare(18, 18),
            new DirtFloorSquare(18, 19)
        };
        return deathlyHallowsDirtFloorSquares;
    }
    //These squares are the trap squares of the map, which are also put into the map through the DnDMapMaker class
    @Override
    public FloorTrapSquare[] getTraps() throws IOException {
        FloorTrapSquare[] deathlyHallowsFloorTrapSquares = {
            //two different types of traps are used, with Borela001Trap traps being used less as they are more deadly
            new SpikeTrapSquare(5, 13),
            new SpikeTrapSquare(6, 7),
            new Borela001Trap(8, 4),
            new SpikeTrapSquare(8, 15),
            new SpikeTrapSquare(9, 4),
            new Borela001Trap(9, 15),
            new SpikeTrapSquare(12, 12)
        };
        return deathlyHallowsFloorTrapSquares;
    }
    //this returns an array of misc squares, which can be anything, trasure chests, portals, health regen etc.
    @Override
    public MapSquare[] getMiscSquares() throws IOException {
        //initializing a new chestsquare
        ChestSquare treasureChest = new ChestSquare(12, 4);
        //the chest square has one item
        treasureChest.inventory = new DnDItem[1];
        //the item is a Borela001Weapon, or a Scythe of Kronos
        treasureChest.inventory[0] = new Borela001Weapon();
        MapSquare[] deathlyHallowMiscSquares = {
            //the chestSquare is put into the array
            treasureChest,
            //so is a Borela001MiscSquare
            new Borela001MiscSquare(2, 17)
        };
        return deathlyHallowMiscSquares;
    }

    //4 Monsters are in this map so 4 are initialized in the array 
    @Override
    public Monster[] getMonsters() {
        Monster[] deathlyHallowsMonsters = {
            new Borela001Monster("Farkle", 12, 7),
            new Skeleton("Felicia", 16, 12),
            new Borela001Monster("Eduardo", 4, 17),
            new Skeleton("Josh", 7, 18)
        };
        return deathlyHallowsMonsters;
    }

    //the addmessages method displays messages in the dialogue box everytime a player walks over the certain block
    @Override
    public void addMessages(MapSquare[][] map) {
        map[19][19].message = "\nYou gaze off into the empty distance of the vast hallows";
        map[16][14].message = "\nFaint whispering can be heard, could it be the walls?";
        map[15][16].message = "\n Broken down walls, something must have been here, something big";
        map[9][14].message = "\n You see a corridor opening, you hear faint voices";
        map[5][7].message = "\n The walls speak to you, something about 'the truth'";
        map[8][3].message = "\n You enter a room and spot a faint glow in the distance";
        map[7][13].message = "\n Ancient writings about a scythe?";
        map[12][4].message = "\n The faint glow was emitting from this chest";
        map[1][7].message = "\n The hallows begin to fade away, and the bright shining sun hits you, you become hopeful";
        map[0][11].message = "\n You walk out with mixed emotions, struggling to forget the horrors you witnessed";
    }

    //setting the entrance of the map
    @Override
    public MapCoord setEntrance() {
        return new MapCoord(19, 19);
    }

    //setting all the possible exit points of the map using an array of exit coords
    @Override
    public MapCoord[] setExits() {
        MapCoord[] deathlyHallowsExCoords = {
            new MapCoord(0, 7),
            new MapCoord(0, 8),
            new MapCoord(0, 9),
            new MapCoord(0, 10),
            new MapCoord(0, 11),
            new MapCoord(0, 12),
            new MapCoord(0, 13),
            new MapCoord(0, 14),
            new MapCoord(0, 15)
        };
        return deathlyHallowsExCoords;
    }
    

}