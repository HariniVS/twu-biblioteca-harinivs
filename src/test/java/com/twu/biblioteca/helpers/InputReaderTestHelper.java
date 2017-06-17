package com.twu.biblioteca.helpers;

import com.twu.biblioteca.InputReader;

public class InputReaderTestHelper extends InputReader {

    private int currentIndex;
    private String[] inputStringArray;

    public InputReaderTestHelper(String inputString) {

        this.inputStringArray = inputString.split("\n");
        currentIndex = 0;
    }

    @Override
    public String readInput() {
        return inputStringArray[currentIndex++];
    }

}
