package homework4;

import java.util.Deque;
import java.util.LinkedList;

public class task5hw4 {
    private static class DequeTasks {
        public static void removeAllOccurrences(Deque<String> deque, String value) {
            deque.removeIf(element -> element.equals(value));
            System.out.println(deque);
            }
        }

    public static class Printer {
        public static void main(String[] args) {
            Deque<String> deque = new LinkedList<>();
            String value;
            if (args.length < 2) {

                deque.add("apple");
                deque.add("banana");
                deque.add("apple");
                deque.add("cherry");
                value = "apple";
            } else {
                for (int i = 0; i < args.length - 1; i++) {
                    deque.add(args[i]);
                }
                value = args[args.length - 1];
            }
            DequeTasks.removeAllOccurrences(deque, value);
        }
    }
}
