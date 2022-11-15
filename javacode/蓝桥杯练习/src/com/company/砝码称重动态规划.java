package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class 砝码称重动态规划 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            HashSet<Integer> tempSet = new HashSet<>();
            for (Integer integer :set) {
                tempSet.add(integer+temp);
                tempSet.add(Math.abs(integer-temp));
            }
            set.addAll(tempSet);
        }
        set.remove(0);
        System.out.println(set.size());
    }
}
