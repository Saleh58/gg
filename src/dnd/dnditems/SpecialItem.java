/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import java.util.HashMap;

/**
 *
 * @author Daria
 */
public abstract class SpecialItem extends DnDItem{
    
    public final String name;
    public final String itemType;
    
    HashMap<String, Integer> bonuses = new HashMap<>();
    
    public SpecialItem(String name, String itemType){
        
        this.name = name;
        this.itemType = itemType;
        
        bonuses.put("strength" , 0);
        bonuses.put("dexterity" , 0);
        bonuses.put("wisdom" , 0);
        bonuses.put("intelligence" , 0);
        bonuses.put("charisma" , 0);
        bonuses.put("speed" , 0);
        bonuses.put("armor" , 0);
    }
    
    public int getStrBonus(){
        return bonuses.get("strength");
    }
    public int getDexBonus(){
        return bonuses.get("dexterity");
    }
    public int getIntBonus(){
        return bonuses.get("intelligence");
    }
    public int getWisBonus(){
        return bonuses.get("wisdom");
    }
    public int getCharBonus(){
        return bonuses.get("charisma");
    }
    public int getSpeedBonus(){
        return bonuses.get("speed");
    }
    public int getArmorBonus(){
        return bonuses.get("armor");
    }
    
}
