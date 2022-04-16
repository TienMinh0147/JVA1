/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class labs6_abif2 {

    static String xepLoai(double diem) {
        String s;
        if (diem < 5) {
            s = "YẾU";
        } else if (diem < 6.5) {
            s = "TRUNG BINH";
        } else if (diem < 7.5) {
            s = "KHÁ";
        } else if (diem < 9) {
            s = "GIỎI";
        } else {
            s = "XUẤT SẮC";
        }
        return s;
    }

    public static void main(String[] args) {
        double diem;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Nhập điểm");
        diem = sc.nextDouble();
        String hocluc = xepLoai(diem);
        System.out.println(hocluc);

    }
}
