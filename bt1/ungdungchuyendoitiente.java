package bt1;

import java.util.Scanner;

public class ungdungchuyendoitiente {
    public int ChuyenDoiTien(int USD) {

        return USD * 23000;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ungdungchuyendoitiente UD = new ungdungchuyendoitiente();
        int USD;
        do {
            System.out.println("Nhập vào giá trị USD :");
            USD = sc.nextInt();
            System.out.println("Giá trị của VND" + UD.ChuyenDoiTien(USD));
        } while (USD > 0);

    }

}
