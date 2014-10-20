package rest;

import java.io.Serializable;

public class Greeting  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String greetText = null;
	private String name = null;
	public Greeting(String greetText, String name) {
		super();
		this.greetText = greetText;
		this.name = name;
	}
	public String getGreetText() {
		return greetText;
	}
	public void setGreetText(String greetText) {
		this.greetText = greetText;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
