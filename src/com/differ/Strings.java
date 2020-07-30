package com.differ;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Strings {
    private final List<String> strings;

    public Strings(List<String> strings) {
        this.strings = strings;
    }

    protected int getCountEmptyStringStream() {
        return (int) strings.stream().filter(String::isEmpty).count();
    }

    protected int getCountEmptyStringLoop() {
        int counter = 0;
        for (String string : strings) {
            if (string.isEmpty()) {
                counter++;
            }
        }
        return counter;
    }

    protected List<String> deleteEmptyStringsStream() {
        return strings.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
    }

    protected List<String> deleteEmptyStringsLoop() {
        List<String> listWithoutEmptyStrings = new ArrayList<>();
        for (String string : strings) {
            if (!string.isEmpty()) {
                listWithoutEmptyStrings.add(string);
            }
        }
        return listWithoutEmptyStrings;

    }

    protected String getMergedStringStream() {
        return strings.stream().filter(x -> !x.isEmpty()).collect(Collectors.joining(""));
    }

    protected String getMergedStringLoop() {
        List<String> listWithoutEmptyStrings = deleteEmptyStringsLoop();
        return String.join("", listWithoutEmptyStrings);
    }

}