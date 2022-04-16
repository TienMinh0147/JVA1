
package labs5;
import java.util.Scanner;
public class bai2 {
   
    public static String getHocLuc(double diem) {
        String hocLuc;
        if (diem < 5) {
            hocLuc = "YẾU";
        } else if (diem < 6.5) {
            hocLuc = "Trung Bình";
        } else if (diem < 7.5) {
            hocLuc = "Khá";
        } else if (diem < 9) {
            hocLuc = "Giỏi";
        } else {
            hocLuc = "xuất xắc";           
        }
         return hocLuc;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        n = sc.nextInt();
        String[] hoTen = new String[n];
        double[] diem = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("nhập sinh viên thứ %d", i + 1);
            System.out.println("\nhọ tên :");
            Scanner tam = new Scanner(System.in);
            hoTen[i] = tam.nextLine();
            System.out.println("\nđiểm :");
            diem[i] = sc.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(hoTen[i] + "-" + diem[i] + "-" + getHocLuc(diem[i]));
        }
    }
}

