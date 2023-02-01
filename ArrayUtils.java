public class ArrayUtils {

    public static double getAverage(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Ошибка! Пустой массив!");
        }
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return (double) res / arr.length;
    }

    public static void invertArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int j = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = j;
        }
    }

    public static int getIndex(int[] arr, int lookIndex) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == lookIndex) {
                return i;
            }
        }
        return -1;
    }

    public static int[] getSubArray(int[] arr, int firstIndex, int secondIndex) {
        if (firstIndex < 0 || secondIndex > arr.length || firstIndex > secondIndex) {
            throw new IllegalArgumentException("Ошибка, некоректные границы подмассива!");
        }
        int[] subArr = new int[secondIndex - firstIndex];
        int j = 0;
        for (int i = firstIndex; i < secondIndex; i++) {
            subArr[j] = arr[i];
            j++;
        }
        return subArr;
    }

    public static int[] getPageIfo(int[] catalogElements, int pageNumber, int pageElements) {
        if (catalogElements.length == 0 || pageNumber < 1 || catalogElements.length < ((pageNumber - 1) * pageElements)) {
            throw new IllegalArgumentException("Не работает с 0 элементами. Номер страницы начинается с 1 . Неправильный номер страници или количество элементов");
        }
        int firstIndex = (pageNumber - 1) * pageElements;
        int secondIndex = firstIndex + pageElements;

        if (secondIndex > catalogElements.length) {
            secondIndex = catalogElements.length;
        }
        return getSubArray(catalogElements, firstIndex, secondIndex);
    }


}
