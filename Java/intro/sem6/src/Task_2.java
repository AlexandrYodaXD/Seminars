import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в
данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class Task_2 {
    public static void main(String[] args) {
        Integer[] arr = getArray(0, 24, 1000);
        double percentage = getAPercentage(arr);
        System.out.println(percentage);
    }
    static Integer[] getArray(int min_, int max_, int size_){
        Integer[] arr = new Integer[size_];
        Random rnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(min_, max_ + 1);
        }
        return arr;
    }

    static Double getAPercentage(Integer[] arr){
        double percentage = 0;
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        percentage = set.size() * 100.0 / arr.length;
        return percentage;
    }
}
