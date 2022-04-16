package lab3;

import java.util.Scanner;

public class bai2 {
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("nhập a");
        a=sc.nextDouble();
        System.out.println("nhập b");
        b=sc.nextDouble();
        System.out.println("nhập c");
        c=sc.nextDouble();
        if (a==0)
        {
            if (b==0)
            {
                if (c==0)
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
                double x=-c/b;
                System.out.print("Nghiệm x="+x);
            }
        }
        else
        {
            double dt=b*b-4*a*c;
            if (dt<0)
            {
                System.out.print("PT vô nghiệm");
            }
            else if (dt==0)
            {
                double x=-b/(2*a);
                System.out.print("PT có nghiệm kép là "+x);
            }
            else
            {
                double x1,x2;
                x1= (-b+Math.sqrt(dt)) / (2*a);
                x2= (-b-Math.sqrt(dt)) / (2*a);
                System.out.print("PT có 2 nghiệm x1="+x1+", x2="+x2);
            }
        }
    }
}
