package Abstraction;

public class ProductPage extends Page{

	@Override
	void header() {
		System.out.println("PP - header");
	}

	@Override
	void title() {
		System.out.println("PP - title");		
	}
	
	
	public void productDetails(){
		System.out.println("PP - productDetails");
	}
	
}