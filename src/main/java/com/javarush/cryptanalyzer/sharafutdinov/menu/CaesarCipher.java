package com.javarush.cryptanalyzer.sharafutdinov.menu;

import java.util.Scanner;

import static com.javarush.cryptanalyzer.sharafutdinov.encryptionanddecryption.BruteForce.*;
import static com.javarush.cryptanalyzer.sharafutdinov.encryptionanddecryption.Decoded.*;
import static com.javarush.cryptanalyzer.sharafutdinov.encryptionanddecryption.Encoded.*;
import static com.javarush.cryptanalyzer.sharafutdinov.constants.ConstantsForTheDialog.*;

public class CaesarCipher {
    public static void main(String[] args) {
        System.out.print(START_THE_PROGRAM);
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int choose = in.nextInt();
            if (choose == 1) {
                encoded();
            } else if (choose == 2) {
                decoded();
            } else if (choose == 3) {
                bruteForce();
            } else {
                System.out.println(WRONG_CHOICE);
            }
        } else {
            System.out.println(INCORRECT_FORMAT);
            in.close();
        }
    }
}
