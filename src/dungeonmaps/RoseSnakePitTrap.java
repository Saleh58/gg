/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import java.io.IOException;

/**
 *
 * @author jaker
 */
public class RoseSnakePitTrap extends FloorTrapSquare{
    
    public RoseSnakePitTrap(int r, int c) throws IOException {
        //a pit of snakes that you fall in does low damage but is hard to see not sure what a high camo is so I put 5 for a placeholder
        super(1, 5, r, c);
        this.message = "\nYou fell into a pit of snakes... Why did it have to be snakes?";
    }
    
}