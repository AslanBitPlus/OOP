package org.example.sem2.z6;

public class Scate implements Transportable{
    @Override
    public void run() {
        System.out.println("Еду на скейтборде");
    }

    @Override
    public void stop() {
        System.out.println("Стоим на скейтборде");
    }
}
