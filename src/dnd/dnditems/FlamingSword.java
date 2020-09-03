/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author jkni1
 */
public class FlamingSword extends DnDWeapon{

    public FlamingSword() {
        super("Flaming Sword",ItemTypes.ONE_HANDED_BLADE, 1);
    }

    @Override
    public int rollDamage() {
        return Roll.d6() + damageBonus;
    }
    
}
