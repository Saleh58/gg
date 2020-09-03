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
public class ClownShoes extends SpecialItem{
    
    public ClownShoes(){
        
        super("Clown Shoes",ItemTypes.SHOES);
        
        this.bonuses.replace("dexterity", 0, 2);
        this.bonuses.replace("charisma", 0, 1);
        this.bonuses.replace("wisdom", 0, -1);
        this.bonuses.replace("speed", 0, -2);
        this.bonuses.replace("armor", 0, 1);
    }
    
}
