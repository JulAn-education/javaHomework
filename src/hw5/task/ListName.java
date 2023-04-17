package hw5.task;
//Пусть дан список сотрудников:
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ListName {
    public static void sortName(String[] names) {

        Map<String, Integer> personName = new HashMap<>();
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names.length; j++) {
                if (names[i].split(" ")[0].equals(names[j].split(" ")[0])) {
                    count++;
                }
            }
            personName.putIfAbsent(names[i].split(" ")[0], count);
            count = 0;
        }
        personName.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

    }

}
