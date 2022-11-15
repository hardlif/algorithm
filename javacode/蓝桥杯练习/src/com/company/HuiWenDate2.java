package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HuiWenDate2 {//ababbaba
    List list1 = Arrays.asList(0,2,5,7);
    List list2 = Arrays.asList(1,3,4,6);

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int beginDateNum = scanner.nextInt();
        new HuiWenDate2().getHuiWenDate(beginDateNum);

    }
    public  void getHuiWenDate(Integer beginDateNum) throws ParseException {
        //日期格式化显示，首先定义格式
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyyMMdd");
        Date overDate = sdf1.parse(String.valueOf(89991231));
        Date currentDate = sdf1.parse(String.valueOf(beginDateNum));
        Calendar calendar = Calendar.getInstance();
        String HuiWenDate = null;

        while (!currentDate.after(overDate)){
            calendar.setTime(currentDate);
            calendar.add(Calendar.DAY_OF_MONTH,1);
            currentDate = calendar.getTime();
            String currentDateStr = sdf1.format(currentDate);
            if (isHuiWenDate(currentDateStr)){
                if (HuiWenDate == null){
                    HuiWenDate = currentDateStr;
                    System.out.println(currentDateStr);
                }
                if (isHuiWenABABBABADate(currentDateStr)){
                    System.out.println(currentDateStr);
                    return;

                }
            }
        }


//        calendar.setTime(date);
//        calendar.add(Calendar.DAY_OF_MONTH,1);
//        Date date1 = calendar.getTime();
//        System.out.println(sdf1.format(date1));

}



public boolean isHuiWenDate(String str){
        String afterStr = new StringBuffer(str).reverse().toString();
        return afterStr.equals(str) ? true : false;
}

public boolean isHuiWenABABBABADate(String str){
    for (Object integer :list1) {
        if (str.charAt((Integer) integer)!=str.charAt(0)){
            return false;
        }
    }
    for (Object integer :list2) {
        if (str.charAt((Integer) integer)!=str.charAt(1)){
            return false;
        }
    }
    return true;
}
}
