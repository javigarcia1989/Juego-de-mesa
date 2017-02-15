/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelesdado;

import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author javi
 */
public class Modelo{
    private int lanzamientos;
    private int lanzamiento=0;
    private static int suma=0;
    private Tablero tablero;
    private Vista vista;
    private Color c;
    private int indice;
    private Ficha ficha;
    
    public Modelo(Tablero tablero,Vista vista,Ficha ficha){
        this.tablero=tablero;
        this.vista=vista;
        this.ficha=ficha;
        lanzamientos=0;
    }
    
    public int getNumberRandom(int Max){
        return (int) (Math.random()*Max+1);
    }
    public void incrementarLanzamientos(int numero){
        lanzamientos+=numero;
    }
    public void disminuirLanzamientos(int numero){
        lanzamientos-=numero;
    }
    


    public void jugar(){
        lanzamiento=lanzar();
            if(suma<0)
                suma=(suma*-1)*2;
            if(suma+lanzamiento>12)
                suma=suma+lanzamiento-12;
            else 
                suma+=lanzamiento;
    }

    public void guardar(){
        
    }
    
    public void cargar(){
       
    }
    public void comenzar(){
            this.incrementarLanzamientos(1);
            
            /*tablero.getBotones().get(indice).remove(ficha);
            tablero.setEtiqueta(this.getLanzamiento()+"");
            tablero.setLanzamientos(this.getLanzamientos()+"");
            for(int i=0;i<tablero.getNCASILLAS();i++){
                if(this.getSuma()==Integer.parseInt(tablero.getBotones().get(i).getText())){
                    c=tablero.getBotones().get(i).getBackground();
                    indice=i;
                    tablero.getBotones().get(i).add(ficha); 
                    tablero.getBotones().get(i).setBackground(c);
                    tablero.repaint();
                    
                    switch(Integer.parseInt(tablero.getBotones().get(i).getText())){
                        case 2:
                            tablero.getBotones().get(1).remove(ficha);
                            tablero.getBotones().get(8).add(ficha);
                            this.disminuirSuma(6);
                            break;
                        case 4:
                        this.disminuirLanzamientos(1);
                        break;
                        case 6:
                            this.incrementarLanzamientos(2);
                        break;
                        case 8:
                            tablero.getBotones().get(8).remove(ficha);
                            tablero.getBotones().get(1).add(ficha);
                            this.incrementarSuma(6);
                            break;
                        case 10:
                            this.disminuirLanzamientos(1);
                        break;
                        case 12:
                            JOptionPane.showMessageDialog(null,"Has terminado!!!!"); 
                            System.exit(0);
                        break;
                        
                    }//fin switch
                   
                }      
            }//fin for*/
    }

    public int getLanzamientos(){
        return lanzamientos;
    }
    public int lanzar(){
        return getNumberRandom(5);
    }

    public int getLanzamiento(){
        return lanzamiento;
    }

    public int getSuma(){
        return suma;
    }
    public void incrementarSuma(int numero){
        suma+=numero;
    }
    public void disminuirSuma(int numero){
        suma-=numero;
    }
    
    
    
}
