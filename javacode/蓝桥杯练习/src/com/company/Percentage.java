package com.company;

import org.junit.jupiter.api.Test;

import java.util.Scanner;
//next()不能得到空白的字符串
public class Percentage {
    public static void main(String[] args) {
        int passNum = 0;
        int goodNum = 0;
        int count = 0;
        Scanner scanner=new Scanner(System.in);
        int allNum = scanner.nextInt();
        while (count<allNum){
            String str=scanner.next();//使用next方法接收

            int num = Integer.parseInt(str);

            if(num>=60){
                passNum++;
                if (num>=85){
                    goodNum++;
                }
            }
            count++;
        }

        //凡是属于IO流的类，不关闭会一直占用空间
        scanner.close();

        System.out.println((int)(passNum*100.0/allNum+0.5)+"%");
        System.out.println((int)(goodNum*100.0/allNum+0.5)+"%");
    }

    @Test
    public void testScanner(){
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){
            System.out.println("scanner获取的字符串为"+scanner.next());
        }
    }
}
