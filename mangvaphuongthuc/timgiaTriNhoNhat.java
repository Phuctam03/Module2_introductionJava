package mangvaphuongthuc;

import java.util.Scanner;

public class timgiaTriNhoNhat {
    public int timGiaTrinhoNhatTrongmang(int mang[]) {
        int min = mang[0];
        for (int i = 0; i < mang.length; i++) {
            if (min > mang[i]) {
                min = mang[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        timgiaTriNhoNhat vd = new timgiaTriNhoNhat();
        int mang[], n;
        System.out.println("nhập số lượng mảng ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập các phần tử trong mảng");
        mang = new int[n];
        for (int i = 0; i < mang.length; i++) {
            mang[i] = sc.nextInt();
        }
        for (int i = 0; i < mang.length; i++) {
            System.out.print(mang[i] + " ");
        }
        System.out.println("Giá trị nhỏ nhất :" + vd.timGiaTrinhoNhatTrongmang(mang));

    }

}
