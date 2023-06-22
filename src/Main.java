import java.util.Arrays;

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
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
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
        System.out.printf("a = %d%nb = %d%n", a, b);
    }

    public static void task4() {
        System.out.println("Задание 4");
        int age = 19;
        int salary = 58_000;
        double limit;
        if (age >= 23) {
            limit = salary * 3;
        } else {
            limit = salary * 2;
        }
        if (salary >= 50_000) {
            limit *= 1.2;
        } else if (salary >= 80_000) {
            limit *= 1.5;
        }
        System.out.printf("Мы готовы выдать вам кредитную карту с лимитом %.2f рублей%n", limit);
    }

    public static void task5() {
        System.out.println("Задание 5");
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000; // желаемая сумма кредита
        double interestRate = 10; // процентная ставка
        double maxPayment = salary / 2; // максимально допустимый платеж
        double payment; // платеж по кредиту
        if (age < 23) {
            interestRate++;
        } else if (age < 30) {
            interestRate += 0.5;
        }
        if (salary > 80_000) {
            interestRate -= 0.7;
        }
        payment = wantedSum / 100d * interestRate;
        if (payment < maxPayment) {
            System.out.printf("Максимальный платеж при ЗП %d равен %.2f рублей. Платеж по кредиту %.2f рублей." +
                    " Одобрено%n", salary, maxPayment, payment);
        } else {
            System.out.printf("Максимальный платеж при ЗП %d равен %.2f рублей. Платеж по кредиту %.2f рублей." +
                    " Отказано%n", salary, maxPayment, payment);
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("%d: ping pong%n", i);
            } else if (i % 3 == 0) {
                System.out.printf("%d: ping%n", i);
            } else if (i % 5 == 0) {
                System.out.printf("%d: pong%n", i);
            } else {
                System.out.printf("%d:%n", i);
            }
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        int number = 10; // до какого числа считаем
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 0; i < number - 2; i++) {
            int fibonacci = a + b;
            a = b;
            b = fibonacci;
            System.out.print(fibonacci + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.println("Задание 8");
        int[][] matrix = new int[3][3];
        int number = 1; // число для замены
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i % 2 == 0 && j % 2 == 0 || i == 1 && j == 1) {
                    matrix[i][j] = number;
                }
            }
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }

    public static void task9() {
        System.out.println("Задание 9");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - i - 1];
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void task10() {
        System.out.println("Задание 10");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int number = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = number;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task11() {
        System.out.println("Задание 11");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        work:
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + " " + arr[j]);
                    break work;
                }
            }
        }
    }

    public static void task12() {
        System.out.println("Задание 12");
        int[] arr = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == -2) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void task13() {
        System.out.println("Задание 13");

    }

    public static void task14() {
        System.out.println("Задание 14");

    }

    public static void task15() {
        System.out.println("Задание 15");

    }

    public static void task16() {
        System.out.println("Задание 16");

    }
}