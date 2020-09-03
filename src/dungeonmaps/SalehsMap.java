/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.Monster;
import dnd.characters.SalehsElderDragon;
import dnd.characters.SalehsViking;
import dnd.characters.SalehsIceGolem;
import dnd.dnditems.DnDItem;
import dnd.dnditems.IcedPunch;
import dnd.dnditems.SalehsSwordAndShield;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author saleh
 */
public class SalehsMap implements MapMakerIF{
    // map's name
    private final String title = "Saleh's Map";
    // maps descreption
    public final String mapDesc = "Welcome to Saleh's Map. Try to escape the "
            + "Elder's mountains and kill all of your enmeies. Have fun!";
    // map's icons
    public final ImageIcon mapImg;
    public SalehsMap() throws IOException {
        // the maps display explanation
        mapImg = new ImageIcon(ImageIO.read(new File("img//SalehsMap.png")));
    }
    // getting the name selected
    @Override
    public String getName(){
        return title;
    }
    // geting the description
    @Override
    public String getMapDesc(){
        return mapDesc;
    }
    // getting the images
    public ImageIcon getMapImg(){
        return mapImg;
    }
    
    @Override
    // all wallSquares' location
    public WallSquare[] getWallSquares() {
        WallSquare[] walls = {
            
            new WallSquare(0,0),
            new WallSquare(0,12),
            new WallSquare(0,11),
            new WallSquare(0,3),
            new WallSquare(0,4),
            new WallSquare(0,5),
            new WallSquare(0,6),
            new WallSquare(0,7),
            new WallSquare(0,8),
            new WallSquare(0,9),
            new WallSquare(0,10),
            new WallSquare(0,13),
            new WallSquare(0,14),
            new WallSquare(0,15),
            new WallSquare(0,16),
            new WallSquare(0,17),
            new WallSquare(0,18),
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
            new WallSquare(14,3),
            new WallSquare(14,4),
            new WallSquare(14,5),
            new WallSquare(14,6),
            new WallSquare(14,7),
            new WallSquare(14,8),
            new WallSquare(14,19),
            new WallSquare(15,19),
            new WallSquare(16,19),
            new WallSquare(17,19),
            new WallSquare(11,13),
            new WallSquare(19,18),
            new WallSquare(19,9),
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
            new WallSquare(18,19),
            new WallSquare(19,19),
            new WallSquare(19,17),
            new WallSquare(19,16),
            new WallSquare(19,15),
            new WallSquare(19,14),
            new WallSquare(19,13),
            new WallSquare(19,12),
            new WallSquare(19,11),
            new WallSquare(19,10),
            new WallSquare(19,9),
            new WallSquare(3,6),
            new WallSquare(3,7),
            new WallSquare(3,8),
            new WallSquare(3,9),
            new WallSquare(3,10),
            new WallSquare(3,11),
            new WallSquare(3,12),
            new WallSquare(3,13),
            new WallSquare(3,14),
            new WallSquare(4,14),
            new WallSquare(5,14),
            new WallSquare(6,14),
            new WallSquare(8,14),
            new WallSquare(9,14),
            new WallSquare(4,6),
            new WallSquare(5,6),
            new WallSquare(6,6),
            new WallSquare(7,6),
            new WallSquare(7,9),
            new WallSquare(7,14),
            new WallSquare(8,4),
            new WallSquare(7,4),
            new WallSquare(6,4),
            new WallSquare(5,4),
            new WallSquare(4,4),
            new WallSquare(3,4),
            new WallSquare(2,4),
            new WallSquare(1,4),
            new WallSquare(8,6),
            new WallSquare(9,6),
            new WallSquare(10,6),
            new WallSquare(8,9),
            new WallSquare(9,9),
            new WallSquare(10,9),
            new WallSquare(10,14),
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
            new WallSquare(14,9),
            new WallSquare(14,12),
            new WallSquare(15,9),
            new WallSquare(15,12),
            new WallSquare(16,9),
            new WallSquare(16,12),
            new WallSquare(17,9),
            new WallSquare(18,9),
            new WallSquare(12,12),
            new WallSquare(17,1),
            new WallSquare(17,2),
            new WallSquare(17,3),
            new WallSquare(17,4),
            new WallSquare(17,5),
            new WallSquare(17,6),
            new WallSquare(16,1),
            new WallSquare(16,2),
            new WallSquare(16,3),
            new WallSquare(16,4),
            new WallSquare(16,5),
            new WallSquare(16,6),
            
            
        };
        return walls;
    }
    
