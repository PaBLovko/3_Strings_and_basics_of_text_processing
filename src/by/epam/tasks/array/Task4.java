package by.epam.tasks.array;

/*    В строке найти количество чисел
 */

public class Task4 {
    public static void main(String[]args){
        String string ="12word and 24word an334d word4!";
        String numbers = "123456789";
        int counter = 0;
        for (int i = 1; i < string.length(); i++)
            if (numbers.contains(String.valueOf(string.charAt(i-1)))
                    && !numbers.contains(String.valueOf(string.charAt(i))))
                counter++;
        System.out.println(counter);
    }
}