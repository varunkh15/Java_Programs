package Inheritance;

public class Super_keyword1 {
	
	public Super_keyword1()
	{
		System.out.println("Car -- const....");
	}
	
	public Super_keyword1(int i){
		System.out.println("Car -- const...." + i);
	}
	
	public Super_keyword1(int i, int k){
		System.out.println("Car -- const...." + (i+k));
	}
	
	int max_speed = 100;
	
	public void start()
	{
		System.out.println("Car -- start");
	}
	
	

}