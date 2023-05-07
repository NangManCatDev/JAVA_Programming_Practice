import java.util.Scanner;

public class Chapter2_OpenChallenge01 {
    public static void main(String[] args) {
        String cVar = "";
        String yVar = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요. ");
        
        System.out.print("철수 >> ");
        cVar = scanner.next();

        System.out.print("영희 >> ");
        yVar = scanner.next();

        if (cVar.equals("가위")) {
            switch (yVar) {
                case "바위": System.out.println("영희가 이겼습니다."); break;
                case "보": System.out.println("철수가 이겼습니다."); break;
                default: System.out.println("비겼습니다."); break;
            }
        } else if (cVar.equals("바위")) {
            switch (yVar) {
                case "가위": System.out.println("철수가 이겼습니다."); break;
                case "보": System.out.println("영희가 이겼습니다."); break;
                default: System.out.println("비겼습니다."); break;
            } 
        } else {
                switch (yVar) {
                    case "가위": System.out.println("영희가 이겼습니다."); break;
                    case "바위": System.out.println("철수가 이겼습니다."); break;
                    default: System.out.println("비겼습니다."); break;
                }
            }
            scanner.close();
        } 
        
    }
