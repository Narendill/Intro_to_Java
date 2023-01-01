// 3. *Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.

public class Task3 {
    public static void main(String[] args) {

        String str1 = "qwerty";
        String newStr = reversString(str1);
        System.out.println(newStr);

    }

    private static String reversString(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reversString(str.substring(0, str.length() - 1));
        }

    }
}
