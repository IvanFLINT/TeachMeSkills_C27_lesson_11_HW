package com.teachmeskills.lesson11.task1.method;

/**
 * The class contains methods for working with strings
 */
public class Utils {
    public static String firstConclusion(String st) {
        String[] arr = st.split("-");
        return arr[0] + arr[2];
    }

    public static String replacement(String st) {
        String[] arr = st.split("-");
        return st.replace(arr[1], "***").replace(arr[3], "***");
    }

    public static String secondConclusion(String st) {
        String[] arr = st.split("-");
        String str = (arr[1] + "/" + arr[3] + "/" + arr[4].substring(1, 2) +
                "/" + arr[4].substring(3)).toLowerCase();
        return str;
    }

    public static StringBuilder formattingStringBuilder(String st) {
        StringBuilder str = new StringBuilder();
        str.append("Length:");
        str.append(secondConclusion(st).toUpperCase());
        return str;
    }

    public static void checkingForCharacters(String st) {
        if (st.contains("abc")) {
            System.out.println("5) Строка содержит символы abc");
        } else if (st.contains("ABC")) {
            System.out.println("5) Строка содержит символы ABC");
        } else {
            System.out.println("5) В строе нету символов abc и символов ABC");
        }
    }

    public static void checkingBeginningLine(String st) {
        if (st.startsWith("555")) {
            System.out.println("6) Строка начинается с символов 555");
        } else {
            System.out.println("6) Строка не начинается на символы 555");
        }
    }

    public static void endLineCheck(String st) {
        if (st.endsWith("1a2b")) {
            System.out.println("7) Строка заканчивается символами 1a2b");
        } else {
            System.out.println("7) Строка не заканчивается на символы 1a2b");
        }
    }

    public static void maximumAndMinimum(String st) {
        String[] arr = st.split(" ");
        String max = arr[0];
        String min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max.length() <= arr[i].length()) {
                max = arr[i];
            } else if (min.length() >= arr[i].length()) {
                min = arr[i];
            }
        }
        System.out.println("1) Самое длинное слово: " + max);
        System.out.println("2) Самое короткое слово: " + min);
    }

    public static void duplication(String st) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < st.length(); i++) {
            sb.append(st.charAt(i)).append(st.charAt(i));
        }
        System.out.println(sb);
    }


}
