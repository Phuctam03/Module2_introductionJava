package mang_va_phuongthuc;

import java.util.Scanner;

public class themPhantuTrongmang {
    public int nhapViTriCanChen(int n, int index) {
        Scanner sc = new Scanner(System.in);
        while (index <= 1 || index >= n - 1) {
            System.out.println("nhập lại vị trí :");
            index = sc.nextInt();
        }
        return index;
    }

    public void themPhanTuTrongMang(int x, int mang[], int index, int n) {
        int mangmoi[] = new int[mang.length + 1];
        for (int i = 0; i < index; i++) {
            mangmoi[i] = mang[i];
            System.out.println(mangmoi[i] + " ");
        }

        mangmoi[index] = x;

        for (int i = index + 1; i < mangmoi.length; i++) { // mangmoi.length = 6 ;
            mangmoi[i] = mang[i - 1];

        }
        System.out.println("Mảng mới :");
        for (int i = 0; i < mangmoi.length; i++) {
            System.out.println(mangmoi[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        themPhantuTrongmang vd = new themPhantuTrongmang();
        int a[], n, index, x;
        System.out.println("nhập số lượng mảng :");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("nhập các phần tử trong mảng");
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("mảng cũ :");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("nhập vào vị trí cần chèn :");
        index = Integer.parseInt(sc.nextLine());
        vd.nhapViTriCanChen(n, index);
        System.out.println("nhập phần tử muốn chèn");
        x = Integer.parseInt(sc.nextLine());
        vd.themPhanTuTrongMang(x, a, index, n);

    }
}
