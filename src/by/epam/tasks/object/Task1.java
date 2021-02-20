package by.epam.tasks.object;

/*   Дан текст. Найти наибольшее количество идущих продряд пробелов в нём.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[]args){
        String string ="12wordand  24wordan3 34word4     !";
        Matcher m = Pattern.compile("( )*").matcher(string);
        int maxLen = 0;
        while (m.find()) {
            String sub = m.group();
            if (sub.length() > maxLen) maxLen = sub.length();
        }
        System.out.println(maxLen);
    }
}