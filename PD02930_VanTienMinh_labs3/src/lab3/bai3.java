package lab3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        short dien;
        long tien;
        System.out.println("nhập số diện tiêu thụ");
        dien=sc.nextShort();
        if (dien<50)
        {
            tien=dien*1000;
            System.out.print("Số tiền phải trả là "+tien);
        }
        else
        {
            tien=(dien-50)*1200 + 50*1000;
            System.out.print("Số tiền phải trả là "+tien);
        }
    }
}
