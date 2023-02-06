import Exercice1.MyPoint;
import Exercice2.Person;
import Exercice3.Car;
import Exercice3.Vehicle;
import Exercice4.Laptop;
import Exercice4.SmartPhone;

public class Main {
    public static void main(String[] args) {
        //Exercice1
        MyPoint p1 = new MyPoint(3,4);
        System.out.println("La distance du point est:" + p1.distance(5,6));

        //Exercice2
        Person person = new Person("John", "Wick", "john@wick.com", 55);
        System.out.println(person.toString());

        //Exercice3
        Car car1 = new Car();
        car1.setSpeed(125);
        car1.setModel("ford256");
        System.out.println(car1.getDetails("Ford"));
        car1.setDetails("Range Rover", "verlar", 135);
        System.out.println(car1.getDetails("Range Rover"));

        //Exercice4
        Laptop laptop = new Laptop("Dell", 8, 500, "Dell Laptitude");
        laptop.displaySpecs();
        laptop.useTouchpad("scrolling");

        SmartPhone smartphone = new SmartPhone("Samsung", 12, "S22");
        smartphone.displaySpecs();
        smartphone.makeCall("123456789");

    }
}