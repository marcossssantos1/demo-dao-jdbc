package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao dp = DaoFactory.createDepartmentDao();
		
		Department dep = new Department(9, "Ventiladores");
		
		//dp.insert(dep);
		
		//System.out.println(dep);
		
		dep = dp.findById(9);
		
		System.out.println(dep);

	}

}
