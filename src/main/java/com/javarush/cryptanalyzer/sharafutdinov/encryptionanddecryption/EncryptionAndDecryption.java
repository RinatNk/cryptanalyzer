package com.javarush.cryptanalyzer.sharafutdinov.encryptionanddecryption;

import static com.javarush.cryptanalyzer.sharafutdinov.constants.Alphabet.*;

public class EncryptionAndDecryption {
    public static char encryption(char symbols, int key) {
        if (ALPHABET.indexOf(symbols) != -1) {
            return ALPHABET.charAt((ALPHABET.indexOf(symbols) + key) % ALPHABET.length());
        } else {
            return symbols;
        }
    }
    public static char decryption(char symbols, int key) {
        return encryption(symbols, ALPHABET.length() - (key % ALPHABET.length()));
    }
}

