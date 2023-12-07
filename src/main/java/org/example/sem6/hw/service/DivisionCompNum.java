package org.example.sem6.hw.service;

import org.example.sem6.hw.model.CompNum;

public class DivisionCompNum {
    public DivisionCompNum() {
    }

    public CompNum divisionCompNum (CompNum cn1, CompNum cn2) {
        CompNum result = new CompNum();
        result.setdNum(
                (cn1.getdNum()*cn2.getdNum() + cn1.getmNum()*cn2.getmNum())/
                (cn2.getdNum()*cn2.getdNum() + cn2.getmNum()*cn2.getmNum()) +
                (cn1.getmNum()*cn2.getdNum() - cn1.getdNum()*cn2.getmNum())/
                (cn2.getdNum()*cn2.getdNum() + cn2.getmNum()*cn2.getmNum())
        );
        result.setmNum(cn1.getmNum() - cn2.getmNum());
        return result;
    }
}
