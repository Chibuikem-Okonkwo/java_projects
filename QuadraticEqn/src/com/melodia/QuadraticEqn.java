package com.melodia;

import java.util.Scanner;

public class QuadraticEqn {

    private double a;
    private double b;
    private double c;

    Scanner scan = new Scanner(System.in);

    public QuadraticEqn() {

        System.out.println("Quadratic Equation ax^2 + bx + c = 0 ");
        System.out.println("");

        System.out.print("Please Enter the coefficient of x^2 i.e. a : ");
        a = Double.parseDouble(scan.nextLine());
        System.out.println("");

        System.out.print("Please Enter the coefficient of x i.e. b : ");
        b = Double.parseDouble(scan.nextLine());
        System.out.println("");

        System.out.print("Please Enter the coefficient of x^0 i.e. c : ");
        c = Double.parseDouble(scan.nextLine());
        System.out.println("");

        calcRoots();
    }

    public void calcRoots() {

        double det = b * b - 4 * a * c;

        if (det > 0 || det == 0) {

            double root1 = (-b + Math.sqrt(det)) / (2 * a);
            double root2 = (-b - Math.sqrt(det)) / (2 * a);

            System.out.println("The roots are: " + root1 + ", " + root2);
        } else if (det < 0) {

            det = -det;
            double root1 = (-b + Math.sqrt(det)) / (2 * a);
            double root2 = (-b - Math.sqrt(det)) / (2 * a);

            System.out.println("The roots are: " + root1 + "i, " + root2 + "i");
        }
    }

    public static void main(String[] args) {

        QuadraticEqn qe = new QuadraticEqn();
    }

}
