import java.util.*;

/*Заполнить список десятью случайными числами.
        Отсортировать список методом sort() и вывести его на экран.*/
public class Task_1 {
    public static void main(String[] args) {
        Random rn = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            arr.add(rn.nextInt(10, 100));
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}
