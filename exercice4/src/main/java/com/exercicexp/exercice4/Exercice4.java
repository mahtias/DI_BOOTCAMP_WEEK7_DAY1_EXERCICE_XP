/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexp.exercice4;

/**
 *
 * @author kernel-mk
 */
public class Exercice4 {

    public static void main(String[] args) {

        // TODO code application logic here
        
        Laptop laptop = new Laptop("Dell", 8, 500, 6);
        laptop.displaySpecs();
        laptop.useTouchpad("scrolling");
        
        SmartPhone smartphone = new SmartPhone("Samsung", 4, 128, "Android");
        smartphone.displaySpecs();
        smartphone.makeCall("123456789");


    }
}
