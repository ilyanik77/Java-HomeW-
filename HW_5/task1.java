package HW_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1 {

    public Map<Integer, String> fillMap() {

        Map<Integer, String> phoneBook = new HashMap<>();
        phoneBook.put(89564447, "Иванов");
        phoneBook.put(95645615, "Петров");
        phoneBook.put(92656213, "Семенов");
        phoneBook.put(98756231, "Сидоров");
        phoneBook.put(95623154, "Иванов");
        phoneBook.put(85246213, "Сидоров");
        phoneBook.put(74512545, "Захаров");

        return phoneBook;
    }

    public void getPhoneNumber(Map<Integer, String> phoneBook ) {
        System.out.print("Введите фамилию: ");
        Scanner in = new Scanner(System.in, "Cp866");
        String name = in.nextLine();
        in.close();
        System.out.println("Телефонные номера: ");
        for(Map.Entry<Integer, String> phoneBookEntry  : phoneBook.entrySet()) {
            if(phoneBookEntry.getValue().equals(name)) {
                System.out.println(phoneBookEntry.getKey());
            }
        }
    }


}
