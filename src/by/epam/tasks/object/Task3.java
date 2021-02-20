package by.epam.tasks.object;

/*  Проверить является ли заданное слово палиндромом
*/

public class Task3 {
    public static void main(String[]args){
        String string ="AnnA";
        System.out.println(string.equals((new StringBuilder(string)).reverse().toString()));
    }
}