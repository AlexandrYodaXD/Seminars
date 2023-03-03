public class Task2 {
    //    Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
//    Если общего префикса нет, вернуть пустую строку "".
    public static void main(String[] args) {
        String[] strings_array = new String[]{"Вот первый элемент", "А это вторая строка", "Тут уже третий элемент",
                "А вот это уже четвертый, самый длинный, очень-очень большой элемент"};
        String pref = "эле";

        String result = find_str(strings_array, pref);
        System.out.println(result);
    }

    private static String find_str(String[] str_arr, String find_pref) {
        int index_max = 0;
        int max_length = str_arr[index_max].length();
        for (int i = 0; i < str_arr.length; i++) {
            if (str_arr[i].contains(find_pref) && str_arr[i].length() > max_length) {
                index_max = i;
                max_length = str_arr[index_max].length();
            }
        }
        return str_arr[index_max];
    }
}