/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vonglap;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class nle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i, n,giaithua=1;
        System.out.println("Nhập n");
        n= sc.nextInt();
        if (n%2==0) i=2;
        else i=1;
        while (i<=n){
            giaithua= giaithua*i;
            i= i+2;
        }
        System.out.println("giai thùa kép là:"+giaithua);
    }
}
