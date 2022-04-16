/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class chinhphuong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, i;

        n = sc.nextInt();
        for (k = 1; k<n; k++) {
            boolean kt = false;
            for (i = 1; i <= Math.sqrt(k); i++) {
                if (i * i == k) {
                    kt = true;

                }
            }
            if (kt == true) {
                System.out.printf("%6d",k);
            } 
        }System.out.println("");
    }
}
            
                
            

        
    