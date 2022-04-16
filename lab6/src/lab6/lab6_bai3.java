package lab6;

import keyboard.Keyboard;


public class lab6_bai3 {
public static void main(String[] args) {
        String fullName=Keyboard.readString("Họ và tên:");
        int tuoi=Keyboard.readInt("Tuổi:");
        double diem=Keyboard.readDouble("Điểm: ");
        boolean gioiTinh=Keyboard.readBoolean("Giới tính: ");
        System.out.println(fullName+" : "+tuoi+" : "+diem+" : "+gioiTinh);
    }
}
    
