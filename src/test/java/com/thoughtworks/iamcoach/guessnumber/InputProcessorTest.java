package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;
import org.mockito.stubbing.OngoingStubbing;

import java.util.Scanner;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InputProcessorTest {

    @Test
    public void should_return_a_string(){

        InputProcessor inputProcessor = mock(InputProcessor.class);

        when(inputProcessor.process()).thenReturn("11x1");
        assertThat(inputProcessor.process()).isEqualTo("11x1");
    }

//    @Test
//    public void should_return_string(){
//
//        InputProcessor inputProcessor = new InputProcessor();
//
//        when(new Scanner(System.in)).thenReturn("11x1");
//
//        assertThat(inputProcessor.process()).isEqualTo("adfdaf");
//
//    }

}
