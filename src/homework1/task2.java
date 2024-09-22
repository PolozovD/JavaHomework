package homework1;

public class task2 {
    static class Answer {

        public static void printEvenNumb() {
            for (int i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public static class Printer {

        public static void main(String[] args) {
            Answer ans = new Answer();
            ans.printEvenNumb();
        }
    }

}
