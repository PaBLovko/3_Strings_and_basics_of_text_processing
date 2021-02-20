package by.epam.tasks.object;

/*  С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
 */

public class Task4 {
    public static void main(String[]args){
        String string ="информатика";
        String res = "";
        res = res.concat(String.valueOf(string.charAt(string.indexOf("т"))));
        res = res.concat(String.valueOf(string.charAt(string.indexOf("о"))));
        res = res.concat(String.valueOf(string.charAt(string.indexOf("р"))));
        res = res.concat(String.valueOf(string.charAt(string.indexOf("т"))));
        System.out.println(res);
    }
}