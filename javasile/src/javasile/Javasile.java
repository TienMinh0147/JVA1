package javasile;

import java.util.Scanner;

public class Javasile {

    public static void main(String[] args) {
String userName, passWord;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap userName:");
        userName =sc.nextLine();
        System.out.println("Nhap passWord:");
        passWord = sc.nextLine();
        if(userName.equals("Admin")&&passWord.equals("Abc123"))
            System.out.println("DANG NHAP THANH CONG");
        else{
            System.out.println("DANG NHAP THAT BAI");
        }
    }

}
