package proyecto_ia;

import java.awt.Container;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/*
    para que sea una ventana hay que extender de JFrame
 */
public class VentanaPrincipal extends JFrame implements Constantes {

    public VentanaPrincipal() {
        super(TITULO_APP);
        setSize(ANCHO_VENTANA, ALTO_VENTANA);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();

        Lienzo l = new Lienzo();
        cp.add(l);
    }
}
