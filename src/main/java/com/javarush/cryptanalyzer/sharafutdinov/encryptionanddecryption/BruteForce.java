package com.javarush.cryptanalyzer.sharafutdinov.encryptionanddecryption;

import java.io.*;
import java.util.Scanner;

import static com.javarush.cryptanalyzer.sharafutdinov.encryptionanddecryption.EncryptionAndDecryption.*;
import static com.javarush.cryptanalyzer.sharafutdinov.constants.Alphabet.*;
import static com.javarush.cryptanalyzer.sharafutdinov.constants.ConstantsForTheDialog.*;

public class BruteForce {
    public static void bruteForce() {
        System.out.print(FILE_SELECTION_FOR_DECODED);
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        int i = 1;
        if (file.isEmpty()) {
            while (i < ALPHABET.length()) {
                try (BufferedReader readerInputText = new BufferedReader(new FileReader("encoded.txt"));
                     BufferedWriter writerOutputText = new BufferedWriter(new FileWriter("output.txt"))) {
                    String text;
                    while ((text = readerInputText.readLine()) != null) {
                            writerOutputText.write(decryption(text, i) + "\n");
                            System.out.print(decryption(text, i));
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(THE_TEXT_IS_DECODED_YES_OR_NO);
                String choice = scanner.nextLine();
                if (choice.equals("N")) {
                    i++;
                } else if (choice.equals("Y")) {
                    System.out.println(HACKING_DEFAULT_BRUTE_FORCE + YOUR_KEY + i);
                    break;
                }
            }
        } else {
            while (i < ALPHABET.length()) {
                try (BufferedReader readerInputText = new BufferedReader(new FileReader("encoded.txt"));
                     BufferedWriter writerOutputText = new BufferedWriter(new FileWriter(file))) {
                    String text;
                    while ((text = readerInputText.readLine()) != null) {
                        writerOutputText.write(decryption(text, i) + "\n");
                            System.out.print(decryption(text, i));
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(THE_TEXT_IS_DECODED_YES_OR_NO);
                String choice = scanner.nextLine();
                if (choice.equals("N")) {
                    i++;
                } else if (choice.equals("Y")) {
                    System.out.println(HACKING_BRUTE_FORCE + YOUR_KEY + i);
                    break;
                }
            }
        }
        scanner.close();
    }
}
