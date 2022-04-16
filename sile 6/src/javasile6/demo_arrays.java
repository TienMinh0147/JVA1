package javasile6;

import java.util.Scanner;

public class demo_arrays {

    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n");
        n=sc.nextInt();
        arr= new int[n];
        //nhập mảng
        for(int i=0;i<n;i++){
            System.out.printf("Nhập phần tử thứ %d:",i);
            arr[i]= sc.nextInt();
        }
        //xuất mảng
        System.out.println("Mảng ban đầu");
        for(int i=0; i<n;i++){
            System.out.println(""+arr[i]);
            
        }
        System.out.println("");
        Xarray.Sort_Arr(arr);
        //xuất mảng
        System.out.println("Mảng sau khi đổi");
        for(int i=0;i<n;i++){
            System.out.println(""+arr[i]);
        }
        //tìm min
        
        System.out.println("min là :"+Xarray.min(arr));
        System.out.println("Mảng sau khi xuát phâng tử");
        arr=Xarray.remove(arr,2);
        for(int i=0;i<n-1;i++){
            System.out.println(""+arr[i]);
        }
    }
    

}
