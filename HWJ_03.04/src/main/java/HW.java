import javax.swing.*;
import java.util.Scanner;

public class HW {
    /*
        ДЗ
    1) Сделать через методы калькулятор(арифметические операции)
    и добавить расчет квадратного корня  и возведение в степень (класс Math)
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        calculator();

    }

    public static void calculator() {
        System.out.println("Введите ваш знак!");
        char sing = sc.next().charAt(0);

        if (sing == '+') {
            sum();
        } else if (sing == '-') {
            sub();
        } else if (sing == '*') {
            mult();
        } else if (sing == '/') {
            div();
        } else if (sing == '√') {
            sqrt();
        } else if (sing == '^'){
            pow();
        }else{
            rem();
        }
    }

    public static void sum() {
        System.out.println("Введите знаменатель!");
        int a = sc.nextInt();
        System.out.println("Введите числитель!");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Результат сложения: " + sum);
    }

    public static void sub() {
        System.out.println("Введите знаменатель!");
        int a = sc.nextInt();
        System.out.println("Введите числитель!");
        int b = sc.nextInt();
        int sub = a - b;
        System.out.println("Результат вычетания: " + sub);
    }

    public static void mult() {
        System.out.println("Введите знаменатель!");
        int a = sc.nextInt();
        System.out.println("Введите числитель!");
        int b = sc.nextInt();
        int mult = a * b;
        System.out.println("Результат умножения: " + mult);
    }

    public static void div() {
        System.out.println("Введите знаменатель!");
        int a = sc.nextInt();
        System.out.println("Введите числитель!");
        int b = sc.nextInt();
        int div = a / b;
        System.out.println("Результат деления: " + div);
    }

    public static void rem() {
        System.out.println("Введите знаменатель!");
        int a = sc.nextInt();
        System.out.println("Введите числитель!");
        int b = sc.nextInt();
        int rem = a % b;
        System.out.println("Сумма остатка: " + rem);
    }
    public static void sqrt() {
        System.out.println("Введите знаменатель!");
        int a = sc.nextInt();
        System.out.println("Введите числитель!");
        int b = sc.nextInt();
        double sqrt = Math.sqrt(a);
        System.out.println("Квадрат корня: " + sqrt);
    }
    public static void pow() {
        System.out.println("Введите знаменатель!");
        int a = sc.nextInt();
        System.out.println("Введите числитель!");
        int b = sc.nextInt();
        int pow = (int) Math.pow(a,b);
        System.out.println("Степень знаменателя: " + pow);
    }

}