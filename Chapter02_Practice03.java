import java.util.Scanner;

public class Chapter2_Practice3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("금액을 입력하시오>>");
    int won = scanner.nextInt();

    System.out.println("5만원권 " + (won / 50000) + "개");
    won %= 50000;
    System.out.println("1만원권 " + (won / 10000) + "개");
    won %= 10000;
    System.out.println("5천원권 " + (won / 5000) + "개");
    won %= 5000;
    System.out.println("1천원권 " + (won / 1000) + "개");
    won %= 1000;
    System.out.println("5백원 " + (won / 500) + "개");
    won %= 500;
    System.out.println("100원 " + (won / 100) + "개");
    won %= 100;
    System.out.println("50원 " + (won / 50) + "개");
    won %= 50;
    System.out.println("10원 " + (won / 10) + "개");
    won %= 10;
    System.out.println("5원 " + (won / 5) + "개");
    won %= 5;
    System.out.println("1원 " + (won / 1) + "개");
    won %= 1;

    scanner.close();
    }
}
