package com.twu.biblioteca;

import java.util.Scanner;

public class InputReader {

    private Scanner scanner = new Scanner(System.in);
    private String inputString;

    public String readInput() {

        inputString = scanner.next();
        return inputString;
    }
}
