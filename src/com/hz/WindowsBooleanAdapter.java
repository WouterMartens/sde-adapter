package com.hz;

import java.util.Arrays;
import java.util.List;

public class WindowsBooleanAdapter implements BooleanAdapter{
    private ConsoleReader adaptee;

    public WindowsBooleanAdapter(ConsoleReader reader) {
        this.adaptee = reader;
    }

    @Override
    public Boolean readLineBoolean() {
        String line = this.adaptee.readLine();

        String[] trueWords = new String[]{"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};
        List<String> trueList = Arrays.asList(trueWords);

        // see if the given answer is in the list
        if (trueList.contains(line)) {
            return true;
        }
        return false;
    }
}
