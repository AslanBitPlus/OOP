package org.example.sem4;

import java.util.Arrays;

public class BoxWithNumber <T extends Number> {
    private T[] arr;

    public BoxWithNumber(T[] arr) {
        this.arr = arr;
    }

    public BoxWithNumber() {
    }

    public double average() {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].doubleValue();
        }
        return sum / arr.length;
    }

    // public boolean compareAverage(BoxWithNumber bwn2) { // метод мы создали вручную
    //     return this.average() > bwn2.average();
    // }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    // метод мы создали авто alt+Enter
    public boolean compareAverage(BoxWithNumber<?> bwn2) { // ? для того чтобы принять любые значения
        return this.average() > bwn2.average();
    }
}
