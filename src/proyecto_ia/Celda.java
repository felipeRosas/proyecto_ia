/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ia;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.ImageIcon;

/**
 *
 * @author usario
 */
public class Celda extends JComponent implements Constantes{
    public int x;
    public int y;
    
    //clase7/05
   public Image imagenJugador;
   public Image imagenEnemigo;
   public Image imagenVacio;
   public Image imagenActual;
    public String tipo="V";//vacio , reprecenta una celda
    
    public Celda(int x,int y){
        this.x = x;
        this.y = y;
        imagenJugador =  new ImageIcon(getClass().getResource(IMAGEN_JUGADOR)).getImage();
        imagenEnemigo = new ImageIcon(getClass().getResource(IMAGEN_ENEMIGO)).getImage();
        imagenVacio =  new ImageIcon(getClass().getResource(IMAGEN_VACIO)).getImage();
       this.imagenActual=this.imagenVacio;
        
    }
    
    public void cambiarTipo(String tipo){
        this.tipo=tipo;
        switch(tipo){
            case TIPO_JUGADOR : this.imagenActual = this.imagenJugador; break;
            case TIPO_ENEMIGO : this.imagenActual = this.imagenEnemigo; break;
            case TIPO_VACIO : this.imagenActual = this.imagenVacio; break;
        }
    }
    
    public String objetenerTipo(){
        
        return this.tipo;
    }
    /*
    @Override
    public void paintComponent(Graphics g){
        
        switch(this.tipo){
            
            case TIPO_VACIO: g.setColor(COLOR_VACIO); break;
            case TIPO_JUGADOR: g.setColor(COLOR_JUGADOR); break;
            case TIPO_ENEMIGO: g.setColor(COLOR_ENEMIGO); break;
            
        }
        //g.drawImage(img, x, y, this);
        g.fillRect(x, y, TAMAÑO_CELDA, TAMAÑO_CELDA);
         
    }
    */
    @Override
    public void update(Graphics g){
    switch(this.tipo){
           /* 
            case TIPO_VACIO: g.setColor(COLOR_VACIO); break;
            case TIPO_JUGADOR: g.setColor(COLOR_JUGADOR); break;
            case TIPO_ENEMIGO: g.setColor(COLOR_ENEMIGO); break;
            */
           
        }
        //g.drawImage(img, x, y, this);
        //g.fillRect(x, y, TAMAÑO_CELDA, TAMAÑO_CELDA);
        g.drawImage(imagenVacio, this.x, this.y, TAMAÑO_CELDA, TAMAÑO_CELDA, this);
        g.drawImage(imagenActual, this.x, this.y, TAMAÑO_CELDA, TAMAÑO_CELDA, this);
    }
}
