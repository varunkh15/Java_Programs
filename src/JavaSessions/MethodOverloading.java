package JavaSessions;

public class MethodOverloading {

	public static void main(String[] args) {

	}
//method overloading:
	//within the same class, when we have different methods with the same name 
	//but different parameters diff types and sequence of the params is also different.
	
	public void login() {// 0

	}

	public void login(int i) {// 1

	}

	public void login(String t) {// 1

	}

	public void login(int p, int q) {// 2

	}

	public void login(int p, String q) {//2

	}

	public void login(String q, int p) {//2

	}
	
}