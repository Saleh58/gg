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
public class DragonFire extends DnDWeapon{

    public DragonFire() {
        super("DragonFire",ItemTypes.FIRE_FLY_THROWER, 1);
    }

    @Override
    public int rollDamage() {
        return Roll.d6() + damageBonus;
    }
    
}
