package StreamTasks;

import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<Double> list = List.of(15.4, 64.12, 9.0, 13.41);
        System.out.println(
                list.stream()
                .mapToDouble(Double::doubleValue)
                .sum());

    }
}
