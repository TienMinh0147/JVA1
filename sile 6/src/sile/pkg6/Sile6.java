package sile.pkg6;

public class Sile6 {

    public static void main(String[] args) {
        String fullName;
        fullName = KeyBoard.readString("Họ Và Tên");
        String mobile = KeyBoard.readString("Số Điện Thoại");
        System.out.println("Ban tên" + fullName + "SDT là:" + mobile);

    }

}
