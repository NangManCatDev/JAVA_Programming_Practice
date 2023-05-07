import java.util.Scanner;

public class Chapter2_Practice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double radius1 = scanner.nextDouble();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();

        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        
        if (distance >= (radius1 + radius2))
            System.out.println("두 원은 서로 겹치지 않는다.");
        else
            System.out.println("두 원은 서로 겹친다.");

        scanner.close();
    }
}
