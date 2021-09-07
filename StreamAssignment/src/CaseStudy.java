import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Employee1 {
	int employeeId;
	String firstname;
	String lastname;
	String email;
	String phoneNumber;
	Date hireDate;
	String designation;
	String dept;
	double salary;
	int managerId;
	Department department;
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the managerId
	 */
	public int getManagerId() {
		return managerId;
	}
	/**
	 * @param managerId the managerId to set
	 */
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	/**
	 * @param employeeId
	 * @param firstname
	 * @param lastname
	 * @param email
	 * @param phoneNumber
	 * @param designation
	 * @param dept
	 * @param salary
	 * @param managerId
	 */
	public Employee1(int employeeId, String firstname, String lastname, String email, String phoneNumber, java.util.Date date,
			String designation, String dept, double salary, int managerId) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.designation = designation;
		this.dept = dept;
		this.salary = salary;
		this.managerId = managerId;
		this.department = department;
	}
	//public Employee1(int i, String string, String string2, String string3, String string4, String string5,
		//	String string6, int j, int k) {
		// TODO Auto-generated constructor stub
	//}
	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", designation=" + designation + ", dept="
				+ dept + ", salary=" + salary + ", managerId=" + managerId + ", department=" + department
				+ ", getEmployeeId()=" + getEmployeeId() + ", getFirstname()=" + getFirstname() + ", getLastname()="
				+ getLastname() + ", getEmail()=" + getEmail() + ", getPhoneNumber()=" + getPhoneNumber()
				+ ", getDesignation()=" +", hireDate=" + hireDate +  getDesignation() + ", getDept()=" + getDept() + ", getSalary()=" + getSalary()
				+ ", getManagerId()=" + getManagerId() + ", getDepartment()=" + getDepartment() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}

class Department
{
	int departmentId;
	String departmentName;
	int managerId;
	/**
	 * @return the departmentId
	 */
	public int getDepartmentId() {
		return departmentId;
	}
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * @param departmentName the departmentName to set
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * @return the managerId
	 */
	public int getManagerId() {
		return managerId;
	}
	/**
	 * @param managerId the managerId to set
	 */
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	/**
	 * @param departmentId
	 * @param departmentName
	 * @param managerId
	 */
	public Department(int departmentId, String departmentName, int managerId) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}
	
	
}

public class CaseStudy {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		ArrayList<Employee1> employees = new ArrayList<Employee1>();
		employees.add(new Employee1(1, "ankit","kumar","gmail","445982",new SimpleDateFormat("dd/MM/yyyy").parse("01/09/2020"),"software developer","it developer", 25000, 30));
		employees.add(new Employee1(2, "lalit","kumar ","7gmail","25000",new SimpleDateFormat("dd/MM/yyyy").parse("25/12/2010"),"software developer","it developer", 30000, 30));
		employees.add(new Employee1(3, "krishna","kumar ","8gmail","7778",new SimpleDateFormat("dd/MM/yyyy").parse("31/12/2021"),"hr","hr dept", 20000, 40));
		employees.add(new Employee1(5, "will","smith ","5gmail","8888",new SimpleDateFormat("dd/MM/yyyy").parse("11/06/2011"),"software developer","it developer", 19000, 30));
		employees.add(new Employee1(6, "subodh","nag ","9gmail","7777",new SimpleDateFormat("dd/MM/yyyy").parse("5/04/2020"),"hr","hr dept000", 33000, 10));
		
		
		System.out.println("list of employees :"+employees);
		
		ArrayList<Department> department = new ArrayList<Department>();
		department.add(new Department(1,"Hr Department",20));
		department.add(new Department(2,"Front end",25));
		department.add(new Department(3,"Back end",30));
		department.add(new Department(4,"consultancy",35));
		
		
		CaseStudy cs = new CaseStudy();
		System.out.println("Sum of salary of all the employee are given "+cs.sumSalaryEmp(employees));
		System.out.println("Number of employees "+cs.noOfEmp(employees));
		System.out.println("Department name "+cs.deptName(department));
		System.out.println("Eenior most employee : "+cs.maxSalary(employees));
		
		

		System.out.println("Department names count wise \n");
		
		System.out.println("\nEmployee without department ");
		cs.employeeWithoutDepartment(employees);
		
		System.out.println("\nDepartment without employees");
		cs.deptWithoutEmp(department);

		System.out.println("\nDepartment with highest count of employees");
		cs.deptWithHighestCountOfEmp(employees);
		
		System.out.println("\nList Employee name , hire date and hire day ");
		cs.empNameDayDateDetails(employees);
		
		System.out.println("\nList Employee details hired on particular date ");
		cs.empNameDetailsHired(employees,"FRIDAY");

		System.out.println("\nList Employee details report to manager ");
		cs.empDetailsReportToManager(employees);
		
		System.out.println("\nEmployee Salary increases by 15% ");
		cs.empSalaryIncreasesBy(employees,15);
		
		
		System.out.println("All sorting");
		
		cs.sortAll(employees,department);
		
		
		
