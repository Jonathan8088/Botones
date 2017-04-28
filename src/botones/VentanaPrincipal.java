/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates    

 * and open the template in the editor.
 */
package botones;

import javax.swing.JFrame;

/**
 *
 * @author Jonathan
 */
public class VentanaPrincipal extends JFrame{
    
    private FilasColumnas filCol;
    
    private PanelBotones botones;

    public VentanaPrincipal(int fil,int col) {
        setTitle("BOTONES");
        setSize(800, 600);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);
        setLayout(null);
        
        botones = new PanelBotones(fil,col);
        botones.setBounds(10, 10, 780, 550);
        add(botones);   
        
        setVisible(true);
        
   
    }
   
}
