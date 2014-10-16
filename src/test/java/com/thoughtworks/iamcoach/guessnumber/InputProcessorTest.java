package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class InputProcessorTest {

    @Test
    public void should_return_a_string(){

        InputProcessor inputProcessor = mock(InputProcessor.class);

        when(inputProcessor.process()).thenReturn("1111");
        assertThat(inputProcessor.process()).isEqualTo("1111");
    }

}
