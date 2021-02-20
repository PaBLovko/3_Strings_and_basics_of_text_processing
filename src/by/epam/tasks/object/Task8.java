package by.epam.tasks.object;

/*  Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести
    его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[]args){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String string = reader.readLine();
            Matcher m = Pattern.compile("([^ ])*").matcher(string);
            String maxLen = "";
            while (m.find()) {
                String sub = m.group();
                if (sub.length() > maxLen.length()) maxLen = sub;
            }
            System.out.println(maxLen);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}