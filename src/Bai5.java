import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double kiemtra=scanner.nextDouble();
        if(kiemtra%3==0&&kiemtra%5==0){
            System.out.println("Chia hết cho cả 3 và 5");
        } else if (kiemtra%3==0&&kiemtra%5!=0) {
            System.out.println("Chỉ chia hết cho 3");
        } else if (kiemtra%3!=0&&kiemtra%5==0) {
            System.out.println("Chỉ chia hết cho 5");
        }else {
            System.out.println("Không chia hết cho cả 3 và 5");
        }
    }
}
