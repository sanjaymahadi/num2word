package sgm.labs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;


/*
 * This program converts numbers in decimal system to words. The program handles up to centillion, 10 ^303
 * There is no consistent and widely accepted way to extend cardinals beyond centillion
 * http://en.wikipedia.org/wiki/List_of_numbers
 */
public class NumToWords { 

	public static final String[] lessthan20 = {"zero", "one", "two", "three", "four", "five", "six", "seven",
		"eight", "nine", "ten", "eleven", "twleve", "thirteen", "fourteen", "fifteen", "sixteen",
		"seventeen", "eighteen", "ninteen", "twenty"};
	
	public static String[] tees = {"","ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String thisLine ="";
			String numstr = "";
			StringBuffer buf = new StringBuffer();
			buf.ensureCapacity(10000);
			int newLineCountForTerm = 0;
			
			while ((thisLine = br.readLine()) != null) {
				if (!thisLine.trim().isEmpty()) {
					buf.append(thisLine.replaceAll(",", ""));
					//System.out.println("\n appended" + buf.length());
					newLineCountForTerm = 0;
					thisLine = "";
				}
				else {
					newLineCountForTerm++;
					if (newLineCountForTerm >=1)
						break;
				}
			}
			
			numstr = buf.toString();
			//numstr = new String(charBuf);
			//System.out.println("\nread string: " + numstr + "\nlength of the number is " + numstr.length() + " digits");
			
			if (numstr == null || numstr.length() == 0) {
				System.err.println("Please enter a valid number");
				return;
			}
			
							
			if (numstr.length() <= 2 && Integer.parseInt(numstr) <= 20) {
				System.out.println(lessthan20[Integer.parseInt(numstr)]);
				return;
			}
			System.out.println("length of the number is " + numstr.length() + " digits");
			
			//Split the numbers as 3 position numbers and put them in an array
			String numToWord = "";

			//split the numbers as sets of 3 digit numbers and store them in a string array
			ArrayList<String> threedigitSet = new ArrayList<String>();
			String runningNum = numstr, temp = "";
			int runningCount = 0;
			while (runningCount < runningNum.length()) {
				temp =  String.valueOf(runningNum.charAt(runningNum.length()- (runningCount +1))) + temp;
				runningCount++;
				if (runningCount%3 == 0) {
					threedigitSet.add(temp);
					temp = "";
				}
			}
			if (runningCount%3 != 0) {
				threedigitSet.add(temp);
			}
			
			Iterator<String> itr = threedigitSet.iterator();
			int threedigitSetCount = 0;
			boolean nonzero = false;
			while (itr.hasNext()) {
				String numObj = (String)itr.next();
				String threeDigitWord = returnWord(numObj);
				threedigitSetCount++;
				if (Integer.parseInt(numObj) > 0) {
					nonzero = true;
					if (threedigitSetCount == 1)
						numToWord = threeDigitWord;
					else if (threedigitSetCount > 1)
						numToWord = threeDigitWord + " " + Words.highs[threedigitSetCount-1] + " " + numToWord;
				}				
			}
			if (nonzero) {
				int i = 0, len = 20;
				String printStr = "";
				StringTokenizer tokens = new StringTokenizer(numToWord, " ");
				while( tokens.hasMoreTokens()) {
					if (i == 0)
							printStr = tokens.nextToken();
					else
						printStr = printStr + " " + tokens.nextToken();
					i++;
					if (i == len) {
						System.out.print(printStr + "\n");
						printStr = "";
						i = 0;
					}
				}
				
				if (printStr.length() > 0)
					System.out.print(printStr + "\n");
				
				//System.out.println(numToWord);
			}
			else
				System.out.println("zero");
		}
		catch (Exception e) {
			System.out.println("Dont you know what an integer is? it doesn't look like you know it.. you Einstein!");
			return;
		}
		

	}
	
	public static String returnWord(String numstr) {
		int number = Integer.parseInt(numstr);
		String word = "";
		
		if (number < 21) {
			word = lessthan20[number];	
			return word;
		}
		
		int n = 0, decimalPlace = 0;
		int zeroCount  =0;
		boolean skipNum = false;
		
		for (int i=numstr.length()-1; i >= 0; i--) {
	
			try {
				char nc = numstr.charAt(i);
				n = Integer.parseInt(String.valueOf(nc));
				decimalPlace++;
				
				if (skipNum) {
					skipNum = false;
					continue;
				}
				
				if (n > 0) {					
					if (decimalPlace == 1) { //if the last ending 2 digits is greater 10 and less than 21 we need to handle it here
						String nc2 =  String.valueOf(numstr.charAt(i-1)) + String.valueOf(numstr.charAt(i));
						int n2 = Integer.parseInt(String.valueOf(nc2));
						if (n2 > 10 && n2 < 20) {
							word = lessthan20[n2];
							skipNum = true;
						}
						
					}
					if (!skipNum) {
						String returnWord = returnWord(n, decimalPlace);
						if (decimalPlace > 2) {
							if (word.length() > 0)
								word =  returnWord + " and " + word;
							else
								word = returnWord;
						}
						else if (decimalPlace == 2)
							//word = returnWord + " and " + word;
							word = returnWord + " " + word;
						else
							word = returnWord;
					}
				}
				
			}
			catch(NumberFormatException numEx) {
				System.err.println("Please enter a valid number");
				numEx.printStackTrace();
			}
		}
		return word;
	}
	
	public static String returnWord(int number, int decimalPlace) {
		String word = lessthan20[number];
		if (number == 0) {
			word = Words.highs[decimalPlace];
			return word;
		}
		int selector = 0;
		if (decimalPlace == 2)
			word = tees[number];
		else if (decimalPlace > 2 && decimalPlace < 5)
			word = word + " " + Words.highs[decimalPlace-3];
		
		else if (decimalPlace > 5){
			for (int a=5; a< 500; a=a+3) {
				if (decimalPlace == a) {
					selector = 1;
					break;
				}
			}
			if (selector == 0) {
				for (int a=6; a< 500; a=a+3) {
					if (decimalPlace == a) {
						selector = 2;
						break;
					}
				}
			}
			if (selector == 0) {			
				for (int a=7; a< 500; a=a+3) {
					if (decimalPlace == a) {
						selector = 3;
						break;
					}
				}
			}
			if (selector == 1)
				word = tees[number] + " " + Words.highs[decimalPlace-1];
			else if (selector == 2)
				word = word + " " + Words.highs[2];
			else if (selector == 3)
				word = word + " " + Words.highs[3];
		}
		
		return word;
	}

}
