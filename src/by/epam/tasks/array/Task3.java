package by.epam.tasks.array;

//    В строке найти количество цифр

public class Task3 {
    public static void main(String[]args){
        String string ="1word and 2word an3d word!";
        String numbers = "123456789";
        int counter = 0;
        for (int i = 0; i < string.length(); i++)
            if (numbers.contains(String.valueOf(string.charAt(i))))
                counter++;
        System.out.println(counter);
    }
}