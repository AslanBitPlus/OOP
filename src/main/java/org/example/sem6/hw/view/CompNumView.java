package org.example.sem6.hw.view;

import org.example.sem6.hw.model.CompNum;

public class CompNumView {
    public void printCompNum(CompNum compNum) {
        if (compNum.getmNum() < 0) {
            System.out.println(compNum.getdNum() + "" + compNum.getmNum() + "i");
        } else {
            System.out.println(compNum.getdNum() + "+" + compNum.getmNum() + "i");
        }
    }
}
