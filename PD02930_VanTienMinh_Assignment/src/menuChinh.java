
import java.util.Scanner;

public class menuChinh {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số lượng SV: ");
        n = sc.nextInt();
        sinhvien sv[] = new sinhvien[n];
        byte a;
        while (true) {
            menu();
            a = sc.nextByte();
            switch (a) {
                case 1:

                    chucnang1(sv, n);
                    break;
                case 2:

                    chucnang2(sv, n);
                    break;
                case 3:

                    chucnang3(sv, n);
                    break;
                case 4:

                    chucnang4(sv, n);
                    break;
                case 5:

                    chucnang5(sv, n);
                    break;
                case 6:

                    chucnang6(sv, n);
                    break;
                case 7:

                    chucnang7(sv, n);
                    break;
                case 8:

                    chucnang8(sv, n);
                    break;
                case 9:

                    chucnang9(sv, n);
                    break;
                case 10:
                    chucnang10(sv, n);
            }
        }
    }

    static void menu() {
        System.out.println("Mời chọn 1 chức năng");

        System.out.println("1.Nhập danh sách học viên.");

        System.out.println("2.Xuất danh sách học viên.");

        System.out.println("3.Tìm kiếm học viên theo khoảng điểm.");

        System.out.println("4.Tìm kiếm học viên theo học lực.");

        System.out.println("5.Tìm học viên theo mã số và cập nhập thông tin học viên.");

        System.out.println("6.Sắp xếp học viên theo điểm.");

        System.out.println("7.Xuất 5 học viên có điểm cao nhất.");

        System.out.println("8.Tính trung bình điểm của lớp.");

        System.out.println("9.Xuất danh sách học viên có điểm trên điểm trung bình của lớp.");

        System.out.println("10.Tổng số học viên theo học lực.");
    }

    //,1.Nhập danh sách sinh viên
    static void chucnang1(sinhvien sv[], int n) {
        for (int i = 0; i < n; i++) {
            sv[i] = new sinhvien();
            System.out.println("");
            sv[i].input();
        }

        System.out.println("");
    }

    // 2.xuất danh sách sinh viên
    static void chucnang2(sinhvien sv[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("");
            sv[i].output();
        }

        System.out.println("");
    }

    // 3.Tìm kiếm học viên theo khoảng điểm nhập từ bàn phím.
    static void chucnang3(sinhvien sv[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập khoảng điểm từ: ");
        double min = sc.nextDouble();
        System.out.println("Đến: ");
        double max = sc.nextDouble();
        for (int i = 0; i < n; i++) {
            if (sv[i].diem >= min && sv[i].diem <= max) {
                sv[i].output();
            }
        }
        System.out.println("");
    }

    // 4.Tìm kiếm học viên theo học lực nhập từ bàn phím 
    static void chucnang4(sinhvien sv[], int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập học lực: ");

        String hluc = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (sv[i].hocluc().equalsIgnoreCase(hluc)) {
                sv[i].output();
            }
        }
        System.out.println("");
        System.out.println("Danh sách học viên có học lực" + " " + hluc + ":");
    }

    // 5.Tìm học viên theo mã số và cập nhật thông tin học viên.
    static void chucnang5(sinhvien[] sv, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập MSSV cần tìm: ");
        String ms = sc.next();
        for (int i = 0; i < n; i++) {
            if (sv[i].maso.equals(ms)) {
                System.out.println("Đã Tìm Thấy");
                System.out.println("Mời thay đổi thông tin: ");
                sv[i].input();
                break;
            }
        }
        System.out.println("");
    }

    // 6.Sắp xếp học viên theo điểm
    static void chucnang6(sinhvien[] sv, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sv[i].diem > sv[j].diem) {
                    double tam = sv[i].diem;
                    sv[i].diem = sv[j].diem;
                    sv[j].diem = tam;
                    String tam2 =sv[i].hoten;
                    sv[i].hoten = sv[j].hoten;
                    sv[j].hoten = tam2;

                }
            }
        }
        System.out.println("Danh sách sinh viên đã được sắp xếp theo điểm: ");
        for (int i = 0; i < n; i++) {

            System.out.println("");
            sv[i].output();

        }
        System.out.println("");
    }

    // 7.Xuất 5 học viên có điểm cao nhất
    static void chucnang7(sinhvien[] sv, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sv[i].diem < sv[j].diem) {
                    double tam = sv[i].diem;
                    sv[i].diem = sv[j].diem;
                    sv[j].diem = tam;
                    String tam2 = sv[i].hoten;
                    sv[i].hoten = sv[j].hoten;
                   sv[j].hoten = tam2;
                }
            }
        }
        if (n < 5) {
            System.out.println("");
            System.out.println("5 Sinh viên có điểm cao nhất: ");
            for (int i = 0; i < n; i++) {
                sv[i].output();
            }
        } else {

            System.out.println("5 Sinh viên có điểm cao nhất: ");
            for (int i = 0; i < 5; i++) {
                sv[i].output();

            }
            System.out.println("");
        }
    }

    // 8.Tính trung bình cộng điểm cả lớp
    static void chucnang8(sinhvien[] sv, int n) {
        float s = 0, dtb;
        for (int i = 0; i < n; i++) {
            s = (float) (s + sv[i].diem);

        }
        dtb = s / n;
        System.out.println("điểm tb cã lớp: " + dtb);
    }

    // 9.Xuất danh sách học viên có điểm trên điểm trung bình của lớp
    static void chucnang9(sinhvien[] sv, int n) {
        float s = 0, dtb;
        for (int i = 0; i < n; i++) {
            s = (float) (s + sv[i].diem);

        }
        dtb = s / n;
        System.out.println("điểm tb cã lớp: " + dtb);
        System.out.println("");
        System.out.println("Danh sách sinh viên có ĐTB trên ĐTB của cả lớp: ");
        for (int i = 0; i < n; i++) {
            if (sv[i].diem > dtb) {
                sv[i].output();
            }
            System.out.println("");
        }

    }

    // 10.Tổng số học viên theo học lực
    static void chucnang10(sinhvien[] sv, int n) {
        String b = "Kha";
        String d = "Gioi";
        String c = "Kem";
        String s = "Xuat Sac";
        String f = "Trung Binh";
        String u = "Yeu";
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (b.equalsIgnoreCase(sv[i].hocluc())) {
                dem = dem + 1;
            }
        }
        System.out.println("Số sinh viên khá:" + dem);
        int y = 0;
        for (int i = 0; i < n; i++) {
            if (d.equalsIgnoreCase(sv[i].hocluc())) {
                y = y + 1;
            }
        }

        System.out.println("Số sinh viên giỏi:" + y);
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (c.equalsIgnoreCase(sv[i].hocluc())) {
                t = t + 1;
            }
        }

        System.out.println("Số sinh viên kém:" + t);
        int sd = 0;
        for (int i = 0; i < n; i++) {
            if (s.equalsIgnoreCase(sv[i].hocluc())) {
                sd = sd + 1;
            }
        }

        System.out.println("Số sinh viên Xuất Sắc:" + sd);
        int r = 0;
        for (int i = 0; i < n; i++) {
            if (u.equalsIgnoreCase(sv[i].hocluc())) {
                r = r + 1;
            }
        }
        System.out.println("Số sinh viên yếu:" + r);
        int e = 0;
        for (int i = 0; i < n; i++) {
            if (f.equalsIgnoreCase(sv[i].hocluc())) {
                e = e + 1;
            }
        }
        System.out.println("Số sinh viên trung bình:" + e);
    }
}
