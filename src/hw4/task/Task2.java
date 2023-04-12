package hw4.task;
// Реализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Task2 {

    public static void enqueue() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i < 30; i+=3) {
            list.add(i);
        }
        System.out.println(list);

        list.addLast(74);
        System.out.println(list);
    }

    public static void dequeue() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i < 30; i+=4) {
            list.add(i);
        }
        System.out.println(list);

        int del = list.pollFirst();
        System.out.println("Первый элемент списка: " + del);
        System.out.println(list);

    }

    public static void first() {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 2; i < 30; i+=5) {
            list.add(i);
        }
        System.out.println(list);

        int first = list.peekFirst();
        System.out.println("Первый элемент списка: " + first);
        System.out.println(list);
    }

}
