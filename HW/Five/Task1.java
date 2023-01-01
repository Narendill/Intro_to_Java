package Five;

import java.util.ArrayList;
import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {

        // 1. Объявить и инициализировать словарь hashMap<String, String>
        HashMap<String, String> hm = new HashMap<>();

        // 2. Добавить в словарь 10 пар "Ключ - Значение". Автор и название книги
        // например.
        hm.put("Pushkin", "Evgenii Onegin");
        hm.put("Tolstoi", "Voina i mir");
        hm.put("Akhmatova", "Stihi");
        hm.put("Gogol", "Mertvie dushi");
        hm.put("Bunin", "Granatovii braslet");
        hm.put("Lermontov", "Mciri");
        hm.put("Tolkien", "Vlastelin kolec");
        hm.put("Oruel", "1984");
        hm.put("Blok", "Dvenadcat");
        hm.put("Dostoevskii", "Prestuplenie i nakazanie");

        hm.forEach((k, v) -> System.out.println(k + " = " + v));
        System.out.println();

        // 3. Пройти по словарю и добавить к значениям символ "!"
        for (var item : hm.entrySet()) {
            String key = item.getKey();
            String value = item.getValue() + "!";
            hm.replace(key, value);
        }

        hm.forEach((k, v) -> System.out.println(k + " = " + v));
        System.out.println();

        // 4. Добавить нового автора и название книги если соответствующего ключа не
        // было.
        hm.putIfAbsent("Rowling", "Harry Potter");

        hm.forEach((k, v) -> System.out.println(k + " = " + v));
        System.out.println();

        // 5. Если ключ, указанный в запросе, имеется, вырезать из соответствующего
        // ключу значения первое слово.
        if (hm.containsKey("Tolstoi")) {
            String[] str = hm.get("Tolstoi").split(" ");
            String newStr = new String();
            for (int i = 1; i < str.length; i++) {
                newStr += str[i] + " ";
            }
            hm.replace("Tolstoi", newStr);
        }
        hm.forEach((k, v) -> System.out.println(k + " = " + v));
        System.out.println();

        // 6. *Пройти по словарю другим, не таким как в пункте 3, методом и вывести пары
        // ключ значение в консоль.
        hm.forEach((k, v) -> System.out.println(k + " = " + v));
        System.out.println();

        // 7. Пройти по словарю другим, не таким как в пункте 3 и 6, методом. Добавить к
        // значениям строку "(просмотрен)" и вывести в консоль.
        Object[] keys = hm.keySet().toArray();
        for (int i = 0; i < keys.length; i++) {
            String tempString = hm.get(keys[i]) + " - prosmotren";
            hm.replace(keys[i].toString(), tempString);
        }
        hm.forEach((k, v) -> System.out.println(k + " = " + v));
        System.out.println();

    }
}
