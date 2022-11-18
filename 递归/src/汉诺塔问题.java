import java.util.Scanner;

public class 汉诺塔问题 {
    static int count = 0;
    static  int m;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        m = scanner.nextInt();
        moveCircle(n,'A','C','B');
        System.out.print(count);
    }


    public static void moveCircle(int n,char origin,char target,char auxiliary){
        if (n == 1){
            count++;
            if (count == m){
                System.out.println("#"+n+": "+origin+"->"+target);
            }
            return;
        }
        else {
            //把n-1的盘子从a到b
            moveCircle(n-1,origin,auxiliary,target);
            //把第n个盘子放到从a到c
            count++;
            if (count == m){
                System.out.println("#"+n+": "+origin+"->"+target);
            }
            //把n-1的盘子从b到c
            moveCircle(n-1,auxiliary,target,origin);
        }

    }
}
