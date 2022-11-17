package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[] = new int[m];
        for (int i = 0; i < m; i++) {
            a[i]=scanner.nextInt();
        }

//        selectionSort(a);
//        bubbleSort(a);
        insertionSort(a);
        for (Integer integer :a) {
            System.out.print(integer+" ");
        }

    }

    /**
     * 选择排序
     * @param a
     */
    public static void selectionSort(int a[]){
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序
     * @param a
     */
    public static void bubbleSort(int a[]){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j <a.length -1 - i; j++) {
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    /**
     * 插入排序
     * @param a
     */
    public static void insertionSort(int a[]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i; j++) {
                if (a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}