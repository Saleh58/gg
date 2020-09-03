/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author sethg
 */
public class HeavyHammer extends DnDWeapon{
    public HeavyHammer() {
        super("Heavy Hammer", ItemTypes.ONE_HANDED_BLADE, 2);
    }

    @Override
    public int rollDamage() {
        return Roll.d6() + damageBonus;
    }
    
}
