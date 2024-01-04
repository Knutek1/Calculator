package com.kodilla.kalkulator;

public class Calculator {
        private int a;
        private int b;
        private int c;

        public Calculator(int a, int b){
            this.a = a;
            this.b = b;
        }
        public void dodawanie(){
            this.c = this.a + this.b;
            System.out.println("Wynik dodawania to: " +this.c);
        }

        public void odejmowanie(){
            this.c = this.a - this.b;
            System.out.println("Wynik odejmowania to: " +this.c);
        }
        public static void main(String args[]){
            Calculator calc = new Calculator(6,3);
            calc.dodawanie();
            calc.odejmowanie();
        }
    }


