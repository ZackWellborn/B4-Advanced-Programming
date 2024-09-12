import java.util.ArrayList;
import java.util.*;  

public class MyProgram{
    public static void main(String[] args)
    {
        ArrayList<String> users = new ArrayList<String> ();
        users.add("Jimmy");
        // Account Jimmy = new Account();      
        // Account Alice = new Account(); 
        // Account Max = new Account();
        // Account Bob = new Account();
        // Account Charlie = new Account();
        for (String c : users) {
             // Account c = new Account();
             System.out.println(c);
        }
        System.out.println("Hello, welcome to our banking application!");
        Account filler = new Account(5.0, "bill");
        //System.out.println("Enter your account name below to create a new account.");
        filler.setName();
        System.out.println("Accounts: Jimmy, Alice, Max, Bob, Charlie");
    }
    //scanner.close();
}


// https://www.w3schools.com/java/java_arrays.asp
// https://www.w3schools.com/java/java_arraylist.asp
// https://www.w3schools.com/java/ref_keyword_float.asp
// https://www.geeksforgeeks.org/java-main-method-public-static-void-main-string-args/
// https://www.w3schools.com/java/java_methods.asp
// https://www.w3schools.com/java/java_classes.asp
// https://stackoverflow.com/questions/27729607/creating-an-array-of-classes-in-java
// https://www.w3schools.com/java/java_for_loop.asp             // Account c = new Account();
