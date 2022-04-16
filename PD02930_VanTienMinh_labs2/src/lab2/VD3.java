/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd3;


import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class VD3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a:");
        a= sc.nextDouble();
        System.out.println("nhap b");
        b= sc. nextDouble();
        System.out.println("nhap c");
        c= sc.nextDouble();
        
        double max=(a>b)&&(a>c)?a:(b>c)&&(b>a)?b:c;
        
        System.out.println("max:"+max);
        String checktamgiac= (a+b>c)&&(a+c>b)&&(b+c>a)?"Tam Giac":"Ko";
        System.out.println("checkTamGiac");
        
    }

   
    }
    
}
