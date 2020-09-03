/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author SP20CIS182
 */
public class SandwichSword extends DnDWeapon{

    public SandwichSword() {
        super("Sandwich Sword",ItemTypes.ONE_HANDED_BLUDGEONING, 2);
    }

    @Override
    public int rollDamage() {
        return Roll.d4() + damageBonus;
    }
    
}
