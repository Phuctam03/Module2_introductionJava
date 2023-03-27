package baitapvonglap;

import java.util.Scanner;

public class hienthi20songuyento {
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
        hienthi20songuyento UD = new hienthi20songuyento();
        for (int i = 0; i <= 20; i++) {
            if (UD.KiemTraSoNguyenTo(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
