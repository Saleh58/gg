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
public class BloodiedClubs extends DnDWeapon{
    //This is a joke item
    public BloodiedClubs() {
        super("Bloodied Juggling Clubs",ItemTypes.TWO_HANDED_BLUDGEONING, 1);
    }

    @Override
    public int rollDamage() {
        return (Roll.d6() + damageBonus) * 2;
    }
}
