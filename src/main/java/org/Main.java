package org;

import java.util.stream.IntStream;

/**
 * Created by areph on 2016/08/02.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }
    public void run() {
        IntStream.rangeClosed(1, 30).forEach(i -> fizzbuzz(i));
    }

    public String fizzbuzz(int i) {
        if (i % 15 == 0) return "FizzBuzz";
        if (i % 3 == 0) return "Fizz";
        if (i % 5 == 0) return "Buzz";
        return String.valueOf(i);
    }
}
