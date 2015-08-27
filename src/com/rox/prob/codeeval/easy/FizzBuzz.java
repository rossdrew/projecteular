package com.rox.prob.codeeval.easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *  Players generally sit in a circle. The first player says the number 1, and each player says
 *  next number in turn. However, any number divisible by X (for example, three) is replaced by
 *  the word fizz, and any divisible by Y (for example, five) by the word buzz. Numbers divisible
 *  by both become fizz buzz. A player who hesitates, or makes a mistake is eliminated from the
 *  game.
 *
 * Write a program that prints out the final series of numbers where those divisible by X, Y and
 * both are replaced by F for fizz, B for buzz and FB for fizz buzz.
 * Input sample:
 *
 * Your program should accept a file as its first argument. The file contains multiple separated
 * lines; each line contains 3 numbers that are space delimited. The first number is the first
 * divider (X), the second number is the second divider (Y), and the third number is how far you
 * should count (N). You may assume that the input file is formatted correctly and the numbers
 * are valid positive integers.
 *
 * For example:
 * 3 5 10
 * 2 7 15
 *
 * Output sample:
 * 1 2 F 4 B F 7 8 F B
 * 1 F 3 F 5 F B F 9 F 11 F 13 FB 15
 *
 * Print out the series 1 through N replacing numbers divisible by X with F, numbers divisible
 * by Y with B and numbers divisible by both with FB. Since the input file contains multiple
 * sets of values, your output should print out one line per set. Ensure that there are no
 * trailing empty spaces in each line you print.
 * Constraints:
 *
 * The number of test cases ? 20
 * "X" is in range [1, 20]
 * "Y" is in range [1, 20]
 * "N" is in range [21, 100]
 *
 */
public class FizzBuzz {
    Scanner fileScanner;
    int fizzDivisor;
    int buzzDivisor;
    int count;

    public FizzBuzz(String filename)
    {
        try {
            File file = new File(filename);
            fileScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.err.println("Invalid file input.");
        }
    }

    private void loadNextLine()
    {
        fizzDivisor = fileScanner.nextInt();
        buzzDivisor = fileScanner.nextInt();
        count = fileScanner.nextInt();
    }

    public void start()
    {
        while (fileScanner.hasNext()) {
            loadNextLine();
            String output = calculateFizzBuzz();
            System.out.println(output);
        }
    }

    private String calculateFizzBuzz() {
        StringBuffer sb = new StringBuffer();

        for (int i=1; i<=count; i++)
        {
            getFizzBuzzStringFor(i);
        }

        return sb.toString();
    }

    private String getFizzBuzzStringFor(int i) {
        boolean divByFizz = (i % fizzDivisor)==0;
        boolean divByBuzz = (i % buzzDivisor)==0;

        if (divByFizz && divByBuzz)
        {
            return " FB";
        }
        else if (divByFizz)
        {
            return " F";
        }
        else if (divByBuzz)
        {
            return " B";
        }
        else
        {
            return " " + i;
        }
    }

    public static void main(String[] args)
    {
        FizzBuzz problem = new FizzBuzz(args[0]);
        problem.start();
    }
}
