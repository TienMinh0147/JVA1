/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs7_bai1;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class Labs7_bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        hoTen = hoTen.trim();
        int t1 = hoTen.indexOf("");
        String ho = hoTen.substring(0, t1);
        ho = ho.toUpperCase();
        System.out.println("Ho" +ho);
        t1=hoTen.lastIndexOf(" ");
        int t2 = hoTen.lastIndexOf(hoTen);
        String ten = hoTen.substring(t2 + 1);
        ten = ten.toUpperCase();
        System.out.println("ten:" + ten);
        String tenDem = hoTen.substring(t1 + 1, t2);
        System.out.println("Ten diem" + tenDem);
    }

}
