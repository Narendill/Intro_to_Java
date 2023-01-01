import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 1. Напишите программу на Java, чтобы найти наименьшее окно в строке, содержащей все символы другой строки.

public class Task1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.print("Input the 1st string: "); // Можно воспользоваться: pwelcome tto 1212w3resource"
        String str1 = iScanner.nextLine();
        System.out.print("Input the 2nd string you would like to find: "); // Можно воспользоваться: tow"
        String str2 = iScanner.nextLine();
        System.out.println("_______________________________________");

        int step = str2.length();
        int start = 0;
        int[] proverkaWin = new int[str2.length()];
        boolean matchFound = false;

        while ((step <= str1.length()) && (matchFound == false)) {

            while ((start <= str1.length() - str2.length()) && (matchFound == false)
                    && ((start + step) <= str1.length())) {

                for (int j2 = 0; j2 < str2.length(); j2++) {
                    for (int j1 = start; j1 < start + step; j1++) {
                        if (str2.charAt(j2) == str1.charAt(j1)) {
                            proverkaWin[j2]++;
                        }
                    }
                }
                int min = minIm(proverkaWin);
                if (min == 0) {
                    start++;
                    for (int j = 0; j < proverkaWin.length; j++) {
                        proverkaWin[j] = 0;
                    }

                } else if (min > 0) {
                    matchFound = true;

                    System.out.print("Nachalnaya stroka: ");
                    System.out.println(str1);
                    System.out.print("Iskomaya stroka: ");
                    System.out.println(str2);
                    System.out.print("Naimenshee okno: ");
                    for (int i = start; i < start + step; i++) {
                        System.out.print(str1.charAt(i));
                    }
                    System.out.println();
                }

            }
            step++;
            start = 0;
        }

        if (minIm(proverkaWin) == 0)
            System.out.println("There is no result.");

    }

    private static int minIm(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}