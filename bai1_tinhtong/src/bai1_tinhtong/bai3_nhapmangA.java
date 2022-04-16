package bai1_tinhtong;

import java.util.Scanner;

public class bai3_nhapmangA {

    public static void main(String[] args) {
        int n, sum = 0, temp = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nMảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");

        }
       System.out.println("Mảng sau khi sắp xếp là: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
         
    }
}
    