package PD02930_VanTienMinh_labs5;

public class bai4 {

    public static void main(String[] args) {

        String[] hoTen = {"Tuấn", "Hạnh", "Cường"};
        double[][] diem = {{5, 6, 7}, {7, 9, 5}, {8, 3, 4}};

        for (int i = 0; i < 3; i++) {
            double tong = 0;
            for (int j = 0; j < 3; j++) {
                tong = tong + diem[i][j];
            }
            double trungBinh = tong / 3;
            System.out.println(hoTen[i] + ": " + trungBinh);
        }

    }

}
