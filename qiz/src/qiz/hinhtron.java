/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qiz;

/**
 *
 * @author MINH
 */
public class hinhtron {
    public  double banKinh;
    public double getchuVi(){
    return 2* Math.PI*this.banKinh;
    }
    public double getdientich(){
    return Math.PI*Math.pow(banKinh,2);
    }
    public  void print(){
        System.out.println("ban kinh la :"+this.banKinh);
        System.out.println("chi vi la:"+this.getchuVi());
        System.out.println("dien tich la:"+this.getdientich());
    }
            
}
