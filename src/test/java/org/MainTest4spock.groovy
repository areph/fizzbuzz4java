package org

/**
 * Created by areph on 2016/08/03.
 */
class MainTest4spock extends spock.lang.Specification {
    def "test fizzbuzz"() {
        setup:
        def sut = new Main()

        expect:
        sut.fizzbuzz(number) == result

        where:
        number | result
        1      | "1"
        3      | "Fizz"
        5      | "Buzz"
        15     | "FizzBuzz"
        0      | "0"
        -1     | "-1"
    }
}
