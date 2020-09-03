/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.dnditems.DnDItem;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author julia
 */
public class JuliasMysteriousRockSquare extends MapSquare{
    
    public DnDItem[] inventory;   
 
    public JuliasMysteriousRockSquare(int r, int c) throws IOException {
        super(new ImageIcon(ImageIO.read(new File("img//MysteriousRock.png"))), r, c, true);   
        message = "\nYou find a mysterious rock.";
    }  
    
    //Will eventually allow the rock teleport 
    public JuliasMysteriousRockSquare teleport(JuliasMysteriousRockSquare rock) throws IOException{
        
        int newR = (int)(Math.random()*20);
        int newC = (int)(Math.random()*20);
        JuliasMysteriousRockSquare newRock = new JuliasMysteriousRockSquare(newR,newC);
        
        rock.message = "none"; //not sure if this is necessary at the current moment
        
        return newRock;
               
    }
    
}
