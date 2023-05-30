public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }
    public static void task1() {
        System.out.println("Задача № 1.");
        for (int a = 1; a < 11; a++) {
            System.out.println("Цикл и его переменная " + a);
        }
    }
    public static void task2() {
        System.out.println("Задача № 2.");
        for (int b = 10; b > 0; b--) {
            System.out.println("Цикл2 и его переменная " + b);
        }
    }
    public static void task3() {
        System.out.println("Задача № 3.");
        for (int c = 0; c < 17; c = c + 2) {
            System.out.println("Цикл3 и его переменная " + c);
        }
    }
    public static void task4() {
        System.out.println("Задача № 4.");
        for (int d = 10; d > -11; d--) {
            System.out.println("Цикл4 и его переменная " + d);
        }
    }
    public static void task5() {
        System.out.println("Задача № 5.");
        for (int e = 1904; e < 2100; e = e + 4) {
            System.out.println(e + " Год является високосным.");
        }
    }
    public static void task6() {
        System.out.println("Задача № 6.");
        for (int f = 0; f < 105; f = f + 7) {
            System.out.println(f);
        }
    }
    public static void task7() {
        System.out.println("Задача № 7.");
        for (int g = 1; g < 1024; g = g * 2) {
            System.out.println(g);
    }
}
    public static void task8() {
        System.out.println("Задача № 8.");
        int salary = 29000;
        int sSalary = 0;
        for (int h = 1; h < 13; h = h + 1) {
            sSalary = sSalary + salary;
            System.out.println("Месяц " + h + " Сумма накоплений составила " + sSalary + " рублей.");
        }
    }
    public static void task9() {
        System.out.println("Задача № 9.");
        int myzpSPez = 86700 ;
        int total = 0 ;
        for(int i = 1; i < 13 ; i++) {
            total = total + total / 100 ;
            total = myzpSPez + total ;
            System.out.println("Месяц " + i + " сумма накоплений составила " + total) ;
        }
    }
    public static void task10() {
        System.out.println("Задача № 10.");
        byte n = 2 ;
        for (int f = 1; f <= 10; f++) {
        int g = n * f;
        System.out.println(n + " * " + f + " = " + g);
        }
    }
}
// Неожиданные сложности, но интересно.
// Домашнее задание считаю выполненным.




