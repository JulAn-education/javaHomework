1. Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.

2. Создать множество ноутбуков.

3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

 - “Введите цифру, соответствующую необходимому критерию:

- 1 - бренд

- 2 -цвет

Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
СПОЙЛЕР:

1) создаете класс ноутбук (equals, hashCode)
2) создаете сет ноутбукоа
3) создаете и заполняете Map<Integer, Laptop>
4) запрашиваете через сканнер у пользователя критерий фильтрации
5) циклом проходите по Map.Entry<Integer, Laptop> entry: entries
6) В результирующий Set<Laptop> складываете ноутбуки entry.getValue() у которых
   равны критерию пользователя

Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.