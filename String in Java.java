# Concatenation in Java (i.e Adding two or more Strings in Java is known as Concatenation)
import java.util.*;
public class concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName="Deep";
        String lastName="Singh";
        String fullName =firstName +" "+lastName;
        System.out.println(fullName);  
    }
}
OUTPUT:
Deep Singh

# Use of length method /function to calculate length of the given Strings .. 
import java.util.*;
public class concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName="Deep";
        String lastName="Singh";
        String fullName =firstName +" "+lastName;
        System.out.println(fullName.length());  
    }
}
OUTPUT:
10

# Use of charAt() function in Java to print the string by its indexes .
import java.util.*;
public class concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName="Deep";
        String lastName="Singh";
        String fullName =firstName +" "+lastName;
        System.out.println(fullName.length());  
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
    
    
    }


}
OUTPUT:
10
D
e
e
p

S
i
n
g
h

# How to use compareTo() function in java for comparing two strings ...

public class Comparestrings {
    public static void main(String[] args) {
        String name1="Deep";
        String name2="Deep";
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are Equal");
        }
        else{
            System.out.println("Strings are not Equal ");
        }
    }    
}
OUTPUT:
Strings are Equal

# Use of substring() in java for printing the sub part of the Strings 

MEHTOD-1 
public class substrings {
    public static void main(String[] args) {
        String sentence ="My name is Deep";
       
        String name=sentence.substring(11,15);
        System.out.println(name);
    }    
}
OUTPUT:
Deep

METHOD-2 (By using length() function instead of ending index)

public class substrings {
    public static void main(String[] args) {
        String sentence ="My name is Deep";
       
        String name=sentence.substring(11,sentence.length());
        System.out.println(name);
    }    
}
OUTPUT:
Deep

METHOD-3(without passing the ending index. In java bydefault it will goes upto the ending index )

public class substrings {
    public static void main(String[] args) {
        String sentence ="My name is Deep";
       
        String name=sentence.substring(11);
        System.out.println(name);
    }    
}
OUTPUT:
Deep

# Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”

import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the String :");
        String Original=sc.next();
        String Result="";
        for(int i=0;i<Original.length();i++){
            if(Original.charAt(i)=='e'|| Original.charAt(i)=='E'){
                   Result+='i';
            }
            else{
                Result+=Original.charAt(i);
            }
        }
        System.out.println(Result);
    }
}
OUTPUT:
Enter the String :
DeEp
Diip

# Input an username from the user. You have to create a email id  with the help of username by adding @gmail.com after the username and  Display this  email id  to the user.
Example : 
username = “shivamkumar123” 
email = “shivamkumar123@gmail.com”


import java.util.*;
public class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Username :");
        String username =sc.next();
        String str="@gmail.com";
        String email_id=username+str;
        System.out.println("your Email id is :" +email_id);
    }
}
OUTPUT:
Enter the Username :
shivamkumar123

