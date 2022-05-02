package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.OrderStatus;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Email: ");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		System.out.println("Enter order data: ");
		Date orderData = sdf.parse(sc.next());
		System.out.println("Status: " + OrderStatus.PROCESSING);
		System.out.println("How many items to this order?");
		System.out.println("Enter #1 item data: ");
		System.out.println("Product name: ");
		String productName = sc.nextLine();
		System.out.println("Product price: ");
		double productPrice = sc.nextDouble();
		System.out.println("Quantity: ");
		int quantity = sc.nextInt();
		
		sc.close();
	}

}
