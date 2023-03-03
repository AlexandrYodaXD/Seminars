import java.util.ArrayList;
import java.util.Iterator;

/*
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
*/
public class Task_3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Строка 1");
        arr.add("1");
        arr.add("Строка 2");
        arr.add("2");
        arr.add("Строка 3");
        arr.add("3");
        Iterator<String> iterator = arr.iterator();
        System.out.println(arr);
        while (iterator.hasNext()){
            String current = iterator.next();
            if (isParable(current)){
                iterator.remove();
            } else {
                System.out.printf("\"%s\" - это было не число...\n", current);
            }
        }
        System.out.println(arr);
    }

    public static Boolean isParable(String number){
        try {
            Integer.parseInt(number);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
