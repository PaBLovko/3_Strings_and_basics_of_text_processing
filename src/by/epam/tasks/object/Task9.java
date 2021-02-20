package by.epam.tasks.object;

/*     Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке.
       Учитывать только английские буквы
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[]args){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            System.out.println("Upper case "+Pattern.compile("[A-Z]").matcher(string).results().count());
            System.out.println("Lower case "+Pattern.compile("[a-z]").matcher(string).results().count());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}