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
public class SharpenedHands extends DnDWeapon{
    public SharpenedHands() {
        super("Sharp Hands",ItemTypes.TWO_HANDED_BLADE, 2);
    }

    @Override
    public int rollDamage() {
        return Roll.d8() + damageBonus;
    }
}
