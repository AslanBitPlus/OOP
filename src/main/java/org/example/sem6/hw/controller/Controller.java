package org.example.sem6.hw.controller;

import org.example.sem6.hw.service.*;
import org.example.sem6.hw.model.CompNum;
import org.example.sem6.hw.view.CompNumView;

public class Controller {

    public CreateCompNum createCompNum;
    public AmountCompNum amountCompNum;
    public CompNumView compNumView;
    public DifferenceCompNum differenceCompNum;
    public MultiplicationCompNum multiplicationCompNum;
    public DivisionCompNum divisionCompNum;
    public MyLogger myLogger;

    public Controller() {
        this.createCompNum = new CreateCompNum();
        this.compNumView = new CompNumView();
        this.amountCompNum = new AmountCompNum();
        this.differenceCompNum = new DifferenceCompNum();
        this.multiplicationCompNum = new MultiplicationCompNum();
        this.divisionCompNum = new DivisionCompNum();
        this.myLogger = new MyLogger();

    }

    public Controller(CreateCompNum createCompNum, AmountCompNum amountCompNum,
                      CompNumView compNumView, DifferenceCompNum differenceCompNum,
                      MultiplicationCompNum multiplicationCompNum,
                      DivisionCompNum divisionCompNum,
                      MyLogger myLogger) {
        this.createCompNum = createCompNum;
        this.amountCompNum = amountCompNum;
        this.compNumView = compNumView;
        this.differenceCompNum = differenceCompNum;
        this.multiplicationCompNum = multiplicationCompNum;
        this.divisionCompNum = divisionCompNum;
        this.myLogger = myLogger;
    }

    public CreateCompNum getCreateCompNum() {
        return createCompNum;
    }

    public void setCreateCompNum(CreateCompNum createCompNum) {
        this.createCompNum = createCompNum;
    }

    public AmountCompNum getAmountCompNum() {
        return amountCompNum;
    }

    public void setAmountCompNum(AmountCompNum amountCompNum) {
        this.amountCompNum = amountCompNum;
    }

    public CompNumView getCompNumView() {
        return compNumView;
    }

    public void setCompNumView(CompNumView compNumView) {
        this.compNumView = compNumView;
    }

    public DifferenceCompNum getDifferenceCompNum() {
        return differenceCompNum;
    }

    public void setDifferenceCompNum(DifferenceCompNum differenceCompNum) {
        this.differenceCompNum = differenceCompNum;
    }

    public MultiplicationCompNum getMultiplicationCompNum() {
        return multiplicationCompNum;
    }

    public void setMultiplicationCompNum(MultiplicationCompNum multiplicationCompNum) {
        this.multiplicationCompNum = multiplicationCompNum;
    }

    public DivisionCompNum getDivisionCompNum() {
        return divisionCompNum;
    }

    public void setDivisionCompNum(DivisionCompNum divisionCompNum) {
        this.divisionCompNum = divisionCompNum;
    }

    public MyLogger getMyLogger() {
        return myLogger;
    }

    public void setMyLogger(MyLogger myLogger) {
        this.myLogger = myLogger;
    }
}
