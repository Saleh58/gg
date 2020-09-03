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
public class FlameThrower extends DnDWeapon{

    public FlameThrower() {
        super("FlameThrower",ItemTypes.FIRE_BREATHER, 1);
    }

    @Override
    public int rollDamage() {
        return Roll.d6() + damageBonus;
    }
    
}
