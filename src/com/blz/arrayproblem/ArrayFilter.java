package com.blz.arrayproblem;

import java.util.ArrayList;

public class ArrayFilter {
    private ArrayList<Integer> positive_nums;
    private ArrayList<Integer> negative_nums;

    public ArrayFilter() {
        positive_nums = new ArrayList<Integer>();
        negative_nums = new ArrayList<Integer>();
    }
    public void filterArray(int[]arr){
        for (int num : arr){
            if (num >=0){
                positive_nums.add(num);
            }else{
                negative_nums.add(num);
            }
        }
    }
    public ArrayList<Integer> getPositive_numbers(){
        return positive_nums;
    }
    public ArrayList<Integer> getNegative_numbers() {
        return negative_nums;
    }

    public ArrayList<Integer> getPrimeNumbers(int[]arr){
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        for (int num : arr){
            if (isPrime(num)){
                primeNumbers.add(num);
            }
        }
        return primeNumbers;
    }
    private boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
