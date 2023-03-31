package mangvaphuongthuc;

import java.util.Scanner;

public class Tong2duongcheo {
    public int tong2duongcheomang2D(int mang2D[][]) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < mang2D.length; i++) {
            sum1 += mang2D[i][i];
            sum2 += mang2D[i][mang2D.length - i - 1];
        }
        return sum1 + sum2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tong2duongcheo vd = new Tong2duongcheo();
        int mang2D[][], dong, cot;
        System.out.println("nhập vào số dòng :");
        dong = Integer.parseInt(sc.nextLine());
        System.out.println("nhập vào số cột :");
        cot = Integer.parseInt(sc.nextLine());
        mang2D = new int[cot][dong];
        System.out.println("nhập các giá trị");
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < dong; j++) {
                mang2D[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < dong; j++) {
                System.out.print(mang2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tổng 2 đường chéo :" + vd.tong2duongcheomang2D(mang2D));

    }
}
