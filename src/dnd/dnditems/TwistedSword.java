/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author Daria
 */
public class TwistedSword extends DnDWeapon{
    
    public TwistedSword() {
        super("Twisted Sword",ItemTypes.ONE_HANDED_BLADE, 1);
    }

    @Override
    public int rollDamage() {
        return Roll.d6() + damageBonus + Roll.d4();
    }
    
}
