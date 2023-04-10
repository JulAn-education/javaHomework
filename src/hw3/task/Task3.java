package hw3.task;

// Задан целочисленный список ArrayList. Найти минимальное,
// максимальное и среднее арифметическое этого списка.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void findNumber () {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(7, 3, 1, 2, 5, 7, 4, 8, 10));
        System.out.println(list);

        int maxNum = list.get(0);
        int minNum = list.get(0);
        float sumNum = 0;

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);

            if (num < minNum) {
                minNum = num;
            }
            if (num > maxNum) {
                maxNum = num;
            }
            sumNum += num;
        }
        float arithMean = sumNum / list.size();
        System.out.println("Максимальное число: " +  maxNum);
        System.out.println("Минимальное число: " + minNum);
        System.out.println("Среднее арифметическое: " + arithMean);

    }

}
