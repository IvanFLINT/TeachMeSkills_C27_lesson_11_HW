package com.teachmeskills.lesson11.task1.runner;

import com.teachmeskills.lesson11.task1.method.Utils;
/**
 * This program execution class
 */
public class Runner {
    public static void main(String[] args) {
        String numberDocument = "1234-AsR-6709-tWu-3y5E";
        String arbitraryString = "Все эти методы реализовать в отдельном классе в статических методах";


        System.out.println("Исходная строка: " + numberDocument);
        System.out.println("1) " + Utils.firstConclusion(numberDocument));
        System.out.println("2) " + Utils.replacement(numberDocument));
        System.out.println("3) " + Utils.secondConclusion(numberDocument));
        System.out.println("4) " + Utils.formattingStringBuilder(numberDocument));
        Utils.checkingForCharacters(numberDocument);
        Utils.checkingBeginningLine(numberDocument);
        Utils.endLineCheck(numberDocument);
        System.out.println();
        System.out.println("Исходная строка: " + arbitraryString);
        Utils.maximumAndMinimum(arbitraryString);
        System.out.println();
        Utils.duplication("Hello");

    }

}
