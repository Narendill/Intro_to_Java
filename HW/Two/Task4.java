
public class Task4 {
    public static void main(String[] args) {
        // 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3
        // + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
        Integer a = 3;
        Integer b = 56;

        StringBuilder stringBuilderPlus = new StringBuilder();
        stringBuilderPlus.append(a.toString());
        stringBuilderPlus.append(" + ");
        stringBuilderPlus.append(b.toString());
        stringBuilderPlus.append(" = ");
        stringBuilderPlus.append(a + b);
        String strPlus = stringBuilderPlus.toString();

        StringBuilder stringBuilderMinus = new StringBuilder();
        stringBuilderMinus.append(a.toString());
        stringBuilderMinus.append(" - ");
        stringBuilderMinus.append(b.toString());
        stringBuilderMinus.append(" = ");
        stringBuilderMinus.append(a - b);
        String strMinus = stringBuilderMinus.toString();

        StringBuilder stringBuilderMult = new StringBuilder();
        stringBuilderMult.append(a.toString());
        stringBuilderMult.append(" - ");
        stringBuilderMult.append(b.toString());
        stringBuilderMult.append(" = ");
        stringBuilderMult.append(a * b);
        String strMult = stringBuilderMult.toString();

        System.out.println(strPlus);
        System.out.println(strMinus);
        System.out.println(strMult);

        // 5. Замените символ “=” на слово “равно”. Используйте методы
        // StringBuilder.insert(), StringBuilder.deleteCharAt().
        StringBuilder plus = changeEqual(stringBuilderPlus);
        StringBuilder minus = changeEqual(stringBuilderMinus);
        StringBuilder mult = changeEqual(stringBuilderMult);

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(mult);

        // 6. *Замените символ “=” на слово “равно”. Используйте методы
        // StringBuilder.replace().
        StringBuilder plus2 = changeEqual2(stringBuilderPlus);
        StringBuilder minus2 = changeEqual2(stringBuilderMinus);
        StringBuilder mult2 = changeEqual2(stringBuilderMult);

        System.out.println(plus2);
        System.out.println(minus2);
        System.out.println(mult2);

        // 7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов
        // "=" средствами String и StringBuilder.

        StringBuilder str10000 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            str10000.append('=');
        }

        String str10000Str = str10000.toString();

        long start1 = System.currentTimeMillis();
        String newString = str10000Str.replace("=", "egual");
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);

        long start2 = System.currentTimeMillis();
        StringBuilder newStrBld = changeEqual2(str10000);
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);

    }

    private static StringBuilder changeEqual(StringBuilder stringBuilder) {
        for (int i = 0; i < stringBuilder.length(); i++) {

            if (stringBuilder.charAt(i) == '=') {
                stringBuilder.deleteCharAt(i);
                stringBuilder.insert(i, "equal");
            }
        }
        return stringBuilder;
    }

    private static StringBuilder changeEqual2(StringBuilder stringBuilder) {
        for (int i = 0; i < stringBuilder.length(); i++) {

            if (stringBuilder.charAt(i) == '=') {
                stringBuilder.replace(i, i + 1, "equal");
            }
        }
        return stringBuilder;
    }

}
