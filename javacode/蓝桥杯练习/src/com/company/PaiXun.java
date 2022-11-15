package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PaiXun {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = scanner.nextInt();
        }
        int temp;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1)
                System.out.println(a[i]);
            else {
                System.out.print(a[i] + " ");
            }

        }

//        public void paixun() {
//            Scanner scanner = new Scanner(System.in);
//            int count = scanner.nextInt();
//            int[] a = new int[count];
//            for (int i = 0; i < count; i++) {
//                a[i] = scanner.nextInt();
//            }
//            int temp;
//            for (int i = 0; i < a.length - 1; i++) {
//                for (int j = 0; j < a.length - 1; j++) {
//                    if (a[i + j] > a[i + j + 1]) {
//                        temp = a[i + j];
//                        a[i + j] = a[i + j + 1];
//                        a[i + j] = temp;
//                    }
//                }
//
//            }
//            for (int i : a) {
//                System.out.println(i);
//            }

        }
    }