		cs.empWithoutManager(employees);
		
		

	}
	




	double sumSalaryEmp(ArrayList<Employee1> employees)
	{
		double sumSalary = employees.stream().collect(Collectors.summarizingDouble(Employee1::getSalary)).getSum();
		return sumSalary;
		
	}
	ArrayList<Department> deptName(ArrayList<Department> department)
	{
	 department.stream().map(Department::getDepartmentName).distinct().forEach(System.out::println);
	 return department;
	}

	Map<String, Long> noOfEmp(ArrayList<Employee1> employees)
	{
		Map<String, Long> noEmp = employees.stream().collect(Collectors.groupingBy(Employee1::getDept,Collectors.counting()));
		return noEmp;
	}
	
//	double increasedSalary(ArrayList<Employee1> employees)
//	{
//		double salInc= employees.stream().map(e->"Name : " +e.getfirstName()+" Salary :"+e.getSalary()+" Salary increased by 15% = "+(e.getSalary()+e.getSalary()*0.15)).forEach(System.out::println);
//		//employees.stream().map(e->"Name : "+e.getfirstName()+" Salary :"+e.getSalary()+" Salary increased by 20% = "+(e.getSalary()+e.getSalary()*0.15)).forEach(System.out::println);
//		//List<Employee1> l=employees.stream().collect(Collectors.toList());
//
//		return salInc;
//	}
	
	double maxSalary(ArrayList<Employee1> employees)
	{
		double maxSal = employees.stream().collect(Collectors.summarizingDouble(Employee1::getSalary)).getMax();
		return maxSal;
	}
	
	@SuppressWarnings("deprecation")
	public void employeeDuration(ArrayList<Employee1> employees) {
		// TODO Auto-generated method stub
		employees.stream().map(i -> i.getFirstname() + " " + i.getLastname() + "  " + i.getHireDate().getMonth() + " "
				+ i.getHireDate().getYear()).forEach(i -> System.out.println(i));

	}

	public void employeeWithoutDepartment(ArrayList<Employee1> employees) {
		// TODO Auto-generated method stub
		employees.stream().filter(i -> i.getDepartment() == null).forEach(i -> System.out.println(i));
	}

	public void deptWithoutEmp(List<Department> departments) {
		// TODO Auto-generated method stub
		departments.stream().filter(i -> i.getManagerId() == 0).forEach(System.out::println);

	}

	public void deptWithHighestCountOfEmp(ArrayList<Employee1> employees) {
		// TODO Auto-generated method stub
		Map<Department, Long> m = employees.stream().filter(i -> i.getDepartment() != null)
				.collect(Collectors.groupingBy(Employee1::getDepartment, Collectors.counting()));

		for (Map.Entry<Department, Long> entry : m.entrySet())
			System.out.println(
					"Department = " + entry.getKey().getDepartmentName() + "......  Count = " + entry.getValue());

	}

	@SuppressWarnings("deprecation")
	public void empNameDayDateDetails(ArrayList<Employee1> employees) {
		// TODO Auto-generated method stub

		employees.stream().forEach(i -> System.out.println(i.getFirstname() + " " + i.getLastname() + " "
				+ i.getHireDate().getDate() + " " + i.getHireDate().getDay()));
	}

	@SuppressWarnings("deprecation")
	public void empNameDetailsHired(ArrayList<Employee1> employees, String string) {

		employees.stream().filter(a -> a.getHireDate().getDay() == 5).forEach(System.out::println);

	}

	public void empDetailsReportToManager(ArrayList<Employee1> employees) {
		// TODO Auto-generated method stub
		employees.stream().forEach(i -> System.out
				.println(i.getFirstname() + " " + i.getLastname() + " reporting to " + i.getManagerId() + " manager"));

	}

	public void empSalaryIncreasesBy(ArrayList<Employee1> employees, int s) {
		// TODO Auto-generated method stub

		employees.stream().forEach(i -> System.out.println(i.getFirstname() + " " + i.getLastname() + " salary "
				+ i.getSalary() + " increases by " + s + " is " + (i.getSalary() + i.getSalary() * (s / 100.00))));

	}

	
	public void sortAll(ArrayList<Employee1> employees, ArrayList<Department> departments) {
		// TODO Auto-generated method stub

		System.out.println("\n=====Sorting by Employee id=====\n");
		employees.stream().sorted(Comparator.comparingInt(Employee1::getEmployeeId)).forEach(System.out::println);

		System.out.println("\n ======Sorting by Department id =====\n");

		departments.stream().sorted(Comparator.comparingInt(Department::getDepartmentId)).forEach(i->System.out.println(i));
		 

		
		
		
		// Sorting by name
		
		System.out.println("\n =====Sort by name===== ");
		employees.stream().sorted(Comparator.comparingLong(Employee1::getFirstName)).forEach(System.out::println);
	
		
		
		
		 

	}

	public void empWithoutManager(ArrayList<Employee1> employees) {
		// TODO Auto-generated method stub
		
		System.out.println("Employes which are having no manager ");
		employees.stream().filter(i->i.getManagerId()==0).forEach(System.out::println);
		
		
		
	}

}

