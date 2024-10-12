package homework4;

import java.util.LinkedList;

public class task1hw4 {
    static class LLTasks {
        public static void removeOddLengthStrings(LinkedList<String> ll) {
//            for (int i = 0; i < ll.size(); i++) {
//                if (ll.get(i).length() % 2 != 0){
//                    ll.remove(i);

                LinkedList<String> removeString = new LinkedList<>();
                for ( String s : ll ) {
                    if (s.length() % 2 != 0){
                        removeString.add(s);
                }
            }
            ll.removeAll(removeString);
        }
    }

    public static class Printer {
        public static void main(String[] args) {
            LinkedList<String> ll = new LinkedList<>();
            if (args.length == 0) {
                ll.add("apple");
                ll.add("banana");
                ll.add("pear");
                ll.add("grape");
            } else {
                for (String arg : args) {
                    ll.add(arg);
                }
            }
            LLTasks answer = new LLTasks();
            System.out.println(ll);
            answer.removeOddLengthStrings(ll);
            System.out.println(ll);
        }
    }

}
