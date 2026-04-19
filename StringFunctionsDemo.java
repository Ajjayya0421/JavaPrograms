
/*3a. String Exercise progams
Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().
Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()
Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().
Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():
Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/


package Basics;


	import java.util.Scanner;

	public class StringFunctionsDemo {

	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) return 0;
	        int count = 0;
	        int index = 0;
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }
	        return count;
	    }

	    public static String reverseString(String str) {
	        if (str == null) return null;
	        StringBuilder sb = new StringBuilder(str);
	        return sb.reverse().toString();
	    }

	    public static boolean isPalindrome(String str) {
	        if (str == null) return false;
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversed = new StringBuilder(cleaned).reverse().toString();
	        return cleaned.equals(reversed);
	    }

	    public static String removeWhitespace(String str) {
	        if (str == null) return null;
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        System.out.println("Is null or empty: " + isNullOrEmpty(input));

	        System.out.print("Enter substring to count: ");
	        String sub = sc.nextLine();
	        System.out.println("Occurrences: " + countOccurrences(input, sub));

	        System.out.println("Reversed string: " + reverseString(input));

	        System.out.println("Is palindrome: " + isPalindrome(input));

	        System.out.println("Without whitespace: " + removeWhitespace(input));

	        sc.close();
	    }
	
	


		// TODO Auto-generated method stub

	}


