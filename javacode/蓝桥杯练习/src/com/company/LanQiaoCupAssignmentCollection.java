package com.company;





import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LanQiaoCupAssignmentCollection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList();
        int sum = 0;
        int num;
        int temp;
        for (int i = 1; i <= n; i++) {
            num = i;
            while (num!=0){
                temp = num % 10;
                if (temp==2||temp==0||temp==1||temp==9){
                    list.add(i);
                    break;
                }
                num/=10;
            }
        }
        for (Integer integer :list) {
            sum+=integer;
        }
        System.out.println(sum);
    }

}
