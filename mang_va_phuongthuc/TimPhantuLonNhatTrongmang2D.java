package mang_va_phuongthuc;

import java.util.Scanner;

public class TimPhantuLonNhatTrongmang2D {
    public int timGiaTriLonNhatTrongMang2D(int mang2D[][]) {
        int max = mang2D[0][0];
        for (int i = 0; i < mang2D.length; i++) {
            if (max < mang2D[i][i]) {
                max = mang2D[i][i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TimPhantuLonNhatTrongmang2D vd = new TimPhantuLonNhatTrongmang2D();
        int mang2D[][], dong, cot;
        System.out.println("Nhập vào số dòng");
        dong = Integer.parseInt(sc.nextLine());
        System.out.println("nhập số cột");
        cot = Integer.parseInt(sc.nextLine());
        mang2D = new int[dong][cot];
        System.out.println("nhập các giá trị mảng 2D ");
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                mang2D[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        for (int i = 0; i < dong; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(mang2D[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Giá trị lớn nhất trong mảng 2D :" + vd.timGiaTriLonNhatTrongMang2D(mang2D));
    }
}
