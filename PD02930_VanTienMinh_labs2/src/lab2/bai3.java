/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd3;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class bai3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem toan:");
        double t = sc.nextDouble();
        // diem toan
        System.out.println("nhap diem ly:");
        double l = sc.nextDouble();
        // diem ly
        System.out.println("nhap diem hoa:");
        double h = sc.nextDouble();
        // diem hoa
        double tb = (t*3)+(l*2)+(h*1)/6;
        // diem trung binh cong chia cho 6
        System.out.println("trung binh:"+tb);
        
        
        
        
        
    }
}
