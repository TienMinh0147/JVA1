/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangcuuchuong;

import java.util.Scanner;

public class as {

    public static void main(String[] args) {
        menu();

    }

    static void menu() {
        byte so;
        do{
            System.out.println("Bạn hãy chọn 1 chức năng");
         System.out.println("1.Chọn dánh sách học viên");
        System.out.println("2.Xuất dánh sách học viên");
        System.out.println("3.Tìm kiếm học viên theo khoảng điểm");
        System.out.println("4.Tìm kiếm học viên theo học lực");
        System.out.println("5.Tìm kiếm học viên theo mã số và cập nhật");
        System.out.println("6.Sắp xếp học viên theo điểm");
        System.out.println("7.Xuất 5 học viên có điểm có cao nhất");
        System.out.println("8.Tính điểm trung bình");
        System.out.println("9.Xuất danh sách học viên có điểm trên điểm trung bình của lớp");
        System.out.println("10.Tổng hợp số học viên theo học lực");
        System.out.println("0. KẾT THÚC");
        Scanner sc = new Scanner(System.in);
        so= sc.nextByte();
        switch (so) {
            case 1:
                NhapDs();
                break;
            case 2:
                XuatDl();
                break;
            case 3:
                TimTheoDiem();
                break;
            case 4:
                TinhTheoHocLuc();
                break;
            case 5:
                TInhTheoMsSo();
                break;
            case 6:
                SapSep();
                break;
            case 7:
                Xuat5HV();
                break;
            case 8:
                TinhDTB();
                break;
            case 9:
                XuuatDScoDTB();
                break;
            case 10:
                TongDiemTheoHL();
                break;

            default:
                System.out.println("Nhập sai YC");
                break;

        }
        } while (so!=0);      
            
        }

    private static void NhapDs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void XuatDl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void TimTheoDiem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void TinhTheoHocLuc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void TInhTheoMsSo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void SapSep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void Xuat5HV() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void TinhDTB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void XuuatDScoDTB() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void TongDiemTheoHL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
}
