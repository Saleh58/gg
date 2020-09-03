/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

/**
 *
 * @author julia
 */
public abstract class DnDConsumableWeapon extends DnDWeapon{
    
    protected final int numOfShots;
    
    public DnDConsumableWeapon(String name, String weaponType, int range, int numOfShots) {
        super(name, weaponType, range);
        this.numOfShots = numOfShots;
    }
    
    
    
}
