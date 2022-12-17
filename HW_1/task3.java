package HW_1;

import java.util.Scanner;

public class task3 {
    public static void main(String args[])
{
    float a, b, res;
    char choice = ' ';
    try (Scanner scan = new Scanner(System.in)) {

        System.out.print("(1) Сложение\n");
        System.out.print("(2) Вычитание\n");
        System.out.print("(3) Умножение\n");
        System.out.print("(4) Деление\n");
        System.out.print("(5) Выход\n\n");
        System.out.print("Выбери действие : ");
        choice = scan.next().charAt(0);

        switch(choice)
        {
            case '1' : System.out.println("Введите два числа : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                res = a + b;
                System.out.print("Результат = " + res);
                break;
            case '2' : System.out.println("Введите два числа : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                res = a - b;
                System.out.print("Результат = " + res);
                break;
            case '3' : System.out.println("Введите два числа : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                res = a * b;
                System.out.print("Результат = " + res);
                break;
            case '4' : System.out.println("Введите два числа : ");
                a = scan.nextFloat();
                b = scan.nextFloat();
                res = a / b;
                System.out.print("Результат = " + res);
                break;
                case '5' : System.exit(0);
                    break;
                default : System.out.print("Неправильный выбор!");
        }

    }
}
}
