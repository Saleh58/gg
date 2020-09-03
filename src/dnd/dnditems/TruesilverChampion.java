/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author jared
 */
public class TruesilverChampion extends DnDWeapon {
    //constructor calls the DnDWeapon consturctor, it is a two handed blade with
    //a range of 1
    public TruesilverChampion(){
        super("Truesilver Champion", ItemTypes.TWO_HANDED_BLADE, 1);
    }

    //damage is a d10 roll in additon to the damage bonus
    @Override
    public int rollDamage() {
        return Roll.d10() + damageBonus;
    }
    
}
