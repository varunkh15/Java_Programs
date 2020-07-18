package Interface;

public class TestHospital {

	public static void main(String[] args) {

		
		Fortis_Hospital fh  = new Fortis_Hospital();	
		fh.cardioServices();
		fh.neuroServices();
		fh.Services_911();
		fh.physioServices();
		fh.ENTServices();
		fh.medicalInsurance();
		fh.OPDServices();		
		System.out.println(USMedical.min_fee);
		USMedical.display();
		fh.billing();
		CDC.vaccination();
		
		//top casting:
		//child class object can be referred by parent interface ref variable:
		
		USMedical us = new Fortis_Hospital();
		
		us.orthoServices();
		us.neuroServices();
		us.Services_911();
		
		UKMedical uk = new Fortis_Hospital();
		
		uk.pediaServices();
		uk.physioServices();
		
				
	}
	

}