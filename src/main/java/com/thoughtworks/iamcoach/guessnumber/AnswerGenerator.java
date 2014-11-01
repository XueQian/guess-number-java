package com.thoughtworks.iamcoach.guessnumber;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnswerGenerator {

    private Random random;

    public AnswerGenerator(Random random) {
        this.random = random;
    }

    public String generate() {
        List<String> numberStrings = new ArrayList<>();

        while (numberStrings.size() < 4) {

            String randomNumberString = Integer.toString(random.nextInt(10));

            if (!numberStrings.contains(randomNumberString)) {
                numberStrings.add(randomNumberString);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        numberStrings.forEach(stringBuilder::append);

        return stringBuilder.toString();
    }
}