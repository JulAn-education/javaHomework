package hw3.task;
// Пусть дан произвольный список целых чисел, удалить из него чётные числа.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void listNumbers(){
        List<Integer> listNumb = new ArrayList<>();
        Random random = new Random();
        listNumb.add(random.nextInt(10));
        listNumb.add(random.nextInt(10));
        listNumb.add(random.nextInt(10));
        listNumb.add(random.nextInt(10));
        listNumb.add(random.nextInt(10));
        listNumb.add(random.nextInt(10));
        listNumb.add(random.nextInt(10));

        System.out.println(listNumb);

        listNumb.removeIf(x -> x % 2 == 0);

        ///// Решение с помощью цикла
//        for (int i = 0; i < listNumb.size(); i++) {
//            if (listNumb.get(i) % 2 == 0) {
//                listNumb.remove(i);
//                i--;
//            }
//        }
        System.out.println(listNumb);
    }
}
