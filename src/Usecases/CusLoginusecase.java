package Usecases;

import java.util.InputMismatchException;
import java.util.Scanner;

import Model.Customer;
import bus.Exception.CustomerException;
import bus.custom.ConsoleColors;
import Dao.CustomerDao;
import DaoImpl.CustomerDaoImpl;


public class CusLoginusecase {
public static Customer CusLogin() {
		
		Customer customer = null;
		Scanner sc = new Scanner (System.in);
		try {
			
			System.out.println(ConsoleColors.ORANGE + "Enter Username" + ConsoleColors.RESET);
			String username = sc.next();
			
			System.out.println(ConsoleColors.ORANGE + "Enter Password" + ConsoleColors.RESET);
			String password = sc.next();
		
			CustomerDao dao = new CustomerDaoImpl();
			
			try {
				customer = dao.cusLogin(username, password);
				
				System.out.println(ConsoleColors.ROSY_PINK + "Welcome " + customer.getFirstName() + " " + customer.getLastName() + ConsoleColors.RESET);
			} catch (CustomerException e) {
				
				System.out.println(ConsoleColors.RED_BACKGROUND + e.getMessage() + ConsoleColors.RESET);
			}
		}
		catch (InputMismatchException e) {
			System.out.println(ConsoleColors.RED_BACKGROUND + e.getMessage() + ConsoleColors.RESET);
		}
		
		return customer;

	}

}


