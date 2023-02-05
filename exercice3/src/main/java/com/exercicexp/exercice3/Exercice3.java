/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexp.exercice3;

/**
 *
 * @author kernel-mk
 */
public class Exercice3 {

    public static void main(String[] args) {
        
        Car car = new Car();
        car.setDetails("Roadster", "Tesla", 100);
        System.out.println(car.getDetails("Roadster"));
    }
}
