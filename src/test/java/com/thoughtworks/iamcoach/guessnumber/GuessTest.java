package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {
    @Test
    public void should_correct_answer(){

        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("1234");

        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.compare("1234","1234")).thenReturn("4A0B");
        Guess guess = new Guess(answerGenerator,compareNumber);

        String result = guess.guess("1234");
        assertThat(result).isEqualTo("4A0B");
    }
}
