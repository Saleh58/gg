/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd.characters;

import dnd.dnditems.DnDItem;
import dnd.dnditems.DnDWeapon;
import dnd.dnditems.Fists;
import dungeonmaps.MapCoord;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author SP20CIS182
 */
public class Actor {
    public final String name, actorType, actorRace;
    protected String weaponName;
    protected int hitPoints, speed, armorClass;
    public MapCoord coord;
    public Icon pic;
    public DnDWeapon weapon;
    public ArrayList<DnDItem> inventory = new ArrayList();
    
    public Actor(String name, String actorType, String actorRace, int row, int col){
        this.name = name;
        this.actorType = actorType;
        this.actorRace = actorRace;
        this.weapon = new Fists();
        this.coord = new MapCoord(row,col);
    }
    
    public Actor(String name, String actorType, String actorRace, DnDWeapon weapon, int row, int col){
        this.name = name;
        this.actorType = actorType;
        this.actorRace = actorRace;
        this.weapon = weapon;
        this.coord = new MapCoord(row,col);
    }
    
    public String getActorString(){
        return actorType + ": " + actorRace +"\nName: " + name
            + "\nArmor Class: " + armorClass + "\nWeapon: " + weaponName
            + "\nHealth: " + hitPoints;
    }
    
    public void takeDamage(int damage){
        hitPoints -= damage;
    }
    
    public int getHitPoints(){
        return hitPoints;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public int getArmorClass(){
        return armorClass;
    }
    
    public DnDWeapon getWeapon(){
        return weapon;
    }
    
}
