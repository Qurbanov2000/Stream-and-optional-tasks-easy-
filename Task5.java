package StreamTasks;

import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list.stream().filter(x -> x % 2 == 0).count());
    }
}
