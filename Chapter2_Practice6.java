import java.util.Scanner;

public class Chapter2_Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1~99 사이의 정수를 입력하시오 >>");
        int num1 = scanner.nextInt();

        if (num1 >= 1 && num1 <= 99)
            if (num1 / 10 % 3 == 0)
                if (num1 % 10 % 3 == 0 && num1 % 10 != 0)
                    System.out.println("박수짝짝");
                else
                    System.out.println("박수짝");
            else if (num1 % 10 % 3 == 0 && num1 % 10 != 0)
                System.out.println("박수짝");
            else
                System.out.println(num1);
        else
            System.out.println("잘못된 숫자가 입력되었습니다.");

        scanner.close();
    }
}
