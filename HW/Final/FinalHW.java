package Final;

import java.security.Key;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

public class FinalHW {
    public static void main(String[] args) {

        // 1. Объявить и инициализировать множества HashSet hs,
        // LinkedHashSet lhs и TreeSet ts.
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        
        // 2. Добавить в множества по 10 случайных целочисленных ключей.
        // Так как для дальнейшей работы нам нужны 3 сета с разными значениями,
        // реализуем метод (randomInt), который будет возвращать ArrayList, из
        // которого будем формировать множества.
        ArrayList<Integer> arrHS = randomInt(10);
        arrHS.forEach(n -> hs.add(n));

        ArrayList<Integer> arrLHS = randomInt(10);
        arrLHS.forEach(n -> lhs.add(n));

        ArrayList<Integer> arrTS = randomInt(10);
        arrTS.forEach(n -> ts.add(n));

        // Распечатаем
        System.out.println();
        System.out.println("---===Task #2===---");
        printAll(hs, lhs, ts);

        
        // 3. Пройти по множеству hs и, при условии наличия соответствующего ключа в
        // множестве lhs, удалить ключ из hs
        HashSet<Integer> tempHS = new HashSet<>();
        for (int value : hs){
            if(lhs.contains(value)){
                tempHS.add(value);
            }            
        }
        hs.removeAll(tempHS);
        System.out.println();
        System.out.println("---===Task #3===---");
        printAll(tempHS, lhs, ts);
        // Можно было просто найти разность множеств hs.removeAll(lhs)
        // но смутила постановка "пройти по множеству"...

        
        // 4. Пройти по множеству lhs и, при условии отсутствия соответствующего
        // ключа в множестве ts, добавит ключ в ts
        HashSet<Integer> tempLHS = new HashSet<>();
        for (int value : lhs){
            if(!ts.contains(value)){
                tempLHS.add(value);
            }            
        }
        ts.addAll(tempLHS);
        System.out.println();
        System.out.println("---===Task #4===---");
        printAll(tempHS, lhs, ts);
        // Можно было просто найти объединение множеств ts.addAll(lhs)


        // 5. Объявить и инициализировать множество TreeSet ts1 с 
        // компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0).
        // Заполнить ts1 15 случайными числами и вывести на печать.
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b){
                if((a - b) % 2 == 0){ // a левее b
                    return -1;
                }
                if (a - b == 0){
                    return 0;
                }
                else{
                    return 1; //((a - b) % 2 != 0) a правее b
                }  
            }
        };

        TreeSet<Integer> ts1 = new TreeSet<>(comparator);
        ArrayList<Integer> arrTS1 = randomInt(15);
        System.out.println();
        System.out.println("---===Task #5===---");
        System.out.println(arrTS1);
        arrTS1.forEach(n -> ts1.add(n));
        System.out.println();
        System.out.println("TreeSet with hell\'s comparator:");
        ts1.forEach(n -> System.out.print(n + " "));
        System.out.println();


        // 6. *Объявить и инициализировать множество TreeMap tm
        // с компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0).
        // Заполнить tm 15 случайными числами и вывести на печать.
        TreeMap<Integer, String> tm = new TreeMap<>(comparator);
        ArrayList<Integer> arrTM = randomInt(15);
        System.out.println();
        System.out.println("---===Task #6===---");
        System.out.println();
        arrTM.forEach(n -> tm.put(n, null));
        tm.forEach((k, v) -> System.out.println("key: " + k + ", " + "value: " + v));

    }

    // Создание ArrayList с n случайными неповторяющимися числами
    private static ArrayList<Integer> randomInt(int n) {
        ArrayList<Integer> array = new ArrayList<>();

        int i = 0;
        while (i < n) {
            Integer value = (int) (Math.random() * (20 + 1)) - 10; // например, [-10; 10]
            if (!array.contains(value)) {
                array.add(value);
                i++;
            }
        }
        return array;

    }

    // Печать всего безобразия из трех сетов на экран
    private static void printAll(HashSet<Integer> hs, LinkedHashSet<Integer> lhs, TreeSet<Integer> ts) {
        System.out.println();
        System.out.print("hs: ");
        hs.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.print("lhs: ");
        lhs.forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.print("ts: ");
        ts.forEach(n -> System.out.print(n + " "));
        System.out.println();
        
    }
}
