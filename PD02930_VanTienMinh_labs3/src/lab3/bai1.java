package lab3;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a,b;
        System.out.println("nhập a");
        a=sc.nextDouble();
        System.out.println("nhập b");
        b=sc.nextDouble();
        if (a==0)
        {
            if (b==0)
            {
                System.out.print("PT vô số nghiệm");
            }
            else
            {
                System.out.print("PT vô nghiệm");
            }
        }
        else
        {
            double x=-b/a;
            System.out.print("Nghiệm x="+x);
        }
    }
}
