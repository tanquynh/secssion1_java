package RA_baitap4;
import java.util.Scanner;
public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh dài");
        double length = sc.nextDouble();
        System.out.print("Nhập cạnh ngắn");
        double height = sc.nextDouble();
        double perimeter = 2 * (length * height);
        double area = length * height;
        System.out.println(("Chu vi hình chữ nhật là : " + perimeter ));
        System.out.println(("Diện tích hình chữ nhật là : " + area ));

    }
}
