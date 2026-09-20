package org.example;

public class Calculator {

    private static final int bonus = 5;
        public int aduna(int a, int b) {
            return a + b + bonus;
        }
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            System.out.println("Rezultat: " + calc.aduna(5, 10));
        }
}
