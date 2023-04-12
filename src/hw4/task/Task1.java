package hw4.task;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    public static void reverseList() {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 2; i < 30; i+=5) {
            list.add(i);
        }
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

    }
}
