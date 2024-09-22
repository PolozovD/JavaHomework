package homework1;

import java.util.Scanner;

public class task3 {
    static class Answer {
        public  int sumDigits(int n) {
            int sum = 0;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }
    static public class Printer {
        public static void main(String[] args) {
//            int n = 12345;
            Scanner sc = new Scanner(System.in);
            System.out.println("Please insert 'n': ");
            int n = sc.nextInt();
            if (args.length > 0) {
                n = Integer.parseInt(args[0]);
            }
// Вывод результата на экран
            Answer ans = new Answer();
            int itresume_res = ans.sumDigits(n);
            System.out.println(itresume_res);
        }
    }

}
