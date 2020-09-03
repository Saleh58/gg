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
public class MetalGloves extends SpecialItem{
    
    public MetalGloves(){
        
        super("Metal Gloves",ItemTypes.HAND_ARMOR);
        
        this.bonuses.replace("strength", 0, 2);
        this.bonuses.replace("speed", 0, -3);
        this.bonuses.replace("armor", 0, 2);
    }
}
