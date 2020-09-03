/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author Joshi Gandham
 */
public class Gandham003Whip extends DnDWeapon{
          
public Gandham003Whip() {
        super("Slasher",ItemTypes.WHIP, 2);
    }

    @Override
    public int rollDamage() {
        return Roll.d6() + damageBonus;
    }
    
}
