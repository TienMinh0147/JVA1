/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pd02930_vantienminh_lab_1;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class bai4 {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ho va Ten:");
        String hoTen= scanner.nextLine();
        System.out.print("Diem TB:");
        double diemTB=scanner.nextDouble();
        System.out.print("ho va ten la:"+ hoTen);
        System.out.printf("diem trung binh la:"+ diemTB);
        System.out.println("hoTen, dienTB, ");
        System.out.printf("%s %fdiem",hoTen,diemTB );
    }
}
