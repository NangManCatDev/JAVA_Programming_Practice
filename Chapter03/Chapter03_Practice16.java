import java.util.Random;
import java.util.Scanner;

public class Chapter03_Practice16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        String a [] = {"가위", "바위", "보"};

        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        System.out.print("가위 바위 보!>>");
        String command = scanner.next();

        while (!command.equals("그만")) {
            int i = r.nextInt(3);
            String winner = "";

            if (command.equals("가위")) {
                if (a[i].equals("가위")) winner = "";
                else if (a[i].equals("바위")) winner = "컴퓨터";
                else winner = "사용자";
            } else if (command.equals("바위")) {
                if (a[i].equals("가위")) winner = "사용자";
                else if (a[i].equals("바위")) winner = "";
                else winner = "컴퓨터";
            } else if (command.equals("보")) { 
                if (a[i].equals("가위")) winner = "컴퓨터";
                else if (a[i].equals("바위")) winner = "사용자";
                else winner = "";
            } else {
                System.out.println("다시 입력하십시오.");
                System.out.print("가위 바위 보!>>");
                command = scanner.next();
            }
            
            
            System.out.println("사용자 = " + command + ", 컴퓨터 = " + a[i] + ", " + winner + "가 이겼습니다.");
            System.out.print("가위 바위 보!>>");
            command = scanner.next();
        }
        scanner.close();
    }
}