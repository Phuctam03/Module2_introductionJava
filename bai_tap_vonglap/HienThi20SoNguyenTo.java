package bai_tap_vonglap;

import java.util.Scanner;

public class HienThi20SoNguyenTo {
    public boolean KiemTraSoNguyenTo(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HienThi20SoNguyenTo UD = new HienThi20SoNguyenTo();
        for (int i = 0; i <= 20; i++) {
            if (UD.KiemTraSoNguyenTo(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
