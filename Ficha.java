/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panelesdado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Timer;
/**
 *
 * @author javi
 */
public class Ficha extends JButton{
    private Vista vista;
    private ImageIcon imgFicha;
    private  Timer timer;
    private int x,y;
    private final int ancho=40,alto=40,velocidadX=1,velocidadY=1;    
    
    public Ficha(Vista vista){
        this.vista=vista;
        imgFicha=new ImageIcon("src/assets/ficha.png");
        x=200;
        y=100;
        setOpaque(false);    //para quitarle el marco al boton estas 4 propiedades
        setContentAreaFilled(false);
        setBorderPainted(false);
        setBorder(null);
        setIcon(imgFicha);

    }
    
    public void colocarFicha(int x, int y){
        this.setBounds(x,y,ancho,alto);
    }
    
    /*public void moverFicha(){
        x += velocidad_X;  //incrementamos los pixeles
        y += velocidad_Y;
        //controla que el pez no salga de los limites del contenedor
        if (x < this.limite_izquierda) {
            x = 0;
            velocidad_X = -velocidad_X;
        } else if (x > limite_derecha) {
            x = limite_derecha;
            velocidad_X = -velocidad_X;
        }
        if (y < this.limite_superior) {
            y = 0;
            velocidad_Y = -velocidad_Y;

        } else if (y > limite_inferior) {
            y =  limite_inferior;
            velocidad_Y = -velocidad_Y;
        }
  
        this.colocarFicha(x,y);  //se va colocando en el resultado del metodo
    }*/
    
    public void insertarTimer(){  //creo un objeto timer para que se mueva el pez por la ventana
        timer= new Timer (50, new ActionListener () 
        {     
        @Override
        public void actionPerformed(ActionEvent e) 
            { 
                //moverFicha();  //el metodo que quiero que haga el timer
            }  
        }); 
        timer.setRepeats(true);  //para que repita constantemente el metodo
        
        timer.start();
        
    }
    
    
    
    
    //GETTERS...............................................................................................

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getAncho(){
        return ancho;
    }

    public int getAlto(){
        return alto;
    }
    
}
