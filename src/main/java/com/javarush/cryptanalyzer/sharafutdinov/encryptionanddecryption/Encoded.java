package com.javarush.cryptanalyzer.sharafutdinov.encryptionanddecryption;


import java.io.*;
import java.util.Scanner;

import static com.javarush.cryptanalyzer.sharafutdinov.encryptionanddecryption.EncryptionAndDecryption.*;
import static com.javarush.cryptanalyzer.sharafutdinov.constants.Alphabet.*;
import static com.javarush.cryptanalyzer.sharafutdinov.constants.ConstantsForTheDialog.*;

public class Encoded {
    public static void encoded() {
        System.out.print(FILE_SELECTION_FOR_ENCODED);
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        if (file.isEmpty()) {
            try (BufferedReader readerInputText = new BufferedReader(new FileReader("input.txt"));
                 BufferedWriter writerOutputText = new BufferedWriter(new FileWriter("encoded.txt"))) {
                String text;
                System.out.print(CHOOSING_AN_ENCRYPTION_KEY);
                String key = scanner.nextLine();
                if (key.isEmpty()) {
                    int randomKey = (int) ((Math.random() * ALPHABET.length()) + 1);
                    while ((text = readerInputText.readLine()) != null) {
                        for (int i = 0; i < text.length(); i++) {
                            writerOutputText.write(encryption(text.charAt(i), randomKey));
                        }
                    }
                    System.out.print(THE_TEXT_IS_ENCRYPTED + "\n" + YOUR_KEY + randomKey + "\n"+ ATTENTION);
                } else {
                    int userKey = Integer.parseInt(key);
                    while ((text = readerInputText.readLine()) != null) {
                        for (int i = 0; i < text.length(); i++) {
                            writerOutputText.write(encryption(text.charAt(i), userKey));
                        }
                    }
                    System.out.print(THE_TEXT_IS_ENCRYPTED + "\n" + YOUR_KEY + userKey + "\n" + ATTENTION);
                }
            } catch (IOException e) {
                System.out.print(IOEXCEPTION + e);
            }
        } else {
            try (BufferedReader readerInputText = new BufferedReader(new FileReader(file));
                 BufferedWriter writerOutputText = new BufferedWriter(new FileWriter("encoded.txt"))) {
                String text;
                System.out.print(CHOOSING_AN_ENCRYPTION_KEY);
                String key = scanner.nextLine();
                if (key.isEmpty()) {
                    int randomKey = (int) ((Math.random() * ALPHABET.length()) + 1);
                    while ((text = readerInputText.readLine()) != null) {
                        for (int i = 0; i < text.length(); i++) {
                            writerOutputText.write(encryption(text.charAt(i), randomKey));
                        }
                    }
                    System.out.print(THE_TEXT_IS_ENCRYPTED + "\n" + YOUR_KEY + randomKey + "\n"+ ATTENTION);
                } else {
                    int userKey = Integer.parseInt(key);
                    while ((text = readerInputText.readLine()) != null) {
                        for (int i = 0; i < text.length(); i++) {
                            writerOutputText.write(encryption(text.charAt(i), userKey));
                        }
                    }
                    System.out.print(THE_TEXT_IS_ENCRYPTED + "\n" + YOUR_KEY + userKey+ "\n"+ ATTENTION);
                }
            } catch (IOException e) {
                System.out.print(IOEXCEPTION + e);
            }
        }
        scanner.close();
    }
}