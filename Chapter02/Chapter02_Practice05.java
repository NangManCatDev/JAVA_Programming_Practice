import java.util.Scanner;

public class Chapter2_Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개를 입력하시오>>");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        if (num1 > num2) {
            if (num1 > num3) {
                if (num2 + num3 > num1) {
                System.out.println("삼각형이 됩니다.");
                } else {
                System.out.println("삼각형이 되지 않습니다.");
                }
            } else {
                if (num1 + num2 > num3) {
                System.out.println("삼각형이 됩니다.");
                } else {
                System.out.println("삼각형이 되지 않습니다.");
                }
            }
        } else {
            if (num2 > num3) {
                if (num1 + num3 > num2) {
                System.out.println("삼각형이 됩니다.");
                } else {
                System.out.println("삼각형이 되지 않습니다.");
                }
            } else {
                if (num1 + num2 > num3) {
                System.out.println("삼각형이 됩니다.");
                } else {
                System.out.println("삼각형이 되지 않습니다.");
                }
            }
        }
        scanner.close();
    }
}
