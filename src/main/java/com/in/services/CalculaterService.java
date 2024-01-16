package com.in.services;

public class CalculaterService {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int nSum(int ...number){
        int sum=0;
        for (int n:number) {
            sum=+n;
        }
        return sum;
    }
}
