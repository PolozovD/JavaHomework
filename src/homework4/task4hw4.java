package homework4;

import java.util.Deque;
import java.util.LinkedList;

public class task4hw4 {
    static class DequeTasks {
        public static void rotateDeque(Deque<Integer> deque, int n)
        {
            if (deque.isEmpty()) return;
            int size = deque.size();
            if (n < 0) {
                n += size;
            }
            for (int i = 0; i < n; i++) {
                deque.addLast(deque.removeFirst());
            }
            System.out.println(deque);
        }
    }

    public static class Printer {
        public static void main(String[] args) {
            Deque<Integer> deque = new LinkedList<>();
            int n;
            if (args.length < 1) {

                deque.add(1);
                deque.add(2);
                deque.add(3);
                deque.add(4);
                n = 2;
            } else {
                for (int i = 0; i < args.length - 1; i++) {
                    deque.add(Integer.parseInt(args[i]));
                }
                n = Integer.parseInt(args[args.length - 1]);
            }
            DequeTasks.rotateDeque(deque, n);
        }
    }
}
