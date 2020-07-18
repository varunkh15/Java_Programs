package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		// cond operators is used to write decision making statements
		// < > <= >= == != ----> if else ifelse

		int c = 20;
		int d = 20;
		int g = 30;
		double d1 = 12.33;
		
		System.out.println(c);
		
		int a = 30;
		int b = 20;
		System.out.println(b > a);

		if (b > a) {
			System.out.println("b is greater than a");
		} else {
			System.out.println("a is greater than b");

		}

		int num = 0;
		if (num > 0) {
			System.out.println("this is +ve number");
		} else if (num == 0) {
			System.out.println("number is zero");
		} else {
			System.out.println("this is -ve number");
		}

		String browser = "opera";
		// if(browser.equals("chrome")){
		// System.out.println("launch chrome");
		// }
		//
		// if(browser.equals("firefox")){
		// System.out.println("launch firefox");
		// }
		//
		// if(browser.equals("safari")){
		// System.out.println("launch safari");
		// }
		//
		// if(browser.equals("ie")){
		// System.out.println("launch ie");
		// }

		// if - elese if
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}

		else if (browser.equals("firefox")) {
			System.out.println("launch firefox");
		}

		else if (browser.equals("safari")) {
			System.out.println("launch safari");
		}

		else if (browser.equals("ie")) {
			System.out.println("launch ie");
		}

		else {
			System.out.println("please pass the correct browser name -->" + browser);
		}

		//
		int number = 20;
		if (number == 10) {

			if (number < 15) {
				System.out.println("number is smaller than 15");
			}
			if (number < 12) {
				System.out.println("number is smaller than 12 too");
			}

			else {
				System.out.println("number is greater than 15");
			}

		} else {
			System.out.println("Bye....");
		}

		// dead code:
		if (false) {
			System.out.println("hiii");
		} else {
			System.out.println("Hello...");
		}

		// WAP where we have three numbers --> find out the highest number
		int x = 700;
		int y = 500;
		int z = 300;
		// && -- short circuit operator

		if (x > y && x > z) {// true && true
			System.out.println("x is the highest number");
		} else if (y > z) {// true
			System.out.println("y is the highest number");
		} else {
			System.out.println("z is the highest number");
		}

		// switch-case:
		int point = 0;

		switch (point) {

		case 0:
			System.out.println("point is zero");
			break;
		case 1:
			System.out.println("point is 1");
			break;
		case 2:
			System.out.println("point is 2");
			break;
		case 3:
			System.out.println("point is 3");
			break;

		default:
			System.out.println("this point not found....");
			break;
		}

		String browserName = "Opera";

		switch (browserName) {
		
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "ie":
			System.out.println("launch ie");
			break;

		default:
			System.out.println("please pass the correct browser name : " + browserName);
			break;
		}

	}

}