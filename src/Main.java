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
    }

    public static void task1() {
        System.out.println("Задание 1");
        int a = 12, b = 27, c = 44, d = 15, e = 9;
        int result = a * (b + (c - d * e));
        int invertResult = result - (2 * result);
        System.out.println("Инвертированное значение = " + invertResult);
    }

    public static void task2() {
        System.out.println("Задание 2");
        int a = 5, b = 7;
        a = b - a;
        b -= a;
        a += b;
        System.out.printf("a = %d%nb = %d%n", a, b);
    }

    public static void task3() {
        System.out.println("Задание 3");
        int a = 456;
        int b = (a % 100) / 10;
        System.out.printf("a = %d%nb = %d%n",a, b);
    }

    public static void task4() {
        System.out.println("Задание 4");

    }

    public static void task5() {
        System.out.println("Задание 5");

    }

    public static void task6() {
        System.out.println("Задание 6");

    }

    public static void task7() {
        System.out.println("Задание 7");

    }

    public static void task8() {
        System.out.println("Задание 8");

    }
}