package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class 找回文数 {
    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        for (int D = 0; D < 2; D++) {
            for (int C =0; C < 10; C++) {
                for (int B = 0; B < 4; B++) {
                    for (int A = 1; A <10; A++) {
                        int year = A*10000000+B*1000000+C*100000+D*10000+D*1000+C*100+B*10+A;
                        //限定条件
                        if (D==1&&C>2||D==0&&C==2&&C>3||D==0&&C==0){
                            break;
                        }
                        //根据月份限定条件
                        if ((D==0&&(C==1||C==3||C==5||C==7||C==8)&&B==3&&A>1)||(D==1&&(C==0||C==2)&&B==3&&A>1)){
                            break;
                        }
                        if ((D==0&&(C==2||C==4||C==6||C==9)&&B==3&&A>0)||(D==1&&(C==11)&&B==3&&A>0)){
                            break;
                        }

                        //判断闰年限定条件
                        if (year%400==0||year%100!=0&&year%4==0){
                            if (D==0&&C==2&&B==2&&A>=9){
                                break;
                            }
                        }

                        list2.add(year);
                    }
                }


            }
        }
        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        for (Integer integer :list2) {
            if (integer-n>0){
                System.out.println(integer);
                break;
            }
        }


        for (int B = 0; B < 2; B++) {
            for (int A = 1; A < 10; A++) {
                if (B == 1&&A > 2){
                    break;
                }
                int num = Integer.parseInt(""+A+B+A+B+B+A+B+A);
                list1.add(num);
            }
        }
        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for (Integer integer :list1) {
            if (integer-n>0){
                System.out.println(integer);
                break;
            }
        }

    }
}
