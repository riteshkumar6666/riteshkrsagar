package com.company;

public class empWageBuiderUC2 {
    public static void main(String[] args)
    {
        //CONSTANTS
        int IS_FULL_TIME = 1;
        int EMP_RATE_PER_HOUR = 20;
        //VARIABLES
        int empHrs = 0;
        int empwage = 0;
                //COMPUTATION
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if ( empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empCheck = 0;
         empwage = empHrs * EMP_RATE_PER_HOUR;
         System.out.println("Emp wage: " + empwage);

    }
}
