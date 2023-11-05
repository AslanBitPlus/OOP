package org.example.sem2.hw;

import org.example.sem2.z5.Animal;
import org.example.sem2.z5.Dog;
import org.example.sem2.z5.HomeCat;
import org.example.sem2.z5.Tiger;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //
        Player[] players = {
                new Human("Петя", 5000, 2),
                new Human("Иван", 2000, 3),
                new Human("Миша", 3000, 1),
                new Cat("Патрич", 800, 1),
                new Cat("Мурка", 800, 1),
                new Robot("Rob1", 10000, 4),
                new Robot("Rob2", 7000, 2)
        };
        for (Player element: players) {
            System.out.println(element.toString());
            //element.toString();
            // element.run(100 + new Random().nextInt(20));
            // element.swim(100 + new Random().nextInt(10));
        }
        Prepyat[] prepyats = {
                new Dorojka("Дорожка-1", 2500),
                new Stena("Стена-1", 1),
                new Dorojka("Дорожка-2", 3500),
                new Stena("Стена-2", 2),
                new Dorojka("Дорожка-3", 7500),
                new Stena("Стена-3", 3)
        };
        for (Prepyat element: prepyats) {
            System.out.println(element.toString());
        }
        //
        Integer playcount = Player.count;
        for (Prepyat pr: prepyats) {
            System.out.println("===Препятствие=========================== " + pr.name);
            for (Player pl: players) {
                pl.run(pr.dist);
                if (pl.maxRunDistance < pr.dist && pl.maxJumpDistance < pr.dist) {
                    playcount --;
                    System.out.println(pl.name + " Выбыл из игры!");
                }
            }
        }
        //


    }
}
