/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class baithem1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, x, x1, x2, delta;
        System.out.print("Nhập a:");
        a = sc.nextDouble();
        System.out.print("Nhập b :");
        b = sc.nextDouble();
        System.out.print("Nhập c:");
        c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) 
                    System.out.println("Phương trình có vô số nghiệm.");
                else 
                    System.out.println("Phương trình vô nghiệm.");
                }
            else {
                x = -c / b;
                System.out.println("Phương trình có nghiệm:" + x);
            }
            }
            delta = b * b - (4 * a * c);
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                x = -b / 2 * a;
                System.out.println("Phương trình có nghiệm :" + x);
            } else {
                x1 = (-b + Math.sqrt(delta)) / 2 * a;
                x2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.printf("Phương trình có nghiệm là: %.2f\n", x1, x2);

            }
        }
    }


