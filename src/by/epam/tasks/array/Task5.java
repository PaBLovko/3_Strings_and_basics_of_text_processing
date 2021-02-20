package by.epam.tasks.array;

/*  Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
    Крайние пробелы в строке удалить.
*/

public class Task5 {
    public static void main(String[]args){
        String string =" 12word  and 24word  an334d  word4!  ";
        String whitespace = " ";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < string.length(); i++){
            if (!(whitespace.contains(String.valueOf(string.charAt(i-1)))
                    && whitespace.contains(String.valueOf(string.charAt(i)))))
                stringBuilder.append(string.charAt(i));
        }
        string = stringBuilder.toString();
        if (string.charAt(0) == ' ')  string = string.substring(1);
        if ((string.charAt(string.length()-1)) == ' ')  string = string.substring(0, string.length() - 1);
        System.out.println(string);
    }
}