/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelesdado;

import java.awt.BorderLayout;
import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.EAST;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;
import static java.awt.BorderLayout.WEST;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 *
 * @author javi
 */
public class Tablero extends JPanel{
    private final int NCASILLAS=12;
    private ArrayList<JButton> botones;
    private ArrayList<JPanel> paneles;
    private Color[] colores;
    private JLabel etiquetaCentral,lanzamientos;
    
    
    
    public Tablero(){
        this.setLayout(new BorderLayout());
        iniciarElementos();
        insertarElementos();
        agregarPaneles();
        reconfigurarBotones();
        agregarBotones();
        agregarEtiquetas();
    }
    
    public void agregarEtiquetas(){
        Font fuente=new Font("Arial", Font.ITALIC, 70);
        Font fuente2=new Font("Arial", Font.ITALIC, 20);
        Font fuente3=new Font("Arial", Font.ITALIC, 20);
        JLabel lanza=new JLabel("Lanzamientos: ");
        etiquetaCentral=new JLabel("0");
        lanzamientos=new JLabel("0");
        JPanel panelCentral=new JPanel();
        panelCentral.setLayout(null);
        panelCentral.add(lanza);
  
        panelCentral.add(etiquetaCentral);
        panelCentral.add(lanzamientos);
        
        etiquetaCentral.setFont(fuente);
        etiquetaCentral.setBounds(180,80,50,80);
        lanzamientos.setFont(fuente2);
        lanzamientos.setBounds(260,30,60,20);
        lanza.setFont(fuente3);
        lanza.setBounds(120,30,150,20);
   
        this.add(panelCentral,CENTER);
        
        
    }
    
    public void iniciarElementos(){
        
       
        botones=new ArrayList();
        paneles=new ArrayList(); 
        colores=new Color[]{Color.orange,Color.blue,Color.black,Color.pink,Color.green};
    }
    
    public void insertarElementos(){
        for(int i=0;i<NCASILLAS;i++){
            botones.add(new JButton((i+1)+""));
            if(i<4)
                paneles.add(new JPanel());
        }
    }
    
    public void agregarPaneles(){
        JPanel auxPanel;
        
        for(int i=0;i<paneles.size();i++){
            auxPanel=paneles.get(i);
            switch(i){
                case 0:
                    this.add(auxPanel,NORTH);
                    auxPanel.setLayout(new GridLayout(1,4));
                    break;
                case 1:
                    this.add(auxPanel,EAST);
                    auxPanel.setLayout(new GridLayout(2,1));
                    break;
                case 2:
                    this.add(auxPanel,SOUTH);
                    auxPanel.setLayout(new GridLayout(1,4));
                    break;
                case 3:
                    this.add(auxPanel,WEST);
                    auxPanel.setLayout(new GridLayout(2,1));
                    break;
            }
        }
     
    }
    
    public void agregarBotones(){
        JButton auxBoton;
        for(int i=0;i<NCASILLAS;i++){
            auxBoton=botones.get(i);
            botones.get(1).setBackground(Color.blue);
           // botones.get(0).add(ficha);
            botones.get(8).setBackground(Color.blue);
            botones.get(10).setBackground(Color.black);
            botones.get(6).setBackground(Color.green);
            botones.get(3).setBackground(Color.green);
            botones.get(5).setBackground(Color.pink);
            if(Integer.parseInt(auxBoton.getText())%2!=0)
                auxBoton.setBackground(Color.orange);

            if(i<4){
                paneles.get(0).add(auxBoton);
                auxBoton.setPreferredSize(new Dimension(75,75));
            }
            if(i>=4 && i<6){
                paneles.get(1).add(auxBoton);
                auxBoton.setPreferredSize(new Dimension(100,75));
            }
           
            if(i>=6 && i<10)  {
                paneles.get(2).add(auxBoton);
                auxBoton.setPreferredSize(new Dimension(75,75));
               
            }
                
            if(i>=10 && i<12){
                paneles.get(3).add(auxBoton);
                auxBoton.setPreferredSize(new Dimension(100,75));
            }
                
        }
        
    }
    
    public void reconfigurarBotones(){
            botones.get(6).setText("10");
            botones.get(7).setText("9");
            botones.get(8).setText("8");
            botones.get(9).setText("7");
            botones.get(10).setText("12");
            botones.get(11).setText("11");
    }
    
    
    
    
    
    //GETTERS y SETTERS.....................................................................................................

    

    public int getNCASILLAS(){
        return NCASILLAS;
    }

    public ArrayList<JButton> getBotones(){
        return botones;
    }

    public Color[] getColores(){
        return colores;
    }

    public JLabel getLanzamientos(){
        return lanzamientos;
    }

    
    
    
    
    
    
    public void setEtiqueta(String texto){
        etiquetaCentral.setText(texto);
    }
    
    public void setLanzamientos(String texto){
        lanzamientos.setText(texto);
    }
    
    
    
    
    
    
}
