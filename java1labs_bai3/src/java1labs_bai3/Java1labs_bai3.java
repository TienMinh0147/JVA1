package java1labs_bai3;

import java.util.Scanner;

public class Java1labs_bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();
        String mauEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        String email = sc.nextLine();
        if (!email.matches(mauEmail)) {
            System.out.println("Nhập sai định dạng email");
        }
        String mauMobile = "0\\d{9}";
        String mobile = sc.nextLine();
        if (!mobile.matches(mauMobile)) {
            System.out.println("Nhập sai định dạng mobile");
        }
        String mauID = "\\d{9}";
        String id = sc.nextLine();
        if (!id.matches(mauID)) {
            System.out.println("Nhập sai định dạng chứng minh nhân dân");
        }

    }

}
