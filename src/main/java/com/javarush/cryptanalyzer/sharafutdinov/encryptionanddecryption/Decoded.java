package com.javarush.cryptanalyzer.sharafutdinov.encryptionanddecryption;

import java.io.*;
import java.util.Scanner;

import static com.javarush.cryptanalyzer.sharafutdinov.encryptionanddecryption.EncryptionAndDecryption.*;
import static com.javarush.cryptanalyzer.sharafutdinov.constants.ConstantsForTheDialog.*;

public class Decoded {
    public static void decoded(){
        System.out.print(FILE_SELECTION_FOR_DECODED);
        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        if (file.isEmpty()) {
            try (BufferedReader readerInputText = new BufferedReader(new FileReader("encoded.txt"));
                 BufferedWriter writerOutputText = new BufferedWriter(new FileWriter("output.txt"))) {
                String text;
                System.out.print(ENTERING_THE_KEY);
                int key = scanner.nextInt();
                while ((text = readerInputText.readLine()) != null) {
                        writerOutputText.write(decryption(text, key) + "\n");
                }
                System.out.print(THE_TEXT_IS_DECODED_BY_DEFAULT);
            } catch (IOException e) {
                System.out.print(IOEXCEPTION + e);
            }
        } else {
            try (BufferedReader readerInputText = new BufferedReader(new FileReader("encoded.txt"));
                 BufferedWriter writerOutputText = new BufferedWriter(new FileWriter(file))) {
                String text;
                System.out.print(ENTERING_THE_KEY);
                int key = scanner.nextInt();
                while ((text = readerInputText.readLine()) != null) {
                        writerOutputText.write(decryption(text, key) + "\n");
                }
                System.out.print(THE_TEXT_IS_DECODED + file);
            } catch (IOException e) {
                System.out.print(IOEXCEPTION + e);
            }
        }
        scanner.close();
    }
}
