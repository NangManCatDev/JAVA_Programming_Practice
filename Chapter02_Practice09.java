import java.util.Scanner;

public class Chapter2_Practice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원의 중심과 반지름 입력>>");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double radius = scanner.nextDouble();

        System.out.print("점 입력>>");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        if (distance <= radius)
            System.out.println("점 (" + x2 + "," + y2 + ")는 원 안에 있다.");
        else
            System.out.println("점 (" + x2 + "," + y2 + ")는 원 밖에 있다.");
        
        scanner.close();
    }
}
