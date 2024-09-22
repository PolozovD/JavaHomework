package homework1;

import java.util.Scanner;

public class task4 {
    static class Answer {

        // Функция для нахождения максимума из двух чисел
        public int finMaxOfTwo(int a, int b) {
            return (a > b) ? a : b;
        }

        public int findMaxOfThree(int a, int b, int c) {
            return (finMaxOfTwo(a, b) > c) ? finMaxOfTwo(a, b) : c;
        }
    }

    static public class Printer {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please insert number's a, b, c: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            Answer ans = new Answer();
            int itresume_res = ans.findMaxOfThree(c, b, c);
            System.out.println(itresume_res);
        }
    }


}
