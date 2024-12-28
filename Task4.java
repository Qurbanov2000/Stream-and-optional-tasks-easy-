package StreamTasks;

import java.util.List;
import java.util.Set;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 1, 4, 5, 2, 2, 5, 6, 1);
        Set<Integer> set = list.stream().collect(Collectors.toSet());
        System.out.println(set);

    }
}
