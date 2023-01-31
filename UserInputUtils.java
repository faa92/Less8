import java.util.Scanner;

public class UserInputUtils {
    public static int[] getNewArr() throws IllegalArgumentException {

        System.out.print("Введите длинну массива: ");

        Scanner scanner = new Scanner(System.in);
        int arrValue = scanner.nextInt();

        if (arrValue < 0) {
            throw new IllegalArgumentException("Неправильное количество элементов");
        }

        int[] cratedArr = new int[arrValue];

        if (arrValue != 0) {
            for (int i = 0; i < arrValue; i++) {
                System.out.print("Введите элемент массива: ");
                cratedArr[i] = scanner.nextInt();
            }
        }
        return cratedArr;
    }
}
