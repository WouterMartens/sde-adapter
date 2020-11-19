package com.hz;

import java.awt.geom.NoninvertibleTransformException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
//        AnswerAdapter adapter = new AnswerAdapter();
        BooleanAdapter adapter2 = new WindowsBooleanAdapter(reader);

        // ask questions
        String q1 = "Do you like eating vegetables?";

        String good = "You healthy person!";
        String bad = "Maybe you should try to eat some carrots";

        // ask question to user
        writer.write(q1);

        // read and checks response
//        Boolean ans1 = adapter.contains(reader.readLine());
        Boolean ans1 = adapter2.readLineBoolean();

        // the reader should accept the following values as true:
        // "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"
        if (ans1) {
            writer.write(good);
        } else {
            writer.write(bad);
        }

        // allow user to read our response
        reader.readLine();
    }
}