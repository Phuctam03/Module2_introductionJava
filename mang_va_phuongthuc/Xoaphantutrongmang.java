package mang_va_phuongthuc;

import java.util.Scanner;

public class Xoaphantutrongmang {
    public void xoaPhantuTrongmang(int x, int[] mang) {
        int index_del;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] == x) {
                index_del = i;
                for (int j = index_del; j < mang.length - 1; j++) {
                    mang[j] = mang[j + 1];
                }
            }
        }
        for (int i = 0; i < mang.length - 1; i++) {
            System.out.print(mang[i] + " ");
        }
    }


    public static void main(String[] args) {
        Xoaphantutrongmang vd = new Xoaphantutrongmang();
        Scanner sc = new Scanner(System.in);
        int n, mang[];

        System.out.println("nhập số lượng mảng");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập các phần tử trong mảng");
        mang = new int[n];
        for (int i = 0; i < mang.length; i++) {
            mang[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng cũ :");
        for (int i = 0; i < mang.length; i++) {
            System.out.print(+mang[i] + " ");

        }
        System.out.println("nhập phần tử cần xóa ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Mảng mới :");
        vd.xoaPhantuTrongmang(x, mang);

    }
}
