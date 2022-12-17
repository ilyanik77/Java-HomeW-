package HW_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class task2 {


    public void solution() {
        ArrayList<String> staff = fillArray();
        HashMap<Integer, ArrayList<String>> sort = sortStaff(staff);
        System.out.println("\n Итоговый список: ");
        printSort(sort);

    }


    public ArrayList<String> fillArray() {
        ArrayList<String> staff = new ArrayList<>();
        staff.add("Иванов");
        staff.add("Сидоров");
        staff.add("Иванов");
        staff.add("Иванов");
        staff.add("Петров");
        staff.add("Сидоров");
        staff.add("Калмыкин");
        staff.add("Иванов");
        staff.add("Суворов");
        staff.add("Калмыкин");
        staff.add("Иванов");
        staff.add("Захаров");
        staff.add("Куминов");
        staff.add("Зорин");
        staff.add("Зверев");
        staff.add("Зверев");

        return staff;
    }


    public HashMap<Integer, ArrayList<String>> sortStaff(ArrayList<String> staff) {
        HashMap<Integer, ArrayList<String>> sort = new HashMap<>();

        for (String person : staff) {

            int count = Collections.frequency(staff, person);

            if (!sort.containsKey(count)) {
                ArrayList<String> unic = new ArrayList<>();
                unic.add(person);
                sort.put(count, unic);

            } else if (sort.containsKey(count) && !sort.get(count).contains(person)) {
                sort.get(count).add(person);
            }

        }

        return sort;
    }


    public void printSort(HashMap<Integer, ArrayList<String>> sort) {

        ArrayList<String> revers = new ArrayList<>();
        String string = "";

        for (Map.Entry<Integer, ArrayList<String>> entry : sort.entrySet()) {
            Integer key = entry.getKey();
            String key1 = String.valueOf(key);
            string = string + key1 + ": ";
            ArrayList<String> value = entry.getValue();
            for (String valueInValue : value) {
                string = string + valueInValue + " ";
            }
            revers.add(string);
            string = "";

        }

        for (int i = revers.size() - 1; i >= 0; i--) {
            System.out.println(revers.get(i));
        }

    }
}
