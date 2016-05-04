import java.util.Scanner;

/**
 *  v.20160429
 *  This class contains only STATIC methods. Each method below executes a 
 * 	a basic aspect of programming (loops, conditionals, arrays, variables, 
 *	simple math computations, etc.). Your task is to implement each method
 *	below as indicated in the comments. You will use another file 
 *	(e.g., PortfolioApp.java) to run and test your method implementations.
 */
class MyPortfolio {

    /**
     * Prompts the user for their name. This method should use a Scanner object
     * to retrieve the name. It shoud return the collected string.
     */
	static String getFirstName() {
        Scanner user_input = new Scanner(System.in);
        System.out.print("PLease enter your first name: ");
        String user_name = user_input.next();
		return user_name;
	}


    /**
     * Accepts a list of integers as an argument and prints the integers to 
     * the screen on one line.
     */	
	static void printIntegerList(int[] values) {
        int j = values.length;
        for (int i = 0; i < j; i++) {
            System.out.print(values[i] + " ");
        }
	}


    /**
     * Accepts a list of integers as an argument and prints the integers IN REVERSE 
     * ORDER to the screen on one line.
     */	
	static void printIntegerListReversed(int[] values) {
        int j = values.length - 1;
        for (int i = j; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
	}

    /**
     * Accepts two characters, swaps the value of left_char and right_char
     * and returns the "new" left_char.
      */	
	static char swapLeftWithRight(char left_char, char right_char) {
        char x = left_char;
        char y = right_char;
        char z = left_char;

        x = y;
        y = z;
		return x;
	}

    /**
     * Accepts a list of integers as an argument and swaps the first value 
     * with the last value in the list. This method should create a new array
     * containing the swapped version of the array passed in as the argument.
     */	
	static int[] swapFirstWithLast(int[] values) {
        int x = values[0];
        int y = values[values.length - 1];
        int z = values[0];

        values[0] = y;
        values[values.length-1] = z;
		return values;
	}

    /**
     * Accepts a list of integers as an argument and returns the smallest value
     * found in the list.
     */	
	static int min(int[] values) {
        int minimum = values[0];

        for(int i = 0; i < values.length; i++) {
            if (values[i] < minimum) {
                minimum = values[i];
            }
        }
		return minimum;
	}

    /**
     * Accepts a list of integers as an argument and returns the largest value
     * found in the list.
     */	
	static int max(int[] values) {
        int maximum = values[0];

        for(int i = 0; i < values.length; i++) {
            if (values[i] > maximum) {
                maximum = values[i];
            }
        }
        return maximum;
    }

    /**
     * Accepts a list of integers as an argument and returns the average of all the
     * values found in the list.
     */	
	static int findAverage(int[] values) {
        int sum = 0;        

        for(int i = 0; i < values.length; i++) {
            sum = sum + values[i];
        }
        int average = (sum / values.length);
		return average;
	}

    /**
     * Accepts a list of integers and an integer value as arguments and returns 
     * the number of times the integer is found in the list.
     */	
	static int frequencyCount(int[] values, int val) {
        int count = 0;
        for(int i = 0; i < values.length; i++) {
            if (val == values[i]) {
                count++;
            }
        }
		return count;
	}

    /**
     * Accepts a String argument and returns the argument in reverse order.
     */	
	static String reverseString(String chars) {
        String s = "";
        int j = chars.length() - 1;
        for (int i = j; i >= 0; i--) {
            s = s + chars.charAt(i);
        }
		return s;
	}
}