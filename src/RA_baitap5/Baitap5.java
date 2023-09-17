package RA_baitap5;
import  java.util.Scanner;
public class Baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double diemToan, diemLy, diemHoa, diemVan, diemTiengAnh;
        double diemTrungBinh;


        System.out.print("Nhập điểm môn Toán: ");
        diemToan = scanner.nextDouble();

        System.out.print("Nhập điểm môn Lý: ");
        diemLy = scanner.nextDouble();

        System.out.print("Nhập điểm môn Hóa: ");
        diemHoa = scanner.nextDouble();

        System.out.print("Nhập điểm môn Văn: ");
        diemVan = scanner.nextDouble();

        System.out.print("Nhập điểm môn Tiếng Anh: ");
        diemTiengAnh = scanner.nextDouble();


        diemTrungBinh = (diemToan + diemLy + diemHoa + diemVan + diemTiengAnh) / 5;


        String xepLoai;
        if (diemTrungBinh < 5) {
            xepLoai = "Yếu";
        } else if (diemTrungBinh < 6.5) {
            xepLoai = "Trung bình";
        } else if (diemTrungBinh < 8) {
            xepLoai = "Khá";
        } else if (diemTrungBinh < 9) {
            xepLoai = "Giỏi";
        } else {
            xepLoai = "Xuất sắc";
        }


        System.out.println("Điểm trung bình các môn: " + diemTrungBinh);
        System.out.println("Xếp loại học lực: " + xepLoai);


    }
}
