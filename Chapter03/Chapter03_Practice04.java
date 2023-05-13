import java.util.Scanner;

public class Chapter03_Practice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String s = scanner.next();
        char c = s.charAt(0);   // 문자열의 첫 번째 문자

        for (char i = 97; i <= c; i++){
            for(char j = i; j <= c; j++)
                System.out.print(j);
        System.out.println();
        }
        scanner.close();
    }
}
