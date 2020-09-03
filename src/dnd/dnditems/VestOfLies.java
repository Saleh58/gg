/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

/**
 *
 * @author Daria
 */
public class VestOfLies extends SpecialItem{
    
    public VestOfLies(){
        
        super("Vest of Lies",ItemTypes.UPPER_BODY_ARMOR);
        
        this.bonuses.replace("charisma", 0, 1);
        this.bonuses.replace("wisdom", 0, 2 + (int)(Math.random()*4) -1);
        this.bonuses.replace("speed", 0, -2);
        this.bonuses.replace("armor", 0, 2);
        this.bonuses.replace("intelligence", 0, 2);
    }
}
