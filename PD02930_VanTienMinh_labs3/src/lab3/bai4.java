package lab3;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        byte a;
        System.out.println("1. Giải phương trình bậc 1");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("Mời chọn chức năng theo số tương ứng");
        a=sc.nextByte();
        switch (a)
        {
            case 1 : System.out.println("Giải phương trình bậc 1");
                     bai1.main(args);
            break;
            case 2 : System.out.println("Giải phương trình bậ 2");
                     bai2.main(args);
            break;
            case 3 : System.out.println("Tính tiền điện");
                     bai3.main(args);
            break;
            case 4 : System.out.println("Kết thúc");
                     System.exit(a);
            default : System.out.println("Chọn sai! Vui lòng chọn lại!");
            
        }
    }
}
