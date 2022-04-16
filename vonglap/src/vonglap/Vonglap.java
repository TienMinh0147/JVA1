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
public class Vonglap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,giaithua=1;
        System.out.println("Nhập n");
        n= sc.nextInt();
        for(int i=1; i<=n;i++)
            giaithua = giaithua*i;
        System.out.println("giai thua la:"+ giaithua);
        
        
    }
    
}
