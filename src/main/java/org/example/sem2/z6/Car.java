package org.example.sem2.z6;

public class Car implements Transportable{
    @Override
    public void run() {
        System.out.println("Еду на машине");
    }

    @Override
    public void stop() {
        System.out.println("Стою на машине");
    }
}
