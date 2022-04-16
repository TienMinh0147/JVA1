package lab4;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,i;
        System.out.println("nhập N");
        x=sc.nextInt();
        boolean snt=true;
        for (i=2 ; i<=x/2 ; i++)
        {
            if (x % i == 0)
            {
                snt=false;
                System.out.println(x+" không là số nguyên tố");
                break;
            }
        }
        if (snt==true)
        {
            System.out.println(x+" là số nguyên tố");
        }
    }
}
