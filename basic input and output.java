# Java program to count no. of digits in a numeber.

import java.util.*;
public class noOfDigit {
   
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n==0){
            System.out.println("No of digit is :"+1);

        }
        int count=0;
        while(n!=0){
            n/=10;
            count++; //or ++count;
            
        }
        System.out.println("No of Digit is :"+count);
    }
}

#  Java program to calculate the sum of the digits in a number..

import java.util.*;

public class sumOfDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number:");

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        if(n==0){
            System.out.println("The sum of digits is :"+0);
        }
        else{
        int ans=0;
        while(n!=0){
            ans=n%10+ans;
            n/=10;
        }
        System.out.println("The sum of Digits is :"+ans);
    }
    }
}

#

