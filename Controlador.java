/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelesdado;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author javi
 */
public class Controlador implements ActionListener{
    private Modelo modelo;
    private Tablero tablero;
    private Vista vista;
  
    public Controlador(Tablero tablero,Modelo modelo,Vista vista){
        this.tablero=tablero;
        this.modelo=modelo;
        this.vista=vista;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getActionCommand().equals("Salir"))
            System.exit(0);
        if(e.getActionCommand().equals("Lanzar")){
            modelo.jugar();
            modelo.comenzar();
        }
            
        if(e.getActionCommand().equals("Guardar"))
            modelo.guardar();
    }

    public Modelo getModelo(){
        return modelo;
    }

    
    
    
    
}
