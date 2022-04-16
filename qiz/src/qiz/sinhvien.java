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
public class sinhvien {

    public String name;
    public double mark;

    public String gethocluc() {
        if (this.mark < 5) {
            return "yeu";
        } else if (this.mark < 7) {
            return "trung binh";
        } else if (this.mark < 8) {
            return "kha";
        } else {
            return "gioi";
        }

    }

    public void print() {
        System.out.println(this.name + "-" + this.mark + "-" + this.gethocluc());
    }
}
