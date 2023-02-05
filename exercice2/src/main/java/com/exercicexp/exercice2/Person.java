/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exercicexp.exercice2;

/**
 *
 * @author kernel-mk
 */
public class Person {

    /* les proprietes de la classe */

    private String name;
    private String lastName;
    private String email;
    private int age;

    /* les constructeurs avec paramettres */

    public Person(String name, String lastName, String email, int age) {
        super();
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    /* les setters et getters */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /* la methode toString */
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName=" + lastName + ", email=" + email + ", age=" + age + '}';
    }

}
