package com.thoughtworks.iamcoach.guessnumber;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CompareNumberTest {

    @Test
    public void should_return_4A0B(){
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.compare("1234","1234")).isEqualTo("4A0B");
    }

    @Test
    public void should_return_0A4B(){
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.compare("4321","1234")).isEqualTo("0A4B");
    }

    @Test
    public void should_return_2A2B(){
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.compare("1243","1234")).isEqualTo("2A2B");
    }

    @Test
    public void should_return_0A0B(){
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.compare("5678","1234")).isEqualTo("0A0B");
    }

    @Test
    public void result_length_should_be_4(){
        CompareNumber compareNumber = new CompareNumber();
        assertThat(compareNumber.compare("1256","1234").length()).isEqualTo(4);
    }

}
