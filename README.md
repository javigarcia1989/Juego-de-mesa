# Juego-de-mesa
package panelesdado;

import com.sun.glass.events.KeyEvent;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author javi
 */
public class Vista extends JFrame{
    private Controlador controlador;
    private Modelo modelo;
    private MenuBar barraMenu;
    private ArrayList<MenuItem> opcMenu;
    private Ficha ficha;
    private Tablero tablero;
    private final int ANCHOV=600,ALTOV=400;


    public Vista(){
        ficha=new Ficha(this);
        tablero=new Tablero();
        tablero.setBounds(0,0,ANCHOV,ALTOV-50);
        ficha.setBounds(200,100,40,40);
        this.add(ficha);
        crearFicha();
        modelo=new Modelo(tablero,this,ficha);
        controlador=new Controlador(tablero,modelo,this);
        barraMenu=new MenuBar();
        add(tablero);
        
        
        
        
        insertarMenu();
        darPropiedadesVentana();
        
        this.setVisible(true);
        
    }
    
    public void insertarMenu(){
        Menu menu;
        MenuItem auxMenu;
        MenuShortcut tecla=new MenuShortcut(KeyEvent.VK_S,false);
        MenuShortcut tecla3=new MenuShortcut(KeyEvent.VK_SPACE,false);
        MenuShortcut tecla2=new MenuShortcut(KeyEvent.VK_D,false);
        opcMenu=new ArrayList();
        menu=new Menu("Menu");
        opcMenu.add(new MenuItem("Lanzar",tecla3));
        opcMenu.add(new MenuItem("Guardar",tecla));
        opcMenu.add(new MenuItem("Cargar",tecla2));
        opcMenu.add(new MenuItem("Salir"));
        for(int i=0;i<opcMenu.size();i++){
            auxMenu=opcMenu.get(i);
            auxMenu.addActionListener(controlador);
            if(i==3)
                menu.addSeparator();
            menu.add(auxMenu);
        }
        
        barraMenu.add(menu);
        this.setMenuBar(barraMenu);
    }
    
    
    
    public void darPropiedadesVentana(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(ANCHOV,ALTOV);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);  
    }
    
    
    public Ficha getFicha(){
        return ficha;
    }
    public ArrayList<MenuItem> getOpcMenu(){
        return opcMenu;
    }
    
    public void crearFicha(){
        
        
 
    }
    
    
    public Tablero getVista(){
        return tablero;
    }
    
    
    
    
}
