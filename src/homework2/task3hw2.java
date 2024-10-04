package homework2;

import java.util.Arrays;

public class task3hw2 {

    static class TextCleaner {
        public static String removeEmptyLines(String text) {

            String[] lines = text.split("\n");
            System.out.println(Arrays.toString(lines));
            StringBuilder deleteEmptyString = new StringBuilder();

            for (String line : lines) {
                if (!line.trim().isEmpty()) {
                    if (deleteEmptyString.length() > 0) {
                        deleteEmptyString.append("\n");
                    }
                    deleteEmptyString.append(line);
                }
            }
            return deleteEmptyString.toString();
        }
    }

    public static class Printer {
        public static void main(String[] args) {
            String text = "";
            if (args.length == 0) {

                text = "line1\n\nline2\n\nline3";
            } else {
                text = args[0];
            }
            TextCleaner ans = new TextCleaner();
            System.out.println(ans.removeEmptyLines(text));
        }
    }
}
