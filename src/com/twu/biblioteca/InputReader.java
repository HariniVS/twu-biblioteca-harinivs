package com.twu.biblioteca;

import java.util.Scanner;

public class InputReader {

    String readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        return inputString;
    }
}
