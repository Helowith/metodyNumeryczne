package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int numerProgramu = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz, co chcesz liczyć:");
        System.out.println("1. Schemat Hornera I");
        System.out.println("2. Schemat Hornera II");
        System.out.println("3. Medota bisekcji");
        System.out.println("4. Zakończ program");
        try {
            numerProgramu = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Nieprawiłowy znak!");
        }
        switch (numerProgramu) {
            case 0:
                System.out.println("Zły znak!");
                menu();
            case 1: {
                pierwszyHorner();
                menu();
            }
            case 2: {
                drugiHorner();
                menu();
            }
            case 3: {
                double a, b, epsilon;
                epsilon = 0.00001;
                System.out.println("Wpisz a:");
                a = sc.nextDouble();
                System.out.println("Wpisz b:");
                b = sc.nextDouble();
                System.out.println("Błąd wynosi: " + epsilon);
                if (function(a) * function(b) > 0) {
                    System.out.println("Funkcja nie spełnia założeń!");

                } else {
                    System.out.println("Miejsce zerowe wynosi:");
                    System.out.print(bisekcja(a, b, epsilon));
                }
                menu();
            }
            case 4: {
                koniec();
            }
            default: {
                System.out.println("Nieprawidłowy numer programu!");
                menu();
            }

        }


    }

    public static double bisekcja(double a, double b, double epsilon) {
        if (function(a) == 0.0) {
            return a;
        }
        if (function(b) == 0.0) {
            return b;
        }
        double srodek = 0;

        while (b - a > epsilon) {
            srodek = (a + b) / 2;

            if (function(srodek) == 0.0) {
                return srodek;
            }
            if (function(a) * function(srodek) < 0) {
                b = srodek;
            } else {
                a = srodek;
            }
        }
        return (a + b) / 2;
    }


    public static double function(double f) {
        return f; //Miejsce na funkcję
    }

    public static void pierwszyHorner() {

    }

    public static void drugiHorner() {

    }


    public static int koniec() {
        return 0;
    }
}
