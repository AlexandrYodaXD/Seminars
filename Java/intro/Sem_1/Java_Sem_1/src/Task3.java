//Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
//        Пример 1: а = 3, b = 2, ответ: 9
//        Пример 2: а = 2, b = -2, ответ: 0.25
//        Пример 3: а = 3, b = 0, ответ: 1
public class Task3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(aPowB(a, b));
        System.out.println(aPowB2(a, b));
        System.out.println(Math.pow(a, b));

    }

    private static double aPowB(int a, int b){
        return Math.pow(a, b) ;
    }

    private static double aPowB2(int a, int b){
        double result = a;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        return result;
    }
}
