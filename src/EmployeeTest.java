
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee EmpOne = new Employee("Suma");
		
		Employee EmpTwo = new Employee("Bindu");
		
		EmpOne.employeeAge(39);
		EmpOne.employeeDesig("S/W");
		EmpOne.employeeLocation("UnitedStates");
		EmpOne.employeeSal(30);
		EmpOne.empPri();
		
		EmpTwo.employeeAge(39);
		EmpTwo.employeeDesig("S/W");
		EmpTwo.employeeLocation("UnitedStates");
		
		EmpTwo.empPri();
		
		
	}

}
