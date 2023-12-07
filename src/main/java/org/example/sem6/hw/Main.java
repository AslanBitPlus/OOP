package org.example.sem6.hw;

import org.example.sem6.hw.service.MyLogger;
import org.example.sem6.hw.controller.Controller;
import org.example.sem6.hw.model.CompNum;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        CompNum compNum1 = new CompNum(2.0,3.0);
        CompNum compNum2 = new CompNum(4.0,5.0);
        //
        controller.compNumView.printCompNum(compNum1);
        controller.compNumView.printCompNum(compNum2);

        // Сумма двух комплексных чисел
        CompNum compNum3 = controller.amountCompNum.amountCompNum(compNum1, compNum2);
        System.out.println("Сумма двух комплексных чисел ");
        controller.compNumView.printCompNum(compNum3);
        controller.myLogger.writeMessage("Сумма", compNum1.toString(), compNum2.toString(), compNum3.toString());

        // Разность двух комплексных чисел
        CompNum compNum4 = controller.differenceCompNum.differenceCompNum(compNum1, compNum2);
        System.out.println("Разность двух комплексных чисел ");
        controller.compNumView.printCompNum(compNum4);
        controller.myLogger.writeMessage("Разность", compNum1.toString(), compNum2.toString(), compNum4.toString());

        // Произведение двух комплексных чисел
        CompNum compNum5 = controller.multiplicationCompNum.multiplicationCompNum(compNum1, compNum2);
        System.out.println("Произведение двух комплексных чисел ");
        controller.compNumView.printCompNum(compNum5);
        controller.myLogger.writeMessage("Произведение", compNum1.toString(), compNum2.toString(), compNum5.toString());

        // Деление двух комплексных чисел
        CompNum compNum6 = controller.divisionCompNum.divisionCompNum(compNum1, compNum2);
        System.out.println("Деление двух комплексных чисел ");
        controller.compNumView.printCompNum(compNum6);
        controller.myLogger.writeMessage("Деление", compNum1.toString(), compNum2.toString(), compNum6.toString());
    }
}
