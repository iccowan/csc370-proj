import java.util.Arrays;

public class Combo {
    static int n = 4;
    static int m = 2;

    public static boolean moreSoln(int[] check) {
        for (int i = 0; i < check.length; i++)
            if (check[i] != m - 1)
                return true;

        return false;
    }

    public static void combos() {
        int[] spots = new int[n];
        System.out.println(Arrays.toString(spots));

        while (moreSoln(spots)) {
            int i = n - 1;
            int carry = 1;

            while (i >= 0 && carry != 0) {
                if (spots[i] != m - 1) {
                    spots[i] += carry;
                    carry = 0;
                } else {
                    spots[i] = 0;
                }
                i--;
            }

            System.out.println(Arrays.toString(spots));
        }
    }

    public static void main(String[] args) {
        combos();
    }
}
