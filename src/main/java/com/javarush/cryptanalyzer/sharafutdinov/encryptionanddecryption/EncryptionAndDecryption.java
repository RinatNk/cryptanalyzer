package com.javarush.cryptanalyzer.sharafutdinov.encryptionanddecryption;

import static com.javarush.cryptanalyzer.sharafutdinov.constants.Alphabet.*;

public class EncryptionAndDecryption {
    public static String encryption(String text, int key) {
        StringBuilder cText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            cText.append(ALPHABET.charAt((ALPHABET.indexOf(text.charAt(i)) + key) % ALPHABET.length()));
        }
            return cText.toString();
        }
    public static String decryption(String text, int key) {
        return encryption(text, ALPHABET.length() - (key % ALPHABET.length()));
    }
}

