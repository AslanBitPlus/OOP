package org.example.sem2.z6;

public class Byc implements Transportable {

    @Override
    public void run() {
        System.out.println("Еду на Байке");
    }

    @Override
    public void stop() {
        System.out.println("Стою на Байке");

    }
}
