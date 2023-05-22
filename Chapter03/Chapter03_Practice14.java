import java.util.Scanner;

public class Chapter03_Practice14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score [] = {95, 88, 76, 62, 55};
        boolean check = false;

        System.out.print("과목 이름>>");
        String command = scanner.next();

        while (!command.equals("그만")) {
            for (int i = 0; i < 5; i++) {
                if (command.equals(course[i])) {
                    System.out.println(score[i]);
                    check = true;
                    break;
                }
                check = false;
            }
        
            if (!check) {
                System.out.println("없는 과목입니다.");
            }
            System.out.print("과목 이름>>");
            command = scanner.next();
        }
        scanner.close();
    }
}