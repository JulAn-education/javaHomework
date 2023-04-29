package hw6;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Laptop> setLaptop = new HashSet<>();
        Map<Integer, Laptop> laptopMap = new HashMap<>();

        laptopMap.put(1, new Laptop("Samsung", "red", 20500));
        laptopMap.put(2, new Laptop("HP", "black", 21000));
        laptopMap.put(3, new Laptop("Asus", "grey", 25500));
        laptopMap.put(4, new Laptop("Samsung", "black", 23500));
        laptopMap.put(5, new Laptop("HP", "red", 26500));

        Map<Integer, String> laptopBrand = new HashMap<>();
        Map<Integer, String> laptopColor = new HashMap<>();

        laptopBrand.put(1, "Samsung");
        laptopBrand.put(2, "HP");
        laptopBrand.put(3, "Asus");

        laptopColor.put(1, "red");
        laptopColor.put(2, "black");
        laptopColor.put(3, "grey");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите категриию фильтрации:  ");
            System.out.println("1. brand");
            System.out.println("2. color");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Введите бренд: ");
                printMap(laptopBrand);

                int inputBrand = scanner.nextInt();
                for (Map.Entry<Integer,Laptop>entry:laptopMap.entrySet() ){
                    if (entry.getValue().getBrand().equals(laptopBrand.get(inputBrand))){
                        setLaptop.add(entry.getValue());
                    }

                }
                System.out.println(setLaptop);
                setLaptop.clear();

            } else if (input == 2) {
                System.out.println("Введите цвет: ");
                printMap(laptopColor);
                int inputColor = scanner.nextInt();
                for (Map.Entry<Integer,Laptop>entry:laptopMap.entrySet() ) {
                    if (entry.getValue().getColor().equals(laptopColor.get(inputColor))) {
                        setLaptop.add(entry.getValue());
                    }
                }
                System.out.println(setLaptop);
                setLaptop.clear();

            } else {
                break;
            }
        }
    }
    private static void printMap(Map<Integer, String> map) {
        for (Map.Entry<Integer,String>entry:map.entrySet()) {
            System.out.print(entry.getKey()+". "+entry.getValue());
            System.out.println();
        }
    }
}
