package singleton;

public class EmployeeSingleton {
	private int empEid;
	private String empName;
	private String empAddress;
	private int empSalary;
	
	private static EmployeeSingleton empObject=null;
	public static EmployeeSingleton getEmployee()
	{
		if(null==empObject)
			return(empObject=new EmployeeSingleton());
		else
			return empObject;
	}
	private EmployeeSingleton() {
		super();
	}
	
	@Override
	public String toString() {
		return "EmployeeSingleton [empEid=" + empEid + ", empName=" + empName + ", empAddress=" + empAddress
				+ ", empSalary=" + empSalary + "]";
	}
	public int getEmpEid() {
		return empEid;
	}
	public void setEmpEid(int empEid) {
		this.empEid = empEid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
}
