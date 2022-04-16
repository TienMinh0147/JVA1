package bai1_tinhtong;

import java.util.Scanner;

public class Bai1_tinhtong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập n số nguyên:");
        int n = sc.nextInt();
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tong = tong + i;
        }
        System.out.println("\nTổng n số nguyên là :" + tong);
    }
}
