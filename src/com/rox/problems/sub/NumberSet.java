package com.rox.problems.sub;

/**
 * Representation of a set of numbers and common operations on them
 */
public class NumberSet
{
    private Long numbers[];

    public NumberSet(Long[] numbers)
    {
        this.numbers = numbers;
    }

    /**
     * Highest common factor calculator
     *
     * Euclidean algorithm:-
     *   - Replace larger number with it's difference from the smaller number
     *   - Repeat until one number reaches 0
     *   - The other number is now the GCD of both original numbers
     *
     * Optimised Euclidean algorithm (used here):-
     *   - <b>Replace larger number by it's remainder when divided by the smaller</b>
     *   - Repeat until one number reaches 0
     *   - The other number is now the GCD of both original numbers
     *
     * The HCF of a, b and c is the HCF of hcf(a, b) and c i.e. hcf(a,b,c) == hcf( hcf(a,b) , c)
     */
    public long highestCommonFactor()
    {
        //Guard against < 2 numbers
        if (numbers.length < 2)
        {
            return numbers[0];
        }
        else if (numbers.length == 2)
        {
            return highestCommonFactor(numbers[0], numbers[1]);
        }

        long hcf = highestCommonFactor(numbers[0], numbers[1]);
        for (int i=2; i < numbers.length; i++)
        {
            hcf = highestCommonFactor(hcf, numbers[i]);
        }

        return hcf;
    }

    private long highestCommonFactor(long a, long b){
        if(a == 0) return b;
        if(b == 0) return a;

        if(a > b) {
            return highestCommonFactor(b, a % b);
        }

        return highestCommonFactor(a, b % a);
    }

    /**
     * Find the lowest common multiple of two numbers via reduction of the highest common factor
     */
    public long lowestCommonMultiple()
    {
        //Guard against < 2 numbers
        if (numbers.length < 2)
        {
            return numbers[0];
        }
        else if (numbers.length == 2)
        {
            return highestCommonFactor(numbers[0], numbers[1]);
        }

        long result = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
            result = lowestCommonMultiple(result, numbers[i]);
        }

        return result;
    }

    public long lowestCommonMultiple(long a, long b)
    {
        return a * (b / highestCommonFactor(a, b));
    }
}
