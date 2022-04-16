/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasile;

import java.util.Scanner;

public class demo_quanlysinhvien {

    public static void main(String[] args) {
        String[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien:");
        int n = sc.nextInt();
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap sinh vien thu %d", i);
            Scanner sc1 = new Scanner(System.in);
            arr[i] = sc1.nextLine();
        }
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i].toUpperCase();
            if ((arr[i].startsWith("NGUYEN")) || (arr[i].endsWith("TUAN"))) 
                System.out.println(arr[i]);
            }
        }
    }

