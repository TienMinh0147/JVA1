
package labs5;

import java.util.Scanner;


public class Labs5bai1 {

   
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhập N: ");
        n = sc.nextInt();
        String[] hoTen = new String[n];
        double[] diem = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập sinh viên số %d:", i+1);
            System.out.printf("\nnHọ Tên: ");
            Scanner tam=new Scanner(System.in);
            hoTen[i]=sc.nextLine();
            System.out.print("Điểm: ");
            diem[i]=sc.nextDouble();
            
        }
        //Xuat
        for (int i = 0; i < 10; i++) {
            System.out.printf("Sinh viên thứ %d %s - % .2f", i+1, hoTen[i],diem[i]);
        
    }
       
    }
}
    
    

