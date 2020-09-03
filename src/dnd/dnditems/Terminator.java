/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author elebe001
 */
public class Terminator extends DnDWeapon{

    public Terminator() {
        super("The Terminator",ItemTypes.TWO_HANDED_BLADE, 1);
    }

    @Override
    public int rollDamage() {
        return Roll.d6() + damageBonus;
    }
    
}
