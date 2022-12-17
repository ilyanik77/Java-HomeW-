package HW_5;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        task1 task_1 = new task1();
        Map<Integer, String> phoneBook = task_1.fillMap();
        task_1.getPhoneNumber(phoneBook);


        // Task2 task_2 = new Task2();
        // task_2.solution();

        //Task3 task_3 = new Task3();
        //task_3.solution();

    }

}
