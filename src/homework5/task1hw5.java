package homework5;

import java.util.ArrayList;
import java.util.HashMap;

public class task1hw5 {
    static class StudentDirectory {
        private HashMap<String, ArrayList<Integer>> studentMap = new HashMap<>();
        // Добавляет или обновляет запись о студенте
        public void addStudent(String name, Integer grade) {
            studentMap.computeIfAbsent(name, k -> new ArrayList<>()).add(grade);
        }
        // Находит оценки студента по имени
        public ArrayList<Integer> findStudent(String name) {
            return studentMap.getOrDefault(name, new ArrayList<>());
        }
        // Возвращает весь справочник студентов
        public HashMap<String, ArrayList<Integer>> getAllStudents()
        {
            return studentMap;
        }
        // Удаляет запись о студенте по имени
        public void removeStudent(String name) {
            studentMap.remove(name);
        }
    }

        public static void main(String[] args) {
            StudentDirectory directory = new StudentDirectory();
            directory.addStudent("Alice", 90);
            directory.addStudent("Bob", 85);
            directory.addStudent("Alice", 95);
            System.out.println("Before removal:");
            System.out.println(directory.findStudent("Alice")); //[90, 95]
            System.out.println(directory.getAllStudents()); //{Bob=[85], Alice=[90, 95]}
            directory.removeStudent("Alice");
            System.out.println("After removal:");
            System.out.println(directory.findStudent("Alice")); //[]
            System.out.println(directory.getAllStudents()); //{Bob=[85]}
        }
}

