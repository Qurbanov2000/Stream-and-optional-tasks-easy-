package StreamTasks;

import java.util.List;
import java.util.Optional;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 32, 4, 5, 64, 7, 81, 9, 10);
        Optional<Integer> max = list.stream().max(Integer::compare);
        System.out.println(max.get());
    }
}
