 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonmaps;

import dnd.DnDBulletin;
import dnd.characters.DnDCharacter;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author SP20CIS182
 */
public class MapSelectorGUI extends JFrame{
    
    private MapSelectorGUI(String title){
        super(title);
    }
    
    private DnDBulletin bulletin;
    private ArrayList<DnDCharacter> party;
    private BorderLayout parentLayout = new BorderLayout();
    private JLabel mapImage = new JLabel();
    private JPanel descPanel = new JPanel(new FlowLayout());
    private JTextArea mapDescArea = new JTextArea();
    private JPanel btnPanel = new JPanel(new GridLayout(2,1));
    private JComboBox mapTitleComBox = new JComboBox();
    private JButton selectBtn = new JButton("Select");
    
    private DnDMapMaker mapMaker = new DnDMapMaker();
    
    private ImageIcon selectMapImg;
    
    private void initComponents(){
        try {
            //add more maps here///////////////////////////
            mapMaker.addMapMakerIF(new SethsMap());
            mapMaker.addMapMakerIF(new JaredsMap());
            mapMaker.addMapMakerIF(new MarksMap());
            mapMaker.addMapMakerIF(new Kotagiri002Map()); //added the new map
            mapMaker.addMapMakerIF(new TestMap());
            mapMaker.addMapMakerIF(new JohnsMap());//finished
            mapMaker.addMapMakerIF(new Gandham003Map());
            mapMaker.addMapMakerIF(new SeansMap());
            mapMaker.addMapMakerIF(new AbyssOfRudy());
            mapMaker.addMapMakerIF(new Borela001Map());
            mapMaker.addMapMakerIF(new Dossanto001Map());
            mapMaker.addMapMakerIF(new RosesReach());
            mapMaker.addMapMakerIF(new AshleysMap());
            mapMaker.addMapMakerIF(new DerricksMap());
            mapMaker.addMapMakerIF(new HannasSpiralMaze());
            mapMaker.addMapMakerIF(new DaythansMap());
            mapMaker.addMapMakerIF(new JuliasMap());
            mapMaker.addMapMakerIF(new Elebe001Map());
            mapMaker.addMapMakerIF(new Asamoah001Map());
            mapMaker.addMapMakerIF(new JessesMap());
            mapMaker.addMapMakerIF(new SalehsMap());
            //mapMaker.addMapMakerIF(new YoussefsMap());
            mapMaker.addMapMakerIF(new YoussefsMap());
            //end add more maps////////////////////////////
        } catch (IOException ex) {
            Logger.getLogger(MapSelectorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            selectMapImg = new ImageIcon(ImageIO.read(new File("img//selectMap.png")));
        } catch (IOException ex) {
            Logger.getLogger(MapSelectorGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        mapImage.setIcon(selectMapImg);
        String mapName = mapMaker.mapNames.get(0);
        mapMaker.chooseSelectedMap(mapName);
        
        mapDescArea.setPreferredSize(new Dimension(600,200));
        mapDescArea.setLineWrap(true);
        mapDescArea.setWrapStyleWord(true);
        mapDescArea.setText("Select a map from the drop down list to the right -->");
        descPanel.add(mapDescArea);
        mapTitleComBox.setPreferredSize(new Dimension(150,30));
        mapTitleComBox.addItem("Select Map");
        for(String title : DnDMapMaker.mapNames){
            mapTitleComBox.addItem(title);
        }
        selectBtn.setEnabled(false);
        btnPanel.add(mapTitleComBox);
        btnPanel.add(selectBtn);
        descPanel.add(btnPanel);
    }
    
    private void addListeners(){
        mapTitleComBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mapTitleComBox.getSelectedItem().equals("Select Map")){
                    mapImage.setIcon(selectMapImg);
                    selectBtn.setEnabled(false);
                }else{
                   int index = mapTitleComBox.getSelectedIndex()-1;
                    System.out.println("index: " + index);
                    DnDMapMaker.selectedMaker = DnDMapMaker.maps.get(index);
                    mapImage.setIcon(DnDMapMaker.maps.get(index).getMapImg());
                    mapDescArea.setText(DnDMapMaker.maps.get(index).getMapDesc());
                    selectBtn.setEnabled(true); 
                }
                
            }
        });
        selectBtn.addActionListener(e -> bulletin.startGUI(party, mapMaker));
        selectBtn.addActionListener(e -> this.dispose());
        
    }
    
    private void addComponentsToFrame(Container pane){
        
        //instantiate components
        initComponents();
        
        //add action listeners
        addListeners();
        
        pane.setLayout(parentLayout);
        pane.add(mapImage,BorderLayout.CENTER);
        pane.add(descPanel,BorderLayout.SOUTH);
        
    }
    
    public static void createAndShowGUI(DnDBulletin bulletin, ArrayList<DnDCharacter> party){
        //instatniate an object of this class
        MapSelectorGUI frame = new MapSelectorGUI("Map Selector");
        frame.setAlwaysOnTop(true);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        //add component to the frame
        frame.addComponentsToFrame(frame.getContentPane());
        frame.pack();
        //display GUI
        frame.setVisible(true);
        frame.party = party;
        frame.bulletin = bulletin;
    }
}
