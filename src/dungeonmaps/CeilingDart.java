/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import java.io.IOException;

/**
 *
 * @author Djroc
 */
public class CeilingDart extends FloorTrapSquare {
    
    public CeilingDart(int r, int c) throws IOException {
        super(3, 2, r, c);
        this.message = "The ceiling opens up and a dart shoots you in your "
                + "shoulder";
    }
    
}
