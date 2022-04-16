package keyboard;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MINH
 */
public class xarray {
     static void swap(int[] a,int i,int j){
        int temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void swap(String[] a,int i,int j){
        String temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void swap(double[] a,int i,int j){
        double temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}

