package com.danielsoto;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(1, 15);
        bicycle.changeGear(2);
        bicycle.speedUp(30);
        bicycle.applyBrakes(12);

        bicycle.printStates();

        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(10);
        bike.applyBrakes(5);
        bike.printStates();

        int a = 10;

        Square square = (int x) -> x * x;

        int answer = square.calculate(a);
        System.out.println(answer);
    }
}
