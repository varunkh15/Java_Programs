package Abstraction;

public class PageTest {

	public static void main(String[] args) {

		HomePage hp = new HomePage();
		hp.title();
		hp.header();
		hp.userDetails();
		hp.footer();
		
		Page.plugin();
		
		//top casting:
		Page p = new HomePage();
		
		p.title();
		p.header();
		p.footer();
	
		
		
		
	}

}