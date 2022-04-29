package copiaFactoryMethod;

public class htmlButton implements Button {
	 public void render() {
	        System.out.println("<button>Test Button</button>");
	        onClick();
	    }

	    public void onClick() {
	        System.out.println("Click! Button says - 'Hello World!'");
	    }
}
