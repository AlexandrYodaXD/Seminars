/*
Напишите метод, который составит строку, состоящую из 100
повторений слова TEST и метод, который запишет эту строку в
простой текстовый файл, обработайте исключения.
*/

import java.io.File;
import java.io.FileWriter;

public class Task_4 {
    public static void main(String[] args) {
        String myString = "TEST";
        String data = getString(myString);
        writeToFile(data);
    }

    public static String getString(String template){
        return template.repeat(100);
    }

    public  static void writeToFile(String data){
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("\\file.txt");
            File file = new File(pathFile);

            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(data);
            fileWriter.flush();
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("Вот исключение.");
            e.printStackTrace();
        }
    }
}
