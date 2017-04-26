/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botones;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jonathan
 */
public class FilasColumnas extends JDialog implements ActionListener{

    private static final String ACEPTAR = "ACEPTAR";
    /**
     * label que muestra la palabra Filas
     */
    private JLabel JLFilas;
    /**
     * label que muestra la palabra Columnas
     */
    private JLabel JLColumnas;
    
    /**
     * boton de aceptar
     */    
    private JButton aceptar;
    
    private JTextField filas;
    
    private JTextField columnas;
    
    JPanel panel;
    
    private int fil;
    
    private int col;
    
    VentanaPrincipal ventana;
    
    PanelBotones botones;

    public FilasColumnas() {
        
         setSize(300, 200);
       
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        add(panel);
      
        setTitle( "CREAR ARTISTA               " );
        setLocationRelativeTo(null);
        setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE);
        setLayout( null);
   
        
        JLFilas = new JLabel ("Filas");
        JLFilas.setBounds(20, 20, 50, 20);
        add(JLFilas);
        
        filas = new JTextField();
        filas.setBounds(120, 20, 100, 20);
        add(filas);
             
        
        JLColumnas = new JLabel ("Columnas");
        JLColumnas.setBounds(20, 50, 100, 20);
        add(JLColumnas);
        
        columnas = new JTextField();
        columnas.setBounds(120, 50, 100, 20);
        add(columnas);
   
        aceptar = new JButton( "Aceptar" );
        aceptar.setActionCommand( ACEPTAR );
        aceptar.addActionListener(this);
        aceptar.setBounds(120, 100, 100, 20);
        add( aceptar );
        
        
        setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        fil=Integer.parseInt(filas.getText());
        col=Integer.parseInt(columnas.getText());
        //ventana.botones(fil,col);
        botones = new PanelBotones(fil,col);
        botones.setBounds(10, 10, 780, 550);
        ventana.add(botones);
        
        setVisible(true);
        
    }
    
}
