/*
Напишите метод, который сжимает строку.
Пример: вход aaaabbbcdd.
Пример выхода: a4b3c1d2
*/
public class Task_2 {
    public static void main(String[] args) {
        String data = "aaaabbbcdd";
        System.out.println(encrypter(data));
    }

    public static String encrypter(String data) {
        StringBuilder myString = new StringBuilder();
        if (data.length() == 0) return myString.toString();
        char currentChar = data.charAt(0);
        int currentCount = 0;
        for (int i = 0; i < data.length(); i++) {
            if (currentChar == data.charAt(i)) {
                currentCount++;
            } else {
                myString.append(currentChar)
                        .append(String.valueOf(currentCount));
                currentChar = data.charAt(i);
                currentCount = 1;
            }
            if ((i+1) == data.length()){
                myString.append(currentChar)
                        .append(String.valueOf(currentCount));
            }
        }
        return myString.toString();
    }

    public static String decrypter(String data){
        StringBuilder myString = new StringBuilder();
        if (data.length() == 0) return myString.toString();
        char currentChar = data.charAt(0);
        int currentCount = 0;
        for (int i = 0; i < data.length(); i++) {
            ;
        }

        return myString.toString();
    }
}
