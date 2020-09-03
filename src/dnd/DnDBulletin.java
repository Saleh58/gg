/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd;

import dnd.characters.DnDCharacter;
import dungeonmaps.DnDMapMaker;
import java.util.ArrayList;

/**
 *
 * @author SP20CIS182
 */
public class DnDBulletin {
    
    private DnDGUI gui;
    private DungeonMaster dm;
    private DnDCharacter current;
    
    public DnDBulletin(){
        gui = new DnDGUI(this);
        dm = new DungeonMaster(this);
    }
    
    public DnDCharacter getCurrent(){
        return dm.getNextCharacter();
    }
    
    public void startGUI(ArrayList<DnDCharacter> party, DnDMapMaker maker){
        gui.start(party, maker);
    }
    
    public void printCharNames(){
        for(DnDCharacter next : dm.party){
            System.out.println("Next: " + next.name);
        }
    }
    
}
