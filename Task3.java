package StreamTasks;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = List.of("Ali","Cefer","Samir","Elnur");
        list.stream().filter(s -> s.length() >= 5).forEach(System.out::println);
    }
}
