package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class findNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] ints = new int[count];
        int position = -1;
        int num = 1;
        for (int i = 0; i < count; i++) {
            ints[i] = scanner.nextInt();
        }
        int keyNum = scanner.nextInt();
        for (int i :ints) {
            if (keyNum == i){
                position = num;
                break;
            }
            num++;
        }
        System.out.println(position);

    }
}
