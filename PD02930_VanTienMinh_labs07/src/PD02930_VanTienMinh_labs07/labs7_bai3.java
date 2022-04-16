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
public class labs7_bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Họ và Tên: ");
        String ten = sc.nextLine();
        System.out.println("Nhập Email: ");
        String email = sc.nextLine();
        System.out.println("Nhập số điện thoại");
        String sdt = sc.nextLine();
        System.out.println("Nhập chứng minh nhân dân");
        String cmnd = sc.nextLine();
        String cmail = "\\w+@\\w+\\.\\w+";
        if (!email.matches(cmail)) {
            System.out.println("Không đúng định dạng email");
        }
        String csdt = "0\\d{10}";
        if (!sdt.matches(csdt)) {
            System.out.println("Không đúng số điện thoại");
        }
        String ccmnd = "[0-9]{9}";
        if (!cmnd.matches(ccmnd)) {
            System.out.println("Sai số chứng minh nhân dân");
        }
    }
}
