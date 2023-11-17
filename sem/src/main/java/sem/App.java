package sem;

import java.text.DecimalFormat;

public class App {

	    public static int sum(int a, int b) {
	        return a + b;
	    }

	    public static double divide(double a, double b) {
	        if (b == 0) {
	            return Double.NaN;
	        } else {
	            return Double.parseDouble(new DecimalFormat("#.##").format(a / b));
	        }
	    }

	    public static String returnTwoChars(String input) {
	        if (input == null || input.length() < 2) {
	            return input;
	        } else {
	            return input.substring(0, 2);
	        }
	    }

	    public static Double div(Double a, Double b) {
	        if (a == null || b == null || b == 0) {
	            return null;
	        } else {
	            return a / b;
	        }
	    
	}

}
