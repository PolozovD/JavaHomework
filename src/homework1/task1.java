package homework1;

import java.util.Scanner;

public class task1 {

    static class Answer {

        public int factorial(int n) {
            if (n <= 0) {
                return -1;
            }
            if (n == 1) {
                return 1;
            }
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static class Printer {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter number 'n': ");
            int n = sc.nextInt();

            Answer ans = new Answer();
            int itresume_res = ans.factorial(n);
            System.out.println(itresume_res);
        }
    }
}
