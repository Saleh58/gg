/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnd;

import dnd.characters.DnDCharacter;
import dnd.characters.Monster;
import dungeonmaps.DirtFloorSquare;
import dungeonmaps.DnDMapMaker;
import dungeonmaps.StoneFloorSquare;
import dungeonmaps.MapSquare;
import dungeonmaps.FloorTrapSquare;
import dungeonmaps.JuliasMysteriousRockSquare;
import dungeonmaps.Kotagiri002Health;
import dungeonmaps.MapCoord;
import dungeonmaps.PortalSquare;
import dungeonmaps.RoseCrumblingWall;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

/**
 *
 * @author SP20CIS182
 */
public class DnDGUI extends JFrame{
    private final DnDBulletin bulletin;
    
    private DnDCharacter current;
    private Monster targetedMonster;
    private MapCoord entrance;
    private MapCoord[] exits;
    
    private DnDMapMaker mapMaker;
    
    //GUI border
    Border b = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
    
    //parent Layout
    private BorderLayout parentLayout = new BorderLayout();
    
    //map panel declarations
    private int rows = 20;
    private int cols = 20;
    private JPanel mapPanel = new JPanel(new GridLayout(rows,cols));
    private MapSquare[][] map = new MapSquare[rows][cols]; 
    //end map panel declarations
    
    //control panel declarations
    private JPanel ctrlPanel = new JPanel(new FlowLayout());
    JTextArea messageArea = new JTextArea();
    JScrollPane messageScrollPane = new JScrollPane( messageArea );
    //SmartScroller scroller = new SmartScroller(scrollPane);
    //private JTextArea messageArea = new JTextArea();
    
    ////Direct Button subpanel
    private JPanel dirPanel = new JPanel(new GridLayout(3,3));
    private JButton nw, n, ne, w, e, sw, s, se;
    private JLabel remainingMoves = new JLabel("0");
    //end control panel declarations
    
    //info panel declarations
    private JPanel infoPanel = new JPanel(new GridBagLayout());
    private String[] stats = {"Race: ","\nName: ","\nArmor Class: ","\nWeapon: ",
            "\nHealth: "};
    private JLabel opponentLab = new JLabel("Opponent");
    private JTextArea opponentInfoArea = new JTextArea(reportStats());
    private JLabel characterLab = new JLabel("Current Character");
    private JTextArea characterInfoArea = new JTextArea(reportStats());
    private JLabel weaponLab = new JLabel("Selected Weapon");
    private String[] weapons = {"none", "none"};
    private JComboBox weaponComBox = new JComboBox(weapons);
    private JLabel partyLab = new JLabel("Character Party");
    private JTextArea partyInfoArea = new JTextArea("None");
    private JButton percieveBtn = new JButton("Perceive");
    private JButton attackBtn = new JButton("Attack!");
    private JButton endTurnBtn = new JButton("End Turn");
    //end info panel declarations
    
    public DnDGUI(DnDBulletin bulletin){
        this.bulletin = bulletin;
    }
    
    
    public void placeParty(ArrayList<DnDCharacter> party, MapCoord entrance){
        
        for(int i = 0; i < party.size(); i++){
            party.get(i).coord = entrance;
        }
        current = bulletin.getCurrent();
        characterInfoArea.setText(reportStats());
        map[current.coord.row][current.coord.col].setIcon(current.pic);
        map[current.coord.row][current.coord.col].occupant = current;
        
    }
    
    public void setCurrent(DnDCharacter curr){
        current = curr;
        characterInfoArea.setText(reportStats());
    }
    
    private void initComponents(){
        initSquares();
        initMapPanel();
        initControlPanel();
        initInfoPanel();
    }
    
