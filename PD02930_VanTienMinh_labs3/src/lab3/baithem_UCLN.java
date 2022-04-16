/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class baithem_UCLN {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        a= sc.nextInt();
        System.out.println("nhap b");
        b= sc.nextInt();
        while(a!=0&&b!=0){
            if (a>b) a=a%b;
            else b=b%a;
        }
        if(a!=0)
            System.out.println("UCLN la:"+a);
        else
            System.out.println("UCLN la"+b);
        
    }
    
}
