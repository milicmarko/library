package biblioteka;

import java.util.Scanner;

public class ScannerHelper {
	
	private static Scanner s = new Scanner(System.in);
	
	private static Scanner getScanner() {
		if (s == null)
			s = new Scanner(System.in);
		return s;
	}
	
	public static String getString() {
		return getScanner().nextLine();
	}
	
	public static String getString(String poruka) {
		System.out.println(poruka);
		return getScanner().nextLine();
	}
	
	public static int getInt(String poruka) {
		System.out.println(poruka);
		while(!getScanner().hasNextInt()) {
			System.out.println("Niste uneli ceo broj, pokušajte ponovo:");
			getScanner().nextLine();
		}
		int temp = getScanner().nextInt();
		getScanner().nextLine();
		return temp;
	}
	
	public static double getDouble(String poruka) {
		System.out.println(poruka);
		while(!getScanner().hasNextDouble()) {
			System.out.println("Niste uneli broj, pokušajte ponovo:");
			getScanner().nextLine();
		}
		double temp = getScanner().nextDouble();
		getScanner().nextLine();
		return temp;
	}
	
	public static void closeScanner() {
		getScanner().close();
	}

}
