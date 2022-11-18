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
//        insertionSort(a);
        shellSort(a);
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
            for (int j = i; j > 0; j--) {
                if (a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }

    /**
     * 希尔排序
     * @param a
     */
    public static void shellSort(int a[]){
        int step = a.length;
        while (step>1) {
            step = step / 2;
            //根据步长分组
            for (int i = 0; i < step; i++) {
                //怎么确定a.length-1-i是i组在a.length内的最后一个数
                //不用确定因为a.length-1-i和a.length-1-(i+1)一定是两组
                for (int j = i; j < a.length; j = j + step) {
                    for (int k = j; k >= step ; k=k-step) {
                        if (a[k] < a[k - step]) {
                            int temp = a[k];
                            a[k] = a[k - step];
                            a[k - step] = temp;
                        }
                    }

                }
            }
        }
    }

}
