import java.util.Scanner;

public class Chapter2_Practice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("달을 입력하세요(1~12)>>");
        int month = scanner.nextInt();

        switch (month) {
            case 1: 
            case 2: 
            case 3: System.out.println("겨울"); break;
            case 4: 
            case 5: 
            case 6: 
            case 7:
            case 8: System.out.println("여름"); break;
            case 9:
            case 10:
            case 11: System.out.println("가을"); break;
            case 12: System.out.println("겨울"); break;
            default: System.out.println("잘못입력"); break;
        }
    scanner.close();
    }
}
