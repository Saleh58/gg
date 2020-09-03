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
public class PartyHat extends SpecialItem{
    
    public PartyHat(){
        
        super("Party Hat",ItemTypes.HEADGEAR);
        
        this.bonuses.replace("charisma", 0, 1);
    }
}
