package org.example.sem2.z6;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Transportable car = new Car();
        human.drive(car);
        human.stop(car);
        human.stop(car);
        Transportable byc = new Byc();
        human.drive(byc);
        human.drive(car);
    }
}
