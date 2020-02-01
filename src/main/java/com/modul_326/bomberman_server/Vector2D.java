// https://gist.github.com/gunvirranu/6816d65c0231981787ebefd3bdb61f98

package com.modul_326.bomberman_server;


public class Vector2D {

    public int x;
    public int y;

    public Vector2D() {
    }

    public Vector2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D(Vector2D v) {
        set(v);
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void set(Vector2D v) {
        this.x = v.x;
        this.y = v.y;
    }

    public void add(Vector2D v) {
        this.x += v.x;
        this.y += v.y;
    }

    public void add(int vx, int vy) {
        this.x += vx;
        this.y += vy;
    }

    public static Vector2D add(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.x + v2.x, v1.y + v2.y);
    }

    public Vector2D getAdded(Vector2D v) {
        return new Vector2D(this.x + v.x, this.y + v.y);
    }

    public void subtract(Vector2D v) {
        this.x -= v.x;
        this.y -= v.y;
    }

    public void subtract(int vx, int vy) {
        this.x -= vx;
        this.y -= vy;
    }

    public static Vector2D subtract(Vector2D v1, Vector2D v2) {
        return new Vector2D(v1.x - v2.x, v1.y - v2.y);
    }

    public Vector2D getSubtracted(Vector2D v) {
        return new Vector2D(this.x - v.x, this.y - v.y);
    }

    public void multiply(int scalar) {
        x *= scalar;
        y *= scalar;
    }

    public Vector2D getMultiplied(int scalar) {
        return new Vector2D(x * scalar, y * scalar);
    }

    public void divide(int scalar) {
        x /= scalar;
        y /= scalar;
    }

    public Vector2D getDivided(int scalar) {
        return new Vector2D(x / scalar, y / scalar);
    }
}
