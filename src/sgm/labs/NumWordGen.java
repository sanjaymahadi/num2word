package sgm.labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;


public class NumWordGen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String[] names = {"ducentillion", "trecentillion", "quadringentillion", "quingentillion", "sescentillion", "septingentillion", 
								"octingentillion", "nongentillion"};
		final String[] unitplaces = {"un", "duo", "tres", "quattuor", "quinqua", "ses", "septen", "octo", "noven"};
		final String[] tens = { "deci", "viginti", "triginta", "quadraginta", "quinquaginta", "sexaginta", "septuaginta", "octoginta", "nonaginta"};
		
		try {
			int count = 0;
			String name1 = "";
			File outFile = new File("/Users/sanjay/numberwords.txt");
			FileWriter writer = new FileWriter(outFile);
			
			for (int ni=0; ni < names.length; ni++) {
				String name = names[ni];
				name1 = name;
				//System.out.print("\"" + name + "\", ");
				int tensplace = -1;
				while (tensplace < 9) {
					if (tensplace >= 0)
						name1 = tens[tensplace] + name;
					else {
						System.out.print("\"" + name1 + "\", ");
						writer.write("\"" + name1 + "\", ");
					}
					tensplace++;
					
					for (int unitplace=0; unitplace < unitplaces.length; unitplace++) {
						System.out.print("\"" + unitplaces[unitplace] + name1 + "\", ");
						writer.write("\"" + unitplaces[unitplace] + name1 + "\", ");
						count ++;
					}
					System.out.println("");
					writer.write("");
					
				}
				System.out.println("");
				writer.write("");
				
			}
			//System.out.println("count: " + count);
			writer.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}		

		
	}

}
