import java.util.Scanner;
import java.util.Random;

public class Chapter03_OpenChallenge01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String ys = "y";
        while (ys.equals("y")) {
            int a = 0, b = 99, count = 0;
            int answer = random.nextInt(100);

            System.out.println("수를 결정하였습니다. 맞추어보세요.");
            System.out.println(a + " ~ " + b);
            System.out.print(++count + " >> ");
            int user = scanner.nextInt();

            while (user != answer) {
                if (user < answer) {
                    System.out.println("더 높게");
                    a = user;
                }
                else {
                    System.out.println("더 낮게");
                    b = user;
                }
                System.out.println(a + " ~ " + b);
                System.out.print(++count + " >> ");
                user = scanner.nextInt();
            }
            System.out.println("맞았습니다.");
            System.out.print("다시하시겠습니까? (y/n) >> ");
            ys = scanner.next();
        }
        scanner.close();
    }
}
