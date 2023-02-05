/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicexp.exercice1;

/**
 *
 * @author kernel-mk
 */
public class MyPoint {
    
    private int x;
    private int y;
    
    // Constructeur par défaut
    public MyPoint() {
        super();
    }
    
    // Constructeur surchargé
    public MyPoint(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    
    // Getter et setter pour x
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    
    // Getter et setter pour y
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    // Méthode setXY
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    // Méthode getXY
    public int[] getXY() {
        int[] coordinates = {x, y};
        return coordinates;
    }
    
    // Méthode toString
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    
    // Méthode distance
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}
