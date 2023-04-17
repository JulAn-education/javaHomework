package hw5;

import hw5.task.ListName;
import hw5.task.PhoneBook;

public class Main {
    public static void main(String[] args) {

        //PhoneBook.getContacts();

        String[] names = new String[] {"Иван Иванов", "Светлана Петрова","Кристина Белова",
                "Анна Мусина","Анна Крутова","Иван Юрин", "Петр Лыков","Павел Чернов","Иван Иванов",
                "Петр Чернышов","Мария Федорова","Марина Светлова","Мария Савина","Иван Иванов","Мария Рыкова",
                "Анна Крутова","Марина Лугова","Анна Владимирова","Петр Лыков","Иван Мечников","Петр Петин",
                "Петр Лыков","Иван Ежов"};
        ListName.sortName(names);

    }
}
