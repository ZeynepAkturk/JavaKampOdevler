package JavaKamp_Gun2Odevler.inheritanceSample;



public class Main {

	public static void main(String[] args) {
		
		
		CustomerManager customerManager=new CustomerManager();
		customerManager.Add();
		customerManager.Remove(); 
		
		EmployeeManager employeeManager=new EmployeeManager();
		employeeManager.BestEmployee();
		
		Customer customer=new Customer();
		customer.firstName="Ali";

	}

}
