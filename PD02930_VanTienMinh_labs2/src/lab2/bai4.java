/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class bai4 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("nhap vao nam la:");
        year = sc.nextInt();
        
        if(year%4==0){
            if(year %100 ==0){
                if (year % 400==0){
                    // năm nhuận là năm chia hết cho 4
                    // nếu năm đó chia hết cho 100 thi chũng phải chia hết cho 400
                    System.out.print("Nam"+year+"la nam nhuan:");
                    //năm chia hết cho 4 và 100 nhưng không chia hết cho 400
                    
                }else {
                    System.out.print("Nam"+year+"Khong phai la nam nhuan:");
                }
                }else{
                //năm choa hết cho 4 nhưng không chia hết cho 100 là năm nhuận
                System.out.print("Nam"+year+"la nam nhuan:");
            }
        }else{
            // năm chai hết cho 4 không phải là năm nhuận
            System.out.println("Nam"+year+"khong phia la nam nhuan");
                    
                    
                }
            }
            
        }
        
              
    

