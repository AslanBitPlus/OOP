package org.example.sem3;

public enum Month { // Создаем класс enum
    JAN(1), FEB(2), MAR(3), APR(4),
    MAY(5), JUN(6), JUL(7), AUG(8),
    SEP(9), OCT(10), NOV(11), DEC(12);

    Month() {
    }

    Month(int number, String ruName) {
        this.number = number;
        this.ruName = ruName;
    }

    public int getNumber() {
        return number;
    }

    Month(int number) {
        this.number = number;
    }

    private int number;
    private String ruName;

    public String getRuName() {
        return ruName;
    }

}
