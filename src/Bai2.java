import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double with = scanner.nextDouble();
        double height=scanner.nextDouble();
        System.out.println("Diện tích hình vuông là " + with*height);
        System.out.println("Chu vi vuông là " + (with+height)*2);

    }
}
