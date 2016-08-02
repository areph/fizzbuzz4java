package org;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by areph on 2016/08/02.
 */
public class MainTest {
    @Test
    public void fizzbuzz() throws Exception {
        Main sut = new Main();
        assertEquals(sut.fizzbuzz(1), "1");
        assertEquals(sut.fizzbuzz(3), "Fizz");
        assertEquals(sut.fizzbuzz(5), "Buzz");
        assertEquals(sut.fizzbuzz(15), "FizzBuzz");
    }
}