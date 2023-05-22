public class Chapter03_Practice09 {
    public static void main(String[] args) {
        int intArray[][] = new int[4][4];

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                int k = (int)(Math.random()*10 + 1);
                intArray[i][j] = k;
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
