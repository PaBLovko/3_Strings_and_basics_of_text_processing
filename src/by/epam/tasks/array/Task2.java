package by.epam.tasks.array;

//    Заменить в строке все вхождения word на letter

public class Task2 {
    public static void main(String[]args){
        String string ="word and word and word!";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (i + 3 < string.length()
                    && string.charAt(i) == 'w'
                    && string.charAt(i + 1) == 'o'
                    && string.charAt(i + 2) == 'r'
                    && string.charAt(i + 3) == 'd') {
                stringBuilder.append("letter");
                i += 3;
            } else stringBuilder.append(string.charAt(i));
        }
        System.out.println(stringBuilder.toString());
    }
}
