public class Chapter03_Practice07 {
    public static void main(String[] args) {
        int intArray[] = new int[10];
        int sum = 0;

        System.out.print("랜덤한 정수들 : ");

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int)(Math.random()*10 + 1);
            System.out.print(intArray[i] + " ");
            sum += intArray[i];
        }
        System.out.print("\n평균은 " + (double)sum / intArray.length);
    }
}
