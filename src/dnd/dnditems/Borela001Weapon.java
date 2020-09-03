package dnd.dnditems;

import dnd.Roll;
//extends the DnD weapon class
public class Borela001Weapon extends DnDWeapon {
    //the weapon's constrsutor is the super connsturctor with the name being the scythe of kronos, and a scythe is a one handed blade
    public Borela001Weapon() {
        super("Scythe of Kronos",ItemTypes.ONE_HANDED_BLADE, 1);
    }

    //this item is pretty legendary and overpowered, so the damage bonus is set to be 5 and the scythe has in increased range 
    //because scythes are long
    @Override
    public int rollDamage() {
        setDamageBonus(5);
        setRangeBonus(4);
        return Roll.d6() + damageBonus;
    }
}