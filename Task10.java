package StreamTasks;

import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(list.stream().allMatch(x -> x > 0));
    }
}