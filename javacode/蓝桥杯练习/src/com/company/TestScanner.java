package com.company;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){
            System.out.println("scanner获取的字符串为"+scanner.nextLine());
        }
    }
    }

