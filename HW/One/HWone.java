/* Первый семинар.
1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
5. Сохранить оба массива в файлы с именами m1 и m2 соответственно.
Пункты реализовать в методе main
*Пункты реализовать в разных методах */

package HW.One;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HWone {
    public static void main(String[] args) {

        // 1. Выбросить случайное целое число в диапазоне от -1000 до 1000 и сохранить в
        // i
        Integer i = (int) (Math.random() * (2000 + 1)) - 1000;

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = Integer.toBinaryString(Math.abs(i)).length();

        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в
        // массив m1
        ArrayList<Integer> arrayListM1 = new ArrayList();
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                arrayListM1.add(j);
            }
        }
        int[] m1 = new int[arrayListM1.size()];
        for (int j = 0; j < m1.length; j++) {
            m1[j] = arrayListM1.get(j);

        }

        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и
        // сохранить в массив m2
        ArrayList<Integer> arrayListM2 = new ArrayList();
        for (int j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0) {
                arrayListM2.add(j);
            }
        }
        int[] m2 = new int[arrayListM2.size()];
        for (int j = 0; j < m2.length; j++) {
            m2[j] = arrayListM2.get(j);

        }

        // 5. Сохранить оба массива в файлы с именами m1 и m2 соответственно. Пункты
        // реализовать в методе main
        try (FileWriter f = new FileWriter("m1.txt", false)) {
            for (int j = 0; j < m1.length; j++) {
                String number = Integer.toString(m1[j]);
                f.write(number);
                f.write("\n");

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter f = new FileWriter("m2.txt", false)) {
            for (int j = 0; j < m2.length; j++) {
                String number = Integer.toString(m2[j]);
                f.write(number);
                f.write("\n");

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Реализация через методы
        // 1
        int new_i = dropI();
        System.out.println(new_i);

        // 2
        int new_n = saveHightByte(new_i);
        System.out.println(new_n);

        // 3 
        int[] new_m1 = returnArrayM1(new_i, new_n);

        // 4
        int[] new_m2 = returnArrayM2(new_i, new_n);
        // 5
        saveM1M2(new_m1, new_m2);




    }

    // Пункты реализовать в разных методах
    // 1
    private static Integer dropI() {
        Integer i = (int) (Math.random() * (2000 + 1)) - 1000;
        return i;
    }
    // 2 
    private static Integer saveHightByte(int n) {
        return Integer.toBinaryString(Math.abs(n)).length();
        
    }
    // 3 
    private static int[] returnArrayM1(int i, int n) {
        ArrayList<Integer> arrayListM1 = new ArrayList();
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                arrayListM1.add(j);
            }
        }
        int[] m1 = new int[arrayListM1.size()];
        for (int j = 0; j < m1.length; j++) {
            m1[j] = arrayListM1.get(j);

        }
        return m1;
    }
    // 4
    private static int[] returnArrayM2(int i, int n) {
        ArrayList<Integer> arrayListM2 = new ArrayList();
        for (int j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0) {
                arrayListM2.add(j);
            }
        }
        int[] m2 = new int[arrayListM2.size()];
        for (int j = 0; j < m2.length; j++) {
            m2[j] = arrayListM2.get(j);

        }
        return m2;
    }
    // 5
    private static void saveM1M2(int[] m1, int[] m2) {
        try (FileWriter f = new FileWriter("m1_new.txt", false)) {
            for (int j = 0; j < m1.length; j++) {
                String number = Integer.toString(m1[j]);
                f.write(number);
                f.write("\n");

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        try (FileWriter f = new FileWriter("m2_new.txt", false)) {
            for (int j = 0; j < m2.length; j++) {
                String number = Integer.toString(m2[j]);
                f.write(number);
                f.write("\n");

            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
