import java.util.Scanner;

public class Chapter2_Practice8 {
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
        if ((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
            return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점 (x1,y1)를 입력하시오.");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("점 (x2,y2)를 입력하시오.");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (inRect(100, 100, x1, y1, x2, y2) || inRect(200, 200, x1, y1, x2, y2))
            System.out.println("충돌합니다.");
        else
            System.out.println("충돌하지 않습니다.");

        scanner.close();
    }
}
