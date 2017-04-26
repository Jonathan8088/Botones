/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import static java.util.Spliterators.iterator;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class PanelBotones extends JPanel implements ActionListener{
   
    private static final String ACEPTAR = "ACEPTAR";
    
    private JButton aceptar;

    private int x=10,y=10,key;

    
    
    
    
    public PanelBotones(int fil, int col) {
        Map<Integer, JButton> map = new HashMap<Integer, JButton>();
        key=0;
        setBorder(BorderFactory.createTitledBorder(""));
        
        setBackground(Color.WHITE);
        Dimension d = getSize(); 
        setLayout(null);
        
        for (int i = 0; i < fil; i++) {
            x=10;
            for (int j = 0; j < col; j++) {
                aceptar = new JButton( "Boton "+i+" "+j );
                aceptar.setActionCommand( ACEPTAR );
                aceptar.addActionListener(this);
                aceptar.setBounds(x, y, 100, 20);
                x+=120;
                map.put(key, aceptar);
                key++;
                add(aceptar); 
            }//forj
            y+=80;
        }//fori
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        aceptar.setBackground(Color.red);
        
        
    }
}
