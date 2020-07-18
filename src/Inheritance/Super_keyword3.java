package Inheritance;

public class Super_keyword3 extends Super_keyword1{
	
	public Super_keyword3(){
		super();
		System.out.println("BMW -- const....");
	}
	
	public Super_keyword3(int i){
		super(i);
		System.out.println("BMW -- const....");
	}
	
	public Super_keyword3(int i, int k){
		super(i,k);
		System.out.println("BMW -- const....");
	}
	
	
	int max_speed = 150;
	
	@Override
	public void start(){
		System.out.println("BMW -- start");
		
	}
	
	public void drive(){
		System.out.println("Car speed is : " + super.max_speed);
		super.start();
	}
	
	

}