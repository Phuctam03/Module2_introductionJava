package bt1;

import java.util.Scanner;

public class ungdungchuyendoichuthanhso {

    public void ChuyenDoiSoBaChuSo(int so) {
        int tram;
        int chuc;
        int donvi;
        if (so <= 10) {
            switch (so) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
            }

        }
        if (so > 10 && so <= 20) {
            switch (so) {
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirdteen");
                    break;
                case 14:
                    System.out.println("FourTeen");
                    break;
                case 15:
                    System.out.println("FiveTeen");
                    break;
                case 16:
                    System.out.println("SixTeen");
                    break;
                case 17:
                    System.out.println("SevenTeen");
                    break;
                case 18:
                    System.out.println("EightTeen");
                    break;
                case 19:
                    System.out.println("NineTeen");
                    break;
                case 20:
                    System.out.println("TwenTy");
                    break;

            }
        }
        if (so > 20 && so <= 99) {
            chuc = so / 10;
            donvi = so % 10;
            switch (chuc) {
                case 2:
                    System.out.println("Twenty");
                    break;
                case 3:
                    System.out.println("Thirdty");
                    break;
                case 4:
                    System.out.println("Fourty");
                    break;
                case 5:
                    System.out.println("Fivety");
                    break;
                case 6:
                    System.out.println("Sixty");
                    break;
                case 7:
                    System.out.println("Seventy");
                    break;
                case 8:
                    System.out.println("Eightty");
                    break;
                case 9:
                    System.out.println("Ninety");
                    break;
            }
            switch (donvi) {
                case 0:
                    System.out.println("Even");
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

        }
        if (so >= 100) {
            tram = so / 100;
            chuc = (so % 100) / 10;
            donvi = (so % 100) % 10;
            switch (tram) {
                case 1:
                    System.out.println("One Hundred ");
                    break;
                case 2:
                    System.out.println("Two Hundred ");
                    break;
                case 3:
                    System.out.println("Three Hundred");
                    break;
                case 4:
                    System.out.println("Four Hundred");
                    break;
                case 5:
                    System.out.println("Five Hundred");
                    break;
                case 6:
                    System.out.println("Six Hundred");
                    break;
                case 7:
                    System.out.println("Seven Hundred");
                    break;
                case 8:
                    System.out.println(" Eight Hundred");
                    break;
                case 9:
                    System.out.println("Nine Hundred");
                    break;
            }
            switch (chuc) {
                case 0:
                    if (donvi == 0) {
                        System.out.println("Even");
                    } else {
                        System.out.println("Odd");
                    }
                    break;
                case 1:
                    System.out.println("Ten");
                    break;
                case 2:
                    System.out.println("Twenty");
                    break;
                case 3:
                    System.out.println("Thirdty");
                    break;
                case 4:
                    System.out.println("Fourty");
                    break;
                case 5:
                    System.out.println("Fivety");
                    break;
                case 6:
                    System.out.println("Sixty");
                    break;
                case 7:
                    System.out.println("Seventy");
                    break;
                case 8:
                    System.out.println("Eightty");
                    break;
                case 9:
                    System.out.println("Ninety");
                    break;

            }
            switch (donvi) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

        }
    }

    public static void main(String[] args) {
        ungdungchuyendoichuthanhso UD = new ungdungchuyendoichuthanhso();
        Scanner sc = new Scanner(System.in);
        int so;
        do {
            System.out.println("nhập vào một số (Dưới 999)");
            so = Integer.parseInt(sc.nextLine());
            UD.ChuyenDoiSoBaChuSo(so);

        } while (so < 999);

    }
    }

