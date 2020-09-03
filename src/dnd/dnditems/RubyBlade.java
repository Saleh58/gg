/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author Djroc
 */
public class RubyBlade extends DnDWeapon {

    public RubyBlade() {
        super("Ruby Blade", ItemTypes.ONE_HANDED_BLADE, 2);
    }

   

    @Override
    public int rollDamage() {
        return Roll.d8() + damageBonus;
    }
    
}
