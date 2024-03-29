import java.util.*;

/*
Заполнить список названиями планет Солнечной
системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его
повторений в списке.
*/
/*
Пройти по списку из предыдущего задания и удалить
повторяющиеся элементы.
*/
public class Task_2_1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Меркурий",
                "Земля ", "Венера", "Нептун", "Юпитер", "Земля ", "Земля ", "Марс", "Венера",
                "Юпитер", "Сатурн", "Меркурий", "Земля ", "Венера", "Марс", "Нептун"));
        System.out.println("Изначальный список");
        showCounts(arr);
        delRepeats(arr);
        System.out.println("После удаления");
        showCounts(arr);
    }

    public static void showCounts(ArrayList<String> data){
        Set<String> mySet = new HashSet<>(data);
        for (String planet: mySet) {
            int count = Collections.frequency(data, planet);
            System.out.printf("Колличество %s -> %d\n", planet, count);
        }
    }

    public static void delRepeats(ArrayList<String> data){
        Iterator<String> iterator = data.iterator();
        while (iterator.hasNext()){
            if (Collections.frequency(data, iterator.next()) > 1){
//                int count = Collections.frequency(data, iterator);
                iterator.remove();
            }
        }
    }
}
