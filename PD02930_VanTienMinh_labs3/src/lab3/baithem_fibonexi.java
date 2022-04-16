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
public class baithem_fibonexi {
    public static void main(String[] args) {
        int n,f1=1,f2=1,fn;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:"); 
        n = sc.nextInt();
        while(f1+f2<=n){
            fn=f1+f2;
            System.out.printf("%5d",fn);
            f1=f2;
            f2=fn;
        }
       
        
    }
}
