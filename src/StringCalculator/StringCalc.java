package StringCalculator;

public class StringCalc {

	public static long add1(String input) {
		// TODO Auto-generated method stub
		if (input.equals("")) {
			return 0;
		}
		else{
			String delimiter = ",";
			if(input.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(input.charAt(2));
				input = input.substring(4);
			}
			
			String numList[] = splitNumbers(input, delimiter + "|\n");
			return sum(numList);
		}
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers, String divider){
	    return numbers.split(divider);
	}

	private static int sum(String[] numbers){
 	    int total = 0;
 	    String negativeString = "";

        for(String number : numbers){
        	if(toInt(number) < 0){
        		if(negativeString.equals(""))
        			negativeString = number;
        		else
        			negativeString += ("," + number);
        	}
        	if(toInt(number) < 1000)
		    	total += toInt(number);
		}

		if(!negativeString.equals("")){
			throw new IllegalArgumentException("Negatives not allowed: " + negativeString);
		}

		return total;
    }

	
}
