public class Main {
    // Задание 1.1
    // Дробная часть числа
    public static double fraction(double x) {
        return x - (int) x;
    }
    // Задание 1.3
    // Перевод символа в число
    public static int charToNum(char x) {
        return x - '0';
    }


    // Задание 1.5
    // Проверка на двузначное число
    public static boolean is2Digits(int x) {
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }


    // Задание 1.7
    // Проверка, входит ли число в диапазон
    public static boolean isInRange(int a, int b, int num) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return num >= a && num <= b;
    }


    // Задание 1.9
    // Проверка равенства трех чисел
    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }


    // Задание 2.1
    // Модуль числа
    public static int abs(int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }


    // Задание 2.3
    // Проверка делимости на 3 или 5
    public static boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }
        return x % 3 == 0 || x % 5 == 0;
    }


    // Задание 2.5
    // Максимальное из трех чисел
    public static int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }


    // Задание 2.7
    // Сумма двух чисел
    public static int sum2(int x, int y) {
        int sum = x + y;

        if (sum >= 10 && sum <= 19) {
            return 20;
        }

        return sum;
    }


    // Задание 2.9
    // День недели
    public static String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }


    // Задание 3.1
    // Числа от 0 до x
    public static String listNums(int x) {
        String result = "";

        for (int i = 0; i <= x; i++) {
            result = result + i + " ";
        }
        return result;
    }

    // Задание 3.3
    // Четные числа от 0 до x
    public static String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result = result + i + " ";
        }

        return result;
    }



    // Задание 3.5
    // Количество цифр в числе
    public static int numLen(long x) {
        x = Math.abs(x);

        if (x == 0) {
            return 1;
        }

        int count = 0;

        while (x > 0) {
            x = x / 10;
            count++;
        }

        return count;
    }

    // Задание 3.7
    // Квадрат из звездочек
    public static void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }



    // Задание 3.9
    // Правый треугольник
    public static void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {

            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }



    // Задание 4.1
    // Поиск первого вхождения
    public static int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Задание 4.3
    // Максимальное по модулю значение
    public static int maxAbs(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }

        return max;
    }

    // Задание 4.5
    // Добавление массива в массив
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) {
            result[i + ins.length] = arr[i];
        }

        return result;
    }


    // Задание 4.7
    // Возвратный реверс
    public static int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }

        return result;
    }



    // Задание 4.9
    // Все вхождения числа
    public static int[] findAll(int[] arr, int x) {
        int count = 0;

        // Считаем количество вхождений
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        int[] result = new int[count];
        int j = 0;



        // Записываем индексы
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[j] = i;
                j++;
            }
        }
        return result;

    }
    public static void main(String[] args) {



        // Задание 1
        System.out.println("Задание 1");



        System.out.println(fraction(5.25));
        System.out.println(charToNum('3'));
        System.out.println(is2Digits(32));
        System.out.println(isInRange(5, 1, 3));
        System.out.println(isEqual(3, 3, 3));
        System.out.println();





        // Задание 2
        System.out.println("Задание 2");

        System.out.println(abs(-5));
        System.out.println(is35(5));
        System.out.println(max3(5, 7, 4));
        System.out.println(sum2(5, 7));
        System.out.println(day(5));
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");

        System.out.println(listNums(5));
        System.out.println(chet(9));
        System.out.println(numLen(12567));


        square(3);

        System.out.println();

        rightTriangle(4);

        System.out.println();


        // Задание 4
        System.out.println("Задание 4");

        int[] arr = {1, 2, 3, 4, 2, 2, 5};

        System.out.println(findFirst(arr, 2));

        int[] numbers = {1, -2, -7, 4, 2, 2, 5};
        System.out.println(maxAbs(numbers));

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {7, 8, 9};
        int[] newArr = add(arr1, arr2, 3);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

        System.out.println();

        int[] reversed = reverseBack(arr1);

        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }

        System.out.println();

        int[] all = findAll(arr, 2);

        for (int i = 0; i < all.length; i++) {
            System.out.print(all[i] + " ");
        }
    }
}