package by.epam.tasks.array;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[]args){
        String[] strings = {"SomeString", "CamelCase", "SnakeCase"};
        Pattern p = Pattern.compile("\\B([A-Z])");
        for (int i = 0; i < strings.length; i++) {
            Matcher m = p.matcher(strings[i]);
            StringBuffer stringBuffer = new StringBuffer();
            while (m.find())
                m.appendReplacement(stringBuffer, "_$0");
            m.appendTail(stringBuffer);
            strings[i] = stringBuffer.toString().toLowerCase();
        }
        System.out.println(Arrays.toString(strings));
    }
}
