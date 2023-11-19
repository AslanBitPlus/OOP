package org.example.sem4;

import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> arr) {
        double result = 0;
        for (Number number: arr) {
            result += number.doubleValue();
        }
        return result;
    }
}
