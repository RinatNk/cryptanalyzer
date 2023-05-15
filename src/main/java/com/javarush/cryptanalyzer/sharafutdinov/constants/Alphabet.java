package com.javarush.cryptanalyzer.sharafutdinov.constants;

public class Alphabet {
    private static final String letterUpperAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String letterLowerAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private static final String numbers = "0123456789";
    private static final String symbols = ".,\":-!? ";
    public static final String ALPHABET = letterUpperAlphabet + letterLowerAlphabet + numbers + symbols;
}
