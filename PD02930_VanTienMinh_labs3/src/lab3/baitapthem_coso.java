/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author MINH
 */
public class baitapthem_coso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,coso,tam,du;
        String s = "";
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        coso = sc.nextInt();
        while (coso< 2 || coso>16) {
            System.out.println("Nhập lại cơ số : ");
            coso =sc.nextInt();
        }
        tam = n;
        while (tam!=0) {
            du= tam%coso;
            switch (du) {
                case 10:
                    s = "A" + s;
                    break;
                case 11:
                    s = "B" + s;
                    break;
                case 12:
                    s = "C" + s;
                    break;
                case 13:
                    s = "D" + s;
                    break;
                case 14:
                    s = "E" + s;
                    break;
                case 15:
                    s = "F" + s;
                    break;
                   
                default:
                    s = Integer.toString(du) + s;
                    break;

            }
            tam= tam/coso;

        }
        System.out.println(s);
    }

}
