package org.example.sem2.z6;

public class Human {

    private Transportable lastTransport;

    public void drive(Transportable transport) {
        if (lastTransport == null) {
            transport.run();
            lastTransport = transport;
        } else {
            System.out.println("Уже еду");
        }

    }

    public void stop(Transportable transport) {
        if (lastTransport != null) {
            transport.stop();
            lastTransport = null;
        } else {
            System.out.println("Уже стою");
        }
    }

}
