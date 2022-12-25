package HW_6;
/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии)
 фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
//import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Asus", 4, 1000, "Windows", "grey");
        Notebook notebook2 = new Notebook("Asus", 4, 1000, "Linux", "black");
        Notebook notebook3 = new Notebook("Asus", 4, 2000, "Windows", "black");
        Notebook notebook4 = new Notebook("Asus", 16, 1000, "Windows", "grey");
        Notebook notebook5 = new Notebook("Huawei", 8, 1000, "Windows", "black");
        Notebook notebook6 = new Notebook("Huawei", 6, 512, "Windows", "black");
        Notebook notebook7 = new Notebook("HP", 4, 256, "Linux", "red");
        Notebook notebook8 = new Notebook("Lenovo", 12, 512, "Windows", "grey");

        Set<Notebook> notebooks = new HashSet<>(List.of(notebook1, notebook2,
              notebook3, notebook4, notebook5, notebook6, notebook7, notebook8));

        //Map<String, String> sel = selectCriteria();
        //sort(sel, notebooks);

        for (Object elem : notebooks) {
            System.out.println(elem);
        }

        Scanner in = new Scanner(System.in);
    System.out.println("Введите цифру, соответствующую необходимому критерию:\n 1 - Название\n 2 - ОЗУ\n 3 - Объем ЖД\n 4 - Операционная система\n 5 - Цвет");
    System.out.println("");
    int criterias = in.nextInt();
    System.out.println("");

    //boolean flag = false;

    if (criterias == 1) { // Название
        System.out.println("Введите марку ноутбука:");
        String name = in.next();
        in.close();
        for (Notebook elem : notebooks) {
            if (elem.getName().equals(name)) {
                System.out.println(elem);
                //flag = true;
            }
        }
    } else if (criterias == 2) { // ОЗУ
        System.out.println("Выберите объем ОЗУ:");
        int ram = in.nextInt();
        in.close();
        for (Notebook elem : notebooks) {
            if (elem.getRam() == ram) {
                System.out.println(elem);
                //flag = true;
            }
        }

    } else if (criterias == 3) { // hdd объем жесткого диска
        System.out.println("Выберите объем жесткого диска:");
        int hdd = in.nextInt();
        in.close();
        for (Notebook elem : notebooks) {
            if (elem.getHardDisk() == hdd) {
                System.out.println(elem);
                //flag = true;
            }
        }
    } else if (criterias == 4) { // hdd объем жесткого диска
        System.out.println("Выберите какая операционная система:\n");
        String operatingSystem = in.next();
        in.close();
        for (Notebook elem : notebooks) {
            if (elem.getOperatingSystem().equals(operatingSystem)) {
                System.out.println(elem);
                //flag = true;
            }
        }
    }else if (criterias == 5) { // Цвет
        System.out.println("Выберите цвет:");
        String colour = in.next();
        in.close();
        for (Notebook elem : notebooks) {
            if (elem.getColour().equals(colour)) {
                System.out.println(elem);
                //flag = true;
            }
        }
    } else {
        System.out.println("нет ноутбуков, удовлетворяющих вашему запросу");
    }

     }
}
