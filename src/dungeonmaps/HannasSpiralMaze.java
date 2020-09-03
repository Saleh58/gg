/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.characters.DoorGhost;
import dnd.characters.Ghost;
import dnd.characters.HmstkTroll;
import dnd.characters.Monster;
import dnd.dnditems.ClownShoes;
import dnd.dnditems.DnDItem;
import dnd.dnditems.MetalGloves;
import dnd.dnditems.PartyHat;
import dnd.dnditems.TwistedSword;
import dnd.dnditems.VestOfLies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Daria
 */
public class HannasSpiralMaze implements MapMakerIF{
    
    private final String title = "Hanna's Spiral Maze";
    public final String mapDesc = "You went through the wrong door and now you're here. Enjoy your stay!";
    public final ImageIcon mapImg;
    public HannasSpiralMaze() throws IOException {
        mapImg = new ImageIcon(ImageIO.read(new File("img//SpiralMaze.png")));
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
            //exit
            //new WallSquare(2,19),
            //new WallSquare(3,19),
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
            
            //entrance
            //new WallSquare(19,4),
            //new WallSquare(19,5),
            
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
            ////end west wall
            
            new WallSquare(2,2),
            new WallSquare(2,7),
            new WallSquare(2,8),
            new WallSquare(2,9),
            new WallSquare(2,10),
            new WallSquare(2,11),
            new WallSquare(2,12),
            new WallSquare(2,13),
            new WallSquare(2,16),
            new WallSquare(3,3),
            new WallSquare(3,6),
            new WallSquare(3,7),
            new WallSquare(3,13),
            new WallSquare(3,14),
            new WallSquare(4,5),
            new WallSquare(4,6),
            new WallSquare(4,14),
            new WallSquare(4,15),
            new WallSquare(5,4),
            new WallSquare(5,5),
            new WallSquare(5,8),
            new WallSquare(5,9),
            new WallSquare(5,10),
            new WallSquare(5,11),
            new WallSquare(5,15),
            new WallSquare(5,16),
            new WallSquare(5,18),
            new WallSquare(6,3),
            new WallSquare(6,4),
            new WallSquare(6,7),
            new WallSquare(6,8),
            new WallSquare(6,11),
            new WallSquare(6,12),
            new WallSquare(6,16),
            new WallSquare(7,2),
            new WallSquare(7,3),
            new WallSquare(7,6),
            new WallSquare(7,7),
            new WallSquare(7,12),
            new WallSquare(7,13),
            new WallSquare(7,16),
            new WallSquare(8,2),
            new WallSquare(8,5),
            new WallSquare(8,6),
            new WallSquare(8,9),
            new WallSquare(8,10),
            new WallSquare(8,13),
            new WallSquare(8,16),
            new WallSquare(9,2),
            new WallSquare(9,5),
            new WallSquare(9,8),
            new WallSquare(9,9),
            new WallSquare(9,10),
            new WallSquare(9,13),
            new WallSquare(10,2),
            new WallSquare(10,5),
            new WallSquare(10,8),
            new WallSquare(10,12),
            new WallSquare(10,13),
            new WallSquare(11,2),
            new WallSquare(11,5),
            new WallSquare(11,8),
            new WallSquare(11,9),
            new WallSquare(11,11),
            new WallSquare(11,12),
            new WallSquare(11,16),
            new WallSquare(12,2),
            new WallSquare(12,5),
            new WallSquare(12,6),
            new WallSquare(12,9),
            new WallSquare(12,10),
            new WallSquare(12,11),
            new WallSquare(12,15),
            new WallSquare(12,16),
            new WallSquare(13,2),
            new WallSquare(13,3),
            new WallSquare(13,6),
            new WallSquare(13,7),
            new WallSquare(13,14),
            new WallSquare(13,15),
            new WallSquare(14,3),
            new WallSquare(14,4),
            new WallSquare(14,7),
            new WallSquare(14,8),
            new WallSquare(14,9),
            new WallSquare(14,12),
            new WallSquare(14,13),
            new WallSquare(14,14),
            new WallSquare(15,4),
            new WallSquare(15,8),
            new WallSquare(15,9),
            new WallSquare(15,10),
            new WallSquare(15,11),
            new WallSquare(15,12),
            new WallSquare(15,16),
            new WallSquare(16,3),
            new WallSquare(16,17),
            new WallSquare(17,9)    
        };
        return walls;
    }
    
    @Override
    public Monster[] getMonsters() {
        Monster[] monsters = {
            new Ghost("Boo", 3, 2),
            new Ghost("Bee", 2, 4),
            new HmstkTroll("Gamzee", 4, 13),
            new Ghost("Bop", 13, 11),
            new Ghost("Bep", 15, 6),
            new Ghost("Bap", 4, 17),
            new Ghost("Bup", 13, 17),
            new DoorGhost("Fuckhands McMichael", 10, 10)
        };
        return monsters;
    }
    
    @Override
    public FloorTrapSquare[] getTraps()throws IOException{
        FloorTrapSquare[] traps = {
            new SpikeTrapSquare(6, 1),
            new SpikeTrapSquare(8,8),
            new SpikeTrapSquare(9,4),
            new SpikeTrapSquare(9,7),
            new SpikeTrapSquare(10,3),
            new SpikeTrapSquare(11,6),
            new SpikeTrapSquare(12,4),
            new SpikeTrapSquare(14,2),
            new SpikeTrapSquare(13,10),
            new SpikeTrapSquare(17,14),
            new SpikeTrapSquare(18,14),
            new SpikeTrapSquare(17,15),
            new SpikeTrapSquare(17,16),
            new SludgeTrapSquare(1,9),
            new SludgeTrapSquare(1,10),
            new SludgeTrapSquare(1,11),
            new SludgeTrapSquare(1,12)
        };
        return traps;
    }
    
    @Override
    public DirtFloorSquare[] getDirtFloor() throws IOException{
        DirtFloorSquare[] dirtFloor = {
            new DirtFloorSquare(19,4),
            new DirtFloorSquare(19,5),
            new DirtFloorSquare(2,19),
            new DirtFloorSquare(3,19),
        };
        return dirtFloor;
    }
    
    @Override
    public MapSquare[] getMiscSquares() throws IOException{
        ChestSquare myChest = new ChestSquare(3,10);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new ClownShoes();
        
        ChestSquare exitChest = new ChestSquare(8,18);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new MetalGloves();
        
        ChestSquare fUChest = new ChestSquare(18,15);
        myChest.inventory = new DnDItem[1];
        myChest.inventory[0] = new VestOfLies();
        
        ChestSquare bossChest = new ChestSquare(11,10);
        myChest.inventory = new DnDItem[2];
        myChest.inventory[0] = new TwistedSword();
        myChest.inventory[1] = new PartyHat(); 
        
        
        MapSquare[] misc = {
            myChest, exitChest, fUChest, bossChest,
            new ExitPortal(10,9)
        };
        return misc;
    } 
    
    @Override
    public void addMessages(MapSquare[][] squares){
        
        squares[19][5].message = "\nThe moment you step into the door, the feeling"
                + " of wrongness overwhelms you. Whatever this place is, every "
                + "surface hurts to look at. It's not bright or flashy, but distinctly is not what it is. "
                + "Behind you, the door has turned into a dirt path, leading stright off of a cliff.";
        squares[18][5].message = "\nStepping forward, you see two corridors: one in front of you, "
                + "entrance partially blocked by a spectre, and one to the left, and, "
                + "on the right, what a large open area with a chest in plain sight. They all exude weird energies.";
        squares[18][7].message = "\nThe open area is slightly intimidating, and the presence of a "
                + "flimsy-looking, twisted column fails to quiet the voice telling you it'll collapse at any moment.";
        squares[18][10].message = "\nPassing the column, you notice it's covered in mirror frames, "
                + "some empty, some still snarling with their teeth-shards. The sight unsettles you.";
        squares[16][6].message = "\nAs you step closer to the ghost, it rattles its "
                + "chains spookily, its vague disinterest turning to hostility.";
        squares[13][5].message = "\nStepping further into the corridor, you are faced with a corner."
                + " Inexplicably, there is a mirror embedded in the wall you're facing. You don't like what it's showing you.";
        squares[16][9].message = "\nYou hear a voice say 'what are you even doing in this square, you're not supposed to be here!' You ignore it.";
        squares[13][4].message = "\nAs you turn the corner, you are faced with a "
                + "long, seemingly innocent corridor, though, as you look at it, the patterns on the walls shift ever so slightly.";
        squares[18][1].message = "\nYou get a feeling that someone is looking at you from the dark corner, but there's no one there.";
        squares[12][3].message = "\nSomething whispers at you, 'you might not want to go this way, "
                + "lest you want to join that poor specter.' There;s no one there when you turn around, "
                + "and the walls are a different color when you turn back around.";
        squares[11][3].message = "\nThe walls are now head-splittingly yellow. It's giving you a headache.";
        squares[11][4].message = "\nThe walls are now a very bright magenta. You hate it.";
        squares[10][4].message = "\nThe walls now look like newspaper. Trying to read them proves useless.";
        squares[9][3].message = "\nWhat color even is that?";
        squares[8][3].message = "\nYou catch a glimpse of something looking out of the wall at you and dissapearing immediately.";
        squares[8][4].message = "\nThe corridor is leaning right and getting thinner, and, for a second, you shudder, "
                + "thinking about it coming to a needle-point right around the corner.";
        squares[6][6].message = "\nThankfully, this corridor does open somewhere: there is definetly a wider space ahead.";
        squares[5][6].message = "\nThe light in the open space at the end of the corridor seems strangely dim.";
        squares[4][8].message = "\nYou're glad you're finally out of the corridor, and there's even a chest here, "
                + "probably containing some goodies. On the other side of this room, however, "
                + "stands a tall, imposing figure holding some bloody clubs, its wide grin visible even from behind. What is that doing here?";
        squares[4][10].message = "\nThe chest has a weirdly skillfully drawn clown on the lid. You wonder why. The creature leers at you.";
        squares[4][12].message = "\nThe beast smiles placidly even as it swings one of its clubs at you, dried flakes of blood falling off of it.";
        squares[6][14].message = "\nIn front of you, there is an opening in the left wall and "
                + "a further continuation of the corridor. Strange music seems to be coming from around that corner.";
        squares[9][16].message = "\nThere is a chest in front of you, and a specter to your right. "
                + "The doorway on the left leads right to a second apparition. The wall next to the chestis suspiciouly sparkly.";
        squares[8][17].message = "\nThe whole surface of the chest is a mirror. Somehow, it shows a ghost staring at you judgingly.";
        squares[5][17].message = "\nThe ghost crackles at youand waves its weird little hands around.";
        squares[2][18].message = "\nThe exit is in sight: a dirt path leading... Somewhere. "
                + "Maybe further into the dungeon, maybe out of here entirely. You home for the latter.";
        squares[18][12].message = "\nThis area seems very suspicious, and the chest, without any way to be doing so, look ssomehow very smug.";
        squares[18][15].message = "\nYou obtained a stylish vest! Its smug aura still mocks you.";
        squares[3][10].message = "\nWho put clown shoes in this stupid chest. Why.";
        squares[8][18].message = "\nYou find a pair of reflective metal gloves. The reflection in them still seems wrong.";
        squares[18][18].message = "\nYou feel someone poke you in the back. Predictably, there's no on there.";
        squares[14][16].message = "\nA ghost wobbles at you sadly, clinking its chains in a cacophony. "
                + "Behind it, you can see a corridor containing a chest and a possible exit.";
        squares[16][18].message = "\nYou feel like the column is inching closer, trying to squish you into the wall. "
                + "You are also unsure if that feeling is incorect. The column grins at you.";
        squares[17][2].message = "\nMoving closer, you see a claustrophobic-looking corridor and a weird nook, "
                + "one side formed by two columns squeezed together so tightly you can't see "
                + "through them and the other made of regular wall. The columns have hands sticking out of them on this side.";
        squares[15][3].message = "\nOn closer inspection, the hands are marble, and not flesh. You touch one. It's warm.";
        squares[13][1].message = "\nThe corridor is so thin you can't turn around properly. "
                + "If you need to go back mid-way, you'll just have to trust that there's nothing behind you.";
        squares[10][1].message = "\nIt feels like something is breathingon your neck. You try and fail to ignore it.";
        squares[7][1].message = "\nYou finally popped out of the tube tunnel. Ahead of you, "
                + "there is a spectre floating between a pair of columns similar to the one at the mouth of the tunnel. "
                + "It appears to be trying to hold one of the hands.";
        squares[4][2].message = "\nThe spectre flares up in anger at you disturbing its moping session.";
        squares[1][1].message = "\nFor a moment, the corner's walls are covered in smiling mouths. They dissapear the next second.";
        squares[3][4].message = "\nThe second specter flinches away from you, but attempts to hit you with its chain nevertheless.";
        squares[1][3].message = "\nYou approach the second spectre from behind. It feels weird to see the back of its eyeballs.";
        squares[1][8].message = "\nThe floor is becoming extra sticky. You feel like taking more caution.";
        squares[1][13].message = "\nYou are even more relieved to exit this tunnel. Your shoes stick to the floor slightly as you walk. "
                + "Infront of you is the exit - a dirt path leading... somewhere. You hope that somewhere is outside.";
        squares[1][16].message = "\nThe column in this room is opaque, and you see the specter on the other side. The exit is within reach.";
        squares[1][6].message = "\nAhead of you is another tube corridor. This one seems... slimier.";
        squares[11][14].message = "\nThe corridor ahead looks like it's in perpetually rotating, its walls flashing occasionally. "
                + "In the flashes, you can see a specter guarding the way further in.";
        squares[12][13].message = "\nAs you step in, you immediately feel a surge of vertigo. The walls flash twice, smugly.";
        squares[13][12].message = "\nThe ghost regards you with bloodshot eyes. "
                + "You briefly wonder if ghosts have blood, as its chain, illuminated by the wall lights, whooshes at your face.";
        squares[13][9].message = "\nMoving further into the tunnel, you begin to reognize the music playing. "
                + "Even as your sight blurs from the constant flashing, you wiggle to it a little.";
        squares[13][8].message = "\nAnother turn.";
        squares[12][7].message = "\nAnother chamber.";
        squares[10][6].message = "\nYou think about why you're even going further into this dungeon. "
                + "A distorted laugh echoes though the tunnel, overpowering the music for a split second before it resumes pounding on your eardrums.";
        squares[8][7].message = "\nThe volume of the music is unbearable now, and your familiarity with it brings no comfort."
                + " At least the corridor seems to be coming to an end.";
        squares[8][7].message = "\nA string of letters and numbers sears itself into your mind. It reads https://tinyurl.com/q44douk";
        squares[7][9].message = "\nThe final turn seems to be upon you. The tunnel seems to be spinning in actuality now, "
                + "although fast enough that you don't fall.";
        squares[8][11].message = "\nYou can hear faint laughter from around the corner. "
                + "At this point, you'll do almost anything to make this sensory nightmare stop. It's probably too late to turn back.";
        squares[10][11].message = "\nIn front of you, you see a chest and two yellow doors: one whose very look screams 'exit', "
                + "firmly installed into the dead-end wall of the tunnel, and another seemingly floating in thin air. "
                + "As you stare, it creaks open. Ten thin, long, knobby finger poke through it, followed by what seems to be a grinning "
                + "lump of darkness. It laughs in the same manner you've heard before, and the music gets louder. You prepare for combat.";
        squares[11][10].message = "\nThe chest had a cool sword and a party hat in it. "
                + "You feel the urge to tear the stupid bright article of clothing apart with your teeth. The sword is cool though.";
        squares[10][9].message = "\nThe exit door opens easily enough. You can't tell what's beyond it, but you're more than willing to find out.";
        
        
    }    

    @Override
    public MapCoord setEntrance() {
        return new MapCoord(19,5);
    }

    @Override
    public MapCoord[] setExits() {
        MapCoord[] exits =  {
            new MapCoord(2,19),
            new MapCoord(3,19),
            new MapCoord(10,9)
            };
        return exits;
    }
}
