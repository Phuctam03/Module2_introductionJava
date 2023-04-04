package bai_tap_vonglap;

public class HienThiSoNguyenToNhoHon100 {
    public boolean KiemTrasoNguyenTo(int n) {
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
        HienThiSoNguyenToNhoHon100 UD = new HienThiSoNguyenToNhoHon100();
        for (int i = 2; i <= 100; i++) {
            if (UD.KiemTrasoNguyenTo(i)) {
                System.out.println(i + " ");
            }

        }

    }
}
