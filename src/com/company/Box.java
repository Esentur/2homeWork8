package com.company;

public class Box<N1 extends Number, N2 extends Number> {
    N1 num1;
    N2 num2;

    public Box(N1 num1, N2 num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public N1 getNum1() {
        return num1;
    }

    public N2 getNum2() {
        return num2;
    }
}
