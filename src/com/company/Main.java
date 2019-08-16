package com.company;


public class Main {

    public static void main(String[] args) {
        Box<Double, Integer> box1 = new Box<>(10.0d, 7);
        Box<Float, Float> box2 = new Box<>(3.4f, 2.3f);
        addition(box1, box2);
        multiplication(box1, box2);
    }

    public static Number addition(Box<? extends Double, ? extends Integer> box1,
                                  Box<? extends Float, ? extends Float> box2) {
        System.out.println("Вызов метода сложения");
        Number sum = box1.getNum1() + box1.getNum2() + box2.getNum1() + box2.getNum1();
        System.out.println(sum);
        return sum;
    }

    public static Number multiplication(Box<? extends Double, ? extends Integer> box1,
                                        Box<? extends Float, ? extends Float> box2) {
        System.out.println("Вызов метода умножения");
        Number sum = box1.getNum1() * box1.getNum2() * box2.getNum1() * box2.getNum1();
        System.out.println(sum);
        return sum;
    }
}
