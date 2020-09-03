/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;

/**
 *
 * @author jdrudy
 */
public class Fang extends DnDWeapon{

    public Fang() {
        super("Fang", ItemTypes.FANG, 1);
    }

    @Override
    public int rollDamage() {
         return Roll.d4();
    }
}
