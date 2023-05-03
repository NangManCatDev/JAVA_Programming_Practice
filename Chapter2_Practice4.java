import java.util.Scanner;

public class Chapter2_Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개 입력>> ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        System.out.println("중간 값은 " + ((num1>num2)?((num1>num3)?num3:num1):((num2>num3)?num3:num2)));

        scanner.close();
    }
}
