package by.epam.tasks.object;

/*  В строке вставить после каждого символа 'a' символ 'b'.
* */

public class Task2 {
    public static void main(String[]args){
        String string ="12wordand  24wordan3 34word4     !".replaceAll("a", "ab");
        System.out.println(string);
    }
}