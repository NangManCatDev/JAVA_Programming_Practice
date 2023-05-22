import java.util.Scanner;
import java.util.Arrays;

public class Chapter03_Practice08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("정수 몇개?");
        int num = scanner.nextInt();
        int intArray[] = new int[num];

        for (int j = 0; j < intArray.length; j++) {
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = (int)(Math.random()*100 + 1);
                for (j = 0; j < i; j++) {
                    if (intArray[i] == intArray[j]) {
                        i--;
                        break;
                    }
                }
            }
            for (int i = 1; i <= intArray.length; i++) {
                System.out.printf("%3d", intArray[i - 1]);
                if (i % 10 == 0) {
                    System.out.println();
                }
            }

            Arrays.sort(intArray);
                System.out.println();
            for (int i : intArray) {
                System.out.print("[" + i + "]");
            }
        }
    scanner.close();   
    }
}