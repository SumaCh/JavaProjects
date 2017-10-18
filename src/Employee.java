
public class Employee {
	
	int age;
   String name;
   String designation;
   String location;
   private int salary;
   
	
	public Employee(String name)
	{
		this.name=name;
	}

	public void employeeAge(int empage)
	
	{
	     age= empage;
	     
	}
	
	public void employeeDesig(String empdesig)
	{
		designation=empdesig;
		
	}
	
	public void employeeLocation(String emploc)
	{
		location=emploc;
		
	}
	
	public void employeeSal(int empsal)
	{
		salary=empsal;
		
	}
	
	public void setSalary(String department , int sal) {
		if (sal>1000) {
			salary=sal;
		}
	}

	
	public void empPri()
	{
		System.out.println("Name of the employee---  " + name +"\n");
		System.out.println("Age of the employee---"  + age+"\n" );
		System.out.println("Designation of the employee--"  + designation+"\n");
		System.out.println("Salary of the employee is" + salary +"\n" );
		System.out.println("Name of the employee--"  + location+"\n" +"\n");
	}
}

