/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MINH
 */
public class labs8 {
     public static void main(String []agrs){
    SanPham sp1= new SanPham();
    sp1.nhap();
    sp1.xuat();
    sp1.setTenSP("Iphone");
    System.out.println(sp1.getTenSP());
    System.out.println("------------------------------");
    SanPham sp2= new SanPham("Smartphone",1000000,1);
    sp2.xuat();
}
}


