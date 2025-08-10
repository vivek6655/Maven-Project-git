package service;

import org.springframework.stereotype.Service;

@Service
public class MyClass {
	
	public String getGreeting() {
		return "Hello, welcome to My Application!";
	}

	public String[] fetchNames() {
		return new String[]{"Alice", "Bob", "Charlie"};
	}

}
