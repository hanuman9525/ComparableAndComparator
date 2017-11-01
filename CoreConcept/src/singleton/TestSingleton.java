package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeSingleton e=EmployeeSingleton.getEmployee();
		e.setEmpName("Hanuman");
		e.setEmpEid(123);
		e.setEmpSalary(5200);
		System.out.println(e.toString());
		
		EmployeeSingleton ee=EmployeeSingleton.getEmployee();
		ee.setEmpName("Man");
		ee.setEmpEid(12);
		ee.setEmpSalary(52);
		System.out.println("\n\tFirst Object Value"+e.toString()+"\n\tSecond object value"+ee.toString());
		
	}

}
