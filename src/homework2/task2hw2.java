package homework2;

public class task2hw2 {

    static class CSVGenerator {
        public static String generateCSV(String[] headers, String[][] data) {

            StringBuilder csv = new StringBuilder();
            csv.append(String.join(",", headers)).append("\n");

            for (String[] row : data) {
                csv.append(String.join(",", row)).append("\n");
            }
            return csv.toString().trim();
        }
    }


    public static class Printer {
        public static void main(String[] args) {
            String[] headers = {};
            String[][] data = {};
            if (args.length == 0) {

                headers = new String[]{"Name", "Age", "City"};
                data = new String[][] {
                        {"John", "30", "New York"},
                        {"Alice", "25", "Los Angeles"},
                        {"Bob", "35", "Chicago"}
                };
            } else {
// Преобразование строковых параметров в массивы
// Пример обработки данных можно дополнить в зависимости от формата args
            }
            CSVGenerator ans = new CSVGenerator();
            System.out.println(ans.generateCSV(headers, data));
        }
    }
}

