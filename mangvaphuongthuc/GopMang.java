package mangvaphuongthuc;

import java.util.Scanner;

public class GopMang {
    public void nhapMang(int a[], int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(sc.nextLine());
        }
    }

    public void xuatMang(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public void gopMang(int a[], int b[]) {
        int mangmoi[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            mangmoi[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            mangmoi[i + a.length] = b[i];
        }
        for (int i = 0; i < mangmoi.length; i++) {
            System.out.print(mangmoi[i] + " ");
        }
    } // ????

    public static void main(String[] args) {
        GopMang vd = new GopMang();
        Scanner sc = new Scanner(System.in);
        int a[], n, b[], m;
        System.out.println("Nhập số lượng mảng A :");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập các phần tử trong mảng A  :");
        a = new int[n];
        vd.nhapMang(a, n);
        vd.xuatMang(a, n);
        System.out.println();
        System.out.println("nhập số lượng mảng B :");
        m = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập các phần tử trong mảng :");
        b = new int[m];
        vd.nhapMang(b, m);
        vd.xuatMang(b, m);
        System.out.println();
        vd.gopMang(a, b);
    }
}
