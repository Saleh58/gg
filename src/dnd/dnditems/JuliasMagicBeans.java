/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.dnditems;

import dnd.Roll;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author julia
 */
public class JuliasMagicBeans extends DnDConsumableWeapon{
    //used to create the beans
    public JuliasMagicBeans() {
        super("Magic Beans" ,ItemTypes.MAGIC_BEANS, 3, 5);       
    }
    
    //uses a 20-sided die to roll damage
    @Override
    public int rollDamage() {
        if(numOfShots > 0){
            return Roll.d20() + damageBonus; 
        }else{
            JOptionPane.showMessageDialog(null,"You reach into your bag of magic "
                    + "beans, but find only some old lent... you're out!!!");
            return 0;
        }
              
    }
                    
}
