/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nam_chong;

/**
 *
 * @author MINH
 */
public class thámobiendi {

    public static void main(String[] args) {
        int[] arr = {1, 5, 9};
        int t1 = sum(arr);
        int t2 = sum(7, 8, 9, 10, 11);
        System.out.printf("%d - %d", t1, t2);
    }

    static int sum(int... bien) {
        int tong = 0;
        for (int x : bien) {
            tong += x;
        }
        return tong;
    }
}
