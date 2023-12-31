import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);  // ссылка на сканер в динамической памяти
        System.out.print("Введите размер массива: ");
        int n = kb.nextInt();
        int[] arr = new int[n];
        arr [2] = 1024;             // обращение к элементу массива на запись
        System.out.println(arr[2]); // обращение к элементу массива на чтение

        // Ввод элементов массива с клавиатуры:
        System.out.print("Введите значения элементов: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = kb.nextInt();
        }

        // Вывод массива на экран в прямом порядке:
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // Вывод массива на экран в обратном порядке:
        for(int i = n - 1; i >= 0; i--)
        {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += arr[i];
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + (double)sum / n);

        // Поиск минимального и максимального значений:
        int min, max;
        min = max = arr[0];
        for(int i = 0; i < n; i++)
        {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("Минимальное значение в массиве: " + min);
        System.out.println("Максимальное значение в массиве: " + max);

        /*int[] fib = new int[]{ 3, 5, 8, 13, 21 };
        for(int i = 0; i < fib.length; i++)
        {
            System.out.print(fib[i] + "\t");
        }
        System.out.println();*/



    }
}