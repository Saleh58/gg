/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author 18147
 */
public class AncientWarHammer extends DnDWeapon {

        public AncientWarHammer() {
        super("Ancient War Hammer",ItemTypes.TWO_HANDED_BLUDGEONING, 1);
    }
    
    @Override
    public int rollDamage() {
        return Roll.d8() + damageBonus;
    }
    
}
