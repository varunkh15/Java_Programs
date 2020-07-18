package Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();//overridden method
		b.stop();//inherited method
		b.refuel();//inherited method
		b.autoParking();//child class method
		b.engine();
		
		System.out.println("-------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
	
		System.out.println("-------");

		//top casting:
		Car c1 = new BMW();//child class object can be referred by parent class ref variable
		c1.start();
		c1.stop();
		c1.refuel();
		
		Vehicle v1 = new BMW();//child class object can be referred by grant parent class ref variable
		v1.engine();
		
		//down casting:
		//BMW b1 = (BMW) new Car();//ClassCastException at the run time
		
		BMW b2 = (BMW) new Vehicle();//ClassCastException at the run time
		
	}

}