package com.company;

import java.awt.*;

public class Circle {

    public Circle(char name, double x, double y, double r, double vx, double vy, Color color){
        this.name = name;
        this.x = x;
        this.y = y;
        this.r = r;
        this.vx = vx;
        this.vy = vy;

        this.color = color;
    }

    public char name;
    public double x;
    public double y;
    public double r;

    public double vx;
    public double vy;

    public Color color;


    public void Draw(Graphics g){
        g.setColor(this.color);
        g.fillOval((int) this.x, (int)this.y, (int)this.r, (int)this.r);
    }

    public void Move(){
        x+=vx; y+=vy;
    }
}
