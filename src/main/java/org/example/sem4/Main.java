package org.example.sem4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SimpleBox simpleBox1 = new SimpleBox(10);
        SimpleBox simpleBox2 = new SimpleBox(20);
        // Integer x = simpleBox1.getObject() + simpleBox2.getObject(); // Проблема каста
        Integer x = (Integer) simpleBox1.getObject() + (Integer) simpleBox2.getObject();
        System.out.println("x = " + x);
        simpleBox1.setObject("Java test");
        simpleBox2.setObject(" casting");

        if (simpleBox1.getObject() instanceof Integer &&
                simpleBox2.getObject() instanceof Integer) {
            Integer y = (Integer) simpleBox1.getObject() + (Integer) simpleBox2.getObject();
            System.out.println("y = " + y);
        } else if (simpleBox1.getObject() instanceof String &&
                simpleBox2.getObject() instanceof String) {
            String z = (String) simpleBox1.getObject() + (String) simpleBox2.getObject();
            System.out.println("z = " + z);
        } else {
            System.out.println("Ошибка -----");
        }

        // 2-ой способ с классом GenBox
        GenBox<Integer> gen1 = new GenBox<>(10);
        GenBox<Integer> gen2 = new GenBox<>(20);
        int sum = gen1.getObj() + gen2.getObj(); // каст не требуется
        System.out.println("sum = " + sum);

        GenBox<String> gen3 = new GenBox<>("10");
        GenBox<String> gen4 = new GenBox<>("20");
        String sumt = gen3.getObj() + gen4.getObj();
        System.out.println("sumt = " + sumt);

        //
        BoxWithNumber<Integer> bwn1 = new BoxWithNumber<>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        // BoxWithNumber<Integer> bwn2 = new BoxWithNumber<>(new Integer[] {12,24,3,17,51,8,33,31,45,19});
        // BoxWithNumber<Double> bwn1 = new BoxWithNumber<>(new Double[] {1.0,2.7,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0});
        BoxWithNumber<Double> bwn2 = new BoxWithNumber<>(new Double[]{12.5, 24.0, 3.0, 17.0, 51.0, 8.0, 33.0, 31.0, 45.0, 19.0});


        System.out.println("bwn1 average = " + bwn1.average() + ", bwn2 average = " + bwn2.average());
        if (bwn1.average() > bwn2.average()) {
            System.out.println("bwn1 > bwn2");
        } else if (bwn1.average() < bwn2.average()) {
            System.out.println("bwn1 < bwn2");
        } else {
            System.out.println("bwn1 = bwn2");
        }
        //
        System.out.println(bwn1.compareAverage(bwn2));

        //
        Calculator calc1 = new Calculator();
        System.out.println(calc1.sum(Arrays.asList(1, 2, 3, 4, 5)));

        System.out.println(calc1.sum(Arrays.asList(1.9, 2, 4, 3.6, 4.2, 5.4)));


    }
}
