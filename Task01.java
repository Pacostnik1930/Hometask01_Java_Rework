
// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы

public class Task01 {
    public static void main(String[] args) {
        int[] array = { 5, 7, 9, 2 };

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Макимальное значение в массиве :" + max);
        System.out.println("Минимальное значение в массиве: " + min);

    }
}
    
