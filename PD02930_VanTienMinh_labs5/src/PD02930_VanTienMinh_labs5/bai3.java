/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labs5;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng");
        int n = sc.nextInt();
        System.out.println("Nhập số cột của mảng");
        int m = sc.nextInt();
        int a[][]= new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.printf("Nhập phàn tử thứ["+i+","+j+"]:");
                a[i][j]=sc.nextInt();            
        }
    }
        System.out.println("Mẩng vừa nhập:");
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]+" ");
            }
        System.out.println("");
                
}
}
