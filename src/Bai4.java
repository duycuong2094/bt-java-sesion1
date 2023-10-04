import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int tram = number / 100;
        int chuc = number % 100 / 10;
        int donvi = number % 10;
        int[] mangSo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] Chu = {"một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        if (number >= 100 && chuc != 0 && donvi != 0) {
            for (int i = 0; i < mangSo.length; i++) {
                if (tram == mangSo[i]) {
                    for (int j = 0; j < mangSo.length; j++) {
                        if (chuc == mangSo[j]) {
                            for (int k = 0; k < mangSo.length; k++) {
                                if (donvi == mangSo[k]) {
                                    System.out.println(Chu[i] + "trăm" + Chu[j] + "Mươi" + Chu[k]);
                                }
                            }
                        }
                    }
                }
            }
        } else if (number >= 100 && chuc == 0 && donvi != 0) {
            for (int i = 0; i < mangSo.length; i++) {
                if (tram == mangSo[i]) {
                    for (int j = 0; j < mangSo.length; j++) {
                        if (donvi == mangSo[j]) {
                            System.out.println(Chu[i] + "trăm" + "linh" + Chu[j]);
                        }
                    }
                }
            }
        } else if (number >= 100 && chuc == 0 && donvi == 0) {
            for (int i = 0; i < mangSo.length; i++) {
                if (tram == mangSo[i]) {
                    System.out.println(Chu[i] + "Trăm");
                }
            }
        } else if (number < 100 && number >= 10 && donvi != 0) {
            for (int i = 0; i < mangSo.length; i++) {
                if (chuc == mangSo[i]) {
                    for (int j = 0; j < mangSo.length; j++) {
                        if (donvi == mangSo[j]) {
                            System.out.println(Chu[i] + "mươi" + Chu[j]);
                        }
                    }
                }
            }
        } else if (number < 100 && number >= 10 && donvi == 0) {
            for (int i = 0; i < mangSo.length; i++) {
                if (chuc == mangSo[i]) {
                    System.out.println(Chu[i] + "mươi");
                }
            }
        } else if (number < 10) {
            for (int i = 0; i < mangSo.length; i++) {
                if (mangSo[i] == donvi) {
                    System.out.println(Chu[i]);
                }
            }
        }
    }
}




