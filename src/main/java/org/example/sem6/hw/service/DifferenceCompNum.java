package org.example.sem6.hw.service;

import org.example.sem6.hw.model.CompNum;

public class DifferenceCompNum {
    public DifferenceCompNum() {
    }

    public CompNum differenceCompNum (CompNum cn1, CompNum cn2) {
        CompNum result = new CompNum();
        result.setdNum(cn1.getdNum() - cn2.getdNum());
        result.setmNum(cn1.getmNum() - cn2.getmNum());
        return result;
    }
}
