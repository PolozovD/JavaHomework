package homework2;

import java.util.Arrays;

public class task1hw2 {

    static class URLBuilder {
        public static String buildURL(String baseURL, String params) {
            StringBuilder url = new StringBuilder(baseURL);

            if (!"?".equals(url.charAt(url.length()-1))) {
                url.append("?");
            }
            String[] arrParam = params.split("&");
            System.out.println(Arrays.toString(arrParam));

            for (int i = 0; i < arrParam.length; i++) {
                String[] keyValue = arrParam[i].split("=");
                System.out.println(Arrays.toString(keyValue));
                if (!"null".equals(keyValue[1])) {
                    if (i > 0) {
                        url.append("&");
                    }
                    url.append(keyValue[0]).append("=").append(keyValue[1]);
                }
            }
            return url.toString();
        }
    }

    public static class Printer {
        public static void main(String[] args) {
            String baseURL = "";
            String params = "";
            if (args.length == 0) {

                baseURL = "https://example.com/search";
                params = "query=java&sort=desc&filter=null";
            } else {
                baseURL = args[0];
                params = args[1];
            }
            URLBuilder ans = new URLBuilder();
            System.out.println(ans.buildURL(baseURL, params));
        }
    }
}