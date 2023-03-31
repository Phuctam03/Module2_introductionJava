package mangvaphuongthuc;

import java.util.Scanner;

public class TinhtongCaccottrongmang2D {
    public int tinhTongCotTrongMang2D(int mang2D[][], int cot) {
        int sum = 0;
        for (int i = 0; i < mang2D.length; i++) {
            sum += mang2D[i][cot];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TinhtongCaccottrongmang2D vd = new TinhtongCaccottrongmang2D();
        int mang2D[][], dong, cot, choncot;
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
        System.out.println("Nhập vào cột muốn tính");
        choncot = Integer.parseInt(sc.nextLine());
        System.out.println("tổng giá trị ở các cột :" + vd.tinhTongCotTrongMang2D(mang2D, choncot));


    }
}
