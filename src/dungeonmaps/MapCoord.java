/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

/**
 *
 * @author SP20CIS182
 */
public class MapCoord {
    public int row;
    public int col;
    
    public MapCoord(int row, int col){
        this.row = row;
        this.col = col;
    }
    
    public MapCoord nw(){
        return new MapCoord(row-1,col-1);
    }
    
    public MapCoord n(){
        return new MapCoord(row-1,col);
    }
    
    public MapCoord ne(){
        return new MapCoord(row-1,col+1);
    }
    
    public MapCoord w(){
        return new MapCoord(row,col-1);
    }
    
    public MapCoord e(){
        return new MapCoord(row,col+1);
    }
    
    public MapCoord sw(){
        return new MapCoord(row+1,col-1);
    }
    
    public MapCoord s(){
        return new MapCoord(row+1,col);
    }
    
    public MapCoord se(){
        return new MapCoord(row+1,col+1);
    }
    
    public String toString(){
        return "Row: " + row + " Column: " + col;
    }
}
