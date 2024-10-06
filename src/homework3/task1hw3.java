package homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class task1hw3 {

    static class FilterNegative {
        public static int[] filterNegative(int[] a) {
            ArrayList<Integer> newArr = new ArrayList<>();

            for (int num : a) {
                if (num >= 0){
                  newArr.add(num);
            }
        }
        int[] resArr = new int[newArr.size()];
                for (int i = 0; i < newArr.size(); i++) {
                    resArr[i] = newArr.get(i);
            }
            return resArr;
        }
    }

    public static class Printer {
        public static void main(String[] args) {
            int[] a;
            if (args.length == 0) {

                        a = new int[]{1, -2, -3, 4, -5, 6};
            } else {
                a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            }
            FilterNegative answer = new FilterNegative();
            String itresume_res =
                    Arrays.toString(answer.filterNegative(a));
            System.out.println(itresume_res);
        }
    }

}
