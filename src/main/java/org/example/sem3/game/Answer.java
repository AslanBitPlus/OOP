package org.example.sem3.game;

// import jdk.jfr.DataAmount;
// import lombok.AllArgsConstructor;
// import lombok.Builder;
// import lombok.Data;
// import lombok.NoArgsConstructor;
// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// @Builder

public class Answer {
    //
    private Integer numTry;
    private Integer cow;
    private Integer bull;

    public Answer(Integer numTry, Integer cow, Integer bull) {
        this.numTry = numTry;
        this.cow = cow;
        this.bull = bull;
    }

    public Answer() {
    }

    public Integer getNumTry() {
        return numTry;
    }

    public Integer getCow() {
        return cow;
    }

    public Integer getBull() {
        return bull;
    }



    @Override
    public String toString() {
        return "Answer{" +
                "numTry=" + numTry +
                ", cow=" + cow +
                ", bull=" + bull +
                '}';
    }
}
