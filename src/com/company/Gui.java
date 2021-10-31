package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Gui extends JPanel implements KeyListener, ActionListener {

Circle circle1 = new Circle('A', 20, 50, 40, 1,2, Color.BLUE);

Circle circle2 = new Circle('B', 50, 100, 50, 1, 1, Color.RED);

public Gui(){
    addKeyListener(this);
    this.setFocusable(true);

    //Set timer that will call Action Listener every 200 milliseconds.
    Timer t = new Timer(200, this);

    t.start();

}


    @Override
    //Default pain function that comes by default as we inherit from JPanel (extends JPanel)
    public void paint(Graphics g) {
    g.clearRect(0, 0, 2000, 1000);

    circle1.Draw(g);
    circle2.Draw(g);

    }







    @Override
    public void actionPerformed(ActionEvent e) {
        circle1.Move();
        circle2.Move();
        CollisionTest.GetCollisionTime(circle1, circle2);
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }




}
