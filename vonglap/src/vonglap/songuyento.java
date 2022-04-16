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
public class songuyento {
    public static void main(String[] args) {
       
        int n,f1=1,f2=1,fn;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n");
        n = sc.nextInt();
        System.out.printf("%5d%5d",f1,f2);
        while (f1+f2<=n){
            fn=f1+f2;
            System.out.printf("%5d",fn);
            f1=f2;
            f2=fn;
            
            
        }
        System.out.printf("\n");
    }
    
}
