import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Даны следующие строки, cравнить их с помощью == и метода equals() класса Object
String s1 = "hello";
String s2 = "hello";
String s3 = s1;
String s4 = "h" + "e" + "l" + "l" + "o";
String s5 = new String("hello");
String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
*/
public class Task_0 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        ArrayList<String> arr = new ArrayList<>(List.of(s1, s2, s3, s4, s5, s6));

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                System.out.printf("[i:%d, j:%d] (%s == %s) -> %s\n", i, j, arr.get(i), arr.get(j), arr.get(i) == arr.get(j));
                System.out.printf("[i:%d, j:%d] (%s.equals(%s)) -> %s\n", i, j, arr.get(i), arr.get(j), Objects.equals(arr.get(i), arr.get(j)));
                System.out.println("--------------");
            }
            System.out.println("==============");
        }
    }
}
