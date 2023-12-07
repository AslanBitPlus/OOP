package org.example.sem6.hw.model;

public class CompNum {
    private Double dNum;
    private Double mNum;

    public CompNum(Double dNum, Double mNum) {
        this.dNum = dNum;
        this.mNum = mNum;
    }

    public CompNum() {
    }

    public Double getdNum() {
        return dNum;
    }

    public void setdNum(Double dNum) {
        this.dNum = dNum;
    }

    public Double getmNum() {
        return mNum;
    }

    public void setmNum(Double mNum) {
        this.mNum = mNum;
    }

    @Override
    public String toString() {
        return "(" + dNum + " + " + mNum + "i)";
    }
}
