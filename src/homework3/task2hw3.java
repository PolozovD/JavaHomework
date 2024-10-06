package homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class task2hw3 {
    static class UniqueElements {
        public static int[] getUniqueElements(int[] a) {

            ArrayList<Integer> result = new ArrayList<>();

            for (int i = 0; i < a.length; i++) {
                if(!result.contains(a[i])) {
                    result.add(a[i]);
                }
            }

            int[] resArr = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                resArr[i] = result.get(i);
            }
            return resArr;
        }
    }


    static public class Printer {
        public static void main(String[] args) {
            int[] a;
            if (args.length == 0) {

                a = new int[]{1, 2, 2, 3, 4, 4, 5, 4, 2};
            } else {
                a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            }

            UniqueElements answer = new UniqueElements();
            String itresume_res = Arrays.toString(answer.getUniqueElements(a));
            System.out.println(itresume_res);
        }
    }
}
