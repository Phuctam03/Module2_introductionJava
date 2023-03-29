package baitapvonglap;

import java.util.Scanner;

public class hienthicachinh {
    public void InHinhChuNhat(int h, int w) {
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= w; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void InHinhTamGiacVuongCan(int h) {
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void InHinhTamGiacVuongCanGocTren(int h) {
        for (int i = h; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public void InHinhTamGiacCan(int h) {
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= 2 * h - 1; j++) {
                if (j >= h - i + 1 && j <= h + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hienthicachinh UD = new hienthicachinh();

        while (true) {
            int LuaChon;
            int h, w;
            try {
                System.out.println("1.in hình chữ nhật");
                System.out.println("2.in tam giác vuông cân góc dưới trái");
                System.out.println("3.in tam giác vuông cân góc phải trên");
                System.out.println("4.In hình tam giác cân");
                System.out.println("5.thoát chương trình");

                System.out.println("nhập lựa chọn");
                LuaChon = Integer.parseInt(sc.nextLine());
                switch (LuaChon) {
                    case 1:
                        System.out.println("nhập vào chiều cao");
                        h = Integer.parseInt(sc.nextLine());
                        System.out.println("nhập vào chiều rộng");
                        w = Integer.parseInt(sc.nextLine());
                        UD.InHinhChuNhat(h, w);
                        break;
                    case 2:
                        System.out.println("nhập vào chiều cao");
                        h = Integer.parseInt(sc.nextLine());
                        UD.InHinhTamGiacVuongCan(h);
                        break;
                    case 3:
                        System.out.println("nhập vào chiều cao ");
                        h = Integer.parseInt(sc.nextLine());
                        UD.InHinhTamGiacVuongCanGocTren(h);
                        break;
                    case 4:
                        System.out.println("Nhập vào chiều cao :");
                        h = Integer.parseInt(sc.nextLine());
                        UD.InHinhTamGiacCan(h);
                        break;
                    case 5:
                        System.exit(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("nhập lỗi nhập lại");
            }

        }


    }

}

