package proyecto_ia;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;

//lugar que pinta las celdas,matriz de celdas
public class Escenario extends JComponent implements Constantes {
    

    public Celda[][] c;
    public int filaJugador = 2;//columna
    public int columnaJugador = 2;//fila

    public Escenario() {
        c = new Celda[NUMERO_CELDAS_ALTO][NUMERO_CELDAS_ANCHO];

        int x = 0;
        int y = 0;
        
        for (int i = 0; i < NUMERO_CELDAS_ALTO; i++) {
            for (int j = 0; j < NUMERO_CELDAS_ANCHO; j++) {
                c[i][j] = new Celda(x, y);

                x += TAMAÑO_CELDA;
            }
            y += TAMAÑO_CELDA;
            x = 0;
        }

        c[0][3].cambiarTipo(TIPO_JUGADOR);
       
        c[5][5].cambiarTipo(TIPO_ENEMIGO);
        c[10][8].cambiarTipo(TIPO_ENEMIGO);
    }

    /*
    @Override
    public void paintComponent(Graphics g){
        for(int i=0;i<NUMERO_CELDAS_ALTO;i++){
            for(int j=0;j<NUMERO_CELDAS_ANCHO;j++){
             // c[i][j].paintComponent(g);
              c[i][j].update(g);
            }
        
        }
    }
     */
    @Override
    public void update(Graphics g) {
        for (int i = 0; i < NUMERO_CELDAS_ALTO; i++) {
            for (int j = 0; j < NUMERO_CELDAS_ANCHO; j++) {
                // c[i][j].paintComponent(g);
                c[i][j].update(g);
            }

        }
    }

    @Override
    public void paintComponent(Graphics g) {
        update(g);
    }

    public void moverJugador(KeyEvent e) {
        switch (e.getKeyCode()) {

            case KeyEvent.VK_RIGHT:
                if (c[this.filaJugador][this.columnaJugador + 1].objetenerTipo() == TIPO_ENEMIGO) {
                    System.out.println("perdiste");
                } else {
                    this.moverJugadorDerecha();
                }
                break;
            case KeyEvent.VK_LEFT:
                if (c[this.filaJugador][this.columnaJugador - 1].objetenerTipo() == TIPO_ENEMIGO) {
                    System.out.println("perdiste");
                } else {
                    this.moverJugadorIzquierda();
                }
                break;
            case KeyEvent.VK_DOWN:
                if (c[this.filaJugador + 1][this.columnaJugador].objetenerTipo() == TIPO_ENEMIGO) {
                    System.out.println("perdiste");
                } else {
                    this.moverJugadorAbajo();
                }
                break;
            case KeyEvent.VK_UP:
                if (c[this.filaJugador - 1][this.columnaJugador].objetenerTipo() == TIPO_ENEMIGO) {
                    System.out.println("perdiste");
                } else {
                    this.moverJugadorArriba();
                }
                break;
        }
    }

    public void moverJugadorDerecha() {
        if (columnaJugador + 1 < NUMERO_CELDAS_ANCHO) {//para que no salga del limite
            String tipo = c[this.filaJugador][this.columnaJugador + 1].objetenerTipo();
            c[this.filaJugador][this.columnaJugador].cambiarTipo(tipo);
            c[this.filaJugador][this.columnaJugador + 1].cambiarTipo(TIPO_JUGADOR);
            this.columnaJugador++;
            System.out.println("derecha");
        }

    }

    public void moverJugadorIzquierda() {
        if (columnaJugador > 0) {
            String tipo = c[this.filaJugador][this.columnaJugador - 1].objetenerTipo();
            c[this.filaJugador][columnaJugador].cambiarTipo(tipo);
            c[this.filaJugador][columnaJugador - 1].cambiarTipo(TIPO_JUGADOR);
            this.columnaJugador--;
            System.out.println("izquierda");
        }

    }

    public void moverJugadorAbajo() {
        if (filaJugador + 1 < NUMERO_CELDAS_ALTO) {
            String tipo = c[this.filaJugador + 1][this.columnaJugador].objetenerTipo();
            c[this.filaJugador][columnaJugador].cambiarTipo(tipo);
            c[this.filaJugador + 1][columnaJugador].cambiarTipo(TIPO_JUGADOR);
            this.filaJugador++;
            System.out.println("abajo");
        }
    }

    public void moverJugadorArriba() {
        if (filaJugador + 1 > 0) {
            String tipo = c[this.filaJugador - 1][this.columnaJugador].objetenerTipo();
            c[this.filaJugador][columnaJugador].cambiarTipo(tipo);
            c[this.filaJugador - 1][columnaJugador].cambiarTipo(TIPO_JUGADOR);
            this.filaJugador--;
            System.out.println("arriba");
        }
    }

}
