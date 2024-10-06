package homework3;

import java.util.ArrayList;
import java.util.Arrays;

public class task3hw3 {

    static class FilterStrings {
        public static String[] filterShortStrings(String[] arr) {
            ArrayList<String> result = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > 3) {
                    result.add(arr[i]);
                }
            }
            String[] resArr = new String[result.size()];
            for (int j = 0; j < result.size(); j++) {
                resArr[j] = result.get(j);
            }
            return resArr;
        }
    }

    public static class Printer {
        public static void main(String[] args) {
            String[] arr;
            if(args.length ==0) {
                arr = new String[]{"cat", "elephant", "dog", "giraffe"};
            } else {
                arr = args[0].split(", ");
            }

            FilterStrings answer = new FilterStrings();
            String itresume_res = Arrays.toString(answer.filterShortStrings(arr));
            System.out.println(itresume_res);
        }
    }
}



