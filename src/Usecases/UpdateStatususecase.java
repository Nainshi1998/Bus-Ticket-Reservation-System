package Usecases;

import java.util.Scanner;
import Dao.AdminDao;
import DaoImpl.AdminDaoImpl;
import bus.custom.ConsoleColors;

public class UpdateStatususecase {
	
public static void updateStatus() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(ConsoleColors.ORANGE + "Enter customer Id" + ConsoleColors.RESET);
		int cusId = sc.nextInt();
		
		AdminDao dao = new AdminDaoImpl();
		
		String result = dao.updateStatus(cusId);
		boolean flag = true;
		
		for (int i = 0; i < result.length(); i++) {
			if (result.charAt(i) == 'n') flag = false;
		}
	
		if (flag) System.out.println(ConsoleColors.GREEN_BACKGROUND + result + ConsoleColors.RESET);
		else System.out.println(ConsoleColors.RED_BACKGROUND + result + ConsoleColors.RESET);
		
	}

}


