package com.company;

import java.util.Scanner;

public class Main {
    private double a, b, c;

    public Main() {

    }

    private Main(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDiscriminant() {
        return b * 2 - 4 * a * c;
    }

    private double getRoot1() {
        return ((-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a);
    }

    private double getRoot2() {
        return ((-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac hai: ");
        System.out.print("Pls input a: ");
        double a = sc.nextInt();
        System.out.print("Pls input b: ");
        double b = sc.nextInt();
        System.out.print("Pls input c: ");
        double c = sc.nextInt();

        Main pt1 = new Main(a, b, c);
        double discriminant = pt1.getDiscriminant();
        System.out.println("Delta =" + discriminant);
        System.out.println("Phuong trinh co hai nghiem la: ");
        System.out.println("X1= " + pt1.getRoot1());
        System.out.println("X2= " + pt1.getRoot2());

    }
}
