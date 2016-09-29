import java.util.Scanner;

public class RecursionProject {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a whole number greater than 0.");
		int numberEntered = input.nextInt();
	
		listWholeNumbers(numberEntered);
		
		input.close();
	}
	
	public static int listWholeNumbers(int numberEntered) {
		if (numberEntered >= 0) {
			System.out.println(numberEntered);
			return listWholeNumbers(numberEntered-1);
		} else {
			return numberEntered;
		}
	}	

}
