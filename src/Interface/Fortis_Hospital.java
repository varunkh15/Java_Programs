package Interface;


public class Fortis_Hospital implements USMedical, UKMedical, IndianMedical,WHO {

	// USMedical
	@Override
	public void orthoServices() {
		System.out.println("FH - orthoServices");
	}

	@Override
	public void neuroServices() {
		System.out.println("FH - neuroServices");
	}
	
	@Override
	public void Services_911(){
		System.out.println("FH - Services_911");
	}

	// UKMedical
	@Override
	public void physioServices() {
		System.out.println("FH - physioServices");
	}

	@Override
	public void pediaServices() {
		System.out.println("FH - pediaServices");
	}

	// IndianMedical
	@Override
	public void oncologyServices() {
		System.out.println("FH - oncologyServices");
	}

	@Override
	public void cardioServices() {
		System.out.println("FH - cardioServices");
	}

	@Override
	public void ENTServices() {
		System.out.println("FH - ENTServices");
	}

	//FH methods - Non Overridden
	public void OPDServices(){
		System.out.println("FH - OPDServices");
	}
	
	public void medicalInsurance(){
		System.out.println("FH - medicalInsurance");
	}
	
	@Override
	public void billing(){
		System.out.println("FH - billing");
	}
	

	//WHO interface
	@Override
	public void Covid19Test() {
		System.out.println("FH - covid 19 test");
	}
	
}


