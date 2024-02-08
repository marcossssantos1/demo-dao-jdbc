package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(2, "livros");
		
		Seller seller = new Seller(1, "Marcos", "marcos@gmail.com", new Date(), 3500.0, dp);
		
		System.out.println(seller);
	}

}
