/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import keyboard.Keyboard;

/**
 *
 * @author MINH
 */
public class labs6_bai4 {

    public static void main(String[] args) {
        int[] ArrInt;
        ArrInt = Keyboard.readArrInt(5, "ArrInt");
        Keyboard.writeArrInt(ArrInt, 5, "ArrInt");

        XArrays.swap(ArrInt, 2, 4);
        System.out.println("Mảng sau khi tráo");
        Keyboard.writeArrInt(ArrInt, 5, "ArrInt");

    }

    