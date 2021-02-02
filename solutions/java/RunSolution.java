import java.io.*; 
import java.util.Arrays;

public class RunSolution{

	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";

	public static void main(String[] args) throws Exception{

		//input parsing and reading
		File input00File = new File("../../test-cases/input/input00.txt");
		BufferedReader brInput00 = new BufferedReader(new FileReader(input00File));

		File input01File = new File("../../test-cases/input/input01.txt");
		BufferedReader brInput01 = new BufferedReader(new FileReader(input01File));

		File input60File = new File("../../test-cases/input/input60.txt");
		BufferedReader brInput60 = new BufferedReader(new FileReader(input60File));

		String st;
		String lineSplit[];

		int year00 = Integer.parseInt(brInput00.readLine());

		int year01 = Integer.parseInt(brInput01.readLine());

		int year60 = Integer.parseInt(brInput60.readLine());
		

		// problem application

		String response00 = DayOfTheProgrammer.run(year00);
		String response01 = DayOfTheProgrammer.run(year01);
		String response60 = DayOfTheProgrammer.run(year60);
		

		// expected outputs

		File output00File = new File("../../test-cases/output/output00.txt");
		BufferedReader brOutput00 = new BufferedReader(new FileReader(output00File));

		File output01File = new File("../../test-cases/output/output01.txt");
		BufferedReader brOutput01 = new BufferedReader(new FileReader(output01File));

		File output60File = new File("../../test-cases/output/output60.txt");
		BufferedReader brOutput60 = new BufferedReader(new FileReader(output60File));


		String output00 = brOutput00.readLine();
		String output01 = brOutput01.readLine();
		String output60 = brOutput60.readLine();

		System.out.println(((response00.equals(output00)) ? ANSI_GREEN : ANSI_RED) + "INPUT 00");
		System.out.println(((response01.equals(output01)) ? ANSI_GREEN : ANSI_RED) + "INPUT 05");
		System.out.println(((response60.equals(output60)) ? ANSI_GREEN : ANSI_RED) + "INPUT 60" + ANSI_RESET);
	}
}