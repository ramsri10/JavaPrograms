package Java;

public class SumAllNumbers {

	

		    public static void main(String[] args) {
		        String input = "abc12xyz34poq567";
		        int sum = 0;
		        int currentNumber = 0;

		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);

		            if (Character.isDigit(ch)) {
		                currentNumber = currentNumber * 10 + (ch - '0');
		            } else {
		                sum += currentNumber;
		                currentNumber = 0;
		            }
		        }

		        // Add last number if string ends with digit
		        sum += currentNumber;

		        System.out.println(sum); // Output: 613
		    }
		}

		

