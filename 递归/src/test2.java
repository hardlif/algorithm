import java.util.*;
public class test2 {
    static int m,sum=0;//sum原来统计步数
    static void hanoi(char a,char b,char c,int n) {
        if(n==1) {
            sum++;
            if(sum==m)
                System.out.println("#"+n+": "+a+"->"+c);

        }
        else {
            hanoi(a,c,b,n-1);//这步可以理解为圆盘从A借助C移动到B
            sum++;
            if(sum==m)
                System.out.println("#"+n+": "+a+"->"+c);
            hanoi(b,a,c,n-1); //这步可以理解为圆盘从B借助A移动到C

        }



    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        m=in.nextInt();
        hanoi('A','B','C',n);
        System.out.println(sum);



    }
}