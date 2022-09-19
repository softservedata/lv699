package com.softserve.hw04.home_work;



public class Range {


    private float number;
    private float number2;
    private float number3;

    public Range(){
        number=0f;
    }

    public Range(float number, float number2, float number3) {
        this.number = number;
        this.number2 = number2;
        this.number3 = number3;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public float getNumber2() {
        return number2;
    }

    public void setNumber2(float number2) {
        this.number2 = number2;
    }

    public float getNumber3() {
        return number3;
    }

    public void setNumber3(float number3) {
        this.number3 = number3;
    }

    @Override
    public String toString() {
        return "Range{" +
                "number=" + number +
                ", number2=" + number2 +
                ", number3=" + number3 +
                '}';
    }

    public String belong(){
        String numberbelong="false";
        String numberbelong2="false";
        String numberbelong3="false";
        if (getNumber()>=-5&&getNumber()<=5){
            numberbelong="true";
        }
        if (getNumber2()>=-5&&getNumber2()<=5){
            numberbelong2="true";
        }
        if (getNumber3()>=-5&&getNumber3()<=5){
            numberbelong3="true";
        }
        return "\n"+numberbelong+"\n" +numberbelong2+"\n"+numberbelong3;
    }

}
