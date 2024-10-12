package homework4;

import java.util.LinkedList;

public class task3hw4 {
    static class ListUtils {
        public static int countOccurrences(LinkedList<String> list, String value) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(value)) {
                    count ++;
                }
            }
            return count;
        }
    }

    public static class Printer {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<>();
            String value;
            if (args.length < 2) {

                list.add("apple");
                list.add("banana");
                list.add("apple");
                list.add("pear");
                list.add("banana");
                value = "apple";
            } else {
                for (int i = 0; i < args.length - 1; i++) {
                    list.add(args[i]);
                }
                value = args[args.length - 1];
            }
            ListUtils utils = new ListUtils();
            System.out.println("Occurrences of \"" + value + "\": "
                    + utils.countOccurrences(list, value));
        }
    }

}
