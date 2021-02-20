package by.epam.tasks.object;

/*  Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
    Например, если было введено "abc cde def", то должно быть выведено "abcdef".
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[]args){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            String result = new StringBuilder(string.replaceAll(" ", "")).reverse().toString();
            result = result.replaceAll("(.)(?=.*\\1)", "");
            result = new StringBuilder(result).reverse().toString();
            System.out.println(result.strip());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}