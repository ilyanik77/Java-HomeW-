package HW_1;

import java.util.ArrayList;
import java.util.List;

public class task2 {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            boolean isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                number.add(i);

            }
        }
        System.out.println(number);
    }
}

