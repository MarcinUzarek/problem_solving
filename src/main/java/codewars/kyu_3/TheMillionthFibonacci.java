package codewars.kyu_3;

//The year is 1214. One night, Pope Innocent III awakens to find the the archangel Gabriel floating before him.
// Gabriel thunders to the pope:
//
//        Gather all of the learned men in Pisa, especially Leonardo Fibonacci.
//        In order for the crusades in the holy lands to be successful,
//        these men must calculate the millionth number in Fibonacci's recurrence.
//        Fail to do this, and your armies will never reclaim the holy land. It is His will.
//        The angel then vanishes in an explosion of white light.
//        Pope Innocent III sits in his bed in awe.
//        How much is a million? he thinks to himself. He never was very good at math.
//        He tries writing the number down, but because everyone in Europe is still using Roman numerals at this moment in history,
//        he cannot represent this number.
//        If he only knew about the invention of zero, it might make this sort of thing easier.
//        He decides to go back to bed. He consoles himself,
//        The Lord would never challenge me thus; this must have been some deceit by the devil.
//        A pretty horrendous nightmare, to be sure.
//        Pope Innocent III's armies would go on to conquer Constantinople (now Istanbul),
//        but they would never reclaim the holy land as he desired.
//
//        In this kata you will have to calculate fib(n) where:
//
//        fib(0) := 0
//        fib(1) := 1
//        fin(n + 2) := fib(n + 1) + fib(n)
//        Write an algorithm that can handle n up to 2000000.
//
//        Your algorithm must output the exact integer answer, to full precision. Also, it must correctly handle negative numbers as input.

import java.math.BigInteger;

public class TheMillionthFibonacci {

    public static void main(String[] args) {

        System.out.println(fib(BigInteger.valueOf(999999)));
    }

    //slow for numbers > ~ 1 000 000
    //complexity O(n)
    //TODO: complexity Olog(n)
    public static BigInteger fib(BigInteger n) {

        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }
        if (n.compareTo(BigInteger.ZERO) > 0) {
            return countFiboOfPositive(n);
        } else if (n.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
            n = n.negate();
            return countFiboOfPositive(n).negate();
        } else {
            return countFiboOfPositive(n.abs());
        }
    }

    private static BigInteger countFiboOfPositive(BigInteger n) {
        BigInteger temp;
        BigInteger add = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;
        BigInteger counter = BigInteger.ONE;

        while (!counter.equals(n)) {

            temp = result;
            result = result.add(add);
            add = temp;

            counter = counter.add(BigInteger.valueOf(1));
        }

        return result;
    }


}
