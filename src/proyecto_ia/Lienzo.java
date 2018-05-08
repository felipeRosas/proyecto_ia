/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_ia;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Lienzo extends Canvas implements Constantes, KeyListener {

    public Escenario escenario;

    public Lienzo() {
        escenario = new Escenario();
        this.setBackground(Color.ORANGE);
        this.addKeyListener(this);
        this.setFocusable(true);//
    }

    /*
    @Override
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
       
       escenario.paintComponent(g);
    }
     */
    @Override
    public void update(Graphics g) {
        escenario.paintComponent(g);
    }

    @Override
    public void paint(Graphics g) {
        update(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("presionado");
        escenario.moverJugador(e);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
