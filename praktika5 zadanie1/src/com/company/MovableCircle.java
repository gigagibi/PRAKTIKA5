package com.company;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        center.x = x;
        center.y = y;
        center.ySpeed = ySpeed;
        center.xSpeed = xSpeed;
    }

    @Override
    public void moveDown() {
        for(float i = 0; i < 10f; i+= 0.01f)
        {
            center.x += 0;
            center.y += center.ySpeed;
        }
    }

    @Override
    public void moveLeft() {
        for(float i = 0; i < 10f; i+= 0.01f)
        {
            center.x -= center.xSpeed;
            center.y += 0;
        }
    }

    @Override
    public void moveRight() {
        for(float i = 0; i < 10f; i+= 0.01f)
        {
            center.x += center.xSpeed;
            center.y += 0;
        }
    }

    @Override
    public void moveUp() {
        for(float i = 0; i < 10f; i+= 0.01f)
        {
            center.x += 0;
            center.y -= center.ySpeed;
        }
    }
}
