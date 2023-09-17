package RA_baitap6;

import java.util.Scanner;

public class baitap6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number;
        String mes = "";

        System.out.print("Nhập một số: ");
        number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            mes = " chia hết cho cả 3 và 5.";
        } else if (number % 3 == 0) {
            mes = " chỉ chia hết cho 3.";
        } else if (number % 5 == 0) {
            mes = " chỉ chia hết cho 5.";
        } else {
            mes = " không chia hết cho 3, cũng không chia hết cho 5.";
        }

        System.out.println( number + mes);

        scanner.close();
    }
}
