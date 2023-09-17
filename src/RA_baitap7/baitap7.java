package RA_baitap7;
import  java.util.Scanner;
public class baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        String result = "";

        System.out.print("Nhập một số từ 0 đến 9: ");
        number = scanner.nextInt();

        switch (number) {
            case 0:
                result = "Zero";
                break;
            case 1:
                result = "One";
                break;
            case 2:
                result = "Two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "Four";
                break;
            case 5:
                result = "Five";
                break;
            case 6:
                result = "Six";
                break;
            case 7:
                result = "Seven";
                break;
            case 8:
                result = "Eight";
                break;
            case 9:
                result = "Nine";
                break;
            default:
                result = "Số không hợp lệ";
                break;
        }

        System.out.println("Bằng chữ: " + result);

        scanner.close();
    }
}
