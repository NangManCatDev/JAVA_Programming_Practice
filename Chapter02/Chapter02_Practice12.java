import java.util.Scanner;

public class Chapter02_Practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");
        double num1 = scanner.nextDouble();
        String operator = scanner.next();
        double num2 = scanner.nextDouble();
        
        if (operator.equals("+"))
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        else if (operator.equals("-"))
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        else if (operator.equals("*"))
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        else if (operator.equals("/"))
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        else
            System.out.println("잘못입력");

        scanner.close();
    }
}
