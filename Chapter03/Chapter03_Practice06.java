import java.util.Scanner;

public class Chapter03_Practice06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오>>");
        int won = scanner.nextInt();
        int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        for (int i = 0; i < unit.length; i++) {
            int divided = won / unit[i];
            int remain = won % unit[i];
            if (divided > 0)
                System.out.println(unit[i] + "원 짜리 : " + divided + "개");
            won = remain;
        }
        scanner.close();
    }
}

// Look Good To Me :D