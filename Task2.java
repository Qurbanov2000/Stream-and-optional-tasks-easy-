package StreamTasks;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = List.of("Ali","Cefer","Samir","Elnur");
        list.stream().map(s->s.toUpperCase()).forEach(System.out::println);
    }
}
