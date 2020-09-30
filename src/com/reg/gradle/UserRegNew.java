package com.reg.gradle;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegNew {
	public static boolean checkFname(String fname) {
			            Pattern p1 =Pattern.compile("^[A-Z]{1}[a-z]{2,}");
			            Matcher m1 = p1.matcher(fname);
			            boolean matchfound1 = m1.find();
			            return matchfound1;
	         }
public static void main(String[] args) {
	System.out.println("Welcome to User Registration");
	Scanner sc=new Scanner(System.in);
	do {
	System.out.println("Enter first name (Starts with capital)");
    String fname = sc.nextLine();
    if(checkFname(fname)) {
    	System.out.println("Valid Input");
    	break;
    }
    else {
    	System.out.println("Invalid Input(Start with capital and should have min 3 charcaters)");
    }
}while(true);
}
}
