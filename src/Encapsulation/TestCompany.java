package Encapsulation;

public class TestCompany {

	public static void main(String[] args) 
	{
		Company c1 = new Company();
		
		c1.name = "MS";
		c1.totalEmployee = 1000;
		c1.hqCity = "HYD";
		
		
		c1.getCompanyAddress();
		
		c1.getEmpInfo();

	}

}