    private void addListeners(){
        nw.addActionListener(e -> moveCurrentCharacter(current.coord.nw()));
        n.addActionListener(e -> moveCurrentCharacter(current.coord.n()));
        ne.addActionListener(e -> moveCurrentCharacter(current.coord.ne()));
        w.addActionListener(e -> moveCurrentCharacter(current.coord.w()));
        e.addActionListener(e -> moveCurrentCharacter(current.coord.e()));
        sw.addActionListener(e -> moveCurrentCharacter(current.coord.sw()));
        s.addActionListener(e -> moveCurrentCharacter(current.coord.s()));
        se.addActionListener(e -> moveCurrentCharacter(current.coord.se()));
        
        percieveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int percRoll = Roll.d20() + (int)((current.getWisdom()-10)/2);//this is how it's actually calculated
                int trapCount = 0;
                int disarmedTrapCount = 0;
                for (int i = current.coord.row - 2; i < current.coord.row + 5; i++){
                    for(int q = current.coord.col - 2; q < current.coord.col + 5; q++){
                        try{
                            MapSquare observed = map[i][q];
                            if(observed instanceof FloorTrapSquare && (percRoll > ((FloorTrapSquare)observed).camoflauge)){
                                trapCount += 1;
                                ((FloorTrapSquare)observed).setIcon(((FloorTrapSquare)observed).trippedTrap);
                                int chance = (int)(Math.random()*100) +1;
                                if (chance > 20){
                                    ((FloorTrapSquare)observed).armed = false;
                                    ((FloorTrapSquare)observed).message = "\nThis trap doesn't work anymore.";
                                    disarmedTrapCount += 1;
                                }
                            }
                        }
                        catch(ArrayIndexOutOfBoundsException ex){}
                    }
                }
                if(trapCount == 0){
                    messageArea.append("\nIt doesn't seem like there's any traps in the area.");
                }else{
                    messageArea.append("\nYou perceived " + trapCount + " traps in the area, and " + disarmedTrapCount + " disarmed themselves out of shock.");
                    }
                percieveBtn.setEnabled(false);
            }
        });
        
        attackBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                attackBtn.setEnabled(false);
            }
        });
        
        endTurnBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                current = bulletin.getCurrent();
                characterInfoArea.setText(reportStats());
                map[current.coord.row][current.coord.col].setIcon(current.pic);
                map[current.coord.row][current.coord.col].occupant = current;
                percieveBtn.setEnabled(true); //<--so the next player can perceive too
            }
        });
        
        ActionListener targetListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MapSquare selected = (MapSquare)e.getSource();
                if(selected.occupant instanceof Monster){
                    String opString = reportStats((Monster)selected.occupant);
                    opponentInfoArea.setText(opString);
                    targetedMonster = (Monster)selected.occupant;
                } 
            }
        };
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(map[i][j].passable){
                    map[i][j].addActionListener(targetListener);
                }
            }
        }
    }
    
    private void addComponentsToFrame(Container pane) {
        initComponents();
        addListeners();
        pane.setLayout(parentLayout);
        pane.add(mapPanel, BorderLayout.CENTER);
        pane.add(ctrlPanel, BorderLayout.SOUTH);
        pane.add(infoPanel, BorderLayout.EAST);
    }

    public void start(ArrayList<DnDCharacter> party, DnDMapMaker mapMaker) {
        this.mapMaker = mapMaker;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //add component to the frame
        this.addComponentsToFrame(this.getContentPane());
        this.pack();
        //display GUI
        this.setVisible(true);
        this.placeParty(party,entrance);
        
    }
      
    private void initMapPanel() {
        
        mapMaker.populateMap(map);
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                mapPanel.add(map[i][j]);
            }
        }
        entrance = mapMaker.setEntrance();
        exits = mapMaker.setExits();
    }

    private void initControlPanel() {
        //init direction sub panel
        ////init direction buttons
        Dimension dirBtnDim = new Dimension(70,70);
        
        try {
            nw = new JButton(new ImageIcon(ImageIO.read(new File("img//nw.png"))));
            nw.setPreferredSize(dirBtnDim);
            nw.setBorder(b);
            n = new JButton(new ImageIcon(ImageIO.read(new File("img//n.png"))));
            n.setPreferredSize(dirBtnDim);
            n.setBorder(b);
            ne = new JButton(new ImageIcon(ImageIO.read(new File("img//ne.png"))));
            ne.setPreferredSize(dirBtnDim);
            ne.setBorder(b);
            w = new JButton(new ImageIcon(ImageIO.read(new File("img//w.png"))));
            w.setPreferredSize(dirBtnDim);
            w.setBorder(b);
            e = new JButton(new ImageIcon(ImageIO.read(new File("img//e.png"))));
            e.setPreferredSize(dirBtnDim);
            e.setBorder(b);
            sw = new JButton(new ImageIcon(ImageIO.read(new File("img//sw.png"))));
            sw.setPreferredSize(dirBtnDim);
            sw.setBorder(b);
            s = new JButton(new ImageIcon(ImageIO.read(new File("img//s.png"))));
            s.setPreferredSize(dirBtnDim);
            s.setBorder(b);
            se = new JButton(new ImageIcon(ImageIO.read(new File("img//se.png"))));
            se.setPreferredSize(dirBtnDim);
            se.setBorder(b);
        } catch (IOException ex) {
            Logger.getLogger(DnDGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ////end init direction buttons
        dirPanel.add(nw);
        dirPanel.add(n);
        dirPanel.add(ne);
        dirPanel.add(w);
        remainingMoves.setHorizontalAlignment(SwingConstants.CENTER);
        remainingMoves.setBorder(b);
        dirPanel.add(remainingMoves);
        dirPanel.add(e);
        dirPanel.add(sw);
        dirPanel.add(s);
        dirPanel.add(se);
        //end init direction sub panel
        messageScrollPane.setPreferredSize(new Dimension(700,200));
        messageArea.setLineWrap(true);
        messageArea.setWrapStyleWord(true);
        ctrlPanel.add(messageScrollPane);
        ctrlPanel.add(dirPanel);
    }

    private void initInfoPanel() {
        GridBagConstraints gbc = new GridBagConstraints();
        opponentLab.setPreferredSize(new Dimension(220,30));
        opponentInfoArea.setPreferredSize(new Dimension(220,90));
        characterLab.setPreferredSize(new Dimension(220,30));
        characterInfoArea.setPreferredSize(new Dimension(220,90));
        weaponLab.setPreferredSize(new Dimension(220,30));
        weaponComBox.setPreferredSize(new Dimension(220,25));
        partyLab.setPreferredSize(new Dimension(220,30));
        partyInfoArea.setPreferredSize(new Dimension(220,135));
        percieveBtn.setPreferredSize(new Dimension(220,25));
        attackBtn.setPreferredSize(new Dimension(220,25));
        endTurnBtn.setPreferredSize(new Dimension(220,25));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridheight = 30;
        gbc.gridwidth = 220;
        infoPanel.add(opponentLab,gbc);
        gbc.gridx = 0;
        gbc.gridy = 35;
        gbc.gridheight = 90;
        gbc.gridwidth = 220;
        infoPanel.add(opponentInfoArea,gbc);
        gbc.gridx = 0;
        gbc.gridy = 125;
        gbc.gridheight = 30;
        gbc.gridwidth = 220;
        infoPanel.add(characterLab,gbc);
        gbc.gridx = 0;
        gbc.gridy = 155;
        gbc.gridheight = 90;
        gbc.gridwidth = 220;
        infoPanel.add(characterInfoArea,gbc);
        gbc.gridx = 0;
        gbc.gridy = 250;
        gbc.gridheight = 30;
        gbc.gridwidth = 220;
        infoPanel.add(weaponLab,gbc);
        gbc.gridx = 0;
        gbc.gridy = 280;
        gbc.gridheight = 30;
        gbc.gridwidth = 220;
        infoPanel.add(weaponComBox,gbc);
        gbc.gridx = 0;
        gbc.gridy = 315;
        gbc.gridheight = 30;
        gbc.gridwidth = 220;
        infoPanel.add(partyLab,gbc);
        gbc.gridx = 0;
        gbc.gridy = 350;
        gbc.gridheight = 135;
        gbc.gridwidth = 220;
        infoPanel.add(partyInfoArea,gbc);
        gbc.gridx = 0;
        gbc.gridy = 490;
        gbc.gridheight = 30;
        gbc.gridwidth = 220;
        infoPanel.add(percieveBtn,gbc);
        gbc.gridx = 0;
        gbc.gridy = 525;
        gbc.gridheight = 30;
        gbc.gridwidth = 220;
        infoPanel.add(attackBtn,gbc);
        gbc.gridx = 0;
        gbc.gridy = 560;
        gbc.gridheight = 30;
        gbc.gridwidth = 220;
        infoPanel.add(endTurnBtn,gbc);
    }

    private void initSquares() {
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                try {
                    map[i][j] = new StoneFloorSquare(i,j);
                } catch (IOException ex) {
                    Logger.getLogger(DnDGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private MapSquare getSquare(MapCoord coord){
        return map[coord.row][coord.col];
    }
    
    private boolean moveCurrentCharacter(MapCoord coord){
        MapSquare dest; 
        try{
            dest = map[coord.row][coord.col];
            if(dest instanceof RoseCrumblingWall){
                if(crumblingWallAction(dest)){
                    ((RoseCrumblingWall) dest).passable = true;
            }
        }
            if(!dest.passable) return false;
        }catch(ArrayIndexOutOfBoundsException ex){
            return false;
        }
        
        
        MapSquare curr = getSquare(current.coord);
        dest.occupant = curr.occupant;
        current.coord = dest.coord;
        dest.setIcon(dest.occupant.pic);
        curr.occupant = null;
        curr.resetIcon();
        
        if(dest instanceof FloorTrapSquare && ((FloorTrapSquare)dest).armed){
            floorTrapAction((FloorTrapSquare)dest);
        }else if(dest instanceof PortalSquare){
            portalSquareAction(dest);
        }else if(dest instanceof Kotagiri002Health){
            kotagiri002HealthAction((Kotagiri002Health)dest);
        }else if(dest instanceof JuliasMysteriousRockSquare){
            try {
                System.out.println("I'm here!");
                MapSquare newSq = ((JuliasMysteriousRockSquare)dest).teleport((JuliasMysteriousRockSquare) dest);
                map[dest.row][dest.col] = new DirtFloorSquare(dest.row,dest.col);
                map[dest.row][dest.col].occupant = current;
                
                ImageIcon newPic = new ImageIcon(ImageIO.read(new File("img//MysteriousRock.png")));
                
                map[newSq.row][newSq.col].setImg(newPic);
                map[newSq.row][newSq.col].setIcon(newPic);
                
                map[newSq.row][newSq.col] = newSq;
                
            } catch (IOException ex) {
                Logger.getLogger(DnDGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(!dest.message.equals("none")){
            messageArea.append(dest.message);
        }
        return true;
    }
    
    private boolean crumblingWallAction(MapSquare wallSquare){
        if(current.getStrength() >= 14){ // if you have high enough strength you can break the wall
            messageArea.append("\nYou destroy the wall with your raw power!");
            try {
                wallSquare.setImg(new ImageIcon(ImageIO.read(new File("img//floor_sm.png"))));
            } catch (IOException ex) {
                Logger.getLogger(DnDGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } else {
            messageArea.append("\nYou push at the wall but it does not give. Guess you're not going that way.");
            return false;
        }
    } 
    private void floorTrapAction(FloorTrapSquare trap){
        messageArea.append(trap.message);
        trap.setImg(trap.trippedTrap);
        current.takeDamage(trap.damage);
        trap.armed = false;
        trap.message = "\nThis trap has already been tripped.";
        characterInfoArea.setText(reportStats());
        //DnDCharatcer need a serStregth method for this to work
        //current.setStrength(current.getStrength()+2);
        
    }
     
    private void portalSquareAction(MapSquare portal) {
        MapCoord destCoord = ((PortalSquare)portal).destCoord;
        current.coord = destCoord;
        map[destCoord.row][destCoord.col].occupant = current;
        map[destCoord.row][destCoord.col].setIcon(current.pic);
        portal.occupant = null;
        portal.resetIcon();
    }
    
    private void kotagiri002HealthAction(Kotagiri002Health sq){
        current.takeDamage(-sq.heal);
        characterInfoArea.setText(reportStats());
    }
    
    public String reportStats(){
        String statsStr = "";
        statsStr += (current != null) ? this.stats[0] +current.actorRace : this.stats[0] + "none";
        statsStr += (current != null) ? this.stats[1]+current.name :this.stats[1] + "none";
        statsStr += (current != null) ? this.stats[2]+current.getArmorClass() :this.stats[2] + "none";
        statsStr += (current != null) ? this.stats[3]+current.getWeapon().name :this.stats[3] + "none";
        statsStr += (current != null) ? this.stats[4]+current.getHitPoints() :this.stats[4] + "none";
        return statsStr;
    }
    
    public String reportStats(Monster target){
        String statsStr = "";
        statsStr += (target != null) ? this.stats[0] +target.actorRace : this.stats[0] + "none";
        statsStr += (target != null) ? this.stats[1]+target.name :this.stats[1] + "none";
        statsStr += (target != null) ? this.stats[2]+target.getArmorClass() :this.stats[2] + "none";
        statsStr += (target != null) ? this.stats[3]+target.getWeapon().name :this.stats[3] + "none";
        statsStr += (target != null) ? this.stats[4]+target.getHitPoints() :this.stats[4] + "none";
        return statsStr;
    }
    
}
