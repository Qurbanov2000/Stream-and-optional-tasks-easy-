package StreamTasks;

import java.util.List;
import java.util.Optional;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 32, 4, 5, 64, 7, 81, 9, 10);
        Optional<Integer> findFirst = list.stream().filter(x -> x>10).findFirst();
        System.out.println(findFirst.get());
    }
}
