package com.company;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        System.out.println((String.format("%.7f",radius*radius*Math.PI)));
    }
}
