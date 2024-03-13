package Usecases;
import DaoImpl.AdminDaoImpl;
import Dao.AdminDao;

public class ViewAllTicketusecase {
	
public static void viewAllTicket() {
		
		AdminDao dao = new AdminDaoImpl();
		dao.viewAllTickets();
	}
}

