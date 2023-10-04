import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toan = scanner.nextDouble();
        double ly = scanner.nextDouble();
        double hoa = scanner.nextDouble();
        double van = scanner.nextDouble();
        double tienganh = scanner.nextDouble();
        double trungbinh = (toan + ly + hoa + van + tienganh) / 5;
        if (trungbinh >= 0 && trungbinh <= 5) {
            System.out.println(trungbinh +  "Xếp loai yếu");
        } else if (trungbinh < 6.5) {
            System.out.println(trungbinh + "Xếp loại trung bình");
        } else if (trungbinh < 8) {
            System.out.println(trungbinh + "Xếp loại Khá");

        } else if (trungbinh < 9) {
            System.out.println(trungbinh + "Xếp loại giỏi");
        } else if (trungbinh <= 10) {
            System.out.println(trungbinh + "Xếp loại xuất sắc");
        } else {
            System.out.println("Không thể xếp loại");
        }
    }
}