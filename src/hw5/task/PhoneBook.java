package hw5.task;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class PhoneBook {
    public static void getContacts() {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("+79256358478", "Василий Иванов");
        phoneBook.put("+79862546985", "Петр Сидоров");
        phoneBook.put("+79263548147", "Дмитрий Усов");
        phoneBook.put("+79263548189", "Дмитрий Усов");
        phoneBook.put("+79536984251", "Ирина Петрова");
        phoneBook.put("+79862546325", "Ольга Смирнова");
        phoneBook.put("+79815469258", "Иван Кузнецов");
        phoneBook.put("+79235462579","Ольга Смирнова");

        System.out.println(phoneBook);

        for (Map.Entry<String, String> list : phoneBook.entrySet()) {
            System.out.println(String.format("ФИО: %s, Номер телефона : %s", list.getValue(), list.getKey()));
        }

    }

}
