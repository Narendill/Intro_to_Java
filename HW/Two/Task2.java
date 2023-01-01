// 2. Напишите программу на Java, чтобы проверить, являются ли две данные строки вращением друг друга.

public class Task2 {
    public static void main(String[] args) {
        String str1 = "acbd";
        String str2 = "cbda";

        boolean result = false;

        for (int i = 0; i < str1.length(); i++) {
            str1 = str1.substring(1) + str1.charAt(0);

            if (str1.compareTo(str2) == 0) {
                result = true;
            }
        }

        if (result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
