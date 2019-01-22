package com.company;

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator newShape = new Calculator();


        newShape.setWidth(4);
        newShape.setHeight(4);


        System.out.print("The area of the rectangle is " + newShape.calculateArea(newShape.getWidth(), newShape.getHeight()));



    }
}
