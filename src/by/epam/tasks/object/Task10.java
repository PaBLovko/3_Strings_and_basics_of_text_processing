package by.epam.tasks.object;

/*  Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
    знаком. Определить количество предложений в строке X.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {
    public static void main(String[]args){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            System.out.println("Suggestions case "+Pattern.compile("[!.?]").matcher(string).results().count());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}