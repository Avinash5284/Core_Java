
import java.util.Scanner;
class Faculty
{
	private int facultyId;
	private double salary;
	
	void input(int facultyId,double salary)
	{
		this.facultyId=facultyId;
		this.salary=salary;
	}
	void PrintSalary(){
		System.out.println("salary :: "+salary);
		
	}
}
class FullTimeFaculty extends Faculty{
	private double basicSalary;
	private double allowance;

void input(int facultyId,double basicSalary,double allowance)
	{
		this.basicSalary=basicSalary;
		this.allowance=allowance;
		
		double salary=basicSalary+allowance;
		
		input(facultyId,salary);
	}
	
	void PrintSalary()
	{
		super.PrintSalary();
	}
	
}
class PartTimeFaculty extends Faculty{
	private int workingHours;
	private int ratPerHour;
	
	void input(int facultyId,int workingHours,int ratPerHour)
	{
		this.workingHours=workingHours;
		this.ratPerHour=ratPerHour;
		
		double salary=workingHours*ratPerHour;
		input(facultyId,salary);
	}
	void PrintSalary()
	{
		super.PrintSalary();
	}
	
	
}

class FacultyDemo
{
	public static void main(String argc[])
	{
		Scanner sc=new Scanner(System.in);
		FullTimeFaculty f=new FullTimeFaculty();
		
		System.out.println("Enter id ::");
		int facultyId=sc.nextInt();
		
		System.out.println("Enter basicSalary ::");
		double basicSalary=sc.nextDouble();
		
		System.out.println("allowance::");
		double allowance=sc.nextDouble();
		f.input(facultyId,basicSalary,allowance);
		//f.input(10,1000.55,568.55);
		f.PrintSalary();
		
		PartTimeFaculty p=new PartTimeFaculty();
		p.input(20,20,5000);
		p.PrintSalary();
	}
}