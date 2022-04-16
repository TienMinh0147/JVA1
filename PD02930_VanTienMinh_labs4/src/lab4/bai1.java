package lab4;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int min, max, tong=0,x=0,tb;
        System.out.println("nhập Min");
        min=sc.nextInt();
        System.out.println("nhập Max");
        max=sc.nextInt();
        int i=min;
        while (i<=max)
        {
            if (i % 5 ==0)
            {
                tong+=i;
                x++;
            }
            i++;
        }
        System.out.println("kết quả\n"+(tong/x));
    }
}
