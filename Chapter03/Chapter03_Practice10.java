public class Chapter03_Practice10 {
    public static void main(String[] args) {
        int intArray[][] = new int[4][4];

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                int r = (int)(Math.random()*11);
                intArray[i][j] = r;
                
                int z = 0;
                if (intArray[i][j] == 0 && z <= 6) {
                    z++;
                    System.out.print(intArray[i][j] + " ");
                }
                else if (intArray[i][j] == 0 && z > 6)
                    j--;
                else
                    System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
