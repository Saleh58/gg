/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author jaker
 */
public class TridentRose extends DnDWeapon{
    //did you know the cookie monsters real name is Sid
    //this is his personal trident that you will use to slay him

    public TridentRose() {
        super("Sid's Trident", ItemTypes.TWO_HANDED_BLADE, 3);
    }

    @Override
    public int rollDamage() {
        return Roll.d6() + damageBonus;
    }
    
}
