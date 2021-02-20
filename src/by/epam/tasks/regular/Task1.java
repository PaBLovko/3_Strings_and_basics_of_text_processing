package by.epam.tasks.regular;

/* Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее
   выполнять с текстом три различных операции: отсортировать абзацы по количеству
   предложений; в каждом предложении отсортировать слова по длине; отсортировать
   лексемы в предложении по убыванию количества вхождений заданного символа,
   а в случае равенства – по алфавиту.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[]args){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("1 - sort by number of paragraphs\n"+
                    "2 - in each sentence, sort the words by length\n"+
                    "3 - sort tokens in a sentence in descending order of occurrences of a given character\n");
            String choice = reader.readLine();
            String string = getText();
            String[] text;
            switch (choice){
                case "1":
                    text = string.split("\n");
                    long[] counts = new long[text.length];
                    for (int i = 0; i < text.length; i ++)
                        counts[i] = Pattern.compile("\\.*[.!?]\\s*").matcher(text[i]).results().count();
                    sortByLength(text, counts);
                    for (String elem: text)
                        System.out.println(elem);
                    System.out.println();
                    break;
                case "2":
                    text = string.split("\\.*[.!?]\\s*");
                    for (String line: text){
                        String[] m = Pattern.compile("\\s*(\\s|,|;|:)\\s*").split(line);
                        m = sortByLength(m);
                        showResult(m);
                        System.out.println();
                    }
                    break;
                case "3":
                    String letter = "п";
                    String[] paragraphs = string.split("\n");
                    for (String paragraph : paragraphs) {
                        String[] sentences = Pattern.compile("\\.*[.!?]\\s*").split(paragraph);
                        for (String sentence : sentences) {
                            String[] words = Pattern.compile("\\s*(\\s|,|;|:)\\s*").split(sentence);
                            sortByLength(words, letter);
                            showResult(words);
                            System.out.print("\b. ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Incorrect");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showResult(String[] text){
        for (String elem: text)
            System.out.print(elem+" ");
    }

    private static String[] sortByLength(String[] inputArray) {
        Arrays.sort(inputArray, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s1.length() - s2.length();
            }
        });
        return inputArray;
    }

    private static void sortByLength(String[] text, long[] counts){
        for (int k = counts.length - 1; k >= 0; k--) {
            for (int m = 0; m < k; m++) {
                if (counts[m] > counts[m + 1]) {
                    String tmp = text[m];
                    text[m] = text[m + 1];
                    text[m + 1] = tmp;
                }
            }
        }
    }

    private static void sortByLength(String[] words, String letter){
        for (int k = words.length - 1; k >= 0; k--) {
            for (int m = 0; m < k; m++) {
                int countRight = 0;
                int countLeft = 0;
                for (int n = 0; n < words[m].length(); n++)
                    if (String.valueOf(words[m].charAt(n)).compareToIgnoreCase(letter) == 0)
                        countLeft++;
                for (int n = 0; n < words[m + 1].length(); n++)
                    if (String.valueOf(words[m + 1].charAt(n)).compareToIgnoreCase(letter) == 0)
                        countRight++;
                if (countLeft < countRight) {
                    String tmp = words[m];
                    words[m] = words[m + 1];
                    words[m + 1] = tmp;
                } else if (countLeft == countRight) {
                    String[] forCompare = {words[m], words[m + 1]};
                    Arrays.sort(forCompare);
                    words[m] = forCompare[0];
                    words[m + 1] = forCompare[1];
                }
            }
        }
    }


    private static String getText(){
        return  "Создать приложение разбирающее текст и позволяющее " +
                "выполнять с текстом три различных операции. Отсортировать абзацы по количеству " +
                "предложений. В каждом предложении отсортировать слова по длине.\n" +
                "Отсортировать лексемы в предложении по убыванию количества вхождений заданного символа. "+
                "Если в случае равенства – по алфавиту.\nНапишите анализатор.  ";
    }
}