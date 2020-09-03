/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author saleh
 */
public class IcedPunch extends DnDWeapon{

    public IcedPunch() {
        //weapon's name and type
        super("Iced Punch",ItemTypes.FISTS, 1);
    }

    @Override
    //how many dice rolls and damage bounus
    public int rollDamage() {
        return Roll.d6() + damageBonus;
    }
    
}
