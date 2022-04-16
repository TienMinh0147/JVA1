
package lab6;

import java.util.Scanner;


public class Lab6 {

    
    public static void main(String[] args) {
      double a ,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("a=");
        a=sc.nextDouble();
        b=Math.round(Math.random()*15+5);
        System.out.println("b="+b);
        System.out.println("Min a&b:"+Math.min(a, b));
        System.out.println("Pow(a,b"+Math.pow(a,b));
        System.out.println("Round(a,b"+Math.round(b));        
    }
    
}
