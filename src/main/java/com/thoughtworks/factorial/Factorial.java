package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) {

        if(i>0){
            int factorialResult = 1;

            for(int j = 1; j <= i; j++){
                factorialResult *= j;
            }

            return factorialResult;
        }

        return 1;
    }
}
