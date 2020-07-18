package Encapsulation;

public class Company {
	
	public String name;
	public long totalEmployee;
	public String hqCity;
	private String policy;
	
	public void getCompanyAddress(){
		System.out.println("getCompanyAddress...");
		
	}
	
	public void getEmpInfo(){
		getEmpSalary();
	}
	
	private void getEmpSalary(){
		System.out.println("getEmpSalary...");

	}
	

	public static void main(String[] args) {

		Company c1 = new Company();
		
		c1.name = "IBM";
		c1.policy = "HR Rules";
		
		c1.getCompanyAddress();
		
		c1.getEmpSalary();
	

}
}