/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import java.io.IOException;

/**
 *
 * @author gubotdev
 */
public class MobilityFloorTrap extends FloorTrapSquare{
    
    public final int movementPenalty;
    
    public MobilityFloorTrap(int damage, int camo, int r, int c, int movementPenalty) throws IOException {
        super(damage, camo, r, c);
        this.movementPenalty = movementPenalty;
    }
    
}
