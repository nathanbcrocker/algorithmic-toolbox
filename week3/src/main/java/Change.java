import java.util.Scanner;

public class Change {

    private static int[] denominations = {10,5,1};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }

    public static int getChange(int m) {
        int numberOfCoins = 0, i = 0;
        while (m > 0 && i < denominations.length) {
            if (m >= denominations[i]) {
                numberOfCoins++;
                m -= denominations[i];
            } else {
                i++;
            }
        }

        return numberOfCoins;
    }
}

