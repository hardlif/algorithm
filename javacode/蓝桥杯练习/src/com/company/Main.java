package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    // write your code here
    HashMap<Character, Integer> map = new HashMap<>();
    Character maxChar = null;
    int maxCount = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main main = new Main();
        main.findMaxCountCharacter(scan.next());
        System.out.println(main.maxChar);
        System.out.println(main.maxCount);

    }

    public void returnChar(Character currentCharacter){
        if (map.get(currentCharacter)>=maxCount){
            if (map.get(currentCharacter)==maxCount){
                //判断和前面的字母谁大谁小
                if (maxChar!=null)
                    maxChar = currentCharacter < maxChar ? currentCharacter : maxChar;
                else
                    maxChar = currentCharacter;
            }
            else {
                maxChar = currentCharacter;
                maxCount = map.get(currentCharacter);
            }
        }
    }

    public void findMaxCountCharacter(String str){
        for (int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);
            if (map.containsKey(currentCharacter)){
                map.put(currentCharacter,map.get(currentCharacter)+1);
            }
            else
            {
                map.put(currentCharacter,1);
            }
            returnChar(currentCharacter);
        }

    }
}
