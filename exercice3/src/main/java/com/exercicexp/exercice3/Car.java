/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicexp.exercice3;

/**
 *
 * @author kernel-mk
 */
public class Car extends Vehicule {
    
    private String name;

    public Car() {
        super();
    }

    public void setDetails(String name, String model, int speed) {
        this.name = name;
        setModel(model);
        setSpeed(speed);
    }

    public String getDetails(String carName) {
        return carName + ", " + getModel() + ", " + getSpeed();
    }
    
}
