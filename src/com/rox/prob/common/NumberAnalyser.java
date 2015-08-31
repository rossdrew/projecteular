package com.rox.prob.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for analysing numbers
 *
 * XXX Could be made into non-utility method by creating an instance
 *     for number in question then running queries on it
 */
public class NumberAnalyser
{
    /**
     * Is <code>number</code> divisable by <code>divisor</code>
     */
    public static boolean divisableBy(long number, long divisor)
    {
        return (number % divisor == 0);
    }

    /**
     * Return lowest factor of given number
     */
    public static long nextFactor(long n)
    {
        long factorSearchLimit = n / 2;

        for (long divisor = 2; divisor <= factorSearchLimit; divisor++)
        {
            //if n is divisible by divisor then divisor is a factor of n
            if (n % divisor == 0)
            {
                return divisor;
            }
        }

        return n;
    }

    public static boolean isPrime(long n)
    {
        long min = 2;
        double max = Math.sqrt((double)n);

        for (long i=min; i<=max; i++)
        {
            if (divisableBy(n, i))
            {
                return false;
            }
        }

        return true;
    }

    public static long[] getDigits(long number)
    {
        int NUMBER_BASE = 10;

        int length = getDigitCountInNumber(number);
        long[] digits = new long[length];

        long explodingNumber = number;
        long remainder = 0;
        int i=digits.length-1;

        while (explodingNumber > 0)
        {
            remainder = explodingNumber % NUMBER_BASE;
            explodingNumber /= NUMBER_BASE;

            digits[i--] = remainder;
            if (explodingNumber < NUMBER_BASE)
            {
                digits[i--] = explodingNumber;
                explodingNumber = 0;
            }
        }

        return digits;
    }

    public static boolean isPallindrome(long number)
    {
        long[] d = getDigits(number);

        for (int i=0; i<d.length / 2; i++)
        {
            if (!(d[i] == d[d.length-i-1]))
            {
                return false;
            }
        }

        return true;
    }

    public static int getDigitCountInNumber(long number)
    {
        int length = (int)(Math.log10(number)+1);
        return length;
    }
}