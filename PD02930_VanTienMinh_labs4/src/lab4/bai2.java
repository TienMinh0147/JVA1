package lab4;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int m,x=1,y=2,n=x+y;
        System.out.println("nhập số m");
        m=sc.nextInt();
        while (n<m)
        {
            n=x+y;
            System.out.print(n+", ");
            x=y;
            y=n;
        }
    }
}
