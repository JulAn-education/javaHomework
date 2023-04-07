package hw2.task;

// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task1 {
    private static final Logger LOG = Log.log(Task1.class.getName());
    public static String arraySorted (int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    LOG.log(Level.INFO, "Сортировка прошла успешно!");
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        String result = Arrays.toString(arr);
        Task1.writeFile(result);
        return result;
    }

    public static void writeFile(String arg) {
        try (FileWriter in = new FileWriter("Task1.txt")) {
            in.append(arg);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
