import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("2자리수 정수 입력");
        int in = scanner.nextInt();
        int num1 = in / 10;
        int num2 = in % 10;

        if (num1 == num2)
            System.out.print("Yes! 10의 자리와 1의 자리가 같습니다.");
        else
            System.out.print("No! 10의 자리와 1의 자리가 다릅니다.");
        scanner.close();
    }
}
