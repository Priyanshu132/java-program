package com.timbuchalka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        long j;
        System.out.print("enter the number\n");
        long k=scan.nextLong();
        long start = System.currentTimeMillis();
        if(k==1) {
            System.out.print("There is no prime number less than " + k);
            return;
        }
        if(k>=2) {
            System.out.print("All the prime numbers which are less than " + k + " are listed below\n" + "2");
        }
        if(k>=3)
            System.out.print(" 3");

        for(long i=5;i<=k;i=i+6){   // all the primes no are 6N-1 and 6N+1
            int m=(int)Math.sqrt(i);  // no need to check with all the numbers...
	    for( j=2;j<m;j++){
	         if(i%j==0)
	             break;
         }
	     if(j==m)            // checking the whole loop is executed or not...
	         System.out.print(" "+i);
     }
        System.out.print("\n");
        for(long i=7;i<=k;i=i+6){                   // all the primes no are 6N-1 and 6N+1
            for( j=2;j<(int)Math.sqrt(i);j++){          // no need to check with all the numbers...
                if(i%j==0)
                    break;
            }
            if(j==(int)Math.sqrt(i))           // checking the whole loop is executed or not...
                System.out.print(" "+i);
        }
        System.out.print("\n");
        long end = System.currentTimeMillis();
        System.out.println("time taken by whole process "+ (end - start) + "ms");
    }
}
