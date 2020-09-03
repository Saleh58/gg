/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author Kotagiri
 */
public class Kotagiri002Hammer extends DnDWeapon{

    public Kotagiri002Hammer() {
        super("Hammer",ItemTypes.HAMMER, 2);
    }
    
    @Override
    public int rollDamage() {
        return Roll.d6() + damageBonus;
    }
    
}
