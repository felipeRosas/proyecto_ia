
package proyecto_ia;

import java.awt.Color;
import java.awt.Image;

/**
 *
 * @author usario
 */
public interface Constantes {

    public final String TITULO_APP = "Juego IA";
   
    public final int TAMAÑO_CELDA = 40;
    
    public final int NUMERO_CELDAS_ANCHO= 20;
    public final int NUMERO_CELDAS_ALTO=15;
    
    public final int ANCHO_VENTANA = (NUMERO_CELDAS_ANCHO*TAMAÑO_CELDA)+20;
    public final int ALTO_VENTANA = (NUMERO_CELDAS_ALTO*TAMAÑO_CELDA)+40;
    
    //para describir los tipos de celdas
    public final String TIPO_VACIO ="V";
    public final String TIPO_JUGADOR ="J";
    public final String TIPO_ENEMIGO="E";
    
    public final Color COLOR_VACIO= Color.darkGray;
    public final Color COLOR_JUGADOR= Color.blue;
    public final Color COLOR_ENEMIGO= Color.RED;
    
    //referencia a rutas de imagenes
    public final String IMAGEN_JUGADOR ="../res/jugador.png" ;//string con ruta de la imagen
    public final String IMAGEN_VACIO ="../res/m2.jpg" ;
    public final String IMAGEN_ENEMIGO ="../res/bomba.jpg" ;
    public final String IMAGEN_PARED ="../res/pared.png" ;
    
}
