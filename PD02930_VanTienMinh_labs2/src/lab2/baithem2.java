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
public class baithem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double toan,ly,hoa,TB;
        System.out.println("Nhập điểm toán");
        toan = sc.nextDouble();
        System.out.println("Nhập điểm lý");
        ly = sc.nextDouble();
        System.out.println("Nhập điểm hóa");
        hoa = sc.nextDouble();
        TB = (toan +ly + hoa)/3;
   
        if(TB<5)
        System.out.println("Yếu");
   
        else if(TB<6.5)
        System.out.println("Trung Bình");
        else  if(TB<8)
        System.out.println("Khá");
        else
            System.out.println("Giỏi");
        
    }
}
