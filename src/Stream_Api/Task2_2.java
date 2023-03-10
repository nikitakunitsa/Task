package Stream_Api;

import java.util.List;
import java.util.stream.Collectors;

public class Task2_2 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 15, 17, 18, 30, 35);
        Method method = new Method();
        System.out.println("Коллекция до изменений:" + list);
        List<Integer> newList = list.stream()
                .map(x -> method.streamMethod(x))
                .collect(Collectors.toList());

        System.out.println("Коллекция после изменений: " + newList);
    }
}
