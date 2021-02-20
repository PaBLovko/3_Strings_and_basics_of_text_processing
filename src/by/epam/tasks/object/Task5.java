package by.epam.tasks.object;

/*  Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[]args){
        String string ="12wordand  24wordan3 34worda4     !";
        Matcher m = Pattern.compile("a").matcher(string);
        int maxLen = 0;
        while (m.find()) {
            maxLen++;
        }
        System.out.println(maxLen);
    }
}