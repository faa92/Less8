import java.util.Arrays;
import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задачи: ");
        int task = scanner.nextInt();

            switch (task) {
                case 1 -> {
                    System.out.print("Введите год: ");
                    int year = scanner.nextInt();
                    if (DateTimeUtils.isLeapYear(year)) {
                        System.out.println("Год високосный!");
                    } else System.out.println("Год НЕ високосный!");
                }
                case 2 -> {
                    int[] array = UserInputUtils.getNewArr();
                    double averageElements = ArrayUtils.getAverage(array);
                    System.out.println("Среднее арифметическое значение: " + averageElements);
                }
                case 3 -> {
                    int[] array = UserInputUtils.getNewArr();
                    ArrayUtils.invertArr(array);
                    System.out.println(Arrays.toString(array));
                }
                case 4 -> {
                    int[] array = UserInputUtils.getNewArr();
                    System.out.print("Введите номер элемента, чей индекс мы ищем: ");
                    int numberOfElement = scanner.nextInt();
                    int indexOfElement = ArrayUtils.getIndex(array, numberOfElement);
                    System.out.println("Индекс элемента: " + indexOfElement);
                }
                case 5 -> {
                    int[] array = UserInputUtils.getNewArr();
                    System.out.println("Введите начальный ИНДЕКС: ");
                    int firstIndex = scanner.nextInt();
                    System.out.println("Введите конечный ИНДЕКС: ");
                    int secondIndex = scanner.nextInt();
                    int[] newArr = ArrayUtils.getSubArray(array, firstIndex, secondIndex);
                    System.out.println("Результат: " + Arrays.toString(newArr));
                }
                case 6 -> {
                    System.out.println("Создайте массив.");
                    int[] array = UserInputUtils.getNewArr();
                    System.out.println("Введите номер страницы: ");
                    int pageNum = scanner.nextInt();
                    System.out.println("Введите количество элементов на странице: ");
                    int amountElements = scanner.nextInt();
                    int[] newArr = ArrayUtils.getPageIfo(array, pageNum, amountElements);
                    System.out.println("Резултат: " + Arrays.toString(newArr));


                }
                default -> throw new IllegalArgumentException("Введите корректный номер задачи! 1-6");

            }


    }
}
