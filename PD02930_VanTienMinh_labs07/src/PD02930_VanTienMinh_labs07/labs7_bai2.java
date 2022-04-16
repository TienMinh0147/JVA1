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
public class labs7_bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Đăng nhập");
        System.out.println("--------------------");
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        if (user.equalsIgnoreCase("FPT")) {
            if (pass.equalsIgnoreCase("polytechnic")) {
                System.out.println("Đăng nhập thành công");
            } else {
                System.out.println("sai mật khẩu");
            }
        } else {
            System.out.println("sai tài khoản");
        }
    }
}
