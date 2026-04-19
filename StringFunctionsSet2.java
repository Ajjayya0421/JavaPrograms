
/* 3c. String Exercise progams
Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()
Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()
Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()

Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()
Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/

package Basics;

	import java.util.Random;
	import java.util.Scanner;

	public class StringFunctionsSet2 {

	    public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) return str;
	        String[] words = str.split("\\s+");
	        StringBuilder result = new StringBuilder();
	        for (String word : words) {
	            if (word.length() > 0) {
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1).toLowerCase())
	                      .append(" ");
	            }
	        }
	        return result.toString().trim();
	    }

	    public static String truncate(String str, int length) {
	        if (str == null) return null;
	        if (str.length() <= length) return str;
	        return str.substring(0, length) + "...";
	    }

	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) return false;
	        return str.matches("\\d+");
	    }

	    public static String generateRandomString(int length) {
	        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder sb = new StringBuilder();
	        Random rand = new Random();
	        for (int i = 0; i < length; i++) {
	            sb.append(chars.charAt(rand.nextInt(chars.length())));
	        }
	        return sb.toString();
	    }

	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) return 0;
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        System.out.println("Capitalized: " + capitalizeWords(input));

	        System.out.print("Enter length to truncate: ");
	        int len = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Truncated: " + truncate(input, len));

	        System.out.println("Is numeric: " + isNumeric(input));

	        System.out.print("Enter length for random string: ");
	        int randomLen = sc.nextInt();
	        System.out.println("Random string: " + generateRandomString(randomLen));

	        sc.nextLine();
	        System.out.print("Enter a sentence to count words: ");
	        String sentence = sc.nextLine();
	        System.out.println("Word count: " + countWords(sentence));

	        sc.close();
	    }
	}


