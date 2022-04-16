package keyboard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class Keyboard {
    static Scanner sc=new Scanner(System.in);
  
    static int[] readArrInt(int soPhanTu,String message){
        int[] temp=new int[soPhanTu];
        System.out.println("Nhập mảng " + message);
        for (int i = 0; i < soPhanTu; i++) {
            System.out.print("Phần tử thứ "+i+": ");
            temp[i]=sc.nextInt();
        } 
    return temp;
    }
    static void writeArrInt(int[] ArrInt,int soPhanTu,String message){
        System.out.println("Các phần tử mảng " + message);
        for (int i = 0; i < soPhanTu; i++) {
            System.out.print(" " + ArrInt[i]);            
        }
        System.out.println();
    }

    public static String readString(String họ_và_tên) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static int readInt(String tuổi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean readBoolean(String giới_tính_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static double readDouble(String điểm_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
   