/*
Напишите метод, который принимает на вход строку (String) и
определяет является ли строка палиндромом (возвращает
boolean значение).
*/
public class Task_3 {
    public static void main(String[] args) {
        String myString1 = "шалаш";
        String myString2 = "шоколад";
//        System.out.println(palindrome(myString1));
//        System.out.println(palindrome(myString2));
        System.out.println(palindrome2(myString1));
    }

    public static boolean palindrome(String data){
        int size = data.length();
        for (int i = 0; i < data.length() / 2; i++) {
            if (data.charAt(i) != data.charAt(size - i - 1)){
                return false;
            }
        }
        return true;
    }

    public static boolean palindrome2(String data){
        StringBuilder reversed = new StringBuilder(data.toLowerCase()).reverse();
        return reversed.toString().equalsIgnoreCase(data);
    }
}
