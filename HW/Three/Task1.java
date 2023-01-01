
package Three;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        // 1. Создайте новый список массивов, добавить несколько цветов (строку) и
        // вывести коллекцию на экран.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("black");
        colors.add("green");
        colors.add("blue");
        colors.add("white");

        colors.forEach(n -> System.out.println(n));

        // 2. Проитерируйте все элементы списка цветов и добавте к каждому символ '!'.
        for (int i = 0; i < colors.size(); i++) {
            String str = colors.get(i);
            str += "!";
            colors.set(i, str);

        }
        colors.forEach(n -> System.out.println(n));

        // 3. Напишите программу для вставки элемента в список массивов в первой
        // позиции.
        intertFirstPos(colors, "yellow");
        colors.forEach(n -> System.out.println(n));

        // 4. Извлеките элемент (по указанному индексу) из заданного списка.
        Object element = returnElementFromArray(colors, 1);
        System.out.println(element);

        // 5. Обновите элемент массива по заданному индексу.
        ArrayList renewArray = renewArrayByIndex(colors, 0, "O_o");
        System.out.println(renewArray);

        // 6. Напишите программу для удаления третьего элемента из списка массивов.

        ArrayList delThird = delThirdElem(colors);
        System.out.println(delThird);

        // 7. Напишите программу для поиска элемента в списке массивов.
        findElem(colors, "white!");

        // 8. *Напишите программу для сортировки заданного списка массивов.
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(2);
        a.add(15);
        a.add(20);
        System.out.println(a);
        ArrayList<Integer> sortedArr = sotrArray(a);
        System.out.println(sortedArr);

        // 9. *Напишите программу для копирования одного списка массивов в другой.
        ArrayList<String> nnn = copyArray(colors);
        System.out.println(colors);
        System.out.println(nnn);

    }

    // МЕТОДЫ

    // 3. Напишите программу для вставки элемента в список массивов в первой
    // позиции.
    private static ArrayList intertFirstPos(ArrayList arrayList, Object value) {
        arrayList.add(0, value);

        return arrayList;
    }

    // 4. Извлеките элемент (по указанному индексу) из заданного списка.
    private static Object returnElementFromArray(ArrayList arrayList, Integer index) {
        return arrayList.get(index);
    }

    // 5. Обновите элемент массива по заданному индексу.
    private static ArrayList renewArrayByIndex(ArrayList arrayList, Integer index, Object value) {
        arrayList.set(index, value);
        return arrayList;
    }

    // 6. Напишите программу для удаления третьего элемента из списка массивов.
    private static ArrayList delThirdElem(ArrayList arrayList) {
        arrayList.remove(3);

        return arrayList;
    }

    // 7. Напишите программу для поиска элемента в списке массивов.
    private static void findElem(ArrayList arrayList, Object value) {
        boolean isInArray = false;
        if (arrayList.contains(value)) {
            isInArray = true;
        }
        System.out.println(isInArray);
    }

    // 8. *Напишите программу для сортировки заданного списка массивов.
    private static ArrayList<Integer> sotrArray(ArrayList<Integer> arrayList) {
        int i = 0;
        boolean t = true;
        while (t) {
            t = false;
            for (int j = 0; j < arrayList.size() - i - 2; j++) {
                if (arrayList.get(j) > arrayList.get(j + 1)) {
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j+1, temp);
                    t = true;
                }

            }
            i++;
        }

        return arrayList;
    }

    // 9. *Напишите программу для копирования одного списка массивов в другой.
    private static ArrayList<String> copyArray(ArrayList<String> arrayList) {
        ArrayList<String> newArray = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            newArray.add(arrayList.get(i));
        }
        
        return newArray;
    }

}
