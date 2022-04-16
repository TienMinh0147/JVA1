
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MINH
 */
public class SanPham {

    private String tenSP;
    private double donGia;
    private double giamGia;

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSP = sc.next();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Giam gia: ");
        giamGia = sc.nextDouble();
    }

    public void xuat() {
        System.out.println("Ten SP: " + tenSP);
        System.out.println("Don gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue: " + getThue());
        System.out.println("Tong tien: " + (donGia - giamGia + getThue()));
    }

    private double getThue() {
        double kq;
        kq = (donGia - giamGia) * 0.1;
        return kq;
    }

    public SanPham() {
        tenSP = "Iphone 5S";
        donGia = 221120;
        giamGia = 99999;
    }

    public SanPham(String ten, double gia, double giamgia) {
        tenSP = ten;
        donGia = gia;
        giamGia = giamgia;
    }
}
