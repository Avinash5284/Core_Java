
class Employee{
	private int empId;
	private String empName;
	
	void set(int empId,String empName)
	{
		this.empId=empId;
		this.empName=empName;
	}
	void show()
	{
		System.out.println(empId+ " " +empName);
	}
}
class EmployeeDemo
{
	public static void main(String argc[])
	{
		Employee e=new Employee();
		e.set(100,"RAm");
		e.show();
	}
}