/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author seanh
 */
//is a DnDWeapon
public class BrokenBeerBottle extends DnDWeapon{
    
    //creates a weapon that is a broken beer bottle that also happens to be on
    //a stick, so that it can reach a range of two
        public BrokenBeerBottle() {
        super("Broken Beer Bottle",ItemTypes.ONE_HANDED_BLUDGEONING, 2);
    }
    
        //sets the mechanism for dealing damage
   @Override
    public int rollDamage() {
        return Roll.d6() + damageBonus;
    }
}

