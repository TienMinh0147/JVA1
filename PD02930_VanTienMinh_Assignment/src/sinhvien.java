
import java.util.Scanner;


public class sinhvien {
     String maso; String hoten ; String email;
    double diem;
    void input(){
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mssv: ");
        maso = sc.nextLine();
        System.out.println("Nhập họ và tên: ");
        hoten = sc.nextLine();
        System.out.println("Nhập email: ");
        email = sc.nextLine();
        String gmail = "\\w+@\\w+\\.\\w+";
        
        while (!email.matches(gmail)) {
            
           
            System.out.println("email không đúng");
            System.out.println("Mời nhập lại: ");
            email = sc.next();
        }
        System.out.println("Nhập điểm: ");

        diem = sc.nextDouble();
        while (diem > 10) {
            System.out.println("điểm là số thực 1->10");
            System.out.println("mời nhập lại: ");
            diem = sc.nextDouble();
        }
    }

    void output() {
        

        System.out.println("Mssv:"+maso+"\n"+"Họ Và Tên:"+hoten+"\n"+"Ðiểm:"+diem+"\n"+hocluc()+"\n"+"Email:"+email);
    }

    String hocluc() {
        
        String kq;
        if (diem < 3) {
            kq = "kem";
            
        } else if (diem < 5) {
            kq = "yeu";
            
        } else if (diem < 6.5) {
            kq = "Trung Binh";
            
        } else if (diem < 7.5) {
            kq = "kha";
            
        } else if (diem < 9) {
            kq = "gioi";
            
        } else {
            kq = "xuat Sac";
            
        }
        return kq;
    }

}
    
       
        
            
        
            
        



