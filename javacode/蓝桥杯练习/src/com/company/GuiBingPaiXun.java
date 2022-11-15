package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class GuiBingPaiXun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] a = new int[count];
        for (int i = 0; i < count; i++) {
            a[i] = scanner.nextInt();
        }
        int[] finalArray = new GuiBingPaiXun().paixun(a);
        for (int i = 0; i < finalArray.length-1; i++) {
            System.out.print(finalArray[i]+" ");
        }
        System.out.print(finalArray[finalArray.length-1]);


    }

    public int[] paixun(int[] a){
        if(a.length==1)
            return a;
        int[] aLeft = paixun(Arrays.copyOfRange(a, 0, a.length / 2));
        int[] aRight = paixun(Arrays.copyOfRange(a, a.length / 2,a.length ));
        return mergeArray(aLeft,aRight);
    }

    public int[] mergeArray(int[] aLeft,int[] aRight){
        int[] ints = new int[aLeft.length + aRight.length];
        int leftCursor = 0;
        int rightCursor = 0;
        for (int i = 0; i < ints.length; i++) {
            if (leftCursor >= aLeft.length){
                ints[i] = aRight[rightCursor];
                rightCursor++;
                continue;
            }
            if (rightCursor >= aRight.length){
                ints[i] = aLeft[leftCursor];
                leftCursor++;
                continue;
            }

            if (aLeft[leftCursor]<aRight[rightCursor]){
                ints[i] = aLeft[leftCursor];
                leftCursor++;
            }
            else {
                ints[i] = aRight[rightCursor];
                rightCursor++;
            }
        }
        return ints;
    }

}
