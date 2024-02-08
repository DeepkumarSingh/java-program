# JAVA PROGRAM TO ADD TWO NUMBERS USING METHODS .

import java.util.*;

class Algebra {
    int add(int a,int b){
        int ans=a+b;
        return ans;
    }

}
public class main{
    public static void main(String[] args) {
        Algebra  obj=new Algebra();
        System.out.println("Enter the numbers :");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        System.out.print("Sum of two given numbers is : ");
        int ans=obj.add(x,y);
        System.out.println(ans);
        
    }
}
OUTPUT:
Enter the numbers :
2
3
Sum of two given numbers is : 5


# JAVA PROGRAM FOR CALLING CONSTRUCTORS 

import java.util.*;

class Algebra {
    
    Algebra(){
         System.out.println("Constructors of Algebra class called ");
    }
    int add(int a,int b){
        int ans=a+b;
        return ans;
    }

}
public class Main{
    public static void main(String[] args) {
        Algebra  obj=new Algebra();
        System.out.println("Enter the numbers :");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        System.out.print("Sum of two given numbers is : ");
        int ans=obj.add(x,y);
        System.out.println(ans);
        
    }
}
OUTPUT:
Constructors of Algebra class called 
Enter the numbers :
2
3
Sum of two given numbers is : 5

# HOW TO USE PARAMETERIZED CONSTRUCTOR IN JAVA 

import java.util.*;

class Algebra {
    int a;
    int b;
    
    Algebra(int x, int y){
         System.out.println("Constructors of Algebra class called ");
         a = x;
         b = y;
    }
    int add(){
        int ans=a+b;
        return ans;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
        
    }
    int div(){
        return a/b;
    }

}
public class Main{
    public static void main(String[] args) {
        Algebra  obj=new Algebra(9,6);   //<-- IN THIS WAY CAN PASS OUR PARAMETER (i.e parameterized constructors )
        
        Scanner sc = new Scanner(System.in);
        int ans=obj.add();
        System.out.println(ans);
        System.out.println(obj.sub());
        System.out.println(obj.mul());
        System.out.println(obj.div());
        
        
    }
}

# Write a Java method to compute the average of three numbers

import java.util.*;

class Average{
     int avg(int a,int b,int c){
        int ans=(a+b+c)/3;
        return ans;
    }

}
public class main{
    public static void main(String[] args) {
        Average  obj=new Average();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Three numbers :");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        System.out.print("The average of the given three  numbers is: ");
        int ans=obj.avg(x,y,z);
       
        System.out.println(ans);

    }
}

OUTPUT:
Enter the Three numbers :
1
2
3
The average of the given three  numbers is: 2

# Write a Java method to count all vowels in a string

import java.util.*;
class CountVowels{
    int vow(String s){
int count = 0;
for(int i = 0; i < s.length(); i++){
char ch = s.charAt(i);
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch =='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
count++;
}
}
return count;
}
}

public class Main1 {
    public static void main(String[] args) {
        CountVowels ob = new CountVowels();
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the word :");
        String s = sc.next();
        int ans=ob.vow(s);
        System.out.println(ans);
        
    }
}
OUTPUT:
Enter the word :
DEEP
2

# Addition of two complex number in Java 

class Complex{
    int real,img;
    public Complex(int r,int i)
    {
        this.real=r;
        this.img=i;

    }
    public void showComplex()
    {
        System.out.println(this.real+" + i"+this.img);
    }
    public static Complex add(Complex c1, Complex c2)
    {
        Complex result = new Complex(0, 0);
        result.real=c1.real+c2.real;
        result.img=c1.img+c2.img;
        return result;
    }
    public static void main(String[] args) {
        Complex c1= new Complex(4,5);
        Complex c2= new Complex(10,5);
        System.out.print("1st Complex number is :");
        c1.showComplex();
        System.out.print("2nd Complex number is :");
        c2.showComplex();

        Complex result = add(c1,c2);
        System.out.print("The addition of two given Complex number is : ");
        result.showComplex();
    }
}
OUTPUT:
1st Complex number is :4 + i5
2nd Complex number is :10 + i5
The addition of two given Complex number is : 14 + i10

# java program to Calculate the Sum of two time interval in hours,mimnutes, and seconds ..
class Time{
    int hrs,min,sec;
    public Time (int h,int m,int s){
        this.hrs=h;
        this.min=m;
        this.sec=s;
    }
    public void showTime()
    {
        System.out.println(this.hrs+ ":"+this.min+":"+this.sec);
    }
    public static Time add(Time t1,Time t2)
    {
        Time result= new Time (0,0,0);
        result.hrs=t1.hrs+t2.hrs;
        result.min=t1.min+t2.min;
        result.sec=t1.sec+t2.sec;

        if(result.min>60){
            result.hrs++;
            result.min-=60;
        }
        if(result.sec>60)
        {
            result.sec-=60;
            result.min++;
            //result.sec-=60;
        }

        return result;
    }
    public static void main(String[] args) {
        Time t1 = new Time(3,35,50);
        Time t2= new Time(2,40,34);
        
        System.out.println("The Time t1 is :");
        t1.showTime();
        System.out.println("The Time t2 is :");
        t2.showTime();

        Time result = add(t1,t2);
        System.out.println("The addition of two given time interval is :");
        result.showTime();
    }

}
OUTPUT:
The Time t1 is :
3:35:50
The Time t2 is :
2:40:34
The addition of two given time interval is :
6:16:24

