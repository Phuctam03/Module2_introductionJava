package mangvaphuongthuc;

import java.util.Scanner;

public class Demsokitutrongchuoi {
    public int demSolanxuathientrongchuoi(char c, String chuoi) {
        int count = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == c) {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demsokitutrongchuoi vd = new Demsokitutrongchuoi();
        String chuoi;
        char c;
        System.out.println("nhập vào một chuỗi");
        chuoi = sc.nextLine();
        System.out.println("nhập vào 1 kí tự");
        c = sc.nextLine().charAt(0);
        System.out.println("Số lần kí tự xuất hiện trong chuỗi :" + vd.demSolanxuathientrongchuoi(c, chuoi));

    }
    }

