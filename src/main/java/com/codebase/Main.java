package com.codebase;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        WaterBottle bottle = new WaterBottle();
        Printer printer = new Printer(500, 250);
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.subtract(5,2));
        System.out.println(calculator.multiply(5,2));
        System.out.println(calculator.divide(4,2));
        System.out.println(bottle.getVolume());
        bottle.drink();
        System.out.println(bottle.getVolume());
        bottle.empty();
        System.out.println(bottle.getVolume());
        bottle.fill();
        System.out.println(bottle.getVolume());


        printer.print(30,5);
        System.out.println(printer.getSheetsAvailable());
        System.out.println(printer.getTonerAvailable());
        printer.print(500,1);
        System.out.println(printer.getSheetsAvailable());
        System.out.println(printer.getTonerAvailable());
    }
}