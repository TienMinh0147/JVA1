package bai1_tinhtong;

import java.util.Scanner;

public class bai2_UCLN_BCNN {

    public static void main(String[] args) {

        int a, b, UCLN, tich;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a:");
        a = sc.nextInt();
        System.out.print("Nhập b:");
        b = sc.nextInt();
        tich = a * b;
        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            UCLN = b;
        } else {
            UCLN = a;
        }
        System.out.println("UCLN là:" + UCLN);
        System.out.println("BCNN là:" + tich / UCLN);

    }
}
