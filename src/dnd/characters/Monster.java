/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.DnDWeapon;
import javax.swing.ImageIcon;

/**
 *
 * @author SP20CIS182
 */
public class Monster extends Actor{
    
    public Monster(String name, String actorRace, int row, int col) {
        super(name, "Monster", actorRace, row, col);
    }
    
    public Monster(String name, String actorRace, DnDWeapon weapon, int row, int col){
        super(name, "Monster", actorRace, weapon, row, col);
    }
    
}
