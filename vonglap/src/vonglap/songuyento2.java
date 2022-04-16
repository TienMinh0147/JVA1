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
public class songuyento2 {
    public static void main(String[] args) {
        int n,dem=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập n:");
        n=sc. nextInt();
        for(int i=2;i<=Math.sqrt(n);i++)
            if (n%i==0) dem++;
        if (dem==0)
            System.out.println("KO");
          
        else
            System.out.println(n+"la SNT");
        
    }
}
