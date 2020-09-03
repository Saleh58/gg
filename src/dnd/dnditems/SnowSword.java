/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author yousefelsayed
 */
public class SnowSword extends DnDWeapon{

    public SnowSword() {
        super("SnowSword",ItemTypes.TWO_HANDED_BLADE, 2);
    }

    @Override
    public int rollDamage() {
        return Roll.d6() + damageBonus;
    }
    
}
    
    

