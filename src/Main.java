public class Main {
    public static void main(String[] args) {
        int[] number = new int[] {1, 2, 3};
        double[] numberDot = new double[] {1.57, 7.654, 9.986};
        int[] arbitraryArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println(number[0]+ ", " + number[1] + ", " + number[2]);
        System.out.println(numberDot[0]+ ", " + numberDot[1] + ", " + numberDot[2]);
        for (int i = 0; i < arbitraryArray.length; i++) {
            if (i == (arbitraryArray.length - 1)) {
                System.out.print(arbitraryArray[i]);
            } else System.out.print(arbitraryArray[i] + ", ");
        }

        System.out.println();
        System.out.println(number[2]+ ", " + number[1] + ", " + number[0]);
        System.out.println(numberDot[2]+ ", " + numberDot[1] + ", " + numberDot[0]);
        for (int t =  9; t > -1; t--) {
            if (t == 0) {
                System.out.print(arbitraryArray[t]);
            } else System.out.print(arbitraryArray[t] + ", ");
        }

        System.out.println();
        for (int u = 0; u < 3; u++) {
            if (number[u] % 2 != 0) {
                number[u] = number[u] + 1;
                System.out.println(number[u]);
            } else {
                System.out.println(number[u]);
            }
        }
    }
}