/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class NewClass {
    public static void main(String[] args) {
        int i,n, giaiThua=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n");
        n= sc.nextInt();
        if(n%2==0) i=2;
        else i=1;
        while (i<=n){
            giaiThua =giaiThua*1;
            i=i+2;
            
        }
        System.out.println("giai thừa kép là");
    }
}
