package Usecases;

import Model.Customer;
import Dao.CustomerDao;
import DaoImpl.CustomerDaoImpl;

public class ViewTicketusecase {
	
public static void viewTicket(Customer customer) {
		
		CustomerDao dao = new CustomerDaoImpl();
		
		dao.viewTicket(customer.getCusId());
	}
}


