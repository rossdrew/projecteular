package com.ncr.problems;

import com.ncr.problems.sub.NumberAnalyser;
import com.ncr.problems.sub.Validator;

import java.util.HashSet;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 *
 * [Answer = 4613732]
 */
public class Problem2 implements Problem
{
    private HashSet<Integer> getFibonacciSequenceUntil(int upperLimit, Validator validator)
    {
        int nMinusOne = 0;
        int n = 1;

        HashSet<Integer> fibonacciNumbers = new HashSet<>();

        while (n < upperLimit)
        {
            int tmp = (nMinusOne + n);

            nMinusOne = n;
            n = tmp;

            if (validator.validInt(n)) {
                fibonacciNumbers.add(n);
            }
        }

        return fibonacciNumbers;
    }

    public long solution(int maxValue)
    {
        HashSet<Integer> fibonacciNumbers = getFibonacciSequenceUntil(maxValue, new EvenNumberValidator());

        long sum = 0;
        for (Integer n : fibonacciNumbers)
        {
            sum += n;
        }

        return sum;
    }

    @Override
    public long solution()
    {
        return solution(4000000);
    }

    /**
     * Validate that given Integer is divisable by 2
     */
    class EvenNumberValidator implements Validator {
        @Override
        public boolean validInt(Integer integerToValidate)
        {
            int i = integerToValidate.intValue();
            return NumberAnalyser.divisableBy(i, 2);
        }
    }
}
