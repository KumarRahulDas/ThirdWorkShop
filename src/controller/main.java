package controller;

import com.blz.arrayproblem.ArrayFilter;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayFilter filter = new ArrayFilter();
        int[] arr = {-1,20,-3,30,40,-19,1,7,9,13,17,19};
        filter.filterArray(arr);
        ArrayList<Integer> positive = filter.getPositive_numbers();
        ArrayList<Integer> negative = filter.getNegative_numbers();
        System.out.println("Positive numbers" + positive);
        System.out.println("Negative numbers" + negative);
        ArrayList<Integer> primes = filter.getPrimeNumbers(arr);
        System.out.println("Prime numbers:" +primes);
    }
}
