package com.thoughtworks.iamcoach.guessnumber;
//
//import org.junit.Test;
//
//import static org.fest.assertions.api.Assertions.assertThat;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//public class AnswerGeneratorTest {
//    @Test
//    public void should_answer_length_is_4(){
//        AnswerGenerator answerGenerator = new AnswerGenerator();
//        assertThat(answerGenerator.generate().length()).isEqualTo(4);
//    }
//
//    @Test
//    public void should_result_is_random(){
//        AnswerGenerator answerGenerator = new AnswerGenerator();
//        String result1 = answerGenerator.generate();
//        String result2 = answerGenerator.generate();
//        assertThat(result1).isNotEqualTo(result2);
//    }
//
//
//    @Test
//    public void should_result_is_not_repeatful(){
//
//        Math math = mock(Math.class);
//        when(math.random()).thenReturn(1.0);
//
//        AnswerGenerator answerGenerator = new AnswerGenerator();
//        String answer = answerGenerator.generate();
//
//        boolean result = true;
//        for (int i = 0; i < answer.length(); i++){
//            if( answer.charAt(i) == (answer.length() - i)){
//                result = false;
//            }
//        }
//        assertThat(result).isEqualTo(true);
//
//    }
//}
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hhu on 7/10/14.
 */
public class AnswerGeneratorTest {

    private AnswerGenerator answerGenerator;

    @Before
    public void before() {
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1, 2, 3, 4);

        answerGenerator = new AnswerGenerator(random);
    }

    @Test
    public void result_length_should_be_four() {
        String result = answerGenerator.generate();

        assertThat(result.length()).isEqualTo(4);
    }

    @Test
    public void every_number_should_be_integer() {
        String result = answerGenerator.generate();

        assertThat(result.matches("^[0-9]+$")).isTrue();
    }

    @Test
    public void every_number_should_not_be_same() {
        String result = answerGenerator.generate();

        Set<String> stringSet = new HashSet<String>(Arrays.asList(result.split("")));

        boolean hasDuplicate = result.length() - stringSet.size() > 0;

        assertThat(hasDuplicate).isFalse();
    }

    @Test
    public void result_should_be_random() {
        String result = answerGenerator.generate();
        assertThat(result).isEqualTo("1234");
    }

}