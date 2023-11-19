package org.example.sem4.hw;

import java.util.List;

public class Calculator {
    public Double sum(List<? extends Number> arr) {
        double result = 0;
        for (Number number: arr) {
            result += number.doubleValue();
        }
        return result;
    }

    public Double multip(List<? extends Number> arr) {
        double result = 1;
        for (Number number: arr) {
            result *= number.doubleValue();
        }
        return result;
    }

    public Double div(List<? extends Number> arr) {
        double result = 1;
        for (Number number: arr) {
            if (number.doubleValue() != 0){
                result /= number.doubleValue();
            }
        }
        return result;
    }

    public String[] bin(List<? extends Number> arr) {
        String[] result = new String[arr.size()];
        for (Number number: arr) {
            int res = number.intValue();
            int ost = 0;
            int i = 0;
            String rst = "";
            // System.out.println("res = " + res);
            while (res != 0) {
                ost = res % 2;
                res = res / 2;
                rst = Integer.toString(ost) + rst;
                // result[i] = result[i] + Integer.toString(ost);

            }
            i ++;
            System.out.println(number.intValue() + " - '" + rst + "'");
        }
        return result;
    }

}