    @Override
    //Monster's name and location
    public Monster[] getMonsters() {
        Monster[] monsters = {
            new SalehsIceGolem("Bojeng",6,8),
            new SalehsIceGolem("Sand man", 15, 14),
            new SalehsElderDragon("Thorn",2,1),
            new SalehsViking("MountainDefender",3,18)
        };
        return monsters;
    }
    
    @Override
    //traps location
    public FloorTrapSquare[] getTraps()throws IOException{
        FloorTrapSquare[] traps = {
           
            new SalehsCurseTrap(3,2),
            new SalehsCurseTrap(1,14),
            new SalehsCurseTrap(2,16),
            new SalehsCurseTrap(5,5),
            new SalehsCurseTrap(9,2),
            new SalehIceTrap(5,13),
            new SalehIceTrap(16,10),
            new SalehIceTrap(6,16),
            new SalehIceTrap(13,5)

        };
        return traps;
    }
    
    @Override
    // all DirtFloorSquares' location
    public DirtFloorSquare[] getDirtFloor() throws IOException{
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(0,1),
            new DirtFloorSquare(0,2),
            new DirtFloorSquare(18,0),
            new DirtFloorSquare(19,0),
            new DirtFloorSquare(18,1),
            new DirtFloorSquare(19,1),
            new DirtFloorSquare(19,2),
            new DirtFloorSquare(18,2),
            new DirtFloorSquare(19,3),
            new DirtFloorSquare(19,4),
            new DirtFloorSquare(19,5),
            new DirtFloorSquare(19,6),
            new DirtFloorSquare(19,7),
            new DirtFloorSquare(19,8),
            new DirtFloorSquare(18,3),
            new DirtFloorSquare(18,4),
            new DirtFloorSquare(18,5),
            new DirtFloorSquare(18,6),
            new DirtFloorSquare(18,7),
            new DirtFloorSquare(18,8),
            new DirtFloorSquare(17,7),
            new DirtFloorSquare(17,8),
            new DirtFloorSquare(16,7),
            new DirtFloorSquare(16,8),

        };
        return dirtFloor;
    }
    
    @Override
    // the two che's and the portal location
    public MapSquare[] getMiscSquares() throws IOException{
        
        SalehsDarkChest dChest = new SalehsDarkChest(1,5);
        dChest.inventory = new DnDItem[1];
        dChest.inventory[0] = new SalehsSwordAndShield();
        
        ChestSquare myChest = new ChestSquare(15,17);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new IcedPunch();

        MapSquare[] misc = {
            dChest,
            myChest,
            new PortalSquare(2,7,19,0)    
        };
        return misc;
    } 
    
    @Override
    // the massage when stepping into a spesific square
    public void addMessages(MapSquare[][] squares){
        
        squares[16][7].message = "\nVisitors: Whats going on?! I belive someone telepoted us here."
                + "Man these huge white mountaines look scary. I think we need to go to"
                + " the summit of the big one there. ";
        squares[16][8].message = "\nVisitors: Whats going on?! I belive someone telepoted us here."
                + "Man these huge white Mountaines look scary. I think we need to go to"
                + " the summit of the big one there.";
        squares[14][1].message = "\nMountain Defender: Welcome to the Elder's Mountaines only the"
                + " bravest survives here. the mountains? these are the corpses of our "
                + "visitor, try not to be one of them. HAHAHAHAHA";
        squares[14][2].message = "\nMountain Defender: Welcome to the Elder's Mountaines only the"
                + " bravest survives here. the mountains? these are the corpses of our "
                + "visitor, try not to be one of them. HAHAHAHAHA";
        squares[11][8].message = "\nVisitors: WHAT THE HELL IS THIS. Unknown Whisper:"
                + " guys becarful, this Ice Goblen "
                + "is not that strong I am sure you can deal with him easily. "
                + "Btw I am Sara, I will try to guid you on your way to the Elder's Mountain";
        squares[11][7].message = "\nVisitors: WHAT THE HELL IS THIS. Unknown Whisper: "
                + "guys becarful, this Ice Goblen "
                + "is not that strong I am sure you can deal with him easily. "
                + "Btw I am Sara, I will try to guid you on your way to the Elder's Mountain";
        squares[11][10].message = "\nVisitors: Gotta admit it, these mountaines "
                + "look trrafic from here. YOU IDIOT THESE ARE NOT REAL MOUNTAINES, "
                + "THESE ARE DAMN CORPSES. Guys calm down let's foucs on reaching "
                + "the big mountaine. Okay... We are sorry";
        squares[11][11].message = "\nVisitors: Gotta admit it, these mountaines "
                + "look trrafic from here. YOU IDIOT THESE ARE NOT REAL MOUNTAINES, "
                + "THESE ARE DAMN CORPSES. Guys calm down let's foucs on reaching "
                + "the big mountaine. Okay... We are sorry";
        squares[17][10].message = "\nSara: Listen guys, there is a trasure chest "
                + "in your left but there is an Ice Goblen defending it, I am "
                + "sure you will like him just like the last one just play as a team.";
        squares[17][11].message = "\nSara: Listen guys, there is a trasure chest "
                + "in your left but there is an Ice Goblen defending it, I am "
                + "sure you will like him just like the last one just play as a team.";
        squares[16][16].message = "\nVisitors: Haha found it! Wait the damn goblen "
                + "push me away thats not fare! You think I care, finders keepers. "
                + "Guys wait! remmber what Sara said, we wont escape this place if we "
                + "don't work as a team; Let's play tic tac toe and the winner gets "
                + "the chest. Agree. Okay Man whatever.";
        squares[16][17].message = "\nVisitors: Haha found it! Wait the damn goblen "
                + "push me away thats not fare! You think I care, finders keepers. "
                + "Guys wait! remmber what Sara said, we wont escape this place if we "
                + "don't work as a team; Let's play tic tac toe and the winner gets "
                + "the chest. Agree. Okay Man whatever.";
        squares[16][18].message = "\nVisitors: Haha found it! Wait the damn goblen "
                + "push me away thats not fare! You think I care, finders keepers. "
                + "Guys wait! remmber what Sara said, we wont escape this place if we "
                + "don't work as a team; Let's play tic tac toe and the winner gets "
                + "the chest. Agree. Okay Man whatever.";
        squares[10][15].message = "\nMountain Defender: So long, It has been so long since I saw a human. "
                + "How dare you climing up to my mountaine. Never mind, this is the "
                + "farest you would get, BE READY TO FACE YOUR DEATH! Sara: guys this is "
                + "the viking Zora or by other name the Mountain Defender. Try to use the weapon that "
                + "you get from the chest. Do not give up! We are half way there!";
        squares[10][16].message = "\nMountain Defender: So long, It has been so long since I saw a human. "
                + "How dare you climing up to my mountaine. Never mind, this is the "
                + "farest you would get, BE READY TO FACE YOUR DEATH! Sara: guys this is "
                + "the viking Zora or by other name the Mountain Defender. Try to use the weapon that "
                + "you get from the chest. Do not give up! We are half way there!";
        squares[10][17].message = "\nMountain Defender: So long, It has been so long since I saw a human. "
                + "How dare you climing up to my mountaine. Never mind, this is the "
                + "farest you would get, BE READY TO FACE YOUR DEATH! Sara: guys this is "
                + "the viking Zora or by other name the Mountain Defender. Try to use the weapon that "
                + "you get from the chest. Do not give up! We are half way there!";
        squares[10][18].message = "\nMountain Defender: So long, It has been so long since I saw a human. "
                + "How dare you climing up to my mountaine. Never mind, this is the "
                + "farest you would get, BE READY TO FACE YOUR DEATH! Sara: guys this is "
                + "the viking Zora or by other name the Mountain Defender. Try to use the weapon that "
                + "you get from the chest. Do not give up! We are half way there!";
        squares[1][12].message = "\nVisitors: OMG, what the hell is this thing, "
                + "and what is in side that huge black chest! Sara: guys I am not sure "
                + "about my information but I believe that one of them is a trap and the other one is "
                + "a reward. I think the teleport is the reward and the chest is the trap, you guys decide!";
        squares[2][12].message = "\nVisitors: OMG, what the hell is this thing, "
                + "and what is in side that huge black chest! Sara: guys I am not sure "
                + "about my information but I believe that one of them is a trap and the other one is "
                + "a reward. I think the teleport is the reward and the chest is the trap, you guys decide!";
        squares[3][5].message = "\nSara: Thats great, the black chest has the weapon of Zora, keep it with "
                + "you I am sure you will need it in the future, so the teleport was the trap I really "
                + "do not know where it takes you to. Visitors: Holly Shit, Man this weapon looks awesome!";
        squares[9][1].message = "\nVisitors: Finally we reached the Elder's mountain! I can see a huge gate "
                + "there, I believe it is the exsit! But guys look, there is a dragon sleeping in the front "
                + "of the door, I think he wont let us pass this easily. Guys I have an idea, let's sneak and "
                + "come from the back of the dragon. Remmber DO NOT MAKE A SOUND!";
        squares[9][2].message = "\nVisitors: Finally we reached the Elder's mountain! I can see a huge gate "
                + "there, I believe it is the exsit! But guys look, there is a dragon sleeping in the front "
                + "of the door, I think he wont let us pass this easily. Guys I have an idea, let's sneak and "
                + "come from the back of the dragon. Remmber DO NOT MAKE A SOUND!";
        squares[9][3].message = "\nVisitors: Finally we reached the Elder's mountain! I can see a huge gate "
                + "there, I believe it is the exsit! But guys look, there is a dragon sleeping in the front "
                + "of the door, I think he wont let us pass this easily. Guys I have an idea, let's sneak and "
                + "come from the back of the dragon. Remmber DO NOT MAKE A SOUND!";
        squares[6][3].message = "\nVisitors: Cough...cough. OH SHIT HE WOKE UP!. U IDIOT! CAN'T U JUST HOLD "
                + "IT FOR A MINUTE!. Elder Dragon: Ahh it is been 500 years since someone climbes my mountain "
                + "I am Thorn the only elder dragon left in this world. My family spent their entire "
                + "life protecting this gate and so am I. Go back from whatever you came from. In othe "
                + "words. YOU SHALL NOT PASS! Visitors: What shoudl we do... What should we do. "
                + "Man we can't do shit to this damn dragon and there is no way we can find another gate anywhere "
                + "else. I guess this is the end... It was my pleasure to meet you friends. Sara: guys gather "
                + "yourselfs you can't give up now! You have walk all this way to surrender! Sharpe your sowrds and "
                + "fight this damn dragon! And remmber we have the sowrd of Zora I am sure it must do smothing!";
        squares[6][2].message = "\nVisitors: Cough...cough. OH SHIT HE WOKE UP!. U IDIOT! CAN'T U JUST HOLD "
                + "IT FOR A MINUTE!. Elder Dragon: Ahh it is been 500 years since someone climbes my mountain "
                + "I am Thorn the only elder dragon left in this world. My family spent their entire "
                + "life protecting this gate and so am I. Go back from whatever you came from. In othe "
                + "words. YOU SHALL NOT PASS! Visitors: What shoudl we do... What should we do. "
                + "Man we can't do shit to this damn dragon and there is no way we can find another gate anywhere "
                + "else. I guess this is the end... It was my pleasure to meet you friends. Sara: guys gather "
                + "yourselfs you can't give up now! You have walk all this way to surrender! Sharpe your sowrds and "
                + "fight this damn dragon! And remmber we have the sowrd of Zora I am sure it must do smothing!";
        squares[6][1].message = "\nVisitors: Cough...cough. OH SHIT HE WOKE UP!. U IDIOT! CAN'T U JUST HOLD "
                + "IT FOR A MINUTE!. Elder Dragon: Ahh it is been 500 years since someone climbes my mountain "
                + "I am Thorn the only elder dragon left in this world. My family spent their entire "
                + "life protecting this gate and so am I. Go back from whatever you came from. In othe "
                + "words. YOU SHALL NOT PASS! Visitors: What shoudl we do... What should we do. "
                + "Man we can't do shit to this damn dragon and there is no way we can find another gate anywhere "
                + "else. I guess this is the end... It was my pleasure to meet you friends. Sara: guys gather "
                + "yourselfs you can't give up now! You have walk all this way to surrender! Sharpe your sowrds and "
                + "fight this damn dragon! And remmber we have the sowrd of Zora I am sure it must do smothing!";
        squares[1][1].message = "\nVisitors: OMG!!!! WE MADE IT, WE MADE IT!!! who would though that zora's "
                + "weapon has a bounse damage agains dragon! Sara: Great work guys! I believe this is "
                + "the end, go across this gate I think it should take you to your world.";
        squares[1][2].message = "\nVisitors: OMG!!!! WE MADE IT, WE MADE IT!!! who would though that zora's "
                + "weapon has a bounse damage agains dragon! Sara: Great work guys! I believe this is "
                + "the end, go across this gate I think it should take you to your world.";
    }    

    @Override
    //charchter starting location
    public MapCoord setEntrance() {
        return new MapCoord(19,0);
    }

    @Override
    //game exsits location
    public MapCoord[] setExits() {
        MapCoord[] exits =  {
            new MapCoord(0,1),
            new MapCoord(0,2)
            };
        return exits;
    }
}
    

